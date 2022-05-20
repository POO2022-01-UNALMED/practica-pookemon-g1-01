import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class POOkemon {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

       String pok="â–‘â–‘â–‘â–‘â•”â•—\n" +"â•”â•�â•¦â•�â•£â• â•¦â•�â•¦â•�â•�â•¦â•�â•¦â•�â•¦â•—\n" +"â•‘â•¬â•‘â•¬â•‘â•�â•£â•©â•£â•‘â•‘â•‘â•¬â•‘â•‘â•‘â•‘\n"+"â•‘â•”â•©â•�â•©â•©â•©â•�â•©â•©â•©â•©â•�â•©â•©â•�â•�\n" +"â•šâ•�\n";

       System.out.println(pok+"\n" +"Vamos a crear tu entrenador\nDigite su nombre:");
       String nombre=teclado.nextLine();
       System.out.println(pok+"\n" +"Digita tu genero:\n1)Masculino \n2)Femenino");
       String genero=teclado.nextLine();

      // System.out.flush();
       ArrayList<String> ListaPookemones = new ArrayList<String>();
       
       ListaPookemones.add("Pikachu");
       ListaPookemones.add("Electrode");
       ListaPookemones.add("Voltorb");
       ListaPookemones.add("Squirtle");
       ListaPookemones.add("Gyarados");
       ListaPookemones.add("Tentacool");
       ListaPookemones.add("Charmander");
       ListaPookemones.add("Ponyta");
       ListaPookemones.add("Magmar");
       ListaPookemones.add("Gastly");
       ListaPookemones.add("Ekans");
       ListaPookemones.add("Muk");
       ListaPookemones.add("Bulbasur");
       ListaPookemones.add("Gloom");
       ListaPookemones.add("Venusaur");
       
       Random rand = new Random();
       
       String pokemon = ListaPookemones.get(rand.nextInt(ListaPookemones.size()));
       System.out.println(pokemon);
       

        Pokemon p1=new Pokemon("Pikachu");
        System.out.println(p1.getVida());
        Pokemon p2=new Pokemon(pokemon,true);
        System.out.println(p2.getVida());

        CentroPokemon c1=new CentroPokemon();
        
        while (true) {
            System.out.println("Digite que quieres hacer:\n" +
                    "1)Ir a campo de Batalla \n" +
                    "2)Ir al CentroPokemon\n"+
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

                case 5:
                    System.exit(0);
            }
        }





    }
    }
