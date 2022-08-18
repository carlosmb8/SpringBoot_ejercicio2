package com.example.ejercicio2.parte3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

    @Autowired
    @Qualifier("bean1")
    Persona p1;

    @Autowired
    @Qualifier("bean2")
    Persona p2;

    @Autowired
    @Qualifier("bean3")
    Persona p3;

    @GetMapping("controlador/bean/bean1")
    public Persona dameBean1(){
        return p1;
    }

    @GetMapping("controlador/bean/bean2")
    public Persona dameBean2(){
        return p2;
    }

    @GetMapping("controlador/bean/bean3")
    public Persona dameBean3(){
        return p3;
    }
}
