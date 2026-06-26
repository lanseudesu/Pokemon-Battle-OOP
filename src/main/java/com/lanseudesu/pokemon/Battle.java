package com.lanseudesu.pokemon;

import com.lanseudesu.pokemon.pokemon.Pokemon;

public class Battle {
    private Pokemon attacker;
    private Pokemon defender;

    public Battle(Pokemon attacker, Pokemon defender){
        this.attacker =  attacker;
        this.defender = defender;
    }

    public Pokemon getAttacker(){
        return attacker;
    }

    public Pokemon getDefender() {
        return defender;
    }
}
