package com.example.projeto_tcc.repository;

import com.example.projeto_tcc.model.Iteration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IterationRepository extends JpaRepository<Iteration, Long> {
}

