package com.example.officinabackprog2.controller;

import com.example.officinabackprog2.model.Pecas;
import com.example.officinabackprog2.service.PecasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pecas")
public class PecasController {

    @Autowired
    private PecasService pecasService;

    @PostMapping
    public ResponseEntity<Pecas> createPecas(@RequestBody Pecas pecas) {
        Pecas novoPecas = pecasService.save(pecas);
        return ResponseEntity.ok(novoPecas);
    }

    @GetMapping
    public ResponseEntity<List<Pecas>> getPecass(
            @RequestParam(value = "descricao", required = false) String descricao,
            @RequestParam(value = "preco", required = false) Double preco) {
        List<Pecas> pecas;
        
        if (descricao != null) {
            pecas = pecasService.findByDescricao(descricao);
        } else if (preco != null) {
            pecas = pecasService.findByPreco(preco);
        } else {
            pecas = pecasService.findAll();
        }
        
        return ResponseEntity.ok(pecas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pecas> getPecasById(@PathVariable int id) {
        Optional<Pecas> pecas = pecasService.findById(id);
        return pecas.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pecas> updatePecas(@PathVariable int id, @RequestBody Pecas pecasDetails) {
        try {
            Pecas updatedPecas = pecasService.update(id, pecasDetails);
            return ResponseEntity.ok(updatedPecas);
        } catch (PecasService.PecasNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePecas(@PathVariable int id) {
        try {
            pecasService.deleteById(id);
            return ResponseEntity.noContent().build();
        } catch (PecasService.PecasNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
