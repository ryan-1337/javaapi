package com.api.api;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {

    private String name;

    private Integer hp;

    private List<String> type = Array.asList("Fire", "Water", "Earth", "Electricity");

    public Pokemon(String name, Integer hp, String type) {
        this.name = name;
        this.hp =  hp;
        this.type = type;
    }
}
