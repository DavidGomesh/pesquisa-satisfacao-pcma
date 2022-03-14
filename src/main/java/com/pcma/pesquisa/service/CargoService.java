package com.pcma.pesquisa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pcma.pesquisa.domain.Cargo;
import com.pcma.pesquisa.repository.CargoRepository;

@Service
public class CargoService {

	@Autowired
	private CargoRepository cargoRepository;

	public void salvar(Cargo cargo) {
		cargoRepository.save(cargo);
	}

	public List<Cargo> buscarTodos(){
		return cargoRepository.findAll();
	}
}
