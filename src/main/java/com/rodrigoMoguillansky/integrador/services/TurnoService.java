package com.rodrigoMoguillansky.integrador.services;

import com.rodrigoMoguillansky.integrador.exceptions.NotFoundException;
import com.rodrigoMoguillansky.integrador.models.Paciente;
import com.rodrigoMoguillansky.integrador.models.Turno;
import com.rodrigoMoguillansky.integrador.repositories.PacienteRepository;
import com.rodrigoMoguillansky.integrador.repositories.TurnoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TurnoService {

    private final TurnoRepository respository;

    public List<Turno> getAll() {
        return respository.findAll();
    }

    public Turno getById(int id) throws NotFoundException {
        return respository.findById(id).orElseThrow(NotFoundException::new);
    }

    public void create(Turno turno) {
        respository.save(turno);
    }

    public void update(Turno turno) {
        respository.save(turno);
    }

    public void deleteById(int id) {
        respository.deleteById(id);
    }
}
