// ProfessorController.java
package com.nicolas.professores_turmas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nicolas.professores_turmas.entities.Professor;
import com.nicolas.professores_turmas.service.ProfessorService;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
	
	@Autowired	
    private ProfessorService service;

    public ProfessorController(ProfessorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Professor> listar() {
        return service.findAll();
    }

    @PostMapping("/{nome}/{idade}")
    public Professor salvar(@PathVariable String nome, @PathVariable Integer idade) {
        return service.save(nome, idade);
    }
}
