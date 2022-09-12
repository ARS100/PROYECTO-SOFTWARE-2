package com.example.demo.controllers;

import com.example.demo.entity.ConoEntity;
import com.example.demo.services.ServiceCono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cono")
public class ConoController {

    @Autowired
    ServiceCono sC;

    @GetMapping()
    public String guardarCono(){
        ConoEntity cE = new ConoEntity();
        sC.cargarCono(cE);
        return "Ok";
    }

    @GetMapping("/prueba")
    public String prueba(){
        return "DhPtA";
    }
}
