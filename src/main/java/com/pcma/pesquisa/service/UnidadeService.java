package com.pcma.pesquisa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pcma.pesquisa.domain.Unidades;
import com.pcma.pesquisa.repository.UnidadeRepository;

@Service
public class UnidadeService {

	@Autowired
	private UnidadeRepository unidadeRepository;

	// public void salvar(Unidade Unidade) {
	// unidadeRepository.save(Unidade);
	// }

	public List<Unidades> buscarTodos() {
		return unidadeRepository.findAll();
	}
}
