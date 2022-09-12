const express = require('express');
const app = express();

app.set('view engine', 'ejs');

app.use('/', require('./router'));
app.use('/public', express.static('public'));

app.listen(5000, ()=>{
    console.log('Servidor prendido en http://localhost:5000');
});

