package gestorAplicacion.lugares;

import gestorAplicacion.pokemon.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class CampoDeBatalla {
	int tiempoEspera=1500;
    public void ComenzarBatalla(Pokemon p1,Pokemon p2) {
        Scanner teclado = new Scanner(System.in);
        if (p1.getVida()==0 || p2.getVida()==0){
            System.out.println("Un pokemon no puede luchar por falta de vida");
        }
        else{
            // COMIENZA BATALLA

           tespe();
            for(int i = 0; i <= 10; i = i + 1){
                System.out.println();
            }
            int turno=1;

            String titulo;
            while (p2.getVida()>0 && p1.getVida()>0) {

                for (int i = 0; i <= 10; i = i + 1) {
                    System.out.println();
                }
                titulo="Turno :" + turno + "\n" + p1.pokvid() + " \t\t\tvs\t\t\t" + p2.pokvid() + "\n"+ "()\t\t\t\t\t\t\t\t\t\t\t\t() ";
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
                tespe();

                for (int i = 0; i <= 10; i = i + 1) {
                    System.out.println();
                }

                turno++;
                if (verificarvidas(p1,p2)!=""){
                    System.out.println(verificarvidas(p1,p2));
                    tespe();
                    break;
                }
                turno++;
                titulo="Turno :" + turno + "\n" + p1.pokvid() + " \t\t\tvs\t\t\t" + p2.pokvid() + "\n"+ "()\t\t\t\t\t\t\t\t\t\t\t\t() ";
                System.out.println(titulo);
                tespe();
                System.out.println("El bot lanzar�");
                ArrayList<Habilidad> Habilidadesb = p2.getHabilidades();


                p2.lanzarHabilidad((int) (Math.random() * p2.getNumeroHabiidades() - 1), p1);

                tespe();
                if (verificarvidas(p1,p2)!=""){
                    System.out.println(verificarvidas(p1,p2));
                    tespe();
                    break;
                }
            }
        }
    }
    public void tespe(){
        try {
            Thread.sleep(tiempoEspera);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public String verificarvidas(Pokemon p1,Pokemon p2){
        if (p1.getVida()==0 || p2.getVida()==0){
            String[] a1 = new String[1];

            if (p1.getVida()==0){
                a1[0]=p2.getNombre();
            }
            else if (p2.getVida()==0){
                a1[0]=p1.getNombre();
            }

            return "\nHA TERMINADO LA PELEA\n El ganador ha sido "+a1[0]+"\n";
        }
        else{
            return "";

        }
    }






}
