package com.lanseudesu.pokemon;
import com.lanseudesu.pokemon.pokemon.Pokemon;
import com.lanseudesu.pokemon.pokemon.Type;
import com.lanseudesu.pokemon.pokemon.TypeChart;

import java.util.Random;

public class Move {
    private String name;
    private Type type;
    private int accuracy;
    private int pp;

    private Random random = new Random();

    public Move(String name, Type type, int accuracy, int pp){
        this.name = name;
        this.type = type;
        this.accuracy = accuracy;
        this.pp = pp;
    }

    public void execute(Battle battle){
        Pokemon attacker = battle.getAttacker();
        Pokemon defender = battle.getDefender();

        // 1. PRECONDITION
        if (attacker == null || defender == null) {
            System.out.println("No valid battle participants.");
            return;
        }

        // check pp
        if (pp <= 0) {
            System.out.println(name + " has no PP left");
            return;
        }

        // check type based condition
        if (isImmune(defender)) {
            System.out.println("It doesn't affect " + defender.getName());
            return;
        }

        // 2. ATTEMPT (accuracy)
        int roll = random.nextInt(100) + 1;

        if (roll <= accuracy) {
            System.out.println(name + " hit!");
        } else {
            System.out.println(name + " missed!");
        }

        pp--;
    }

    private boolean isImmune(Pokemon defender) {
        for (Type t : defender.getTypes()) {
            if (TypeChart.isImmune(type, t)) {
                return true;
            }
        }

        return false;
    }
}
