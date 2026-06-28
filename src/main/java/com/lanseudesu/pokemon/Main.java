package com.lanseudesu.pokemon;

import com.lanseudesu.pokemon.move.Move;
import com.lanseudesu.pokemon.move.MoveCategory;
import com.lanseudesu.pokemon.pokemon.Pokemon;
import com.lanseudesu.pokemon.pokemon.Stats;
import com.lanseudesu.pokemon.pokemon.Type;

public class Main {
    public static void main(String[] args) {
        Stats pikachuStats = new Stats(95, 60, 45, 55, 55, 95);
        Pokemon pikachu =
                new Pokemon("Pikachu", new Type[]{Type.ELECTRIC}, pikachuStats, 50);

        Stats eeveeStats = new Stats(115, 60, 55, 50, 70, 60);
        Pokemon eevee =
                new Pokemon("Eevee", new Type[]{Type.WATER, Type.FLYING} , eeveeStats, 50);

        Battle battle = new Battle(pikachu, eevee);
        Move thunder =
                new Move("Thunder", Type.ELECTRIC, MoveCategory.SPECIAL,70, 110, 10);

        thunder.execute(battle);
    }
}
