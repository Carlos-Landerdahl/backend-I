package com.dh.aula21Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Aula21SpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(Aula21SpringApplication.class, args);
	}

	@GetMapping
	public String msg(){
		return "Hello carlos!!";
	}
}
