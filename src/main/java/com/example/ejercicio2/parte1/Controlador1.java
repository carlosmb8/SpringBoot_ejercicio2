package com.example.ejercicio2.parte1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("api/v1/personas")
@RequestMapping("controlador1/addPersona")
public class Controlador1 {

    @Autowired
    PersonaService personaService;

    public Controlador1(PersonaService personaService)
    {
        System.out.println("Hola desde controlador1");
//        this.personaService=personaService;
    }

//    @GetMapping("{name}")
//    public String holaMundo(@PathVariable String name){
//        return "Hola Mundo: "+name;
//    }
//
//    @GetMapping
//    public String holaMundo(){
//        return "Hola Mundo";
//    }
//    @GetMapping("/nombre/{nombre}")
//    public String dimetuNombre(@PathVariable String nombre){
//        personaService.setNombre(nombre);
//        return "Hola: "+nombre;
//    }

//    @PostMapping
//    public Persona holaMundoPost(@RequestBody Persona persona)
//    {
//        persona.setComentario("Hola mundo simple post: "+persona.getNombre()+" edad: "+(persona.getEdad()+1)+" población: "+ persona.getPoblacion());
//        return persona;
//    }
    @GetMapping
    public Persona recibePersona(@RequestHeader("nombre")String nombre, @RequestHeader("poblacion")String poblacion, @RequestHeader("edad")int edad)
    {
        personaService.getPersona().setNombre(nombre);
        personaService.getPersona().setPoblacion(poblacion);
        personaService.getPersona().setEdad(edad);
        return personaService.getPersona();
    }

}
