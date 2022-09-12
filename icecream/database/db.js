const mysql = require('mysql');

const conexion = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: '',
    port: '3306',
    database: 'proyecto_software'
})

conexion.connect((error)=>{
    if(error){
        console.error('El error de conexion es: '+ error);
        return
    }
    console.log('Ya está conectado a la BD');
})


module.exports= conexion;