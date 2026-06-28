package com.lanseudesu.pokemon.pokemon;

public class Pokemon {
    private String name;
    private Type[] types;
    private Stats stats;
    private int level;
    private int currentHp;

    public Pokemon(String name, Type[] types, Stats stats, int level){
        if (types == null || types.length < 1 || types.length > 2) {
            throw new IllegalArgumentException("A Pokemon must have 1 or 2 types.");
        }

        if (types.length == 2 && types[0] == types[1]) {
            throw new IllegalArgumentException("A Pokemon cannot have duplicate types.");
        }

        this.name = name;
        this.types = types;
        this.stats = stats;
        this.level = level;
        this.currentHp = stats.getHp();
    }

    public String getName(){
        return name;
    }

    public Type[] getTypes(){
        return types;
    }

    public Stats getStats() {
        return stats;
    }

    public int getLevel() {
        return level;
    }

    public int getCurrentHp(){
        return currentHp;
    }

    public void takeDamage(int damage) {
        currentHp -= damage;

        if (currentHp < 0) {
            currentHp = 0;
        }
    }
}
