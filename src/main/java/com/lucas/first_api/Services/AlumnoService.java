package com.lucas.first_api.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.first_api.Entities.Alumno;
import com.lucas.first_api.Repository.AlumnoRepo;

@Service
public class AlumnoService {

    @Autowired
    private AlumnoRepo repo;

    public void save(Alumno a){
        repo.save(a);
    }
    public void findAll(){
        repo.findAll();
    }    
    public Optional<Alumno> findById(Long id){
        return repo.findById(null);
    }
    public void deleteById(Long id){
        repo.deleteById(id);
    }
    public void saveAll(Iterable<Alumno> a){
        repo.saveAll(a);
    }
}
