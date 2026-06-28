package com.lanseudesu.pokemon.pokemon;
import java.util.Set;

public class TypeChart {
    private static final Set<String> IMMUNITIES = Set.of(
            "NORMAL:GHOST",
            "ELECTRIC:GROUND",
            "FIGHTING:GHOST",
            "POISON:STEEL",
            "GROUND:FLYING",
            "PSYCHIC:DARK",
            "GHOST:NORMAL",
            "DRAGON:FAIRY"
    );

    public static boolean isImmune(Type attack, Type defend) {
        return IMMUNITIES.contains(attack + ":" + defend);
    }
}
