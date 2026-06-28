package com.lanseudesu.pokemon.pokemon;
import java.util.Map;

public class TypeChart {
    private static final Map<String, Double> EFFECTIVENESS = Map.ofEntries(
            // NORMAL
            Map.entry("NORMAL:GHOST", 0.0),
            Map.entry("NORMAL:ROCK", 0.5),
            Map.entry("NORMAL:STEEL", 0.5),

            // FIRE
            Map.entry("FIRE:FIRE", 0.5),
            Map.entry("FIRE:WATER", 0.5),
            Map.entry("FIRE:ROCK", 0.5),
            Map.entry("FIRE:DRAGON", 0.5),
            Map.entry("FIRE:GRASS", 2.0),
            Map.entry("FIRE:ICE", 2.0),
            Map.entry("FIRE:BUG", 2.0),
            Map.entry("FIRE:STEEL", 2.0),

            // WATER
            Map.entry("WATER:WATER", 0.5),
            Map.entry("WATER:GRASS", 0.5),
            Map.entry("WATER:DRAGON", 0.5),
            Map.entry("WATER:FIRE", 2.0),
            Map.entry("WATER:GROUND", 2.0),
            Map.entry("WATER:ROCK", 2.0),

            // GRASS
            Map.entry("GRASS:FIRE", 0.5),
            Map.entry("GRASS:GRASS", 0.5),
            Map.entry("GRASS:POISON", 0.5),
            Map.entry("GRASS:FLYING", 0.5),
            Map.entry("GRASS:BUG", 0.5),
            Map.entry("GRASS:DRAGON", 0.5),
            Map.entry("GRASS:STEEL", 0.5),
            Map.entry("GRASS:WATER", 2.0),
            Map.entry("GRASS:GROUND", 2.0),
            Map.entry("GRASS:ROCK", 2.0),

            // ELECTRIC
            Map.entry("ELECTRIC:GROUND", 0.0),
            Map.entry("ELECTRIC:GRASS", 0.5),
            Map.entry("ELECTRIC:ELECTRIC", 0.5),
            Map.entry("ELECTRIC:DRAGON", 0.5),
            Map.entry("ELECTRIC:WATER", 2.0),
            Map.entry("ELECTRIC:FLYING", 2.0),

            // ICE
            Map.entry("ICE:WATER", 0.5),
            Map.entry("ICE:ICE", 0.5),
            Map.entry("ICE:STEEL", 0.5),
            Map.entry("ICE:FIRE", 0.5),
            Map.entry("ICE:GRASS", 2.0),
            Map.entry("ICE:GROUND", 2.0),
            Map.entry("ICE:FLYING", 2.0),
            Map.entry("ICE:DRAGON", 2.0),

            // FIGHTING
            Map.entry("FIGHTING:GHOST", 0.0),
            Map.entry("FIGHTING:POISON", 0.5),
            Map.entry("FIGHTING:FLYING", 0.5),
            Map.entry("FIGHTING:PSYCHIC", 0.5),
            Map.entry("FIGHTING:BUG", 0.5),
            Map.entry("FIGHTING:FAIRY", 0.5),
            Map.entry("FIGHTING:NORMAL", 2.0),
            Map.entry("FIGHTING:ICE", 2.0),
            Map.entry("FIGHTING:ROCK", 2.0),
            Map.entry("FIGHTING:DARK", 2.0),
            Map.entry("FIGHTING:STEEL", 2.0),

            // POISON
            Map.entry("POISON:STEEL", 0.0),
            Map.entry("POISON:POISON", 0.5),
            Map.entry("POISON:GROUND", 0.5),
            Map.entry("POISON:ROCK", 0.5),
            Map.entry("POISON:GHOST", 0.5),
            Map.entry("POISON:GRASS", 2.0),
            Map.entry("POISON:FAIRY", 2.0),

            // GROUND
            Map.entry("GROUND:FLYING", 0.0),
            Map.entry("GROUND:GRASS", 0.5),
            Map.entry("GROUND:BUG", 0.5),
            Map.entry("GROUND:FIRE", 2.0),
            Map.entry("GROUND:ELECTRIC", 2.0),
            Map.entry("GROUND:POISON", 2.0),
            Map.entry("GROUND:ROCK", 2.0),
            Map.entry("GROUND:STEEL", 2.0),

            // FLYING
            Map.entry("FLYING:ELECTRIC", 0.5),
            Map.entry("FLYING:ROCK", 0.5),
            Map.entry("FLYING:STEEL", 0.5),
            Map.entry("FLYING:GRASS", 2.0),
            Map.entry("FLYING:FIGHTING", 2.0),
            Map.entry("FLYING:BUG", 2.0),

            // PSYCHIC
            Map.entry("PSYCHIC:DARK", 0.0),
            Map.entry("PSYCHIC:PSYCHIC", 0.5),
            Map.entry("PSYCHIC:STEEL", 0.5),
            Map.entry("PSYCHIC:FIGHTING", 2.0),
            Map.entry("PSYCHIC:POISON", 2.0),

            // BUG
            Map.entry("BUG:FIRE", 0.5),
            Map.entry("BUG:FIGHTING", 0.5),
            Map.entry("BUG:POISON", 0.5),
            Map.entry("BUG:FLYING", 0.5),
            Map.entry("BUG:GHOST", 0.5),
            Map.entry("BUG:STEEL", 0.5),
            Map.entry("BUG:FAIRY", 0.5),
            Map.entry("BUG:GRASS", 2.0),
            Map.entry("BUG:PSYCHIC", 2.0),
            Map.entry("BUG:DARK", 2.0),

            // ROCK
            Map.entry("ROCK:FIGHTING", 0.5),
            Map.entry("ROCK:GROUND", 0.5),
            Map.entry("ROCK:STEEL", 0.5),
            Map.entry("ROCK:FIRE", 2.0),
            Map.entry("ROCK:ICE", 2.0),
            Map.entry("ROCK:FLYING", 2.0),
            Map.entry("ROCK:BUG", 2.0),

            // GHOST
            Map.entry("GHOST:NORMAL", 0.0),
            Map.entry("GHOST:DARK", 0.5),
            Map.entry("GHOST:GHOST", 2.0),
            Map.entry("GHOST:PSYCHIC", 2.0),

            // DRAGON
            Map.entry("DRAGON:FAIRY", 0.0),
            Map.entry("DRAGON:STEEL", 0.5),
            Map.entry("DRAGON:DRAGON", 2.0),

            // DARK
            Map.entry("DARK:FIGHTING", 0.5),
            Map.entry("DARK:DARK", 0.5),
            Map.entry("DARK:FAIRY", 0.5),
            Map.entry("DARK:GHOST", 2.0),
            Map.entry("DARK:PSYCHIC", 2.0),

            // STEEL
            Map.entry("STEEL:FIRE", 0.5),
            Map.entry("STEEL:WATER", 0.5),
            Map.entry("STEEL:ELECTRIC", 0.5),
            Map.entry("STEEL:STEEL", 0.5),
            Map.entry("STEEL:ICE", 2.0),
            Map.entry("STEEL:ROCK", 2.0),
            Map.entry("STEEL:FAIRY", 2.0),

            // FAIRY
            Map.entry("FAIRY:FIRE", 0.5),
            Map.entry("FAIRY:POISON", 0.5),
            Map.entry("FAIRY:STEEL", 0.5),
            Map.entry("FAIRY:FIGHTING", 2.0),
            Map.entry("FAIRY:DRAGON", 2.0),
            Map.entry("FAIRY:DARK", 2.0)
    );

    public static double getMultiplier(Type attack, Type defend) {
        return EFFECTIVENESS.getOrDefault(
                attack + ":" + defend,
                1.0
        );
    }

    public static double getMultiplier(Type attack, Type[] defenderTypes) {

        double multiplier = 1.0;

        for (Type defend : defenderTypes) {
            multiplier *= getMultiplier(attack, defend);
        }

        return multiplier;
    }

    public static boolean isImmune(Type attack, Type[] defenderTypes) {
        return getMultiplier(attack, defenderTypes) == 0.0;
    }
}
