const express = require('express');
const app = express();
const environment = 'http://localhost:8080';
app.use(express.static('public'));

app.set('view engine', 'ejs');
app.listen(8080);
console.log('Listening on 8080');
