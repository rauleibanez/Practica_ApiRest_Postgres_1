package com.apiRest.ApiRest.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.apiRest.ApiRest.models.UsuarioModel;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, String> {
    public abstract ArrayList<UsuarioModel> findByApepatusr(String apepatusr);    
}
