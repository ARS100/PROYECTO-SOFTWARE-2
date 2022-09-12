package com.example.demo.controllers;

import com.example.demo.entity.HeladosEntity;
import com.example.demo.services.ServiceHelados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("helados")
public class HeladosController {

    @Autowired
    ServiceHelados sH;

    @GetMapping()
    public String guardarHelados(){
        HeladosEntity cE = new HeladosEntity();
        sH.cargarHelados(cE);
        return "Ok";
    }

    @GetMapping("/prueba")
    public String prueba(){
        return "DhPtA";
    }
}
