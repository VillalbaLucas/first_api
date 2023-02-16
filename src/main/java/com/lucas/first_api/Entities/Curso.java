package com.lucas.first_api.Entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="cursos")
public class Curso {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int duracion;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "curso")
    private Set<Alumno> alumnos = new HashSet<Alumno>();

    public void addAlumnos(Alumno a){
        alumnos.add(a);
    }

    public Curso() {
    }

    public Curso(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }
    
}
