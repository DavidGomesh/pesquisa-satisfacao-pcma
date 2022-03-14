package com.pcma.pesquisa.repository;

import com.pcma.pesquisa.domain.Cargo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<Cargo, Long> {
    
}
