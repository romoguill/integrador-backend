package com.rodrigoMoguillansky.integrador.controllers;

import com.rodrigoMoguillansky.integrador.exceptions.NotFoundException;
import com.rodrigoMoguillansky.integrador.models.Paciente;
import com.rodrigoMoguillansky.integrador.services.PacienteService;
import com.rodrigoMoguillansky.integrador.services.PacienteService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor

@CrossOrigin( origins = "http://localhost/8080")
@RestController
@RequestMapping("/paciente")
public class PacienteController {

    private final PacienteService service;

    @GetMapping("/all")
    public ResponseEntity<List<Paciente>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Paciente> getById(@PathVariable int id) throws NotFoundException {
        return ResponseEntity.ok(service.getById(id));
    }
    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody Paciente paciente){
        service.create(paciente);
        return new ResponseEntity<>("Paciente creado", HttpStatus.CREATED);
    }
    @PutMapping("/modify")
    public ResponseEntity<String> update(@RequestBody Paciente paciente){
        service.update(paciente);
        return new ResponseEntity<>("Paciente modificado", HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable int id ){
        service.deleteById(id);
        return new ResponseEntity<>("Paciente eliminado",HttpStatus.OK);

    }
}