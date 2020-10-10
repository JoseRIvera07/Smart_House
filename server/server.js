let express = require('express');
let app = express();
let http = require('http').createServer(app);
let bodyParser = require('body-parser');
var NodeWebcam = require( "node-webcam" );
var opts = {
 
  //Picture related

  width: 1280,

  height: 720,

  quality: 100,

  // Number of frames to capture
  // More the frames, longer it takes to capture
  // Use higher framerate for quality. Ex: 60

  frames: 60,


  //Delay in seconds to take shot
  //if the platform supports miliseconds
  //use a float (0.1)
  //Currently only on windows

  delay: 0,


  //Save shots in memory

  saveShots: true,


  // [jpeg, png] support varies
  // Webcam.OutputTypes

  output: "jpeg",


  //Which camera to use
  //Use Webcam.list() for results
  //false for default device

  device: false,


  // [location, buffer, base64]
  // Webcam.CallbackReturnTypes

  callbackReturn: "base64",


  //Logging

  verbose: false

};
var Webcam = NodeWebcam.create( opts );
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
  socket.on('photo', () => {
    console.log('Taking Photo');
    Webcam.capture( "test_picture", function( err, data ) {
      socket.emit('image', data);

    } );
  });
});

let port = 3000
http.listen(port, () =>{
	console.log(`Running server on port: ${port}`);
});
