package com.api.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    private List<Pokemon> pokemon = new ArrayList<Pokemon>();

    @GetMapping("/pokemon")
    public void getPokemon() {
        this.pokemon.stream().forEach(pokemon -> System.err.println(pokemon));
        System.err.println();
    }

   @PostMapping("/new")
    public Pokemon createPokemon(@RequestBody Pokemon pokemon) {
        this.pokemon.add(pokemon);
        System.err.println(this.pokemon.get(0).getName());
        return pokemon;
    }
}