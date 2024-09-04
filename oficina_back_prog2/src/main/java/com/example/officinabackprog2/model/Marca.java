package com.example.officinabackprog2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Marca")
public class Marca {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nomeMarca;

    public Marca(){
     this.nomeMarca = "Desconhecido";
    }

    public Marca(String nomeMarca){
        this.nomeMarca = nomeMarca;
    }

    public Integer getId(){
        return id;
    }

    public String getNomeMarca(){
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca){
        this.nomeMarca = nomeMarca;
    }

}