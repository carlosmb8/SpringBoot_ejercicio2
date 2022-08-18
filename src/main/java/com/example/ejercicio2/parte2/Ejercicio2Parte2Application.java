package com.example.ejercicio2.parte2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

import java.util.ArrayList;

@SpringBootApplication
public class Ejercicio2Parte2Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio2Parte2Application.class, args);
	}

	@Bean
	public List<Ciudad> listadoCiudades()
	{
		List<Ciudad>listaCiudades = new ArrayList<>();
		return listaCiudades;
	}
}
