package com.example.officinabackprog2.repository;

import com.example.officinabackprog2.model.OS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface OSRepository extends JpaRepository<OS, Integer> {

    List<OS> findByClienteId(Integer clienteId);

    List<OS> findByMecanicoId(Integer mecanicoId);

    List<OS> findByAberturaOsBetween(LocalDate startDate, LocalDate endDate);

    List<OS> findByEncerramentoOsBetween(LocalDate startDate, LocalDate endDate);

    @Query("SELECT o FROM OS o WHERE o.encerramentoOs IS NULL")
    List<OS> findAbertas();

    List<OS> findByClienteIdAndVeiculoId(Integer clienteId, Integer veiculoId);

    List<OS> findByPecasId(Integer pecasId);

    List<OS> findByVeiculoId(Integer veiculoId);

    List<OS> findByServicosId(Integer servicosId);
}
