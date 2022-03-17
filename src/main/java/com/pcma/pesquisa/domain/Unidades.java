package com.pcma.pesquisa.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Unidades implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    private Integer idUnidades;

    private String cidade;
    private String descricao;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    

    public Integer getIdUnidades() {
        return idUnidades;
    }

    public void setIdUnidades(Integer idUnidades) {
        this.idUnidades = idUnidades;
    }

    @Override
    public String toString() {
        return "Unidades [cidade=" + cidade + ", descricao=" + descricao + ", idUnidades=" + idUnidades + "]";
    }

    
}
