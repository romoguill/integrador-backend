package com.rodrigoMoguillansky.integrador.controllers;

import com.rodrigoMoguillansky.integrador.exceptions.NotFoundException;
import com.rodrigoMoguillansky.integrador.models.Odontologo;
import com.rodrigoMoguillansky.integrador.services.OdontologoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor

@CrossOrigin( origins = "http://localhost/8080")
@RestController
@RequestMapping("/odontologo")
public class OdontologoController {

    private final OdontologoService service;

    @GetMapping("/all")
    public ResponseEntity<List<Odontologo>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Odontologo> getById(@PathVariable int id) throws NotFoundException {
        return ResponseEntity.ok(service.getById(id));
    }
    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody Odontologo odontologo){
        service.create(odontologo);
        return new ResponseEntity<>("Odontologo creado", HttpStatus.CREATED);
    }
    @PutMapping("/modify")
    public ResponseEntity<String> update(@RequestBody Odontologo odontologo){
        service.update(odontologo);
        return new ResponseEntity<>("Odontologo modificado", HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable int id ){
        service.deleteById(id);
        return new ResponseEntity<>("Odontologo eliminado",HttpStatus.OK);

    }
}
