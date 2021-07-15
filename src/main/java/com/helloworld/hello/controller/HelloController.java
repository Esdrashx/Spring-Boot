package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/Atividade1")
	public String hello() {
		return "Habilidades e Mentalidades: Persistência, Proatividade e Atenção aos Detalhes";
	}
	
	@GetMapping("/Atividade2")
	public String hello2() {
		return "Dar uma adiantada no conteúdo de Spring para já poder trabalhar no projeto.";
	}
	
}
