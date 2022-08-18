package com.example.ejercicio2.parte2;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
public class Ciudad implements Serializable {
    private String nombre;
    private int numeroHabitantes;

    public Ciudad(String nombre, int numeroHabitantes) {
        this.nombre = nombre;
        this.numeroHabitantes = numeroHabitantes;
    }
}
