package com.example.demo.repository;

import com.example.demo.entity.ConoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoCono extends CrudRepository<ConoEntity, Integer> {

}
