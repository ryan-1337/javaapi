package com.api.api;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Pokemon {

    private String name;

    private Integer hp;

    private String type;

    public Pokemon(String name, Integer hp, String type) {
        this.name = name;
        this.hp =  hp;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
