package com.pcma.pesquisa.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	private String nome_atendente;

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


}
