package com.example.ejercicio2.parte1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador2 {
    @Autowired
    PersonaService personaService;


//    @GetMapping("controlador2/getPersona")
//    public Persona escribePersona(@RequestHeader("nombre") String nombre, @RequestHeader("poblacion") String poblacion, @RequestHeader("edad") int edad) {
//        personaService.getPersona().setNombre(nombre);
//        personaService.getPersona().setPoblacion(poblacion);
//        personaService.getPersona().setEdad(edad*2);
//        personaService.getPersona().setEdad(personaService.getPersona().getEdad() * 2);
//        return personaService.getPersona();
//    }
    @GetMapping("controlador2/getPersona")
    public Persona escribePersona(@RequestHeader("nombre") String nombre, @RequestHeader("poblacion") String poblacion, @RequestHeader("edad") int edad) {
        personaService.getPersona().setEdad(personaService.getPersona().getEdad()*2);
        return personaService.getPersona();
    }
}
