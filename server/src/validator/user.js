'use strict';

let expose = {
  exists : undefined,
  getAuth : undefined,
  add : undefined,
  validate : undefined
};

expose.exists = (data, cb) => {
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
}

expose.getAuth = (data, cb) => {
  let to_return = {
    error : undefined,
    success : undefined,
    detail : undefined,
    data : undefined,
  };

  to_return.data = {
    Password : 'ff7f73b854845fc02aa13b777ac090fb1d9ebfe16c8950c7d26499371dd0b479',
  } //123456
  cb(to_return);
}

module.exports = expose;
