package com.api.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    private List<Pokemon> pokemon = new ArrayList<Pokemon>();

    @GetMapping("/pokemon")
    public List<Pokemon> getAllFullLifePokemon() {
        return this.pokemon.stream().filter(pokemon -> pokemon.getHp().equals(100)).toList();
    }

    @PostMapping("/new")
    public Pokemon createPokemon(@RequestBody Pokemon pokemon) {
        this.pokemon.add(pokemon);
        return pokemon;
    }

    @PutMapping("/edit")
    public Pokemon editPokemon(@RequestBody Pokemon pokemon) {
        return this.pokemon.set(pokemon.getId(), pokemon);
    }

    @DeleteMapping("delete")
    public void deletePokemon() {
        this.pokemon.clear();
    }
}
