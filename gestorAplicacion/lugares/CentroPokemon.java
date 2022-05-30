package gestorAplicacion.lugares;//import practica-pookemon-g1-01.gestorAplicacion.pokemon.Pokemon;

import gestorAplicacion.Entrenador.Entrenador;
import gestorAplicacion.pokemon.Pokemon;

public class CentroPokemon {
	private String Nombre;
	private int Personal;
	private int numPacientes;
	private boolean abierto;
	
	public CentroPokemon(){
		this.Nombre = "gestorAplicacion.lugares.CentroPokemon oficial";
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
		if (pokemon.getVida() <= 100) {
			pokemon.setvida(100);
		}
		else {
			pokemon.setvida(50);
		}
		return "El gestorAplicacion.pokemon "+ pokemon.getNombre()+" se ha curado";
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
	
	//metodo para curar un gestorAplicacion.pokemon
	

}
