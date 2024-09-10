package com.example.officinabackprog2.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "OS")
public class OS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String numero_os;

    @Column(name = "abertura_os", nullable = false, updatable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate aberturaOs;

    @Column(name = "encerramento_os")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate encerramentoOs;

    @Column(name = "valor_total")
    private Double valorTotal;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "mecanico_id")
    private Mecanico mecanico;

    @ManyToOne
    @JoinColumn(name = "veiculo_id")
    private Veiculo veiculo;

    @ManyToMany
    @JoinTable(
        name = "os_pecas",
        joinColumns = @JoinColumn(name = "os_id"),
        inverseJoinColumns = @JoinColumn(name = "pecas_id")
    )
    private Set<Pecas> pecas;

    @ManyToMany
    @JoinTable(
        name = "os_servicos",
        joinColumns = @JoinColumn(name = "os_id"),
        inverseJoinColumns = @JoinColumn(name = "servicos_id")
    )
    private Set<Servicos> servicos;

    @PrePersist
    protected void onCreate() {
        this.aberturaOs = LocalDate.now();  
        calcularValorTotal();  

    }

    @PostPersist
    protected void onPostPersist() {
        this.numero_os = "OS-" + this.id;
    }

    public void calcularValorTotal() {
        this.valorTotal = 0.0;

        if (pecas != null) {
            this.valorTotal += pecas.stream().mapToDouble(Pecas::getPreco).sum();
        }

        if (servicos != null) {
            this.valorTotal += servicos.stream().mapToDouble(Servicos::getValorServico).sum();
        }
    }

    public OS() {
    }

    public OS(String numero_os, LocalDate aberturaOs, LocalDate encerramentoOs, 
              Cliente cliente, Mecanico mecanico, Veiculo veiculo, Set<Pecas> pecas, Set<Servicos> servicos) {
        this.numero_os = numero_os;
        this.aberturaOs = aberturaOs;
        this.encerramentoOs = encerramentoOs;
        this.cliente = cliente;
        this.mecanico = mecanico;
        this.veiculo = veiculo;
        this.pecas = pecas;
        this.servicos = servicos;
        calcularValorTotal();  
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero_os() {
        return numero_os;
    }

    public void setNumero_os(String numero_os) {
        this.numero_os = numero_os;
    }

    public LocalDate getAberturaOs() {
        return aberturaOs;
    }

    public void setAberturaOs(LocalDate aberturaOs) {
        this.aberturaOs = aberturaOs;
    }

    public LocalDate getEncerramentoOs() {
        return encerramentoOs;
    }

    public void setEncerramentoOs(LocalDate encerramentoOs) {
        this.encerramentoOs = encerramentoOs;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Set<Pecas> getPecas() {
        return pecas;
    }

    public void setPecas(Set<Pecas> pecas) {
        this.pecas = pecas;
    }

    public Set<Servicos> getServicos() {
        return servicos;
    }

    public void setServicos(Set<Servicos> servicos) {
        this.servicos = servicos;
    }
}
