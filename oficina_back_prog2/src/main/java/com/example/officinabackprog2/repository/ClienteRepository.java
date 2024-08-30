package com.example.officinabackprog2.repository;

import com.example.officinabackprog2.model.Cliente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

    List<Cliente> findByNome(String nome);
    List<Cliente> findByCpf(String cpf);
    List<Cliente> findByNomeAndCpf(String nome, String cpf);
    
}
