package com.example.ejercicio2.parte2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

@RestController
//@RequestMapping("api/v1/personas")
public class Controlador1 {

    @Autowired
    List<Ciudad> ciudad;


    @PostMapping("controlador1/addCiudad")
    public List<Ciudad> grabaCiudad(@RequestParam String nombre, int numeroHabitantes) {
        Ciudad a = new Ciudad(nombre, numeroHabitantes);
        System.out.println(a);
        ciudad.add(a);
        System.out.println(ciudad);
        return ciudad;
    }

}
