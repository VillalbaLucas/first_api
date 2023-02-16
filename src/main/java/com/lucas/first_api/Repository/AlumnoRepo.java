package com.lucas.first_api.Repository;

import org.springframework.data.repository.CrudRepository;

import com.lucas.first_api.Entities.Alumno;

public interface AlumnoRepo extends CrudRepository<Alumno, Long> {
}
