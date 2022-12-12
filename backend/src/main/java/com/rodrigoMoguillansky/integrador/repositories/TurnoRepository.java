package com.rodrigoMoguillansky.integrador.repositories;

import com.rodrigoMoguillansky.integrador.models.Turno;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TurnoRepository extends JpaRepository<Turno, Integer>{
}
