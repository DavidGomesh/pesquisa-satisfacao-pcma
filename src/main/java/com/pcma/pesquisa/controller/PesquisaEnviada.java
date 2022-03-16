package com.pcma.pesquisa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * PesquisaEnviada
 */
@Controller
@RequestMapping("/pesquisa")
public class PesquisaEnviada {

    @GetMapping("/enviada")
    public String pesquisaEnviada(){
        return "pesquisa-enviada";
    }
}