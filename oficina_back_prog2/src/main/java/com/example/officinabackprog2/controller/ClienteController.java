package com.example.officinabackprog2.controller;

import com.example.officinabackprog2.model.Cliente;
import com.example.officinabackprog2.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;


    @PostMapping
    public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) {
        Cliente savedCliente = clienteService.save(cliente);
        return ResponseEntity.ok(savedCliente);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getClienteById(@PathVariable int id) {
        Optional<Cliente> cliente = clienteService.findById(id);
        return cliente.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> getAllClientes(
        @RequestParam(required = false) String nome, 
        @RequestParam(required = false) String cpf
    ) {
        List<Cliente> clientes = clienteService.findAll();

        if(nome != null && cpf  != null) {
            clientes = clienteService.findByNomeAndCpf(nome, cpf);
        } else if (nome != null){
            clientes = clienteService.findByNome(nome);
        } else if (cpf != null) {
            clientes = clienteService.findByCpf(cpf);   
        } else {
            clientes = clienteService.findAll();
        }

        return ResponseEntity.ok(clientes);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> updateClienteById(
        @PathVariable Integer id,
        @RequestBody     Cliente clienteAtualizado
    ) {
        Optional<Cliente> clienteOptional = clienteService.findById(id);

        if(clienteOptional.isPresent()){
            Cliente clienteExistente = clienteOptional.get();
            clienteExistente.setNome(clienteAtualizado.getNome());
            clienteExistente.setEndereco(clienteAtualizado.getEndereco());
            clienteExistente.setCpf(clienteAtualizado.getCpf());
            clienteExistente.setCidade(clienteAtualizado.getCidade());
            clienteExistente.setTelefone(clienteAtualizado.getTelefone());

            Cliente clienteSalvo = clienteService.update(id, clienteExistente);
            return ResponseEntity.ok(clienteSalvo);
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClienteById(@PathVariable int id) {
        clienteService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
