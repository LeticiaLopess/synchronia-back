package com.synchronia.letfolio.entrypoint.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class Teste {

    @GetMapping("/message")
    public ResponseEntity<String> teste() {
        return ResponseEntity.ok("Olá, este é um retorno de teste");
    }
}
