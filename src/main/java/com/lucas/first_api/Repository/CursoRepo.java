package com.lucas.first_api.Repository;

import org.springframework.data.repository.CrudRepository;

import com.lucas.first_api.Entities.Curso;

public interface CursoRepo extends CrudRepository<Curso, Long> {
}
