package com.rodrigoMoguillansky.integrador.repositories;

import com.rodrigoMoguillansky.integrador.models.Odontologo;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface OdontologoRepository extends JpaRepository<Odontologo, Integer> {
}
