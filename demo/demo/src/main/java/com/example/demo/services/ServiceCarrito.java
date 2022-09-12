package com.example.demo.services;

import com.example.demo.entity.CarritoEntity;
import com.example.demo.repository.RepoCarrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiceCarrito {

    @Autowired
    RepoCarrito rC;

    public CarritoEntity cargarCarrito(CarritoEntity c){
        return rC.save(c);
    }

}
