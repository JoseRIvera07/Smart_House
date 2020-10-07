'use strict';
let express = require('express');

let router = module.exports = express.Router();
let authentication = require('./authentication');

router.use('/authentication',authentication);