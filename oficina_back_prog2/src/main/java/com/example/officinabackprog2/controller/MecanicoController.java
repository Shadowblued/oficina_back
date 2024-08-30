package com.example.officinabackprog2.controller;

import com.example.officinabackprog2.model.Cliente;
import com.example.officinabackprog2.model.Mecanico;
import com.example.officinabackprog2.service.MecanicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/mecanicos")
public class MecanicoController {

    @Autowired
    private MecanicoService mecanicoService;

    @PostMapping
    public ResponseEntity<Mecanico> createMecanico(@RequestBody Mecanico mecanico) {
        Mecanico savedMecanico = mecanicoService.save(mecanico);
        return ResponseEntity.ok(savedMecanico);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mecanico> getMecanicoById(@PathVariable int id) {
        Optional<Mecanico> mecanico = mecanicoService.findById(id);
        return mecanico.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Mecanico>> getAllMecanicos(
        @RequestParam(required = false) String nome, 
        @RequestParam(required = false) String cpf
    ) {
        List<Mecanico> mecanicos = mecanicoService.findAll();

        if(nome != null && cpf  != null) {
            mecanicos = mecanicoService.findByNomeAndCpf(nome, cpf);
        } else if (nome != null){
            mecanicos = mecanicoService.findByNome(nome);
        } else if (cpf != null) {
            mecanicos = mecanicoService.findByCpf(cpf);   
        } else {
            mecanicos = mecanicoService.findAll();
        }
        return ResponseEntity.ok(mecanicos);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Mecanico> updateMecanicoById(
        @PathVariable Integer id,
        @RequestBody     Mecanico mecanicoAtualizado
    ) {
        Optional<Mecanico> mecanicoOptional = mecanicoService.findById(id);

        if(mecanicoOptional.isPresent()){
            Mecanico mecanicoExistente = mecanicoOptional.get();
            mecanicoExistente.setNome(mecanicoAtualizado.getNome());
            mecanicoExistente.setEndereco(mecanicoAtualizado.getEndereco());
            mecanicoExistente.setCpf(mecanicoAtualizado.getCpf());
            mecanicoExistente.setCidade(mecanicoAtualizado.getCidade());
            mecanicoExistente.setTelefone(mecanicoAtualizado.getTelefone());

            Mecanico mecanicoSalvo = mecanicoService.update(id, mecanicoExistente);
            return ResponseEntity.ok(mecanicoSalvo);
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMecanicoById(@PathVariable int id) {
        mecanicoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
