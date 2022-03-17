package com.pcma.pesquisa.controller;

import com.pcma.pesquisa.domain.Atendimento;
import com.pcma.pesquisa.domain.Cargo;
import com.pcma.pesquisa.domain.Pessoa;
import com.pcma.pesquisa.domain.Servico;
import com.pcma.pesquisa.domain.Unidades;
import com.pcma.pesquisa.dto.PesquisaDTO;
import com.pcma.pesquisa.service.AtendimentoService;
import com.pcma.pesquisa.service.CargoService;
import com.pcma.pesquisa.service.PessoaService;
import com.pcma.pesquisa.service.ServicoService;
import com.pcma.pesquisa.service.UnidadeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
    
    @Autowired
    private AtendimentoService atendimentoService;

    @Autowired
    private CargoService cargoService;

    @Autowired
    private PessoaService pessoaService;

    @Autowired
    private ServicoService servicoService;

    @Autowired
    private UnidadeService unidadeService;

    
    public String home(PesquisaDTO pesquisa){
        return "home";
    }

    @GetMapping("/")
    public ModelAndView home(RedirectAttributes redirectAttributes, PesquisaDTO pesquisa){
        ModelAndView mv = new ModelAndView("/home");
        mv.addObject("listaUnidade", unidadeService.buscarTodos());
        return mv;
    }

    @PostMapping("/salvar")
    public String salvarAvaliacao(PesquisaDTO pesquisa){
        Atendimento atendimento = pesquisa.getAtendimento();
        Servico servico = atendimento.getServico();
        Pessoa pessoa = atendimento.getPessoa();
        Cargo cargo = atendimento.getCargo();

        cargoService.salvar(cargo);
        pessoaService.salvar(pessoa);
        servicoService.salvar(servico);
        atendimentoService.salvar(atendimento);

        return "redirect:/pesquisa/enviada";
    }
}
