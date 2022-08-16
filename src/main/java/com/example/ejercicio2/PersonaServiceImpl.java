package com.example.ejercicio2;

//@Service
public class PersonaServiceImpl implements PersonaService {

    Persona persona = new Persona();

    public String getNombre(){

        return persona.getNombre();
    }

    public void setNombre(String nombre){
        persona.setNombre(nombre);
    }
}
