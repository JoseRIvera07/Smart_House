let router = require('express').Router();
let authentication = require('./controllers/authenticationController');
// routes
router.route('/authentication/login')
    .post(authentication.new);
// Export API routes
module.exports = router;
