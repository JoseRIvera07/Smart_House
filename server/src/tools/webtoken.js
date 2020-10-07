'use strict';

//let mysql = require('../tools/mysql.js');
let random = require('randomstring')


let expose = {
  check : undefined,
  create : undefined,
  shield : undefined
}

/**
 * This method generates a random token based on the config file specs.
 * @return {alphanumeric} Token
 */
let generate = () => {
  return random.generate({
    "length" : 256,
    "charset" : "alphanumeric"
  });
}

expose.shield = (req,res,next) => {
  const request_url = req.originalUrl;
    expose.check(req.headers, (result) => {
    if(result.matches){
        next();
    }else{
        res.status(403).json({
        error : 'Forbbiden Access (webtoken needed), see docs.'
        })
    }
    })
}

expose.create = (email, cb) => {
  let to_return = {
    error : undefined,
    success : undefined,
    token : undefined,
    detail : undefined
  };

  //let pool = mysql.getPool();

  let token = generate();

//   pool.query(CALL SP_Insert_TOKEN (?,?), [email, token], (error, results, fields) => {
//     if(error){
//       to_return.error = true;
//       to_return.detail = error
//       cb(to_return);
//     }

      

//   })

  to_return.token = token;    

  cb(to_return); 
}


expose.check = (headers, cb) => {
  const token = headers["driverkey-auth-token"];
  const email = headers["driverkey-auth-email"];

  let to_return = {
    error : undefined,
    success : undefined,
    matches : undefined,
    detail : undefined
  };

  let pool = mysql.getPool();

  to_return.success = true;
  to_return.matches =  true ;
  cb(to_return); 

//   pool.query(CALL SP_Select_TOKEN (?), [${token}], (error, results, fields) => {
//     if(error){
//       to_return.error = true;
//       to_return.detail = error
//       cb(to_return);
//     }

    

//     if(results[0].length == 0){ // No exists active token for user given
      
//     }else{
//       let data = results[0][0]; // If there are rows, should be only one, indexed by 0
//       if(data.User_Id == email){ // Token exists and matchs with email given
//         to_return.matches =  true ;
//       }else{ // Does not match
//         to_return.matches =  false ;
//       }
//     }

//        

//   })

}



module.exports = expose;