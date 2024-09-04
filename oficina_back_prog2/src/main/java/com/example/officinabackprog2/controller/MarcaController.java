package com.example.officinabackprog2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.officinabackprog2.model.Marca;
import com.example.officinabackprog2.service.MarcaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/marca")
public class MarcaController {

    @Autowired MarcaService marcaService;

    @PostMapping
    public ResponseEntity<Marca> createMarca(@RequestBody Marca marca){
        Marca novoMarca = marcaService.save(marca);
        return ResponseEntity.ok(novoMarca);
    }

    @GetMapping
    public ResponseEntity<List<Marca>> getMarca(
        @RequestParam(value = "nome", required = false) String nome){
            List<Marca> marca;

            if(nome != null){
                marca = marcaService.findByNomeMarca(nome);
            } else{
                marca = marcaService.findAll();   
            }

            return ResponseEntity.ok(marca);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Marca> getMarcaById(@PathVariable int id) {
        Optional<Marca> marca = marcaService.findById(id);
        return marca.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Marca> getMarcaById(@PathVariable int id, @RequestBody Marca marcaDetails){
        try{
            Marca updateMarca = marcaService.update(id, marcaDetails);
            return ResponseEntity.ok(updateMarca);
        } catch (MarcaService.MarcaNotFoundException e){
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMarca(@PathVariable int id){
        try{
            marcaService.deleteById(id);
            return ResponseEntity.notFound().build();
        } catch (MarcaService.MarcaNotFoundException e){
            return ResponseEntity.notFound().build();
        }
    }
    
}
