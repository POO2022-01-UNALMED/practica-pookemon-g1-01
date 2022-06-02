package gestorAplicacion.entrenador;

import gestorAplicacion.lugares.Gimnasio;
import gestorAplicacion.pokemon.Pokemon;
import java.util.ArrayList;
import java.io.*;

public class EntrenadorGimnasio extends Entrenador implements Serializable{

	
	private Gimnasio Gimnasio;
	private static final long serialVersionUID = 1L;
	public static ArrayList<EntrenadorGimnasio> entrenadoresGym; //= new ArrayList<Entrenador>() ;
	static {
		entrenadoresGym = new ArrayList<EntrenadorGimnasio>();
	}

	public EntrenadorGimnasio(String Nombre,String Genero,String edad,ArrayList<Pokemon> ListaPokemon, Pokemon PokemonInicial,ArrayList<String> Medallas,Gimnasio Gym) {
		super(Nombre, Genero, edad, ListaPokemon, PokemonInicial, Medallas);
		this.Gimnasio = Gym;
		entrenadoresGym.add(this);
	}
	
	public Gimnasio getGimnasio() {
		return this.Gimnasio;
	}
	public void setGimnasio(Gimnasio nuevoGym) {
		this.Gimnasio = nuevoGym;
	}
	public static ArrayList<EntrenadorGimnasio> getEntrenadoresGym(){
		return entrenadoresGym;
	}
	
	public String toString() {
		return "nombre :\t"+super.getNombre()+"\n" +
				"genero :\t"+super.getGenero()+"\n" +
				"edad :\t\t"+super.getedad()+"\n" +
				"Pokemon :\t"+super.getPokemonInicial().getNombre()+"\n" +
				"medallas :\t"+ super.getMedallas()+"\n" +
				"gimnasio :\t"+ this.Gimnasio.getNombre() + "\n";
	}

}
