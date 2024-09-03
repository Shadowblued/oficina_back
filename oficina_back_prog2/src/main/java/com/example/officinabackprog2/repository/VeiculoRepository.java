package com.example.officinabackprog2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.officinabackprog2.model.Veiculo;

import java.util.List;


@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Integer> {
    List<Veiculo> findByPlaca(String placa);
    List<Veiculo> findByAnoModelo(String anoModelo); 
    List<Veiculo> findByPlacaAndAnoModelo(String placa, String anoModelo); 
}
