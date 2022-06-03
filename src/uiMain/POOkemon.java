package uiMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import baseDatos.*;

import java.util.Random;

import gestorAplicacion.pokemon.*;
import gestorAplicacion.lugares.*;
import gestorAplicacion.entrenador.*;

/**
 * clase main en la que se ejecutan todos los procesos del programa
 * @author David Urrego
 * @author Pablo Usuga
 */

public class POOkemon {
	
	public static ArrayList<Pokemon> generar_lista(){
		//metodo para crear una lista de pokemones
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
	
	
	public static Pokemon PokemonRival() {
		//metodo para crear un pokemon rival proveniente de una lista totalmente nueva
		Random rand = new Random();
		
		System.out.println("///Este es el pokemon contra el que vas a pelear///\n");
	    Pokemon pokemonRival = generar_lista().get(rand.nextInt(generar_lista().size()));
	    System.out.println(pokemonRival);
	    
	    return pokemonRival;
	}
	
	
	public static EntrenadorGimnasio CrearEntrenador(){
		//metodo para crear el personaje con el que se va jugar
		
		Scanner teclado = new Scanner(System.in);


	       System.out.println("\n" +"Vamos a crear tu entrenador\nDigite su nombre:");
	       String nombre=teclado.nextLine();
	       System.out.println("Digita tu genero:");
	       String genero=teclado.nextLine();
	       System.out.println("Digita tu edad:");
	       String edad=teclado.nextLine();
	       System.out.println("jugador creado\n");

	      // System.out.flush();
	       ArrayList<String> Medallas = new ArrayList<String>();
	       Medallas.add("canto");
	       Medallas.add("paleta");
	       Medallas.add("ketchub");

	       ArrayList<Pokemon> ListaPookemones = generar_lista();
	       System.out.println("De los siguientes pokemones:\n");
	       int i=0;
	       while (i < ListaPookemones.size()) {
	           System.out.print(i);
	           System.out.print(") ");
	           System.out.print(ListaPookemones.get(i).getNombre());
	           System.out.println();
	           i++;
	       }
	       System.out.println("Cual desea tener?\n");
	       int pokemonn= Integer.parseInt(teclado.nextLine());
	       Pokemon pokemonInicial = ListaPookemones.get(pokemonn);
	       
	       	 
	        EntrenadorGimnasio jugador1 = new EntrenadorGimnasio(nombre,genero,edad,ListaPookemones,pokemonInicial,Medallas,null);
	        Gimnasio Gym = new Gimnasio(jugador1);
	        
	        jugador1.setGimnasio(Gym);
	        
	        System.out.println("///tu perfil///\n");
	        //jugador1 = new EntrenadorGimnasio(nombre,genero,edad,ListaPookemones,pokemonInicial,Medallas,Gym);
	        System.out.println(jugador1);
	        
	        return jugador1;
	}
	
	
	public static void leerEntrenadores(){
		//metodo para deserializar y leer los objetos que ya se han creado con antelacion
		Deserializador.deserializarTodo();
		System.out.println("entrenadortes que pertenecen a un gimnasio");
		for (EntrenadorGimnasio entrenador: EntrenadorGimnasio.getEntrenadoresGym()) {
			System.out.println(entrenador);
		}
		System.out.println("\n");
		System.out.println("entrenadortes sin gimnasio");
		for (Entrenador entrenador: Entrenador.getEntrenadores()) {
			System.out.println(entrenador);
		}
		System.out.println("\n");
	}
	
	
	public static void main(String[] args){
		//metodo principal en el que se ejecuta el juego de manera limpia y 
		//haciendo uso de los metodos y las clases ya creadas
		
		Scanner teclado = new Scanner(System.in);
		
      
		Random rand = new Random();

	    CentroPokemon c1=new CentroPokemon();
	        
        EntrenadorRoket jugadorRoket = new EntrenadorRoket(null,null,null,generar_lista(),generar_lista().get(rand.nextInt(generar_lista().size())),null);
        
        System.out.println("primero debes crear un entrenador\n");
    	EntrenadorGimnasio jugador = CrearEntrenador();
    	
    	Pokemon pokRival = PokemonRival();
        
        while (true) {
            System.out.println("Digite que quieres hacer:\n" +
                    "1)Ir a campo de Batalla \n" +
                    "2)Ir al CentroPokemon\n"+
                    "3)Pelear contra un jugador del equipo Roket\n"+
                    "4)Ver el estado de mi pokemon y mi perfil\n" +
                    "5)conocer historial\n"+
                    "6)salir");
            int opcion= Integer.parseInt(teclado.nextLine());
            switch (opcion){
                case 1:
					CampoDeBatalla cb1 = new CampoDeBatalla();


                	System.out.println(jugador.getGimnasio().getNombre());
                	System.out.println(jugador.getGimnasio().getPOOKEMON());
                    CampoDeBatalla campo=new CampoDeBatalla();
					Pokemon p1= jugador.getPokemonInicial();
					Pokemon p2= pokRival;
					if (p1.getVida()==0 || p2.getVida()==0){
						System.out.println("Un pokemon no puede luchar por falta de vida");
					}
					else{
						cb1.resetTurno();
						campo.ComenzarBatalla(jugador.getPokemonInicial(),pokRival);
						cb1.tespe();
						for(int i = 0; i <= 10; i = i + 1){System.out.println();}
						String titulo;
						while (p2.getVida()>0 && p1.getVida()>0) {
							for(int i = 0; i <= 10; i = i + 1){System.out.println();}
							cb1.seguirturno();
							titulo="Turno :" + cb1.getturno() + "\n" + p1.pokvid() + " \t\t\tvs\t\t\t" + p2.pokvid() + "\n"+ "()\t\t\t\t\t\t\t\t\t\t\t\t() ";
							System.out.println(titulo+"\n Lanzar:");
							ArrayList<Habilidad> Habilidades = p1.getHabilidades();
							for (int i = 0; i < Habilidades.size(); i++) {
								Habilidad element = Habilidades.get(i);
								System.out.println(String.valueOf(i + 1) + ") " + element);
							}
							int hab = Integer.parseInt(teclado.nextLine()) - 1;
							while (hab + 1 > p1.getNumeroHabiidades()) {
								System.out.println("No disponible, digite otro");
								hab = Integer.parseInt(teclado.nextLine()) - 1;

							}

							p1.lanzarHabilidad(hab, p2);
							cb1.tespe();

							for (int i = 0; i <= 10; i = i + 1) {
								System.out.println();
							}

							if (cb1.verificarvidas(p1,p2)!=""){
								System.out.println(cb1.verificarvidas(p1,p2));
								cb1.tespe();
								break;
							}
							cb1.seguirturno();
							titulo="Turno :" + cb1.getturno() + "\n" + p1.pokvid() + " \t\t\tvs\t\t\t" + p2.pokvid() + "\n"+ "()\t\t\t\t\t\t\t\t\t\t\t\t() ";
							System.out.println(titulo);
							cb1.tespe();
							System.out.println("El bot lanzar�");
							ArrayList<Habilidad> Habilidadesb = p2.getHabilidades();


							p2.lanzarHabilidad((int) (Math.random() * p2.getNumeroHabiidades() - 1), p1);

							cb1.tespe();
							if (cb1.verificarvidas(p1,p2)!=""){
								System.out.println(cb1.verificarvidas(p1,p2));
								cb1.tespe();
								break;
							}
						}

					}
					cb1.seguirturno();
					break;
                case 2:
                    System.out.println(c1);
                    System.out.println(c1.CurarPokemon(jugador.getPokemonInicial()));
                    System.out.println(c1.CurarPokemon(pokRival));
                    break;
                case 3:
                	System.out.println(jugadorRoket);
                	CampoDeBatalla cb2=new CampoDeBatalla();
                	
                	System.out.println(jugador.getGimnasio().getNombre());
                	System.out.println(jugador.getGimnasio().getPOOKEMON());
                	
                	CampoDeBatalla campo1=new CampoDeBatalla();
					Pokemon p3= jugador.getPokemonInicial();
					Pokemon p4= jugadorRoket.getPokemonInicial();
					if (p3.getVida()==0 || p4.getVida()==0){
						System.out.println("Un pokemon no puede luchar por falta de vida");
					}
					else{
						cb2.resetTurno();
						campo1.ComenzarBatalla(jugador.getPokemonInicial(),pokRival);
						cb2.tespe();
						for(int i = 0; i <= 10; i = i + 1){System.out.println();}
						String titulo;
						while (p4.getVida()>0 && p3.getVida()>0) {
							for(int i = 0; i <= 10; i = i + 1){System.out.println();}
							cb2.seguirturno();
							titulo="Turno :" + cb2.getturno() + "\n" + p3.pokvid() + " \t\t\tvs\t\t\t" + p4.pokvid() + "\n"+ "()\t\t\t\t\t\t\t\t\t\t\t\t() ";
							System.out.println(titulo+"\n Lanzar:");
							ArrayList<Habilidad> Habilidades = p3.getHabilidades();
							for (int i = 0; i < Habilidades.size(); i++) {
								Habilidad element = Habilidades.get(i);
								System.out.println(String.valueOf(i + 1) + ") " + element);
							}
							int hab = Integer.parseInt(teclado.nextLine()) - 1;
							while (hab + 1 > p3.getNumeroHabiidades()) {
								System.out.println("No disponible, digite otro");
								hab = Integer.parseInt(teclado.nextLine()) - 1;

							}

							p3.lanzarHabilidad(hab, p4);
							cb2.tespe();

							for (int i = 0; i <= 10; i = i + 1) {
								System.out.println();
							}

							if (cb2.verificarvidas(p3,p4)!=""){
								System.out.println(cb2.verificarvidas(p3,p4));
								cb2.tespe();
								break;
							}
							cb2.seguirturno();
							titulo="Turno :" + cb2.getturno() + "\n" + p3.pokvid() + " \t\t\tvs\t\t\t" + p4.pokvid() + "\n"+ "()\t\t\t\t\t\t\t\t\t\t\t\t() ";
							System.out.println(titulo);
							cb2.tespe();
							System.out.println("El bot lanzar�");
							ArrayList<Habilidad> Habilidadesb = p4.getHabilidades();


							p4.lanzarHabilidad((int) (Math.random() * p4.getNumeroHabiidades() - 1), p3);

							cb2.tespe();
							if (cb2.verificarvidas(p3,p4)!=""){
								System.out.println(cb2.verificarvidas(p3,p4));
								cb2.tespe();
								break;
							}
						}

					}
					cb2.seguirturno();
                    break;
                case 4:
                    System.out.println("Veamos su perfil de Pokemon:");
                    System.out.println(jugador.getPokemonInicial());
                    System.out.println("\n\nVeamos su perfil de Entrenador:");
                    System.out.println(jugador);
                    break;

                case 5:
                	leerEntrenadores();
                	break;
                case 6:
                	Serializador.serializarTodo();
                    System.exit(0);
            }
        }
    }

    
/**
 * sin del codigo :)
 */


}
