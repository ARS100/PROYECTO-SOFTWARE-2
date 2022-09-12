package com.example.demo.controllers;

import com.example.demo.entity.UsuarioEntity;
import com.example.demo.services.ServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("usuario")


public class UsuarioController {
    @Autowired
    ServiceUsuario sM;

    @PostMapping()
    public ResponseEntity<UsuarioEntity> guardarUsuario(@RequestBody UsuarioEntity uE){
        UsuarioEntity uE1 = new UsuarioEntity();
        uE1.setIdUsuario(uE.getIdUsuario());
        uE1.setTipoDeUsuario(uE.getTipoDeUsuario());
        uE1.setContraseña(uE.getContraseña());
        uE1.setNombre(uE.getNombre());

        sM.cargarUsuario(uE1);
        return new ResponseEntity<UsuarioEntity>(uE1, HttpStatus.OK);
    }

    @GetMapping("/prueba")
    public String prueba(){
        return "DhPtA";
    }
}
