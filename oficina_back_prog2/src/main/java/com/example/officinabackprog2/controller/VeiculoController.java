package com.example.officinabackprog2.controller;

import com.example.officinabackprog2.model.Veiculo;
import com.example.officinabackprog2.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @PostMapping
    public ResponseEntity<Veiculo> createVeiculo(@RequestBody Veiculo veiculo) {
        Veiculo novoVeiculo = veiculoService.save(veiculo);
        return ResponseEntity.ok(novoVeiculo);
    }

    @GetMapping
    public ResponseEntity<List<Veiculo>> getVeiculos(
            @RequestParam(value = "placa", required = false) String placa,
            @RequestParam(value = "anoModelo", required = false) String anoModelo) {
        List<Veiculo> veiculos;
        
        if (placa != null && anoModelo != null) {
            veiculos = veiculoService.findByPlacaAndAnoModelo(placa, anoModelo);
        } else if (placa != null) {
            veiculos = veiculoService.findByPlaca(placa);
        } else if (anoModelo != null) {
            veiculos = veiculoService.findByAnoModelo(anoModelo);
        } else {
            veiculos = veiculoService.findAll();
        }
        
        return ResponseEntity.ok(veiculos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Veiculo> getVeiculoById(@PathVariable int id) {
        Optional<Veiculo> veiculo = veiculoService.findById(id);
        return veiculo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Veiculo> updateVeiculo(@PathVariable int id, @RequestBody Veiculo veiculoDetails) {
        try {
            Veiculo updatedVeiculo = veiculoService.update(id, veiculoDetails);
            return ResponseEntity.ok(updatedVeiculo);
        } catch (VeiculoService.VeiculoNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVeiculo(@PathVariable int id) {
        try {
            veiculoService.deleteById(id);
            return ResponseEntity.noContent().build();
        } catch (VeiculoService.VeiculoNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
