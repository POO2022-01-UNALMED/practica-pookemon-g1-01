package gestorAplicacion.lugares;

import gestorAplicacion.pokemon.*;
import gestorAplicacion.entrenador.*;
import java.io.*;

public class CentroPokemon {
	private String Nombre;
	private int Personal;
	private int numPacientes;
	private boolean abierto;
	
	public CentroPokemon(){
		this.Nombre = "CentroPokemon oficial";
		this.Personal = 0;
		this.numPacientes = 0;
		this.abierto = false;
		
		
	}

	@Override
	public String toString() {
		return "Bienvenido a "+this.Nombre+" Vamos a curar a tus pokemones";
	}
	public void SeleccionarPokemonParacurar(Entrenador e){

	}
	public String CurarPokemon(Pokemon pokemon) {
		if (pokemon.getVida() < pokemon.getVidaMaxima()) {
			pokemon.setvida(pokemon.getVidaMaxima());
		}
		return "El pokemon "+ pokemon.getNombre()+" se ha curado";
	}


	//metodos get, set y tostring
	
	public String getNombre() {
		return this.Nombre;
	}
	public void setNombre(String nuevoNombre) {
		this.Nombre = nuevoNombre;
	}
	public int getPersonal() {
		return this.Personal;
	}
	public void setPersonal(int nuevoPersonal) {
		this.Personal = nuevoPersonal;
	}
	public int getnumPacientes() {
		return this.numPacientes;
	}
	public void setnumPacientes(int nuevonumPacientes) {
		this.numPacientes = nuevonumPacientes;
	}
	public boolean getabierto() {
		return this.abierto;
	}
	public void setbiertos(boolean nuevoabierto) {
		this.abierto = nuevoabierto;
	}
	
	//metodo para curar un pokemon 
	

}
