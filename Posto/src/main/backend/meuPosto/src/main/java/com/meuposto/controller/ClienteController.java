package com.meuposto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meuposto.model.Cliente;
import com.meuposto.model.ProjecaoQuery11;
import com.meuposto.repository.ClienteRepository;

@RestController
@CrossOrigin
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	ClienteRepository clienteRepository;

	@GetMapping("/listar")
	public List<Cliente> listarClientes() {
		return clienteRepository.findAll();
	}

	@GetMapping("/query11")
	public List<ProjecaoQuery11> getClientesByFrequencia() {
		return clienteRepository.getClientesByFrequencia();
	}
	
	@PostMapping("/query04")
	public ResponseEntity<?> cadastrarCliente(String cpf,String nome){
		clienteRepository.cadastrarCliente(cpf,nome);
		return ResponseEntity.ok("Novo cliente cadastrado com sucesso");
	}

}