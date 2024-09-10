package com.example.officinabackprog2.service;

import com.example.officinabackprog2.model.Cliente;
import com.example.officinabackprog2.model.Mecanico;
import com.example.officinabackprog2.model.OS;
import com.example.officinabackprog2.model.Pecas;
import com.example.officinabackprog2.model.Servicos;
import com.example.officinabackprog2.model.Veiculo;
import com.example.officinabackprog2.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;


@Service
public class OSService {

    @Autowired
    private OSRepository osRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private MecanicoRepository mecanicoRepository;

    @Autowired
    private VeiculoRepository veiculoRepository;

    @Autowired
    private PecasRepository pecasRepository;

    @Autowired
    private ServicosRepository servicosRepository;

    public List<OS> listarTodas() {
        return osRepository.findAll();
    }

    public Optional<OS> buscarPorId(Integer id) {
        return osRepository.findById(id);
    }

    public OS salvar(OS os) {
        Optional<Cliente> cliente = clienteRepository.findById(os.getCliente().getId());
        cliente.ifPresent(os::setCliente);
    
        Optional<Mecanico> mecanico = mecanicoRepository.findById(os.getMecanico().getId());
        mecanico.ifPresent(os::setMecanico);
    
        Optional<Veiculo> veiculo = veiculoRepository.findById(os.getVeiculo().getId());
        veiculo.ifPresent(os::setVeiculo);
    
        List<Pecas> pecasList = os.getPecas() != null ? new ArrayList<>(os.getPecas()) : new ArrayList<>();
        if (!pecasList.isEmpty()) {
            Set<Pecas> pecasSet = new HashSet<>(pecasRepository.findAllById(pecasList.stream().map(Pecas::getId).toList()));
            os.setPecas(pecasSet);
        }
    
        List<Servicos> servicosList = os.getServicos() != null ? new ArrayList<>(os.getServicos()) : new ArrayList<>();
        if (!servicosList.isEmpty()) {
            Set<Servicos> servicosSet = new HashSet<>(servicosRepository.findAllById(servicosList.stream().map(Servicos::getId).toList()));
            os.setServicos(servicosSet);
        }
    
        os.calcularValorTotal();
    
        return osRepository.save(os);
    }

    public OS atualizar(OS os) {
        Optional<OS> osExistente = osRepository.findById(os.getId());
        if (osExistente.isPresent()) {
            return salvar(os);  
        }
        throw new RuntimeException("OS não encontrada com ID: " + os.getId());
    }

    public void deletar(Integer id) {
        if (osRepository.existsById(id)) {
            osRepository.deleteById(id);
        } else {
            throw new RuntimeException("OS não encontrada com ID: " + id);
        }
    }

    public List<OS> buscarPorCliente(Integer clienteId) {
        return osRepository.findByClienteId(clienteId);
    }

    public List<OS> buscarPorMecanico(Integer mecanicoId) {
        return osRepository.findByMecanicoId(mecanicoId);
    }

    public List<OS> buscarPorVeiculo(Integer veiculoId) {
        return osRepository.findByVeiculoId(veiculoId);
    }

    public List<OS> buscarAbertasEntreDatas(LocalDate dataInicio, LocalDate dataFim) {
        return osRepository.findByAberturaOsBetween(dataInicio, dataFim);
    }

    public List<OS> buscarEncerradasEntreDatas(LocalDate dataInicio, LocalDate dataFim) {
        return osRepository.findByEncerramentoOsBetween(dataInicio, dataFim);
    }

    public List<OS> buscarAbertas() {
        return osRepository.findAbertas();
    }

    public List<OS> buscarPorClienteEVeiculo(Integer clienteId, Integer veiculoId) {
        return osRepository.findByClienteIdAndVeiculoId(clienteId, veiculoId);
    }

    public List<OS> buscarPorPeca(Integer pecasId) {
        return osRepository.findByPecasId(pecasId);
    }

    public List<OS> buscarPorServico(Integer servicosId) {
        return osRepository.findByServicosId(servicosId);
    }
}
