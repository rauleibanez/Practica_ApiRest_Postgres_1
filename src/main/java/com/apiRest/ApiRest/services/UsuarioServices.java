package com.apiRest.ApiRest.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiRest.ApiRest.models.UsuarioModel;
import com.apiRest.ApiRest.repositories.UsuarioRepository;

@Service
public class UsuarioServices {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);        
    }

    public Optional <UsuarioModel> obtenerPorId(String idusr){
        return usuarioRepository.findById(idusr);
    }

    public ArrayList<UsuarioModel> obtenerPorApellido(String apepatusr){
        return usuarioRepository.findByApepatusr(apepatusr);
    }

    public boolean eliminarUsuario(String idusr){
        try{
            usuarioRepository.deleteById(idusr);
            return true;            
        } catch(Exception err) {
            return false;
        }
    }
}
