package com.example.demo.services;


import com.example.demo.entity.HeladosEntity;
import com.example.demo.repository.RepoHelados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceHelados {

    @Autowired
    RepoHelados r;

    public HeladosEntity cargarHelados(HeladosEntity h){

        return r.save(h);
    }
}