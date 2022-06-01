package gestorAplicacion.entrenador;

import gestorAplicacion.pokemon.Pokemon;
import java.util.ArrayList;
import java.io.*;

public class Entrenador implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private static String Vestimenta = "pantalon corto negro, camisa negra y zapatos negros";
	private String Nombre;
	private String Genero;
	private String edad;
	private ArrayList<Pokemon> ListaPokemon = new ArrayList<Pokemon>();
	private Pokemon PokemonInicial;
	private ArrayList<String> Medallas = new ArrayList<String>();
	public static ArrayList<Entrenador> entrenadores = new ArrayList<Entrenador>() ;
	
	public Entrenador(String Nombre,String Genero,String edad,ArrayList<Pokemon> ListaPokemon, Pokemon PokemonInicial,ArrayList<String> Medallas){
		this.Nombre = Nombre;
		this.Genero = Genero;
		this.edad = edad;
		this.ListaPokemon = ListaPokemon;
		this.PokemonInicial = PokemonInicial;
		this.Medallas = Medallas;
		entrenadores.add(this);
		}
	
	//metodos get, set y tostring
	
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
		this.PokemonInicial = nuevoInicial;
	}
	@Override
    public String toString() {
        return "nombre :\t"+this.Nombre+"\n" +
				"genero :\t"+this.Genero+"\n" +
				"edad :\t\t"+this.edad+"\n" +
				"Pokemon :\t"+this.PokemonInicial.getNombre()+"\n" +
				"vestimenta :\t"+ Entrenador.Vestimenta ;
    }

}
