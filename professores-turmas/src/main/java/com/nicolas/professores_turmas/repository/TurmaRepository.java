// TurmaRepository.java
package com.nicolas.professores_turmas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nicolas.professores_turmas.entities.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Long> {}
