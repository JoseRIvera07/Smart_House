let sha256 = require('sha256');
let random = require('randomstring');
let config = require('config');


let user = require('../repository/user');
let webToken = require('../tools/webtoken');


let expose ={
  exist:null,
  login:null,
  registerDriver:null
};


expose.login = (data,cb) => {
  let to_return = {
    error : undefined,
    success : undefined,
    code : undefined,
    detail : undefined,
    token : undefined,
    data : undefined,
    token : undefined
  }

  user.exists(data, (exists_result) => {
    
    if (exists_result.error) { // Error
      global.log4us.error(`Error testing user exists: ${exists_result.detail}`);
      to_return.error = true;
      cb(to_return);
    }

    if (!exists_result.exists) { // The user does not exits
      to_return.success = false;
      to_return.detail = 'The user does not exists'
      to_return.code = '0x001';
      cb(to_return);
    }
    else{
      user.getAuth(data, (result) => {
        if (result.error) { // Error
          global.log4us.error(`Error testing user exists: ${result.detail}`);
          to_return.error = true;
          cb(to_return);
        }

        const userInstance = result.data;
        
        const hashed_password = sha256.x2(data.password);
        
        console.log(hashed_password);
        if(hashed_password == userInstance.Password){
          userInstance.password = undefined; 

          webToken.create(data.email, (tokenResult) => { // lets create a token
            if(tokenResult.error){
              global.log4us.error(`Error creating token: ${tokenResult.detail}`);
              to_return.error = true;
              cb(to_return);
            }
            
            to_return.success = true;
            to_return.data = userInstance;
            to_return.token = tokenResult.token;


            cb(to_return);
          });
        }
        else{
          to_return.success = false;
          to_return.detail = 'The email and password combination does not match'
          to_return.code = '0x002';
          cb(to_return);
        }
        
      })
    }
  })
}

module.exports = expose