package com.lanseudesu.pokemon;

public class DamageCalculator {
    public static int calculate(int basePower, int level, int attack, int defense) {
        // base damage from gen 5+ = (2*lvl/5 + 2) * basePower * (A/D) / 50 + 2
        double damage;

        damage = ((2.0 * level / 5 + 2) * basePower * ((double) attack / defense)) / 50 + 2;
        return (int) damage;
    }
}
