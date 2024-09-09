package com.example.officinabackprog2.service;

import com.example.officinabackprog2.model.Pecas;
import com.example.officinabackprog2.repository.PecasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PecasService {

    @Autowired
    private PecasRepository pecasRepository;

    public Pecas save(Pecas pecas) {
        return pecasRepository.save(pecas);
    }

    public List<Pecas> findAll() {
        return pecasRepository.findAll();
    }

    public Optional<Pecas> findById(int id) {
        return pecasRepository.findById(id);
    }

    public List<Pecas> findByDescricao(String descricao) {
        return pecasRepository.findByDescricao(descricao);
    }

    public List<Pecas> findByPreco(Double preco) {
        return pecasRepository.findByPreco(preco);
    }

    public Pecas update(int id, Pecas pecasDetails) {
        Pecas pecas = pecasRepository.findById(id)
            .orElseThrow(() -> new PecasNotFoundException("Peças não encontrado para este id :: " + id));

        pecas.setDescricao(pecasDetails.getDescricao());
        pecas.setPreco(pecasDetails.getPreco());
        pecas.setMarca(pecasDetails.getMarca());

        return pecasRepository.save(pecas);
    }

    public void deleteById(int id) {
        if (pecasRepository.existsById(id)) {
            pecasRepository.deleteById(id);
        } else {
            throw new PecasNotFoundException("Pecas não encontrado para este id :: " + id);
        }
    }

    public static class PecasNotFoundException extends RuntimeException {
        public PecasNotFoundException(String message) {
            super(message);
        }
    }
}
