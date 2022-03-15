package com.pcma.pesquisa.dto;

import com.pcma.pesquisa.domain.Atendimento;
import com.pcma.pesquisa.domain.Cargo;
import com.pcma.pesquisa.domain.Local;
import com.pcma.pesquisa.domain.Pessoa;
import com.pcma.pesquisa.domain.Servico;

public class PesquisaDTO {
    private String nome;
    private String idade;
    private String sexo;
    private String cpf;
    private String email;
    private String telefone;
    private String deficiencia;
    private String lgbt;

    private String nome_atendente;
    private String nome_local;
    private String nome_cargo;
    
    private String nome_servico;

    private String numero_bo;
    private String ano_bo;
    private String periodo;
    private String avaliacao;
    private String observacao;

    public PesquisaDTO() {
    }

  

    public Pessoa getPessoa() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(this.nome.toUpperCase());
        pessoa.setIdade(Integer.parseInt(this.idade));
        pessoa.setSexo(this.sexo.toUpperCase());
        pessoa.setCpf(this.cpf.replace(".", "").replace("-", ""));
        pessoa.setEmail(this.email.toUpperCase());
        pessoa.setTelefone(this.telefone.replace("(","").replace(")", "").replace("-", "").replace(" ", ""));
        pessoa.setDeficiencia(this.deficiencia.equals("Sim") ? true : false);
        if(this.lgbt!=null) {
        	pessoa.setLgbt(this.lgbt.equals("Sim") ? true : false);
        }else {
         pessoa.setLgbt(false);
        }
       	
        return pessoa;
    }

    public Cargo getCargo() {
        Cargo cargo = new Cargo();
        cargo.setNome(this.nome_cargo.toUpperCase());

        return cargo;
    }

    public Local getLocal() {
        Local local = new Local();
        local.setNome(this.nome_local.toUpperCase());

        return local;
    }

    public Servico getServico() {
        Servico servico = new Servico();
        servico.setNome(this.nome_servico.toUpperCase());

        return servico;
    }

    public Atendimento getAtendimento() {
        Atendimento atendimento = new Atendimento();
        atendimento.setPessoa(this.getPessoa());

        if(!this.numero_bo.isBlank()){
            atendimento.setNumero_bo(this.numero_bo);
        } else{
            atendimento.setNumero_bo("-1");
        }

        if (!this.numero_bo.isBlank()) {
            atendimento.setAno_bo(Integer.parseInt(this.ano_bo));
        } else {
            atendimento.setAno_bo(-1);
        }
        
        atendimento.setPeriodo(this.periodo.toUpperCase());
        atendimento.setAvaliacao(Integer.parseInt(this.avaliacao));
        atendimento.setObservacao(this.observacao.toUpperCase());
        atendimento.setNome_atendente(this.nome_atendente.toUpperCase());
        atendimento.setCargo(this.getCargo());
        atendimento.setLocal(this.getLocal());
        atendimento.setServico(this.getServico());

        return atendimento;
    }

    // public

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDeficiencia() {
        return deficiencia;
    }

    public void setDeficiencia(String deficiencia) {
        this.deficiencia = deficiencia;
    }

    public String getLgbt() {
        return lgbt;
    }

    public void setLgbt(String lgbt) {
        this.lgbt = lgbt;
    }

    public String getNome_local() {
        return nome_local;
    }

    public void setNome_local(String nome_local) {
        this.nome_local = nome_local;
    }

    public String getNome_atendente() {
        return nome_atendente;
    }

    public void setNome_atendente(String nome_atendente) {
        this.nome_atendente = nome_atendente;
    }

    public String getNome_cargo() {
        return nome_cargo;
    }

    public void setNome_cargo(String nome_cargo) {
        this.nome_cargo = nome_cargo;
    }

    public String getNome_servico() {
        return nome_servico;
    }

    public void setNome_servico(String nome_servico) {
        this.nome_servico = nome_servico;
    }

    public String getNumero_bo() {
        return numero_bo;
    }

    public void setNumero_bo(String numero_bo) {
        this.numero_bo = numero_bo;
    }

    public String getAno_bo() {
        return ano_bo;
    }

    public void setAno_bo(String ano_bo) {
        this.ano_bo = ano_bo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
