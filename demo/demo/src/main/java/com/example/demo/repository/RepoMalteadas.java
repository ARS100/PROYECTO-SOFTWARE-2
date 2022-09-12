package com.example.demo.repository;

import com.example.demo.entity.MalteadasEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoMalteadas extends CrudRepository<MalteadasEntity, Integer> {
}
