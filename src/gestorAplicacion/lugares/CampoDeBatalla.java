package gestorAplicacion.lugares;

import gestorAplicacion.pokemon.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

/**
 * Se utiliza para crear objetos del tipo CampoDeBatalla
 * 
 * @author Pablo Usuga
 * @author David Urrego
 */

public class CampoDeBatalla {
	
	/**
	 * creamos un objeto CampoDeBatalla
	 * @param tiempoEspera numero de segundos que tarda (esta en micro decimales
	 * @param turno es el turno
	 */
	
	int tiempoEspera=1500;

    int turno=0;
    public void resetTurno(){
    	//reinicia el turno para
        turno=1;
    }
    public int getturno(){
    	//devuelve el turno 
        return turno;
    }
    public void seguirturno(){
    	//aumenta en uno el turno
        turno++;
    }
    public void ComenzarBatalla(Pokemon p1,Pokemon p2) {
        Scanner teclado = new Scanner(System.in);

    }
    public void tespe(){
    	//metodo del tiempo de espera y maneja un 
    	//posible error
        try {
            Thread.sleep(tiempoEspera);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public String verificarvidas(Pokemon p1,Pokemon p2){
    	//este metodo verifica si es se puede seguir la pelea
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
