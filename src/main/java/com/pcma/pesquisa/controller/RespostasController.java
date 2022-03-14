package com.pcma.pesquisa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.pcma.pesquisa.service.AtendimentoService;

public class RespostasController {
	
	@Autowired
	private AtendimentoService atendimentoService;

	@GetMapping("/respostas")
	public String listar(ModelMap model) {
		model.addAttribute("atendimentos", atendimentoService.buscarTodos());
		return "respostas"; 
	}
}
