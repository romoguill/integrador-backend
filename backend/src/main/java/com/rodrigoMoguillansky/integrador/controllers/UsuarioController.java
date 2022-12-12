package com.rodrigoMoguillansky.integrador.controllers;

import com.rodrigoMoguillansky.integrador.models.Usuario;
import com.rodrigoMoguillansky.integrador.services.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor

@CrossOrigin( origins = "http://localhost/8080")
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private UsuarioService service;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody Usuario usuario) {
        service.create(usuario);
        return new ResponseEntity<>("Usuario creado", HttpStatus.CREATED);
    }
}
