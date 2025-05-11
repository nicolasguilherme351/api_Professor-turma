// ProfessorService.java
package com.nicolas.professores_turmas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nicolas.professores_turmas.entities.Professor;
import com.nicolas.professores_turmas.repository.ProfessorRepository;

@Service
public class ProfessorService {
    private final ProfessorRepository repository;

    public ProfessorService(ProfessorRepository repository) {
        this.repository = repository;
    }

    public List<Professor> findAll() {
        return repository.findAll();
    }

    public Professor save(String nome, Integer idade) {
    	Professor professor = new Professor(null, nome, idade); 
        return repository.save(professor);
    }
}
