package com.example.officinabackprog2.service;

import com.example.officinabackprog2.repository.MarcaRepository;
import com.example.officinabackprog2.model.Marca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaService {
    
    @Autowired
    private MarcaRepository marcaRepository;

    public Marca save(Marca marca){
        return marcaRepository.save(marca);
    }

    public List<Marca> findAll(){
        return marcaRepository.findAll();
    }

    public Optional<Marca> findById(int id){
        return marcaRepository.findById(id);
    }

    public List<Marca> findByNomeMarca(String nomeMarca){
        return marcaRepository.findByNomeMarca(nomeMarca);
    }

    public Marca update(int id, Marca marcaDetails){
        Marca marca = marcaRepository.findById(id)
            .orElseThrow(()-> new MarcaNotFoundException("marca nâo encontrada para o id:" + id));

            marca.setNomeMarca(marcaDetails.getNomeMarca());

            return marcaRepository.save(marca);
    }

    public void deleteById(int id){
        if(marcaRepository.existsById(id)){
            marcaRepository.deleteById(id);
        } else {
            throw new MarcaNotFoundException("Marca não encontrada para o id:"+id);
        }
    }

    public static class MarcaNotFoundException extends RuntimeException{
        public MarcaNotFoundException(String message){
            super(message);
        }
    }
}
