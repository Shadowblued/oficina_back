package com.example.officinabackprog2.service;

import org.springframework.stereotype.Service;
import com.example.officinabackprog2.model.Pessoa;
import com.example.officinabackprog2.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> findAll(){
        return pessoaRepository.findAll();
    }

    public Optional<Pessoa> findById(int id){
        return pessoaRepository.findById(id);
    }

    public Pessoa save(Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    public Pessoa updatePessoa(int id, Pessoa newPessoaData){

        Optional<Pessoa> optionalPessoa = pessoaRepository.findById(id);

        if(optionalPessoa.isPresent()){
            Pessoa existingPessoa = optionalPessoa.get();

            existingPessoa.setNome(newPessoaData.getNome());
            existingPessoa.setEndereco(newPessoaData.getEndereco());
            existingPessoa.setCpf(newPessoaData.getCpf());
            existingPessoa.setCidade(newPessoaData.getCidade());
            existingPessoa.setTelefone(newPessoaData.getTelefone());

            return pessoaRepository.save(existingPessoa);
        } else {
            return null;
        }

    }

    
    public void deleteById(int id){
         pessoaRepository.deleteById(id);
    }
}
