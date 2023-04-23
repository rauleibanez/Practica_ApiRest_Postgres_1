package com.apiRest.ApiRest.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apiRest.ApiRest.models.UsuarioModel;
import com.apiRest.ApiRest.services.UsuarioServices;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioServices usuarioServices;

    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return usuarioServices.obtenerUsuarios();
    }

    @PostMapping()
    public UsuarioModel guardaUsuario(@RequestBody UsuarioModel usuario){
        return this.usuarioServices.guardarUsuario(usuario);
    }

    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") String idusr){
        return this.usuarioServices.obtenerPorId(idusr);
    }
    
    /* http://localhost:8080/usuario/query?apepatusr=Rojas */
    @GetMapping("/query")
    public ArrayList<UsuarioModel> obtenerUsuarioPorApellido(@RequestParam("apepatusr") String apepatusr){
        return this.usuarioServices.obtenerPorApellido(apepatusr);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") String idusr){
        boolean ok = this.usuarioServices.eliminarUsuario(idusr);
        if (ok){
            return "Se Eliminó el usuario con ID " + idusr;
        } else {
            return "NO Se pudo Eliminar el usuario con ID " + idusr;
        }
        
    }

}
