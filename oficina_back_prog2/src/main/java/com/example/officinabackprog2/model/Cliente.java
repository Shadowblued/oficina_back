package com.example.officinabackprog2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente extends Pessoa {


    private String email;

    public Cliente() {
        super();
    }

    public Cliente(String nome, String telefone) {
        super(nome, telefone);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
