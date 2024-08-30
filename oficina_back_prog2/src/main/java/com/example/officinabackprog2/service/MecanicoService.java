package com.example.officinabackprog2.service;

import com.example.officinabackprog2.model.Cliente;
import com.example.officinabackprog2.model.Mecanico;
import com.example.officinabackprog2.model.Pessoa;
import com.example.officinabackprog2.repository.MecanicoRepository;
import com.example.officinabackprog2.service.ClienteService.ClienteNotFoundException;

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

    public List<Mecanico> findByNome(String nome) {
        return mecanicoRepository.findByNome(nome);
    }

    public List<Mecanico> findByCpf(String cpf){
        return mecanicoRepository.findByCpf(cpf);
    }
     
    public List<Mecanico> findByNomeAndCpf(String nome, String cpf){
        return mecanicoRepository.findByNomeAndCpf(nome, cpf);
    }

        public Mecanico update(int id, Mecanico mecanicoDetails) { 
        Mecanico mecanico = mecanicoRepository.findById(id)
            .orElseThrow(() -> new MecanicoNotFoundException("mecanico not found for this id :: " + id));

        mecanico.setNome(mecanicoDetails.getNome());
        mecanico.setEndereco(mecanicoDetails.getEndereco());
        mecanico.setCpf(mecanicoDetails.getCpf());
        mecanico.setCidade(mecanicoDetails.getCidade());
        mecanico.setTelefone(mecanicoDetails.getTelefone());

        return mecanicoRepository.save(mecanico);
    }


    public void deleteById(int id) {
        mecanicoRepository.deleteById(id);
    }

    public static class MecanicoNotFoundException extends RuntimeException {
        public MecanicoNotFoundException(String message) {
            super(message);
        }
    }
    

}
