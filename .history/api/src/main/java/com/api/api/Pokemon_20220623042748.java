package com.api.api;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Pokemon {

    public Integer id;

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

    public Integer getHp() {
        return hp;
    }

   public Integer getId() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
