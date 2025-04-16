package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	
	@GetMapping
	public String helloWorld() {
		return "Hello World";
	}
	
	
	@GetMapping (value = "/bsm-lista", produces  = "text/plain")
	public String bsmlista() {
		return "Trabalho em equipe" 
				+ "\nAdaptabilidade"
				+ "\nInteligência emocional"
				+"\nÉtica no trabalho"
				+"\nComunicação assertiva"
				+"\nGerir o tempo"
				+"\nSer sincero";
	}
	
	
	@GetMapping (value = "/aprendizagem", produces = "text/plain")
	public String aprendizagem() {
		return ""
				+"\nMySQL"
				+"\nProtocolos e Camadas de aplicação"
				+"\nMetodos get, pos, put e delet"
				+"\nArquiteturas SOFEA, REST, MVC";
	}
	

}