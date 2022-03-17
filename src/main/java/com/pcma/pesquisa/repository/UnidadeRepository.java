package com.pcma.pesquisa.repository;

import com.pcma.pesquisa.domain.Unidades;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadeRepository extends JpaRepository<Unidades, Integer> {
    
}
