package com.lucas.first_api.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.FetchType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="alumnos")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private Integer dni;

    @ManyToOne( fetch= FetchType.LAZY )
    @JoinColumn(name = "curso_id")
    private Curso curso;

    public Alumno(){}

    public Alumno(String nombre, String apellido, Integer dni, Curso curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.curso = curso;
    }
    

}
