package gestorAplicacion.lugares;

import gestorAplicacion.entrenador.*;
import java.io.*;

public class Gimnasio{
	
	private String Nombre;
	private EntrenadorGimnasio EntrenadorGym;
	
	public Gimnasio(EntrenadorGimnasio EntrenadorGym) {
		this.Nombre = "LaNacho";
		this.EntrenadorGym = EntrenadorGym;
		}
	
	public String getNombre() {
		return this.Nombre;
	}
	public void setNombre(String nuevoNombre) {
		this.Nombre = nuevoNombre;
	}
	public String getEGym() {
		return "el entrenador de" + this.getNombre() + "es: " + this.EntrenadorGym.getNombre();
	}
	public void setEGym(EntrenadorGimnasio nuevoEntrenador) {
		this.EntrenadorGym = nuevoEntrenador;
	}
	public String getPOOKEMON() {
		return "el Pokemon inicial del Entrenador es: " + this.EntrenadorGym.getPokemonInicial();	
	}	

}
