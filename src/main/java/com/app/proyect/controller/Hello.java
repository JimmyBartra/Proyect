package com.app.proyect.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hola/{nombre}")
    public String jimmy(@PathVariable String nombre){

        return "hola mundo soy el mejor "+nombre ;
    }


}
