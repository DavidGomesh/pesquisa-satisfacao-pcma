package com.pcma.pesquisa.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Atendimento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Pessoa pessoa;
	
	private String numero_bo;
	
	private Integer ano_bo;
	
	private String periodo;
	
	private Integer avaliacao;
	
	private String observacao;

	private LocalDate data_atendimento;
	
	private String nome_atendente;
	
	@ManyToOne
	private Cargo cargo;

	@ManyToOne
	@JoinColumn(name="fk_unidade")
	private Unidades unidade;

	@ManyToOne
	private Servico servico;

	private LocalDate data_avaliacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero_bo() {
		return numero_bo;
	}

	public void setNumero_bo(String numero_bo) {
		this.numero_bo = numero_bo;
	}

	public Integer getAno_bo() {
		return ano_bo;
	}

	public void setAno_bo(Integer ano_bo) {
		this.ano_bo = ano_bo;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public Integer getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Integer avaliacao) {
		this.avaliacao = avaliacao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getNome_atendente() {
		return nome_atendente;
	}

	public void setNome_atendente(String nome_atendente) {
		this.nome_atendente = nome_atendente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Unidades getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidades unidade) {
		this.unidade = unidade;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public LocalDate getData_atendimento() {
		return data_atendimento;
	}

	public void setData_atendimento(LocalDate data_atendimento) {
		this.data_atendimento = data_atendimento;
	}

    public LocalDate getData_avaliacao() {
        return data_avaliacao;
    }

    public void setData_avaliacao(LocalDate data_avaliacao) {
        this.data_avaliacao = data_avaliacao;
    }
}
