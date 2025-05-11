// ProfessorRepository.java
package com.nicolas.professores_turmas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nicolas.professores_turmas.entities.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {}
