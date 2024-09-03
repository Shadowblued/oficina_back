package com.example.officinabackprog2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Servicos")
public class Servicos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descricaoServico;
    private Double valorServico;

    public Servicos() {
        this.descricaoServico = "Desconhecido";
        this.valorServico = 0.00;
    }

    public Servicos(String descricaoServico, Double valorServico) {
        this.descricaoServico = descricaoServico;
        this.valorServico = valorServico;
    }

    public Integer getId() {
        return id;
    }

    public String getDescricaoServico() {
        return descricaoServico;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico =  descricaoServico;
    }

    public Double getValorServico() {
        return valorServico;
    }

    public void setValorServico(Double valorServico) {
        this.valorServico  = valorServico;
    }
}
