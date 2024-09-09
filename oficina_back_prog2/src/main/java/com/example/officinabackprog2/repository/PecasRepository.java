package com.example.officinabackprog2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.officinabackprog2.model.Pecas;

import java.util.List;


@Repository
public interface PecasRepository extends JpaRepository<Pecas, Integer> {
    List<Pecas> findByDescricao(String descricao);
    List<Pecas> findByPreco(Double preco); 
}
