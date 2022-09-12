package com.example.demo.services;


import com.example.demo.entity.MalteadasEntity;
import com.example.demo.repository.RepoMalteadas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceMalteadas {

    @Autowired
    RepoMalteadas r;

    public MalteadasEntity cargarMalteadas(MalteadasEntity h){

        return r.save(h);
    }
}