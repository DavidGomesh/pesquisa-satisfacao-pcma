package com.pcma.pesquisa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pcma.pesquisa.domain.Pessoa;
import com.pcma.pesquisa.service.PessoaService;


@Controller
@RequestMapping("/pessoa")
public class PessoaController {

	
	@Autowired private PessoaService service;
	 
	@PostMapping("/salvar")
	public String salvar(Pessoa pessoa) {
		service.salvar(pessoa);
		return "home";
	}
	
	@GetMapping("/listar")
	public String listar() {
		service.buscarTodos().stream().forEach(pessoa -> System.out.println(pessoa.getNome()));		
		return "home";
	}	
}
