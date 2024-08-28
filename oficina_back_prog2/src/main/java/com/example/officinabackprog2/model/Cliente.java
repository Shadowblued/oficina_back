package com.example.officinabackprog2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente extends Pessoa {

    public Cliente() {
        super();
    }

    public Cliente(String nome, String telefone) {
        super(nome, telefone);
    }
}
