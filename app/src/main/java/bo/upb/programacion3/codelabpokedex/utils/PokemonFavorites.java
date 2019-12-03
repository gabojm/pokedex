package bo.upb.programacion3.codelabpokedex.utils;

import java.util.ArrayList;
import java.util.List;

import bo.upb.programacion3.codelabpokedex.R;
import bo.upb.programacion3.codelabpokedex.model.Pokemon;

public class PokemonFavorites {

    /**
     * Get list of pokemons
     *
     * @return List of pokemons in the pokedex
     */
    public static List<Pokemon> getPokemons() {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(1, "Pikachu", R.drawable.pikachu, "Electric"));
        pokemons.add(new Pokemon(2, "Bulbasaur", R.drawable.bulbasaur, "Grass"));
        pokemons.add(new Pokemon(3, "Charmander", R.drawable.charmander, "Fire"));
        pokemons.add(new Pokemon(4, "Squirtle", R.drawable.squirtle, "Water"));


        pokemons.add(new Pokemon(14, "Chikorita", R.drawable.chikorita, "Grass"));
        pokemons.add(new Pokemon(15, "Cyndaquil", R.drawable.cyndaquil, "Fire"));
        pokemons.add(new Pokemon(17, "Eevee", R.drawable.eevee, "Normal"));
        pokemons.add(new Pokemon(18, "Larvitar", R.drawable.larvitar, "Rock"));
        pokemons.add(new Pokemon(21, "Totodile", R.drawable.totodile, "Water"));
        pokemons.add(new Pokemon(22, "Wobbuffet", R.drawable.wobbuffet, "Psychic"));

        return pokemons;
    }
}
