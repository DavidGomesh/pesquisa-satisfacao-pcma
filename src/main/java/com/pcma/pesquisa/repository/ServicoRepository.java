package com.pcma.pesquisa.repository;

import com.pcma.pesquisa.domain.Servico;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
    
}
