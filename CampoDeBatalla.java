import java.util.ArrayList;
import java.util.Scanner;

public class CampoDeBatalla {
    int tiempoEspera=1500;
    public void ComenzarBatalla(Pokemon p1,Pokemon p2) {
        Scanner teclado = new Scanner(System.in);
        if (p1.getVida()==0 || p2.getVida()==0){
            System.out.println("Un pokemon no puede luchar por falta de vida");
        }
        else{
            // COMIENZA BATALLA

            try {
                Thread.sleep(tiempoEspera);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for(int i = 0; i <= 10; i = i + 1){
                System.out.println();
            }
            int turno=1;
            while (p2.getVida()>0 && p1.getVida()>0) {

                for (int i = 0; i <= 10; i = i + 1) {
                    System.out.println();
                }

                System.out.println("Turno :" + turno);

                System.out.println(p1.pokvid() + " \t\t\tvs\t\t\t" + p2.pokvid());
                System.out.println("()\t\t\t\t\t\t\t\t\t\t\t\t()");
                ArrayList<Habilidad> Habilidades = p1.getHabilidades();
                System.out.println("Lanzar:");
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
                try {
                    Thread.sleep(tiempoEspera);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                for (int i = 0; i <= 10; i = i + 1) {
                    System.out.println();
                }

                turno++;
                //
                //TURNO DEL BOT
                //
                System.out.println("Turno :" + turno);
                System.out.println(p1.pokvid() + " \t\t\tvs\t\t\t" + p2.pokvid());
                System.out.println("()\t\t\t\t\t\t\t\t\t\t\t\t()");
                ArrayList<Habilidad> Habilidadesb = p2.getHabilidades();
                System.out.println("\nEL BOT PENSANDO\n\n");

                try {
                    Thread.sleep(tiempoEspera);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                p2.lanzarHabilidad((int) (Math.random() * p2.getNumeroHabiidades() - 1), p1);


                try {
                    Thread.sleep(tiempoEspera);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                if (p1.getVida()==0 || p2.getVida()==0){
                    System.out.println("\nHA TERMINADO LA PELEA\n\n");
                    try {
                        Thread.sleep(tiempoEspera);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    }
