package com.example.webprueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class WebPruebaApplication {

	@GetMapping("/mensaje")

	public String mensaje() {
		return "Bienvenido a Java con Azure";
	}
	public static void main(String[] args) {
		SpringApplication.run(WebPruebaApplication.class, args);
	}

}
