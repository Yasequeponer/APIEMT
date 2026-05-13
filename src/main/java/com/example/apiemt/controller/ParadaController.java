package com.example.apiemt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParadaController {

    @RequestMapping("/paradas")

    @GetMapping
    public ResponseEntity<Parada> getAll(){

    }

}
