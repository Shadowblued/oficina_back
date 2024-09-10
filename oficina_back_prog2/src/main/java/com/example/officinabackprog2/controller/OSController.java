package com.example.officinabackprog2.controller;


import com.example.officinabackprog2.model.OS;
import com.example.officinabackprog2.service.OSService;
import com.example.officinabackprog2.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/api/os")
public class OSController {

    @Autowired
    private OSService osService;

    @Autowired
    private EmailService emailService;

    private static final Pattern EMAIL_PATTERN = 
        Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");

    public static class EmailRequest {
        private String email;

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

    @GetMapping
    public List<OS> listarTodas() {
        return osService.listarTodas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OS> buscarPorId(@PathVariable Integer id) {
        Optional<OS> os = osService.buscarPorId(id);
        return os.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<OS> salvar(@RequestBody OS os) {
        OS novaOS = osService.salvar(os);
        return ResponseEntity.ok(novaOS);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OS> atualizar(@PathVariable Integer id, @RequestBody OS os) {
        if (!os.getId().equals(id)) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(osService.atualizar(os));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        osService.deletar(id);
        return ResponseEntity.noContent().build();
    }

@PostMapping("/email/{id_os}")
public ResponseEntity<String> enviarEmailOS(@PathVariable Integer id_os) {
    Optional<OS> optionalOS = osService.buscarPorId(id_os);
    if (!optionalOS.isPresent()) {
        return ResponseEntity.notFound().build();
    }

    OS os = optionalOS.get();
    
    if (os.getCliente() == null || os.getCliente().getEmail() == null || os.getCliente().getEmail().trim().isEmpty()) {
        return ResponseEntity.badRequest().body("Cliente não possui e-mail cadastrado.");
    }

    String email = os.getCliente().getEmail().trim();

    if (!EMAIL_PATTERN.matcher(email).matches()) {
        return ResponseEntity.badRequest().body("Endereço de e-mail do cliente inválido.");
    }

    String assunto = "Detalhes da Ordem de Serviço #" + os.getNumero_os();
    String corpo = "Detalhes da OS:\n" +
            "Número OS: " + os.getNumero_os() + "\n" +
            "Cliente: " + (os.getCliente() != null ? os.getCliente().getNome() : "N/A") + "\n" +
            "Mecânico: " + (os.getMecanico() != null ? os.getMecanico().getNome() : "N/A") + "\n" +
            "Veículo: " + (os.getVeiculo() != null ? os.getVeiculo().getDescricao() : "N/A") + "\n" +
            "Valor Total: " + os.getValorTotal() + "\n";

    emailService.enviarEmail(email, assunto, corpo);

    return ResponseEntity.ok("E-mail enviado com sucesso para: " + email);
}

}


