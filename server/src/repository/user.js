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
  if(data.email=="embebidos"){
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
    Password : 'ff7f73b854845fc02aa13b777ac090fb1d9ebfe16c8950c7d26499371dd0b479',
  }
  //123456
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
