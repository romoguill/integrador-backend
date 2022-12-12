package com.rodrigoMoguillansky.integrador.repositories;

import com.rodrigoMoguillansky.integrador.models.Paciente;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
}
