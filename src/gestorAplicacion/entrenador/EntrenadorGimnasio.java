package gestorAplicacion.entrenador;

import gestorAplicacion.lugares.Gimnasio;
import gestorAplicacion.pokemon.Pokemon;
import java.util.ArrayList;
import java.io.*;

/**
 * Se utiliza para crear objetos del tipo EntrenadorGimnasio que heredan de la 
 * clase Entrenador tambien serializable
 * 
 * @author David Urrego 
 * @author Pablo Usuga
 */

public class EntrenadorGimnasio extends Entrenador implements Serializable{

	/*al heredar de la clase entrenador, tambien hereda sus atributos y metodos
	 * 
	 * @param Gimnasio objeto de la clase Gimnasio 
	 * @param entrenadoresGym una lista de todos los objetos EntrenadorGimnasio creados,
	 * 		  hace posible la serializacion
	 */
	
	private Gimnasio Gimnasio;
	private static final long serialVersionUID = 1L;
	public static ArrayList<EntrenadorGimnasio> entrenadoresGym; //= new ArrayList<Entrenador>() ;
	static {
		entrenadoresGym = new ArrayList<EntrenadorGimnasio>();
	}

	public EntrenadorGimnasio(String Nombre,String Genero,String edad,ArrayList<Pokemon> ListaPokemon, Pokemon PokemonInicial,ArrayList<String> Medallas,Gimnasio Gym) {
		super(Nombre, Genero, edad, ListaPokemon, PokemonInicial, Medallas);
		//se crea un objeto del tipo EntrenadorGimnasio y se almacena
		this.Gimnasio = Gym;
		entrenadoresGym.add(this);
	}
	
	//ademas de los get y set que heredo, tambien tiene los de sus propios atributos
	
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
		//metodo toString
		return "nombre :\t"+super.getNombre()+"\n" +
				"genero :\t"+super.getGenero()+"\n" +
				"edad :\t\t"+super.getedad()+"\n" +
				"Pokemon :\t"+super.getPokemonInicial().getNombre()+"\n" +
				"medallas :\t"+ super.getMedallas()+"\n" +
				"gimnasio :\t"+ this.Gimnasio.getNombre() + "\n";
	}

}
