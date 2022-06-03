package gestorAplicacion.entrenador;

import gestorAplicacion.pokemon.Pokemon;
import java.util.ArrayList;
import java.io.*;

/**
 * Se utiliza para crear objetos del tipo entrenador con el cual lucharemos
 * 
 * @author David Urrego 
 * @author Pablo Usuga
 */

public class Entrenador implements Serializable {
	
	/*creamos un objeto Entrenador e implementamos el serializable
	 * 
	 * @param Vestimenta  estos son atributos de la clase
	 * @param Nombre  estos son atributos de la clase
	 * @param Genero  estos son atributos de la clase
	 * @param edad   estos son atributos de la clase
	 * @param ListaPokemon lista de objetos tipo pokemon
	 * @param PokemonInicial un objeto de la lista anterior
	 * @param Medallas una lista de Strings
	 * @param entrenadores una lista de todos los objetos Entrenador creados,
	 * 		  hace posible la serializacion
	 * @param serialVersionUID hace posible la serializacion
	 */
	
	private static final long serialVersionUID = 1L;
	private static String Vestimenta = "pantalon corto negro, camisa negra y zapatos negros";
	private String Nombre;
	private String Genero;
	private String edad;
	private ArrayList<Pokemon> ListaPokemon = new ArrayList<Pokemon>();
	private Pokemon PokemonInicial;
	private ArrayList<String> Medallas = new ArrayList<String>();
	public static ArrayList<Entrenador> entrenadores; // = new ArrayList<Entrenador>() ;
	static {
		entrenadores = new ArrayList<Entrenador>();
	}
	
	public Entrenador(String Nombre,String Genero,String edad,ArrayList<Pokemon> ListaPokemon, Pokemon PokemonInicial,ArrayList<String> Medallas){
		//se crea un objeto del tipo entrenador  y se almacena
		this.Nombre = Nombre;
		this.Genero = Genero;
		this.edad = edad;
		this.ListaPokemon = ListaPokemon;
		this.PokemonInicial = PokemonInicial;
		this.Medallas = Medallas;
		if (this instanceof Entrenador && !(this instanceof EntrenadorGimnasio) && !(this instanceof EntrenadorRoket)) {
			entrenadores.add(this);
		}
	}
	
	//metodos get y set
	
	public String getNombre() {
		return this.Nombre;
	}
	public void setNombre(String nom) {
		this.Nombre = nom;
	}
	public String getGenero() {
		return this.Genero;
	}
	public void setGenero(String x) {
		this.Genero = x;
	}
	public String getedad() {
		return this.edad;
	}
	public void setedad(String x) {
		this.edad = x;
	}
	public ArrayList<Pokemon> getListaPokemon() {
		return this.ListaPokemon;
	}
	public void setListaPokemon(Pokemon nuevoPokemon) {
		this.ListaPokemon.add(nuevoPokemon);
	}
	public Pokemon getPokemonInicial() {
		return this.PokemonInicial;
	}
	public ArrayList<String> getMedallas() {
		return this.Medallas;
	}
	public void setMedallas(String nuevaMedallas) {
		this.Medallas.add(nuevaMedallas);
	}
	
	//motodos especiales
	
	public void CambiarInicial(Pokemon nuevoInicial) {
		//cambia el pokemon inicial
		this.PokemonInicial = nuevoInicial;
	}
	
	public static ArrayList<Entrenador> getEntrenadores(){
		//devuelve la lista de entrenadores que se han creado, esto con el fin de serializar
		return entrenadores;
	}
	
	@Override
    public String toString() {
		//metodo toString
        return "nombre :\t"+this.Nombre+"\n" +
				"genero :\t"+this.Genero+"\n" +
				"edad :\t\t"+this.edad+"\n" +
				"Pokemon :\t"+this.PokemonInicial.getNombre()+"\n" +
				"vestimenta :\t"+ Entrenador.Vestimenta + "\n" ;
    }

}
