const express = require('express');
const router = express.Router();

const conexion = require('./database/db');

router.get('/', (req,res)=>{
    res.render('index')
    
    conexion.query('INSERT INTO helados( nombre_Helado, tipo_Helado, costo_Helado) VALUES ("Vainilla", "Dulce", 25)');

    /* conexion.query('SELECT * FROM helados', (error, results)=>{
        if(error){
            throw error;
        }else{
            res.send(results);
        }
    }) */
})

router.get('/heladeria', (req,res)=>{
    res.render('menu')
    /* conexion.query('SELECT * FROM helados', (error, results)=>{
        if(error){
            throw error;
        }else{
            res.send(results);
        }
    }) */
})
router.get('/helados', (req,res)=>{
    res.render('helados')
    /* conexion.query('SELECT * FROM helados', (error, results)=>{
        if(error){
            throw error;
        }else{
            res.send(results);
        }
    }) */
})

router.get('/crearcuenta', (req,res)=>{
    res.render('crearcuenta')
    /* conexion.query('SELECT * FROM helados', (error, results)=>{
        if(error){
            throw error;
        }else{
            res.send(results);
        }
    }) */
})

router.get('/malteadas', (req,res)=>{
    res.render('malteadas')
    /* conexion.query('SELECT * FROM helados', (error, results)=>{
        if(error){
            throw error;
        }else{
            res.send(results);
        }
    }) */
})
router.get('/carrito', (req,res)=>{
    res.render('carrito')
    /* conexion.query('SELECT * FROM helados', (error, results)=>{
        if(error){
            throw error;
        }else{
            res.send(results);
        }
    }) */
})
module.exports = router;