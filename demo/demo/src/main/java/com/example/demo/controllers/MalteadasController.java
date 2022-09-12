package com.example.demo.controllers;

import com.example.demo.entity.MalteadasEntity;
import com.example.demo.services.ServiceMalteadas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("malteadas")
public class MalteadasController {

    @Autowired
    ServiceMalteadas sM;

    @GetMapping()
    public String guardarMalteadas(){
        MalteadasEntity cE = new MalteadasEntity();
        sM.cargarMalteadas(cE);
        return "Ok";
    }

    @GetMapping("/prueba")
    public String prueba(){
        return "DhPtA";
    }
}
