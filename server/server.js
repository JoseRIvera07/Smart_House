let express = require('express');
let app = express();
let http = require('http').createServer(app);
let bodyParser = require('body-parser');
let cors = require('cors');
app.use(cors()); 
app.options('*', cors()) 
let {exec} = require('child_process');

const io = require("socket.io")(http, {
    handlePreflightRequest: (req, res) => {
        const headers = {
            "Access-Control-Allow-Headers": "Content-Type, Authorization",
            "Access-Control-Allow-Origin": req.headers.origin, 
            "Access-Control-Allow-Credentials": true
        };
        res.writeHead(200, headers);
        res.end();
    }
});

global.log4us = require('./src/tools/log4us')();

app.use(bodyParser.json({limit:"50mb"}));
app.use(bodyParser.urlencoded({limit: "50mb", extended: true, parameterLimit:50000}));

io.origins('*:*') 

let apiRoutes = require("./src/api-routes")
app.use('/api', apiRoutes)

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

let port = 3000
http.listen(port, () =>{
	global.log4us.print(`Running server on port: ${port}`);
});
