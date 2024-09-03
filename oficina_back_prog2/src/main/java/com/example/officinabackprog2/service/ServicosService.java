package com.example.officinabackprog2.service;

import com.example.officinabackprog2.repository.ServicosRepository;
import com.example.officinabackprog2.model.Servicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicosService {

    @Autowired
    private ServicosRepository servicosRepository;

    public Servicos save(Servicos servicos) {
        return servicosRepository.save(servicos);
    }
    
    public List<Servicos> findAll() {
        return servicosRepository.findAll();
    }

    public Optional<Servicos> findById(int id) {
        return servicosRepository.findById(id);
    }

    public List<Servicos> findByDescricaoServicos( String descricaoServico) {
        return servicosRepository.findByDescricaoServico(descricaoServico);
    }

    public List<Servicos> findByValorServico(Double valorServico) {
        return servicosRepository.findByValorServico(valorServico);
    }

    public List<Servicos> findByDescricaoServicoAndValorServico(String descricaoServico, Double valorServico) {
        return servicosRepository.findByDescricaoServicoAndValorServico(descricaoServico, valorServico); 
    }
    
    public Servicos update(int id, Servicos servicosDetails){
        Servicos servicos = servicosRepository.findById(id)
          .orElseThrow(()-> new ServicosNotFoundException("Servico não encontrado para  este  id::" + id));

        servicos.setDescricaoServico(servicosDetails.getDescricaoServico());
        servicos.setValorServico(servicosDetails.getValorServico());

        return servicosRepository.save(servicos);

    }

    public  void deleteById(int id) {
        if(servicosRepository.existsById(id)){
            servicosRepository.deleteById(id);
        } else {
            throw new ServicosNotFoundException("Servico nao encontrado para este id:" + id);
        }
    }

    public static class ServicosNotFoundException extends RuntimeException {
        public ServicosNotFoundException(String message) {
            super(message);
        }
    }
    
}
