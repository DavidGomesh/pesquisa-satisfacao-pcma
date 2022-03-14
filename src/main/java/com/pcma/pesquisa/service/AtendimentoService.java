package com.pcma.pesquisa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pcma.pesquisa.domain.Atendimento;
import com.pcma.pesquisa.repository.AtendimentoRepository;

@Service
public class AtendimentoService {

	@Autowired
	private AtendimentoRepository atendimentoRepository;

	public void salvar(Atendimento atendimento) {
		atendimentoRepository.save(atendimento);
	}

	public List<Atendimento> buscarTodos(){
		return atendimentoRepository.findAll();
	}
}
