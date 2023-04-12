package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "<b>Hello Tuma 62</b>!";
	
	}
	
	@GetMapping("/nome")
	public String meuNome() {
		return "<b>Hello!<br />Daisy</b>!";
	
	}	
		
	@GetMapping("/bsm")
	public String bsm() {
		return "<b>Persistencia!<br />Gestão de tempo</b>!<br />Comunicação</b>!<br />Mentalidade de Crescimento</b>!<br />Orientação ao futuro</b>!<br />Comunicação não agressiva</b>!";	
	}	
	
	@GetMapping("/objetivo")
	public String objetivo() {
		return "Eu estou trabalhando a persistência… mais afinal o que é persistência?\r\n"
				+ "Persistência é não deixar qualquer situação desanimar ou me  desviar das minhas metas. \r\n"
				+ "Não permitir que os fracassos abalem minha autoestima ou enfraqueçam minha coragem.\r\n"
				+ "Estou tentando absorver o máximo do programa e ainda consegui cuidar das coisas além do bootcamp ... é um malabarismo com os pratos, mas já consigo ver bons resultados.\r\n";
				 	
		
		
	}	
}
