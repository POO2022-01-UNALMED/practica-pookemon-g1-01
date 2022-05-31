package gestorAplicacion.entrenador;

import gestorAplicacion.lugares.Gimnasio;
import gestorAplicacion.pokemon.Pokemon;
import java.util.ArrayList;
import java.io.*;

public class EntrenadorGimnasio extends Entrenador implements Serializable{

	
	private Gimnasio Gimnasio;
	private static final long serialVersionUID = 1L;

	public EntrenadorGimnasio(String Nombre,String Genero,String edad,ArrayList<Pokemon> ListaPokemon, Pokemon PokemonInicial,ArrayList<String> Medallas,Gimnasio Gym) {
		super(Nombre, Genero, edad, ListaPokemon, PokemonInicial, Medallas);
		this.Gimnasio = Gym;
		
	}
	
	public Gimnasio getGimnasio() {
		return this.Gimnasio;
	}
	public void setGimnasio(Gimnasio nuevoGym) {
		this.Gimnasio = nuevoGym;
	}

}
