package gestorAplicacion.lugares;

import gestorAplicacion.pokemon.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class CampoDeBatalla {
	int tiempoEspera=1500;

    int turno=0;
    public void resetTurno(){
        turno=1;
    }
    public int getturno(){
        return turno;
    }
    public void seguirturno(){
        turno++;
    }
    public void ComenzarBatalla(Pokemon p1,Pokemon p2) {
        Scanner teclado = new Scanner(System.in);

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
