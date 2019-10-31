package com.meuposto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meuposto.model.Abastecimento;
import com.meuposto.repository.AbastecimentoRepository;

@RestController
@CrossOrigin
@RequestMapping("/abastecimento")
public class AbastecimentoController {

	@Autowired
	AbastecimentoRepository abastecimentoRepository;

	@GetMapping("/listar")
	public List<Abastecimento> listarUsuarios() {
		return abastecimentoRepository.findAll();
	}

}
