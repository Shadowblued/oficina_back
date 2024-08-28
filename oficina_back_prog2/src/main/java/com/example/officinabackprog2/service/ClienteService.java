package com.example.officinabackprog2.service;

import com.example.officinabackprog2.model.Cliente;
import com.example.officinabackprog2.model.Pessoa;
import com.example.officinabackprog2.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private PessoaService pessoaService;

    public Cliente save(Cliente cliente) {
        Pessoa savedPessoa = pessoaService.save(cliente);
        return clienteRepository.save((Cliente) savedPessoa);
    }

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> findById(int id) {
        return clienteRepository.findById(id);
    }

    public Cliente update(int id, Cliente clienteDetails) {
        Cliente cliente = clienteRepository.findById(id)
            .orElseThrow(() -> new ClienteNotFoundException("Cliente not found for this id :: " + id));

        cliente.setNome(clienteDetails.getNome());
        cliente.setEndereco(clienteDetails.getEndereco());
        cliente.setCpf(clienteDetails.getCpf());
        cliente.setCidade(clienteDetails.getCidade());
        cliente.setTelefone(clienteDetails.getTelefone());

        return clienteRepository.save(cliente);
    }

    public void deleteById(int id) {
        if (clienteRepository.existsById(id)) {
            clienteRepository.deleteById(id);
        } else {
            throw new ClienteNotFoundException("Cliente not found for this id :: " + id);
        }
    }

    public static class ClienteNotFoundException extends RuntimeException {
        public ClienteNotFoundException(String message) {
            super(message);
        }
    }
}
