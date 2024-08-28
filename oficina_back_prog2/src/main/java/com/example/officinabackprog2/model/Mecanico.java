package com.example.officinabackprog2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "mecanico")
public class Mecanico extends Pessoa {

    public Mecanico() {
        super();
    }

    public Mecanico(String nome, String telefone) {
        super(nome, telefone);
    }
}
