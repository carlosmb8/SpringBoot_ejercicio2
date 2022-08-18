package com.example.ejercicio2.parte3;

import com.example.ejercicio2.parte2.Ciudad;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Ejercicio2Application {
    public static void main(String[] args) {
        SpringApplication.run(Ejercicio2Application.class, args);
    }

    @Bean
    public Persona bean1() { return new Persona("persona1", "Jaen", 20);}

    @Bean
    public Persona bean2() {
        return new Persona("persona2", "Granada", 21);
    }

    @Bean
    public Persona bean3() {
        return new Persona("persona3", "Sevilla", 22);
    }
}