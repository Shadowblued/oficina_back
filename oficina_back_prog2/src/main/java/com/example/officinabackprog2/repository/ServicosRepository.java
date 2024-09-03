package com.example.officinabackprog2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.officinabackprog2.model.Servicos;

import java.util.List;

@Repository
public interface ServicosRepository extends JpaRepository<Servicos, Integer> {
    List<Servicos> findByDescricaoServico(String descricaoServico);
    List<Servicos> findByValorServico(Double  valorServico);
    List<Servicos> findByDescricaoServicoAndValorServicos(String descricaoServico, Double  valorService);
}
