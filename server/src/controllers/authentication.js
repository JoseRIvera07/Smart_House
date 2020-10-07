'use strict';

// Module that handles the RESTful service routes
let express = require('express');
let config = require('config');

let router = module.exports = express.Router();

let authentication = require('../business/authentication');
//let recaptcha = require('../tools/recaptcha');
//let notification = require('../tools/notification');
let user = require('../repository/user');

let expose ={
  exist:null,
  login:null,
  registerDriver:null
};

/**
 * Main Handler
 */
/*router.use((req,res,next) => {
  recaptcha.shield(req,res,next);
});*/
/*
router.get('/validate/:key', (req,res) => {
  const key = req.params.key;
  const url_forward = config.get('authentication.account-verification.url-forward')
  user.validate(key, result => {
    if(result.length == 0){
      res.status(403).json({
        error : 'Invalid Authentication Token'
      })
    }else{
      const user = result[0];
      notification.emailConfirmation(user.Lang, user.Email, user.Name)
      res.redirect(url_forward);      
    }
  })
})
*/

router.post('/login', (req,res) => {
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
})
