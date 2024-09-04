package com.example.officinabackprog2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.officinabackprog2.model.Marca;

import java.util.List;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Integer>{
    List<Marca>findByNomeMarca(String nomeMarca);
}
