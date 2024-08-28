package com.example.officinabackprog2.service;

import com.example.officinabackprog2.model.Mecanico;
import com.example.officinabackprog2.model.Pessoa;
import com.example.officinabackprog2.repository.MecanicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MecanicoService {

    @Autowired
    private MecanicoRepository mecanicoRepository;

    @Autowired
    private PessoaService pessoaService;

    public Mecanico save(Mecanico mecanico) {
        Pessoa savedPessoa = pessoaService.save(mecanico);
        return mecanicoRepository.save((Mecanico) savedPessoa);
    }

    public List<Mecanico> findAll() {
        return mecanicoRepository.findAll();
    }

    public Optional<Mecanico> findById(int id) {
        return mecanicoRepository.findById(id);
    }

    public void deleteById(int id) {
        mecanicoRepository.deleteById(id);
    }
}
