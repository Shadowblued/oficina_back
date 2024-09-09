package com.example.officinabackprog2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name =  "Pecas")
public class Pecas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String descricao;

    private Double preco;

    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marca marca;

    public Pecas() {
        this.descricao = "Desconhecido";
        this.preco = 0.00;
    }

    public Pecas(String descricao, Double preco,  Marca marca) {
        this.descricao = descricao;
        this.preco = preco;
        this.marca = marca;
    }
    
    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}