import java.util.ArrayList;

public class EntrenadorGimnasio extends Entrenador {
	
	private Gimnasio Gimnasio;

	public EntrenadorGimnasio(String Nombre,String Genero,int edad,ArrayList<Pokemon> ListaPokemon, Pokemon PokemonInicial,ArrayList<String> Medallas,Gimnasio Gym) {
		super(Nombre, Genero, edad, ListaPokemon, PokemonInicial, Medallas);
		this.Gimnasio = Gym;
		
	}
	
	public Gimnasio getGimnasio() {
		return this.Gimnasio;
	}
	public void setGimnasio(Gimnasio nuevoGym) {
		this.Gimnasio = nuevoGym;
	}
	

}
