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

       //de aqui para abajo va a ser una prueba de CAMPO DE BATALLA
        Pokemon p1=new Pokemon("Pikachu");
        Pokemon p2=new Pokemon("Bulbasaur");
        for(int i = 0; i <= 10; i = i + 1){
            System.out.println();
        }
        int turno=1;
            while (p2.getVida()>0){

                System.out.println(p1.pokvid() + " \t\t\tvs\t\t\t" + p2.pokvid());
                System.out.println("()\t\t\t\t\t\t\t\t\t\t\t\t()");
                ArrayList<Habilidad> Habilidades = p1.getHabilidades();
                System.out.println("Lanzar:");
                for (int i = 0; i<Habilidades.size(); i++) {
                    Habilidad element = Habilidades.get(i);
                    System.out.println(String.valueOf(i+1)+") "+element);
                }
                int hab= Integer.parseInt(teclado.nextLine())-1;
                for(int i = 0; i <= 10; i = i + 1){
                    System.out.println();
                }
                p1.lanzarHabilidad(hab,p2);

            }
            //System.out.print("\n\n"+Bulbasaur);
            //System.out.print("\n\n"+Pikachu);

    }
    }
