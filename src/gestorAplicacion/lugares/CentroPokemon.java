package gestorAplicacion.lugares;

import gestorAplicacion.pokemon.*;
import gestorAplicacion.entrenador.*;
import java.io.*;

/**
 * Se utiliza para crear objetos del tipo CentroPokemon el cual será usado 
 * para sanar pokemones
 * 
 * @author David Urrego 
 * @author Pablo Usuga
 */

public class CentroPokemon {
	
	/*se crea un CentroPokemon con los siguientes atributos 
	 * 
	 *@param Nombre  estos son atributos de la clase
	 *@param Personal indica el numero de personal,
	 *					esto fue planteado de cara a ampliar el proyecto
	 *@param numPacientes indica el numero de pacientes,
	 *					esto fue planteado de cara a ampliar el proyecto
	 *@param abierto indica si esta abierto o no,
	 *					esto fue planteado de cara a ampliar el proyecto
	 * 
	 */
	
	private String Nombre;
	private int Personal;
	private int numPacientes;
	private boolean abierto;
	
	public CentroPokemon(){
		//metodo constructor
		this.Nombre = "CentroPokemon oficial";
		this.Personal = 0;
		this.numPacientes = 0;
		this.abierto = false;
		
		
	}

	@Override
	public String toString() {
		//metodo toString
		return "Bienvenido a "+this.Nombre+" Vamos a curar a tus pokemones";
	}
	
	
	public String CurarPokemon(Pokemon pokemon) {
		//metodo para curar un pokemon 
		if (pokemon.getVida() < pokemon.getVidaMaxima()) {
			pokemon.setvida(pokemon.getVidaMaxima());
		}
		return "El pokemon "+ pokemon.getNombre()+" se ha curado";
	}


	//metodos get y set
	
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
	
	
	

}
