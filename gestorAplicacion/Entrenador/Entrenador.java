package gestorAplicacion.Entrenador;

import gestorAplicacion.pokemon.Pokemon;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrenador {
    private String nombre;
    private String genero;
    private Pokemon Pokemonprincipal;

    private ArrayList<Pokemon> Pokemones = new ArrayList<Pokemon>();

    public Entrenador(String Nombre, String genero) {
        this.nombre = Nombre;
        this.genero = genero;
    }

    public void SeleccionarPokemones() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Vamos a seleccionar tus pokemones");
        //PIkachu Bulbasaur Charmander
        System.out.println("selecciona tu gestorAplicacion.pokemon principal \n1)Pikachu \n2)Bulbasaur\n3)Charmander");
        int n = Integer.parseInt(teclado.nextLine());
        switch (n) {
            case 1:
                this.Pokemonprincipal = new Pokemon("Pikachu");
            case 2:
                this.Pokemonprincipal = new Pokemon("Bulbasaur");
            case 3:
                this.Pokemonprincipal = new Pokemon("Charmander");
        }
        this.Pokemones.add(this.Pokemonprincipal);
        System.out.println("selecciona tu segundo gestorAplicacion.pokemon.Pokemon \n1)Pikachu \n2)Bulbasaur\n3)Charmander");
        n = Integer.parseInt(teclado.nextLine());
        switch (n) {
            case 1:
                this.Pokemones.add(new Pokemon("Pikachu"));
            case 2:
                this.Pokemones.add(new Pokemon("Bulbasaur"));
            case 3:
                this.Pokemones.add(new Pokemon("Charmander"));
        }
    }

}