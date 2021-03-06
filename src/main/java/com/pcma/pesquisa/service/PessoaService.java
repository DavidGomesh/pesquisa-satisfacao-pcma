package com.pcma.pesquisa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pcma.pesquisa.domain.Pessoa;
import com.pcma.pesquisa.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	public void salvar(Pessoa pessoa) {
		pessoaRepository.save(pessoa);
	}

	public List<Pessoa> buscarTodos(){
		return pessoaRepository.findAll();
	}
}
