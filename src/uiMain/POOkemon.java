package uiMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import baseDatos.Serializador;

import java.util.Random;

import gestorAplicacion.pokemon.*;
import gestorAplicacion.lugares.*;
import gestorAplicacion.entrenador.*;

public class POOkemon {
	//static void comenzarBatalla(){} //funcionalidad
	
	
	public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);


       System.out.println("\n" +"Vamos a crear tu entrenador\nDigite su nombre:");
       String nombre=teclado.nextLine();
       System.out.println("Digita tu genero:");
       String genero=teclado.nextLine();
       System.out.println("Digita tu edad:");
       String edad=teclado.nextLine();
       System.out.println("jugador creado");

      // System.out.flush();
       ArrayList<String> Medallas = new ArrayList<String>();
       Medallas.add("canto");
       Medallas.add("paleta");
       Medallas.add("ketchub");

       ArrayList<Pokemon> ListaPookemones = generar_lista();
       System.out.println("De los siguientes pokemones:");
       int i=0;
       while (i < ListaPookemones.size()) {
           System.out.print(i);
           System.out.print(") ");
           System.out.print(ListaPookemones.get(i).getNombre());
           System.out.println();
           i++;
       }
       System.out.println("Cual desea tener?");
       int pokemonn= Integer.parseInt(teclado.nextLine());
       Pokemon pokemonInicial = ListaPookemones.get(pokemonn);

       Random rand = new Random();
//     Pokemon pokemonInicial = ListaPookemones.get(rand.nextInt(ListaPookemones.size()));

       System.out.println("///Este es el pokemon contra el que vas a pelear///");
       Pokemon pokemonRival = ListaPookemones.get(rand.nextInt(ListaPookemones.size()));
       System.out.println(pokemonRival);
       
        Pokemon pokRival=new Pokemon(pokemonRival.getNombre(),true);

        CentroPokemon c1=new CentroPokemon();
        EntrenadorGimnasio jugador1 = null;
        Gimnasio Gym = new Gimnasio(jugador1);
        
        System.out.println("///tu perfil///");
        jugador1 = new EntrenadorGimnasio(nombre,genero,edad,ListaPookemones,pokemonInicial,Medallas,Gym);
        System.out.println(jugador1);

        EntrenadorRoket jugadorRoket = new EntrenadorRoket(null,null,null,ListaPookemones,pokRival,null);
        
        while (true) {
            System.out.println("Digite que quieres hacer:\n" +
                    "1)Ir a campo de Batalla \n" +
                    "2)Ir al CentroPokemon\n"+
                    "3)Pelear contra un jugador del equipo Roket\n"+
                    "4)Ver el estado de mi pokemon y mi perfil\n" +
                    "5)Salir");
            int opcion= Integer.parseInt(teclado.nextLine());
            switch (opcion){
                case 1:
                    CampoDeBatalla campo=new CampoDeBatalla();
                    campo.ComenzarBatalla(jugador1.getPokemonInicial(),pokRival);
                    break;
                case 2:
                    System.out.println(c1);
                    System.out.println(c1.CurarPokemon(jugador1.getPokemonInicial()));
                    System.out.println(c1.CurarPokemon(pokRival));
                    
                case 3:
                	System.out.println(jugadorRoket);
                	CampoDeBatalla campo2=new CampoDeBatalla();
                    campo2.ComenzarBatalla(jugador1.getPokemonInicial(),jugadorRoket.getPokemonInicial());
                    break;
                case 4:
                    System.out.println("Veamos su perfil de Pokemon:");
                    System.out.println(pokemonInicial);
                    System.out.println("\n\nVeamos su perfil de Entrenador:");
                    System.out.println(jugador1);

                case 5:
                	Serializador.serializarTodo();
                    System.exit(0);
            }
        }
    }

    public static ArrayList<Pokemon> generar_lista(){
        ArrayList<Pokemon> ListaPookemones = new ArrayList<Pokemon>();
        ListaPookemones.add(new Pokemon("Pikachu"));
        ListaPookemones.add(new Pokemon("Electrode"));
        ListaPookemones.add(new Pokemon("Voltorb"));
        ListaPookemones.add(new Pokemon("Squirtle"));
        ListaPookemones.add(new Pokemon("Gyarados"));
        ListaPookemones.add(new Pokemon("Tentacool"));
        ListaPookemones.add(new Pokemon("Charmander"));
        ListaPookemones.add(new Pokemon("Ponyta"));
        ListaPookemones.add(new Pokemon("Magmar"));
        ListaPookemones.add(new Pokemon("Gastly"));
        ListaPookemones.add(new Pokemon("Ekans"));
        ListaPookemones.add(new Pokemon("Muk"));
        ListaPookemones.add(new Pokemon("Bulbasur"));
        ListaPookemones.add(new Pokemon("Gloom"));
        ListaPookemones.add(new Pokemon("Venusaur"));
        return ListaPookemones;
    }



}
