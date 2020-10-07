'use strict';

let authentication = require('../validator/auth');

exports.new = function (req, res) {
  console.log(req.body);
  const email = req.body.email;
  const password = req.body.password;

  authentication.login({
    email : email,
    password : password
  }, (result) => {

    if(result.error){
      res.status(503).json({
        error : 'Internal Server Error, it has been registered.'
      })
      return;
    }

    res.json(result);
  })
};
