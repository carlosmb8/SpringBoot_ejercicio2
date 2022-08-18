package com.example.ejercicio2.parte2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class Controlador2 {

    @Autowired
    List<Ciudad> ciudad;

    @GetMapping("controlador2/getCiudad")
    public List<Ciudad> GetCiudades(){
        return ciudad;
    }
}
