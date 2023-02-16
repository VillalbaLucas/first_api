package com.lucas.first_api.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.lucas.first_api.Entities.Curso;
import com.lucas.first_api.Repository.CursoRepo;

public class CursoService {
    
    @Autowired
    private CursoRepo repo;

    public void save(Curso a){
        repo.save(a);
    }
    public void findAll(){
        repo.findAll();
    }    
    public Optional<Curso> findById(Long id){
        return repo.findById(null);
    }
    public void deleteById(Long id){
        repo.deleteById(id);
    }
}
