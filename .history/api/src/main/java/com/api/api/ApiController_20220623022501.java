package com.api.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    private Pokemon pokemon;

    @GetMapping("/pokemon")
    public void getPokemon() {
        System.err.println("test");
    }

   @PostMapping("/new")
    public Pokemon createPokemon() {
        System.err.println("test");
    }
}
