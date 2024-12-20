package com.coworking.sistema_reservas.controllers;

import com.coworking.sistema_reservas.model.Usuario;
import com.coworking.sistema_reservas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping()
    public List<Usuario> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping
    public Usuario agregarUsuario(@RequestBody Usuario usuario){
        return usuarioService.agregarUsuario(usuario);
    }

    @DeleteMapping("/{id}")
    public String borrarUsuario(@PathVariable int id){
        boolean respuesta=usuarioService.borrarUsuario(id);
        if(respuesta){
            return "Se elimino el usuario correctamente";
        }
        return "Error, no se pudo eliminar el usuario";
    }
}
