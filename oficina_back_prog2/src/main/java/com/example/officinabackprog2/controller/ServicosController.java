package com.example.officinabackprog2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.officinabackprog2.model.Servicos;
import com.example.officinabackprog2.service.ServicosService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/servicos")
public class ServicosController {

    @Autowired
    private ServicosService servicosService;

    @PostMapping
    public ResponseEntity<Servicos> createServicos(@RequestBody Servicos servicos) {
        Servicos novoServicos =  servicosService.save(servicos);
        return ResponseEntity.ok(novoServicos);
    }

    @GetMapping
    public ResponseEntity<List<Servicos>> getServicos(
            @RequestParam(value = "descricao", required = false) String descricao,
            @RequestParam(value = "valor", required = false) Double valor) {
        List<Servicos> servicos;
        
        if (descricao != null) {
            servicos = servicosService.findByDescricaoServicos(descricao);
        } else if (valor != null) {
            servicos = servicosService.findByValorServico(valor);
        } else {
            servicos = servicosService.findAll();
        }
        
        return ResponseEntity.ok(servicos);
    }
    

    @GetMapping("/{id}")
    public ResponseEntity<Servicos> getServicosById(@PathVariable int id) {
        Optional<Servicos> servicos = servicosService.findById(id);
        return servicos.map(ResponseEntity::ok).orElseGet(()-> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Servicos> updateServicos(@PathVariable int id, @RequestBody Servicos servicosDetails) {
        try{
            Servicos updateServicos = servicosService.update(id, servicosDetails);
            return ResponseEntity.ok(updateServicos);
        } catch (ServicosService.ServicosNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteServicos(@PathVariable int id){
        try{
            servicosService.deleteById(id);
            return ResponseEntity.notFound().build();
        } catch (ServicosService.ServicosNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
