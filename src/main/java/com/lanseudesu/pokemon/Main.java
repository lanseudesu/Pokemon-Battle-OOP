package com.lanseudesu.pokemon;

import com.lanseudesu.pokemon.pokemon.Pokemon;
import com.lanseudesu.pokemon.pokemon.Type;

public class Main {
    public static void main(String[] args) {
        Pokemon pikachu =
                new Pokemon("Pikachu", new Type[]{Type.ELECTRIC});
        Pokemon gengar =
                new Pokemon("Gengar", new Type[]{Type.GHOST});

        Battle battle =
                new Battle(pikachu, gengar);
        Move tackle =
                new Move("Tackle", Type.NORMAL, 95, 35);

        tackle.execute(battle);
    }
}
