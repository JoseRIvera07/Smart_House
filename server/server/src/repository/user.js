'use strict';

//let mysql = require('../tools/mysql.js');

let expose = {
  exists : undefined,
  getAuth : undefined,
  add : undefined,
  validate : undefined
};


expose.exists = (data, cb) => {
//   let pool = mysql.getPool();

  let to_return = {
    error : undefined,
    success : undefined,
    exists : undefined,
    detail : undefined
  };
  if(data.email=="pam@map.com"){
    to_return.exists=true;
  }
  else{
    to_return.success=false;
    to_return.exists=false;
  }

  cb(to_return);

//   pool.query(`SELECT Email FROM USERS Where Email = ?`, [data.email], (error, results, fields) => {
//     if(error){
//       to_return.error = true;
//       to_return.detail = error
//       cb(to_return);
//     }

//     results.length == 0 ? to_return.exists = false : to_return.exists = true;

//     cb(to_return);    

//   })
}


expose.getAuth = (data, cb) => {
//   let pool = mysql.getPool();

  let to_return = {
    error : undefined,
    success : undefined,
    detail : undefined,
    data : undefined,
  };

  to_return.data = {
    Password : '379fc00f910be4a4047bd32f8ec99c406eb090c0c5f77c47cfb5902d7f36fc44',
  }
  
  cb(to_return);

//   pool.query(CALL SP_Login(?), [data.email], (error, results, fields) => {
//     if(error){
//       to_return.error = true;
//       to_return.detail = error
//       cb(to_return);
//     }

//     to_return.data = results[0][0];

//     cb(to_return);
//   })

}

module.exports = expose;
