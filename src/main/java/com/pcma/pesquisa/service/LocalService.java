package com.pcma.pesquisa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pcma.pesquisa.domain.Local;
import com.pcma.pesquisa.repository.LocalRepository;

@Service
public class LocalService {

	@Autowired
	private LocalRepository localRepository;

	public void salvar(Local local) {
		localRepository.save(local);
	}

	public List<Local> buscarTodos(){
		return localRepository.findAll();
	}
}
