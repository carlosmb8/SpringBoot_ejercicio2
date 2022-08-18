package com.example.ejercicio2.parte1;

import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService {

    public PersonaServiceImpl(){
        System.out.println("Hola estoy iniciandome");
    }

    Persona persona = new Persona();

    @Override
    public void addPersona(Persona p) {
        persona = p;
    }

    @Override
    public Persona getPersona() {
        return persona;
    }
}
