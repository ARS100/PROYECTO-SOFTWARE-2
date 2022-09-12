package com.example.demo.controllers;


import com.example.demo.entity.CarritoEntity;
import com.example.demo.services.ServiceCarrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("carrito")
public class CarritoController {

    @Autowired
    ServiceCarrito sC;

    @GetMapping()
    public String guardarCarrito(){
        CarritoEntity cE = new CarritoEntity();
        sC.cargarCarrito(cE);
        return "Ok";
    }

    @GetMapping("/prueba")
    public String prueba(){
        return "DhPtA";
    }
}
