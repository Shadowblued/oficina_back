package com.example.officinabackprog2.service;

import com.example.officinabackprog2.model.Veiculo;
import com.example.officinabackprog2.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public Veiculo save(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public List<Veiculo> findAll() {
        return veiculoRepository.findAll();
    }

    public Optional<Veiculo> findById(int id) {
        return veiculoRepository.findById(id);
    }

    public List<Veiculo> findByPlaca(String placa) {
        return veiculoRepository.findByPlaca(placa);
    }

    public List<Veiculo> findByAnoModelo(String anoModelo) {
        return veiculoRepository.findByAnoModelo(anoModelo);
    }

    public List<Veiculo> findByPlacaAndAnoModelo(String placa, String anoModelo) {
        return veiculoRepository.findByPlacaAndAnoModelo(placa, anoModelo);
    }

    public Veiculo update(int id, Veiculo veiculoDetails) {
        Veiculo veiculo = veiculoRepository.findById(id)
            .orElseThrow(() -> new VeiculoNotFoundException("Veículo não encontrado para este id :: " + id));

        veiculo.setDescricao(veiculoDetails.getDescricao());
        veiculo.setPlaca(veiculoDetails.getPlaca());
        veiculo.setAnoModelo(veiculoDetails.getAnoModelo());
        veiculo.setCliente(veiculoDetails.getCliente());

        return veiculoRepository.save(veiculo);
    }

    public void deleteById(int id) {
        if (veiculoRepository.existsById(id)) {
            veiculoRepository.deleteById(id);
        } else {
            throw new VeiculoNotFoundException("Veículo não encontrado para este id :: " + id);
        }
    }

    public static class VeiculoNotFoundException extends RuntimeException {
        public VeiculoNotFoundException(String message) {
            super(message);
        }
    }
}
