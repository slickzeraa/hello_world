package com.generation.olamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/olamundo")
public class OlaMundoController {
	
	@GetMapping("/mensagem")
	public String olamundo() {
		return "Olá mundo, a família 71 CHEGOU!!!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "BSM: comunicação, proatividade, orientação ao detalhe, "
				+ "trabalho em equipe, mentalidade de crescimento, orientação ao futuro,"
				+ " responsabilidade pessoal, persistência";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Compreender Spring Boot, "
	            +"Desenvolver endpoints REST, "
	            +"Integrar dependências no projeto, ";
	}

}
