package com.rodrigoMoguillansky.integrador.services;

import com.rodrigoMoguillansky.integrador.exceptions.NotFoundException;
import com.rodrigoMoguillansky.integrador.models.Paciente;
import com.rodrigoMoguillansky.integrador.repositories.PacienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PacienteService {
    private final PacienteRepository respository;

    public List<Paciente> getAll() {
        return respository.findAll();
    }

    public Paciente getById(int id) throws NotFoundException {
        return respository.findById(id).orElseThrow(NotFoundException::new);
    }

    public void create(Paciente paciente) {
        respository.save(paciente);
    }

    public void update(Paciente paciente) {
        respository.save(paciente);
    }

    public void deleteById(int id) {
        respository.deleteById(id);
    }
}
