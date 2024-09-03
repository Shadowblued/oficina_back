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
    private Double valorService;

    public Servicos() {
        this.descricaoServico = "Desconhecido";
        this.valorService = 0.00;
    }

    public Servicos(String descricaoServico, Double valorService) {
        this.descricaoServico = descricaoServico;
        this.valorService = valorService;
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
        return valorService;
    }

    public void setValorServico(Double valorService) {
        this.valorService  = valorService;
    }
}
