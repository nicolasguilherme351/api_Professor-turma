package com.nicolas.professores_turmas.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.nicolas.professores_turmas.entities.Coisa;

public interface CoisaRepository extends JpaRepository<Coisa, Long> {}
