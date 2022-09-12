package com.example.demo.repository;

import com.example.demo.entity.HeladosEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoHelados extends CrudRepository<HeladosEntity, Integer> {
}
