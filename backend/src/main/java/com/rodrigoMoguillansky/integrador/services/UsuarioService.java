package com.rodrigoMoguillansky.integrador.services;

import com.rodrigoMoguillansky.integrador.exceptions.NotFoundException;
import com.rodrigoMoguillansky.integrador.models.Turno;
import com.rodrigoMoguillansky.integrador.models.Usuario;
import com.rodrigoMoguillansky.integrador.repositories.TurnoRepository;
import com.rodrigoMoguillansky.integrador.repositories.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class UsuarioService implements UserDetailsService {
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

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = respository.findByEmail(username);
        if(usuario == null) {
            throw new UsernameNotFoundException("Credenciales invalidas");
        }
        return new User(usuario.getEmail(),usuario.getPassword(), new ArrayList<>(usuario.getAuthorities()));
    }
}
