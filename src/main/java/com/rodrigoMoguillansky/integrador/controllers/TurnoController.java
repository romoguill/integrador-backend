package com.rodrigoMoguillansky.integrador.controllers;

import com.rodrigoMoguillansky.integrador.exceptions.NotFoundException;
import com.rodrigoMoguillansky.integrador.models.Turno;
import com.rodrigoMoguillansky.integrador.services.TurnoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor

@CrossOrigin( origins = "http://localhost/8080")
@RestController
@RequestMapping("/turno")

public class TurnoController {

    private final TurnoService service;

    @GetMapping("/all")
    public ResponseEntity<List<Turno>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Turno> getById(@PathVariable int id) throws NotFoundException {
        return ResponseEntity.ok(service.getById(id));
    }
    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody Turno turno){
        service.create(turno);
        return new ResponseEntity<>("Turno creado", HttpStatus.CREATED);
    }
    @PutMapping("/modify")
    public ResponseEntity<String> update(@RequestBody Turno turno){
        service.update(turno);
        return new ResponseEntity<>("Turno modificado", HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable int id ){
        service.deleteById(id);
        return new ResponseEntity<>("Turno eliminado",HttpStatus.OK);

    }
}
