package com.rodrigoMoguillansky.integrador.repositories;

import com.rodrigoMoguillansky.integrador.models.Turno;
import com.rodrigoMoguillansky.integrador.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByEmail(String email);
}