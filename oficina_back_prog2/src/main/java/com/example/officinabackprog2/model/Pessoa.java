package com.example.officinabackprog2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pessoa")

public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "cpf", unique = true)
    private String cpf;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "telefone")
    private String telefone;

    public Pessoa() {

    }

    public Pessoa(String nome, String endereco, String cpf, String cidade, String telefone){
          
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.cidade = cidade;
        this.telefone = telefone;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    @Override
    public String toString(){
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cidade='" + cidade + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}




