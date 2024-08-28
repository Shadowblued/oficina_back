package com.example.officinabackprog2.repository;

import com.example.officinabackprog2.model.Mecanico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MecanicoRepository extends JpaRepository<Mecanico, Integer>{
    
}
