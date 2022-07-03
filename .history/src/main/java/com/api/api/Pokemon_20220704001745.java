package com.api.api;

import java.util.concurrent.atomic.AtomicInteger;

public class Pokemon {

    private static final AtomicInteger count = new AtomicInteger(0);

    public Integer id = count.incrementAndGet();

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
        return id;
    }

   public void setId(Integer id) {
        this.id = id;
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
