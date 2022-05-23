package entrenador;

import pokemon.Pokemon;
import java.util.ArrayList;
import java.io.*;

public class Entrenador implements Serializable {
	
	private String Nombre;
	private String Genero;
	private int edad;
	private ArrayList<Pokemon> ListaPokemon = new ArrayList<Pokemon>();
	private Pokemon PokemonInicial;
	private ArrayList<String> Medallas = new ArrayList<String>();
	
	public Entrenador(String Nombre,String Genero,int edad,ArrayList<Pokemon> ListaPokemon, Pokemon PokemonInicial,ArrayList<String> Medallas){
		this.Nombre = Nombre;
		this.Genero = "M";
		this.edad = 0;
		this.ListaPokemon = ListaPokemon;
		this.PokemonInicial = PokemonInicial;
		this.Medallas = Medallas;
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
	public int getedad() {
		return this.edad;
	}
	public void setedad(int x) {
		this.edad = x;
	}
	public ArrayList<Pokemon> getListaPokemon() {
		return this.ListaPokemon;
	}
	public void setListaPokemon(Pokemon nuevoPokemon) {
		this.ListaPokemon.add(nuevoPokemon);
	}
	public String getPokemonInicial() {
		return this.PokemonInicial.getNombre();
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

}
