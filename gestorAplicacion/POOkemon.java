package gestorAplicacion;

import gestorAplicacion.Entrenador.Entrenador;
import gestorAplicacion.lugares.CampoDeBatalla;
import gestorAplicacion.lugares.CentroPokemon;
import gestorAplicacion.pokemon.Habilidad;
import gestorAplicacion.pokemon.Pokemon;

import java.io.IOException;
import java.util.Scanner;


public class POOkemon {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Scanner teclado = new Scanner(System.in);

       String pok="░░░░╔╗\n" +"╔═╦═╣╠╦═╦══╦═╦═╦╗\n" +"║╬║╬║═╣╩╣║║║╬║║║║\n"+"║╔╩═╩╩╩═╩╩╩╩═╩╩═╝\n" +"╚╝\n";

       System.out.println(pok+"\n" +"Vamos a crear tu entrenador\nDigite su nombre:");
       String nombre=teclado.nextLine();
       System.out.println(pok+"\n" +"Digita tu genero:\nM)Masculino \nF)Femenino");
       String genero=teclado.nextLine();
       Entrenador entrenadordeljugador= new Entrenador(nombre,genero);

      // System.out.flush();


        Pokemon p1=new Pokemon("Pikachu");
        Pokemon p2=new Pokemon("Bulbasaur");
        Habilidad h1= new Habilidad("chapuzon");
        Habilidad h2= new Habilidad("agua lodosa");
        Habilidad h3= new Habilidad("cascada");
        Habilidad h4= new Habilidad("Carga");
        Habilidad h5= new Habilidad("Rayo");

        //PokemonOutput salida;
        //salida = new PokemonOutput();
        //salida.abrir();
        //salida.escribir( p1 );
        //salida.escribir( p2 );
        //salida.cerrar();

        //Escritura de datos
        //PokemonOutput salida;
        //salida = new PokemonOutput();
        //salida.abrir();
        //salida.escribir( contacto1 );
        //salida.escribir( contacto2 );
        //salida.cerrar();

        // Lectura de datos




        CentroPokemon c1=new CentroPokemon();
        while (true) {
            System.out.println("Digite que quieres hacer:\n" +
                    "1)Ir a campo de Batalla \n" +
                    "2)Ver estado de mis pokemones \n" +
                    "3)Ir al gestorAplicacion.lugares.CentroPokemon\n"+
                    "4)Pokedex\n"+
                    "5)Salir");
            int opcion= Integer.parseInt(teclado.nextLine());
            switch (opcion){
                case 1:
                    CampoDeBatalla campo=new CampoDeBatalla();
                    campo.ComenzarBatalla(p1,p2);
                    break;
                case 2:
                    System.out.println(c1);
                    System.out.println(c1.CurarPokemon(p1));
                    System.out.println(c1.CurarPokemon(p2));

                case 4:
                    System.out.println("Bienvenido a la pokedex\n" +
                            "1)Ver Pokemones\n" +
                            "2)Crear Pokemones\n"+
                            "3)Eliminar Pokemones");
                    int opcionpokedex= Integer.parseInt(teclado.nextLine());
                    switch (opcionpokedex){
                        case 1:

                        case 2:
                            System.out.println("digite la especie: " +
                                    "\n Planta" +
                                    "\n Fuego" +
                                    "\n Agua" +
                                    "\n Electrico");
                            String especie= teclado.nextLine();
                            System.out.println("digite el nombre: ");
                            String nom1= teclado.nextLine();
                            System.out.println("De las siguientes Habilidades:" +"\n1)chapuzon\n2)agua lodosa\n3)cascada\n4)Carga\n5)Rayo\n6)Chispa\ndigite la primera habilidad que quieres en tu gestorAplicacion.pokemon:");
                            String hab1= teclado.nextLine();
                            System.out.println("digite la segunda habilidad que quieres en tu gestorAplicacion.pokemon:");
                            String hab2= teclado.nextLine();
                            System.out.println("digite la tercera habilidad que quieres en tu gestorAplicacion.pokemon:");
                            String hab3= teclado.nextLine();
                            new Pokemon(especie,nom1,hab1,hab2,hab3);
                    }



                case 5:
                    System.exit(0);
            }
        }





    }
    }
