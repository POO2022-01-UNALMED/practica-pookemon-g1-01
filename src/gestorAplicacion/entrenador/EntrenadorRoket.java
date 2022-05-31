package gestorAplicacion.entrenador;

import java.util.ArrayList;

import gestorAplicacion.pokemon.Pokemon;

public class EntrenadorRoket extends Entrenador {
	final String Nombre;
	ArrayList<String> Medallas;
		
	public EntrenadorRoket(String Nombre, String Genero, String edad, ArrayList<Pokemon> ListaPokemon,
			Pokemon PokemonInicial, ArrayList<String> Medallas) {
		super(Nombre, Genero, edad, ListaPokemon, PokemonInicial, Medallas);
		
		this.Nombre = "James";
		this.Medallas = null;
		
	}
	
	public String toString(){
		return "Soy James me me mes, pelea conmigo";
	}
	
	

}