package com.example.officinabackprog2.controller;

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
    public ResponseEntity<List<Mecanico>> getAllMecanicos() {
        List<Mecanico> mecanicos = mecanicoService.findAll();
        return ResponseEntity.ok(mecanicos);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMecanicoById(@PathVariable int id) {
        mecanicoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
