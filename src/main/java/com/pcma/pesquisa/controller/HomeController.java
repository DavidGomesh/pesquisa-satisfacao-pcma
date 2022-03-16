package com.pcma.pesquisa.controller;

import com.pcma.pesquisa.domain.Atendimento;
import com.pcma.pesquisa.domain.Cargo;
import com.pcma.pesquisa.domain.Local;
import com.pcma.pesquisa.domain.Pessoa;
import com.pcma.pesquisa.domain.Servico;
import com.pcma.pesquisa.dto.PesquisaDTO;
import com.pcma.pesquisa.service.AtendimentoService;
import com.pcma.pesquisa.service.CargoService;
import com.pcma.pesquisa.service.LocalService;
import com.pcma.pesquisa.service.PessoaService;
import com.pcma.pesquisa.service.ServicoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    
    @Autowired
    private AtendimentoService atendimentoService;

    @Autowired
    private CargoService cargoService;

    @Autowired
    private LocalService localService;

    @Autowired
    private PessoaService pessoaService;

    @Autowired
    private ServicoService servicoService;

    @GetMapping("/")
    public String home(PesquisaDTO pesquisa){
        return "home";
    }

    @PostMapping("/salvar")
    public String salvarAvaliacao(PesquisaDTO pesquisa){
        Atendimento atendimento = pesquisa.getAtendimento();
        Servico servico = atendimento.getServico();
        Pessoa pessoa = atendimento.getPessoa();
        Cargo cargo = atendimento.getCargo();
        Local local = atendimento.getLocal();

        cargoService.salvar(cargo);
        localService.salvar(local);
        pessoaService.salvar(pessoa);
        servicoService.salvar(servico);
        atendimentoService.salvar(atendimento);

        return "redirect:/pesquisa/enviada";
    }
}
