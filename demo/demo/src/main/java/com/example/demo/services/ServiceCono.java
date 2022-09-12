package com.example.demo.services;

import com.example.demo.entity.ConoEntity;
import com.example.demo.repository.RepoCono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceCono {

    @Autowired
    RepoCono rC;

    public ConoEntity cargarCono(ConoEntity ce){
        return rC.save(ce);
    }
}
