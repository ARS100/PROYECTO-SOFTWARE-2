package com.example.demo.repository;

import com.example.demo.entity.UsuarioEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoUsuario extends CrudRepository<UsuarioEntity, Integer> {
}
