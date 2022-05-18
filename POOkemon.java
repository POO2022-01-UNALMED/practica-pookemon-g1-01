import java.util.ArrayList;
import java.util.Scanner;


public class POOkemon {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

       String pok="░░░░╔╗\n" +"╔═╦═╣╠╦═╦══╦═╦═╦╗\n" +"║╬║╬║═╣╩╣║║║╬║║║║\n"+"║╔╩═╩╩╩═╩╩╩╩═╩╩═╝\n" +"╚╝\n";

       System.out.println(pok+"\n" +
               "Vamos a crear tu entrenador\nDigite su nombre:");
       String nombre=teclado.nextLine();
      // System.out.flush();




        Pokemon p1=new Pokemon("Pikachu");
        Pokemon p2=new Pokemon("Bulbasaur",true);

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
