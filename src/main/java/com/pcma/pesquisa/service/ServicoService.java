package com.pcma.pesquisa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pcma.pesquisa.domain.Servico;
import com.pcma.pesquisa.repository.ServicoRepository;

@Service
public class ServicoService {

	@Autowired
	private ServicoRepository servicoRepository;

	public void salvar(Servico servico) {
		servicoRepository.save(servico);
	}

	public List<Servico> buscarTodos(){
		return servicoRepository.findAll();
	}
}
