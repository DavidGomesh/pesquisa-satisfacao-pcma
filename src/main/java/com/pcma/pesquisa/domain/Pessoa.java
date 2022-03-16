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
	
	private String sexo;
	
	private String cpf;
	
	private String email;
	
	private String telefone;
	
	private String deficiencia;
	
	private String lgbt;

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

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
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

    @Override
	public String toString() {
		return "Pessoa [cpf=" + cpf + ", deficiencia=" + deficiencia + ", email=" + email + ", id=" + id + ", idade="
				+ idade + ", lgbt=" + lgbt + ", nome=" + nome + ", sexo=" + sexo + ", telefone=" + telefone + "]";
	}

	

	
	

}
