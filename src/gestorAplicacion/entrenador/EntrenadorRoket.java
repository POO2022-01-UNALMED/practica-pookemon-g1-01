package gestorAplicacion.entrenador;

import java.util.ArrayList;

import gestorAplicacion.pokemon.Pokemon;

/**
 * Se utiliza para crear objetos del tipo EntrenadorRoket que heredan de la 
 * clase Entrenador, en este caso no nos intereza serializar ya que siempre será el mismo
 * 
 * @author David Urrego 
 * @author Pablo Usuga
 */

public class EntrenadorRoket extends Entrenador {
	
	/*al heredar de la clase entrenador, tambien hereda sus atributos y metodos
	 *solo que para el caso, ya tiene un nombre y unas medallas por defecto
	 */
	
	final String Nombre;
	ArrayList<String> Medallas;
		
	public EntrenadorRoket(String Nombre, String Genero, String edad, ArrayList<Pokemon> ListaPokemon,
			Pokemon PokemonInicial, ArrayList<String> Medallas) {
		super(Nombre, Genero, edad, ListaPokemon, PokemonInicial, Medallas);
		
		this.Nombre = "James";
		this.Medallas = null;
		
	}
	
	public String toString(){
		//metodo toString
		return "Soy James me me mes, pelea conmigo";
	}
	
	

}