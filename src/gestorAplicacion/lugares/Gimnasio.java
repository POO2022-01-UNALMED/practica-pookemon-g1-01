package gestorAplicacion.lugares;

import gestorAplicacion.entrenador.*;
import java.io.*;

/**
 * Se utiliza para crear objetos del tipo Gimnasio que hara coneccion con los objetos 
 * del tipo EntrenadorGimnasio para indicar una pertenencia
 * 
 * @author David Urrego 
 * @author Pablo Usuga
 */

public class Gimnasio implements Serializable{
	
	/**
	 * se crea un objeto del tipo gimnasio y se emplea la seriabilizacion
	 * para permitir que un objeto del tipo EntrenadorGimnasio se seriabilice 
	 * de manera correcta
	 * 
	 * @param Nombre nombre del gimnasio
	 * @param EntrenadorGym es un objeto del tipo entrenador
	 * @param serialVersionUID permite la seriabilizacion
	 */
	
	private String Nombre;
	private static final long serialVersionUID = 1L;
	private EntrenadorGimnasio EntrenadorGym;
	
	public Gimnasio(EntrenadorGimnasio EntrenadorGym) {
		//metodo con structor
		this.Nombre = "LaNacho";
		this.EntrenadorGym = EntrenadorGym;
		}
	
	/*
	 * metodos get y set
	 */
	
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
	public EntrenadorGimnasio getEntrenador() {
		return this.EntrenadorGym;
	}

}
