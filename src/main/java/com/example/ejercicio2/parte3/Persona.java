package com.example.ejercicio2.parte3;

import lombok.Data;
import org.springframework.context.annotation.Bean;

import java.io.Serializable;

@Data
public class Persona implements Serializable{
    String nombre;
    String poblacion;
    int edad;
    String comentario;

    public Persona(String nombre, String poblacion, int edad) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.edad = edad;
    }
}

