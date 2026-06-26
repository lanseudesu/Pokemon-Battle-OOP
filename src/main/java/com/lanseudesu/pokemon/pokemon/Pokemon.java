package com.lanseudesu.pokemon.pokemon;

public class Pokemon {
    private String name;
    private Type[] types;

    public Pokemon(String name, Type[] types){
        this.name = name;
        this.types = types;
    }

    public String getName(){
        return name;
    }

    public Type[] getTypes(){
        return types;
    }
}
