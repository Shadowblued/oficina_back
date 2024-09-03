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
    public ResponseEntity<List<Servicos>> getAllServicos() {
        List<Servicos> servicos = servicosService.findAll();
        return ResponseEntity.ok(servicos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Servicos> getServicosById(@PathVariable int id) {
        Optional<Servicos> servicos = servicosService.findById(id);
        return servicos.map(ResponseEntity::ok).orElseGet(()-> ResponseEntity.notFound().build());
    }

    @GetMapping("/descricao")
    public ResponseEntity<List<Servicos>> getServicosByDescricaoServicos(@RequestParam("descricao") String descricaoServicos) {
        List<Servicos> servicos = servicosService.findByDescricaoServicos(descricaoServicos);
        return ResponseEntity.ok(servicos);
    }
    
    @GetMapping("/valor")
    public ResponseEntity<List<Servicos>> getServicosByValorServicos(@RequestParam("valor") Double valorServicos) {
        List<Servicos> servicos = servicosService.findByValorServico(valorServicos);
        return ResponseEntity.ok(servicos);
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
