package com.example.demo.repository;

import com.example.demo.entity.CarritoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepoCarrito extends CrudRepository<CarritoEntity, Integer> {

}
