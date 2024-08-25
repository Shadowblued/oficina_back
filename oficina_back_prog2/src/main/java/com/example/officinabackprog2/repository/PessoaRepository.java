package com.example.officinabackprog2.repository;

import com.example.officinabackprog2.model.Pessoa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
    List<Pessoa> findByNome(String Nome);
}
