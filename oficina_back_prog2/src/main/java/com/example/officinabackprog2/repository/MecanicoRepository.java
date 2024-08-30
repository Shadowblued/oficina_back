package com.example.officinabackprog2.repository;

import com.example.officinabackprog2.model.Mecanico;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MecanicoRepository extends JpaRepository<Mecanico, Integer>{

    List<Mecanico>findByNome(String nome);
    List<Mecanico>findByCpf(String cpf);
    List<Mecanico>findByNomeAndCpf(String nome, String cpf);
    
}
