package com.example.sgc.controller;

import com.example.sgc.model.Cliente;
import com.example.sgc.repository.ClienteRepository;
import com.example.sgc.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private ClienteRepository clienteRepository;

    // Método GET para listar todos os clientes
    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteService.getAllClientes();
    }

    // Método POST para cadastrar um cliente
    @PostMapping
    public ResponseEntity<String> cadastrarCliente(@RequestBody Cliente cliente) {
        try {
            // Validação básica
            if (cliente.getNome() == null || cliente.getNome().length() < 3) {
                return ResponseEntity.badRequest().body("O nome deve ter pelo menos 3 caracteres.");
            }
            if (cliente.getEmail() == null || !cliente.getEmail().contains("@")) {
                return ResponseEntity.badRequest().body("O email informado não é válido.");
            }

            // Salvar o cliente no banco de dados
            clienteRepository.save(cliente);

            // Retornar resposta de sucesso
            return ResponseEntity.ok("Cliente cadastrado com sucesso!");

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao cadastrar cliente: " + e.getMessage());
        }
    }
}
