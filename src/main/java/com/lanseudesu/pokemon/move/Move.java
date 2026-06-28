package com.lanseudesu.pokemon.move;
import com.lanseudesu.pokemon.Battle;
import com.lanseudesu.pokemon.pokemon.Pokemon;
import com.lanseudesu.pokemon.pokemon.Type;
import com.lanseudesu.pokemon.pokemon.TypeChart;

import java.util.Random;

public class Move {
    private String name;
    private Type type;
    private MoveCategory category;
    private int accuracy;
    private int basePower;
    private int pp;

    private Random random = new Random();

    public Move(String name, Type type,  MoveCategory category, int accuracy, int basePower, int pp){
        this.name = name;
        this.type = type;
        this.category = category;
        this.accuracy = accuracy;
        this.basePower = basePower;
        this.pp = pp;
    }

    public MoveCategory getCategory(){
        return category;
    }

    public Type getType() {
        return type;
    }

    public int getBasePower(){
        return basePower;
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
        if (TypeChart.isImmune(type, defender.getTypes())) {
            System.out.println("It doesn't affect " + defender.getName() + "...");
            return;
        }

        // 2. ATTEMPT (accuracy)
        int roll = random.nextInt(100) + 1;

        if (roll <= accuracy) {
            System.out.println(name + " hit!");
            applyDamage(attacker, defender);
        } else {
            System.out.println(name + " missed!");
        }

        pp--;

    }

    private void applyDamage(Pokemon attacker, Pokemon defender) {
        int damage = DamageCalculator.calculate(attacker, defender, this);

        defender.takeDamage(damage);

        System.out.println(defender.getName() + " took " + damage + " damage.");
        System.out.println(defender.getName() + " HP: " + defender.getCurrentHp());
    }
}
