package com.example.ejercicio2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ejercicio2Application {
	static String valor;
	public static void main(String[] args) {
		SpringApplication.run(Ejercicio2Application.class, args);
	}

	@Bean
	PersonaService getPersonaService()
	{
		PersonaService p=new PersonaServiceImpl();
		p.setNombre("el del bean");
		return p;
	}
}