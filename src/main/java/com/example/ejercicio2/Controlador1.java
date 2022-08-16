package com.example.ejercicio2;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controlador1 {

    //@Autowired
    PersonaService personaService;

    public Controlador1(PersonaService personaService)
    {
        System.out.println("Hola desde controlador1");
        this.personaService=personaService;
    }

    @GetMapping("{name}")
    public String holaMundo(@PathVariable String name){
        return "Hola Mundo: "+name;
    }

    @GetMapping
    public String holaMundo(){
        return "Hola Mundo";
    }
    @GetMapping("/nombre/{nombre}")
    public String dimetuNombre(@PathVariable String nombre){
        personaService.setNombre(nombre);
        return "Hola: "+nombre;
    }

    @PostMapping
    public Persona holaMundoPost(@RequestBody Persona persona)
    {
        persona.setComentario("Hola mundo simple post: "+persona.getNombre()+" edad: "+(persona.getEdad()+1)+" población: "+ persona.getPoblacion());
        return persona;
    }

}
