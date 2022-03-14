package com.pcma.pesquisa.repository;

import com.pcma.pesquisa.domain.Atendimento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AtendimentoRepository extends JpaRepository<Atendimento, Long> {
    
}
