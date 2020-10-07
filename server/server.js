let express = require('express');
let app = express();
let http = require('http').createServer(app);
let bodyParser = require('body-parser');
let cors = require('cors');
let config = require('config');
app.use(cors()); // Enable request from any server -> npm install cors
app.options('*', cors()) // include before other routes
let {exec} = require('child_process');
//let io = require('socket.io')(http);
const io = require("socket.io")(http, {
    handlePreflightRequest: (req, res) => {
        const headers = {
            "Access-Control-Allow-Headers": "Content-Type, Authorization",
            "Access-Control-Allow-Origin": req.headers.origin, //or the specific origin you want to give access to,
            "Access-Control-Allow-Credentials": true
        };
        res.writeHead(200, headers);
        res.end();
    }
});

global.log4us = require('./src/tools/log4us')();

app.use(bodyParser.json({limit:"50mb"}));
app.use(bodyParser.urlencoded({limit: "50mb", extended: true, parameterLimit:50000}));

let corsOptions = {
	origin: 'http://localhost:4200',
	credentials: true
}
io.origins('*:*') // for latest version
//app.use(cors(corsOptions));
//app.options('*',cors());


//app.use('/',express.static('./public'));


/*
app.get('/', (req,res) => {
	res.sendFile(__dirname + '/public/index.html');
});*/

//cambios
let handlerModule = require('./src/controllers/handler');
app.use('/api/', handlerModule);

//cambios



io.on('connection', socket => {
  console.log('Client Connected');
  socket.on('setup', (msg) => {
    exec(msg, (error, stdout, stderr) =>{
      console.log(msg,error)
  		if (error !== null) {
        console.log('exec error 1: ' + error);
      }
  		else{
  			console.log('SetUp '+ stdout);
  		}
  	});
  });

  socket.on('switch', (msg) => {
    exec(msg, (error, stdout, stderr) =>{
  		if (error !== null) {
        console.log('exec error 2: ' + error);
      }
  		else{
  			console.log('Pin new value '+ stdout);
  		}
  	});
  });

  socket.on('verify', (msg) => {
    exec(msg, (error, stdout, stderr) =>{
  		if (error !== null) {
        console.log('exec error 3: ' + error);
      }
  		else{
  			console.log('DoorState '+ stdout);
  			socket.emit('response', stdout);
  		}
	  });
  });

  socket.on('disconnect', () => {
    console.log('Client disconnected');
  });
});

let port = config.get("port");
http.listen(port, () =>{
	global.log4us.print(`Taken port ${port} to serve HTTP server`);
});
