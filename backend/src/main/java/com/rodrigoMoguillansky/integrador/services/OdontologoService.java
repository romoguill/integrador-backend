package com.rodrigoMoguillansky.integrador.services;

import com.rodrigoMoguillansky.integrador.exceptions.NotFoundException;
import com.rodrigoMoguillansky.integrador.models.Odontologo;
import com.rodrigoMoguillansky.integrador.models.Paciente;
import com.rodrigoMoguillansky.integrador.repositories.OdontologoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class OdontologoService {
    private final OdontologoRepository respository;

    public List<Odontologo> getAll() {
        return respository.findAll();
    }

    public Odontologo getById(int id) throws NotFoundException {
        return respository.findById(id).orElseThrow(NotFoundException::new);
    }

    public void create(Odontologo odontologo) {
        respository.save(odontologo);
    }

    public void update(Odontologo odontologo) {
        respository.save(odontologo);
    }

    public void deleteById(int id) {
        respository.deleteById(id);
    }
}
