package com.example.demo.services;

import com.example.demo.entity.UsuarioEntity;
import com.example.demo.repository.RepoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceUsuario {

    @Autowired
    RepoUsuario r;

    public UsuarioEntity cargarUsuario(UsuarioEntity h){

        return r.save(h);

    }
}