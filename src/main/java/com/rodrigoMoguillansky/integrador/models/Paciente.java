package com.rodrigoMoguillansky.integrador.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Pacientes")

public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private  String nombre;
    @Column
    private  String apellido;
    @Column
    private  String domicilio;
    @Column
    private  String dni;
    @Column
    private LocalDate fechaAlta;


}
