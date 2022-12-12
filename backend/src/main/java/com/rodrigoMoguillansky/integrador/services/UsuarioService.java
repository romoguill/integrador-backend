package com.rodrigoMoguillansky.integrador.services;

import com.rodrigoMoguillansky.integrador.exceptions.NotFoundException;
import com.rodrigoMoguillansky.integrador.models.Turno;
import com.rodrigoMoguillansky.integrador.models.Usuario;
import com.rodrigoMoguillansky.integrador.repositories.TurnoRepository;
import com.rodrigoMoguillansky.integrador.repositories.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UsuarioService {
    private final UsuarioRepository respository;

    public List<Usuario> getAll() {
        return respository.findAll();
    }

    public Usuario getById(int id) throws NotFoundException {
        return respository.findById(id).orElseThrow(NotFoundException::new);
    }

    public void create(Usuario usuario) {
        respository.save(usuario);
    }

    public void update(Usuario usuario) {
        respository.save(usuario);
    }

    public void deleteById(int id) {
        respository.deleteById(id);
    }
}
