package com.lanseudesu.pokemon.move;

import com.lanseudesu.pokemon.pokemon.Pokemon;
import com.lanseudesu.pokemon.pokemon.Type;
import com.lanseudesu.pokemon.pokemon.TypeChart;

import java.util.Random;

public class DamageCalculator {
    public static int calculate(Pokemon attacker, Pokemon defender, Move move) {
        int level = attacker.getLevel();
        int basePower = move.getBasePower();

        int attack;
        int defense;

        if (move.getCategory() == MoveCategory.PHYSICAL) {
            attack = attacker.getStats().getAttack();
            defense = defender.getStats().getDefense();
        } else {
            attack = attacker.getStats().getSpAttack();
            defense = defender.getStats().getSpDefense();
        }

        // base damage from gen 5+ = (2*lvl/5 + 2) * basePower * (A/D) / 50 + 2
        double damage;
        damage = ((2.0 * level / 5 + 2) * basePower * ((double) attack / defense)) / 50 + 2;

        // damage modifiers: damage * critical(1 or 1.5, 1/24 chance) * STAB(1.5) * type effectiveness (0.25, 0.5. 1, 2, 4),
        // crit check:
        damage *= getCriticalMultiplier();

        // random:
        damage *= getRandomMultiplier();

        // STAB check:
        damage *= getSTAB(attacker, move);

        // type multiplier
        damage *= getTypeMultiplier(defender, move);

        return (int) damage;
    }

    private static final Random RANDOM = new Random();

    private static double getCriticalMultiplier() {
        return RANDOM.nextInt(24) == 0 ? 1.5 : 1.0;
    }

    private static double getRandomMultiplier() {
        return (85 + RANDOM.nextInt(16)) / 100.0;
    }

    private static double getSTAB(Pokemon attacker, Move move) {
        for (Type type : attacker.getTypes()) {
            if (type == move.getType()) {
                return 1.5;
            }
        }

        return 1.0;
    }

    private static double getTypeMultiplier(Pokemon defender, Move move) {
        return TypeChart.getMultiplier(move.getType(), defender.getTypes());
    }
}
