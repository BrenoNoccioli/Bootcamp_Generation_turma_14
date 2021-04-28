package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //define classe como controller
@RequestMapping("/hello") //define caminho do endpoint
public class HelloController {
	
	@GetMapping //método a ser chamado na requisição GET
	public String hello() {
		return "Hello World! :)";
	}
	
}
