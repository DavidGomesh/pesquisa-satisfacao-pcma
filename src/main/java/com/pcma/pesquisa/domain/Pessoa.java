package com.pcma.pesquisa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column (nullable = false)
	private String nome;
	
	private Integer idade;
	
	private Character sexo;
	
	private String cpf;
	
	private String email;
	
	private String telefone;
	
	private Boolean deficiencia;
	
	private Boolean lgbt;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
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

	public boolean isDeficiencia() {
		return deficiencia;
	}

	public void setDeficiencia(boolean deficiencia) {
		this.deficiencia = deficiencia;
	}

	public boolean isLgbt() {
		return lgbt;
	}

	public void setLgbt(boolean lgbt) {
		this.lgbt = lgbt;
	}

	
	

}
