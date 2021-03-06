package gestorAplicacion.pokemon;

import java.util.ArrayList;
import java.io.*;

/**
 * Se crean varios Pokemones que pueden usar los Entrenadores
 * 
 * @author David Urrego 
 * @author Pablo Usuga
 */

public class Pokemon implements Serializable{
	
	/**
	 * se crea un objeto del tipo Pokemon y se emplea la seriabilizacion
	 * para permitir que un objeto del tipo EntrenadorGimnasio se seriabilice 
	 * de manera correcta
	 * 
	 * @param nombre nombre del Pokemon
	 * @param especie especie del pokemon
	 * @param serialVersionUID permite la seriabilizacion
	 * @param Habilidades lista de habilidades del pokemon
	 * @param NivelMaximo nivel maximo que puede alcanzar un pokemon
	 * @param Nivel nivel del pokemon
	 * @param VidaMaxima vida maxima del pokemon
	 * @param Vida la vida actul del pokemon
	 * @param bot para indicar si es un bot
	 * @param NumerHabilidades numero de habilidades
	 */
	
	private static final long serialVersionUID = 1L;
	private String especie;
    private String nombre;

    private ArrayList<Habilidad> Habilidades= new ArrayList<Habilidad>();

    private int NivelMaximo;
    private int Nivel=0;
    private int VidaMaxima;
    private int Vida;
    private boolean bot;
    private int NumerHabilidades;


    public Pokemon(String NombredePokemonDefecto,boolean x){
    	//constructor del bot
        this(NombredePokemonDefecto);
        this.bot=x;

    }
    public Pokemon(String NombredePokemonDefecto){
    	//constructor del pokemon con el que jugaremos
        this.bot=false;
        // electricos
        if (NombredePokemonDefecto=="Pikachu"){
            this.especie="Electrico";
            this.nombre="Pikachu";
            this.NivelMaximo=100;
            this.Vida=200;
            this.VidaMaxima=200;
            this.Habilidades.add(new Habilidad("Carga"));
            this.Habilidades.add(new Habilidad("Rayo"));
            this.Habilidades.add(new Habilidad("impactrueno"));
            this.NumerHabilidades=3;
        }
        if (NombredePokemonDefecto=="Electrode"){
            this.especie="Electrico";
            this.nombre="Electrode";
            this.NivelMaximo=100;
            this.Vida=200;
            this.VidaMaxima=200;
            this.Habilidades.add(new Habilidad("electroca???on"));
            this.Habilidades.add(new Habilidad("pu???o trueno"));
            this.Habilidades.add(new Habilidad("Chispa"));
            this.NumerHabilidades=3;
        }
        if (NombredePokemonDefecto=="Voltorb"){
            this.especie="Electrico";
            this.nombre="Voltorb";
            this.NivelMaximo=100;
            this.Vida=200;
            this.VidaMaxima=200;
            this.Habilidades.add(new Habilidad("tecno shock"));
            this.Habilidades.add(new Habilidad("pu???o trueno"));
            this.Habilidades.add(new Habilidad("Rayo"));
            this.NumerHabilidades=3;
        }
        
        
        //acuaticos
        else if (NombredePokemonDefecto=="Squirtle"){
            this.especie="Agua";
            this.nombre="Squirtle";
            this.NivelMaximo=100;
            this.Vida=400;
            this.VidaMaxima=400;
            this.Habilidades.add(new Habilidad("chapuzon"));
            this.Habilidades.add(new Habilidad("agua lodosa"));
            this.Habilidades.add(new Habilidad("cascada"));
            this.NumerHabilidades=3;
        }
        else if (NombredePokemonDefecto=="Gyarados"){
            this.especie="Agua";
            this.nombre="Gyarados";
            this.NivelMaximo=100;
            this.Vida=200;
            this.VidaMaxima=200;
            this.Habilidades.add(new Habilidad("hidroca???on"));
            this.Habilidades.add(new Habilidad("hidrobomba"));
            this.Habilidades.add(new Habilidad("hidropulzo"));
            this.NumerHabilidades=3;
        }
        else if (NombredePokemonDefecto=="Tentacool"){
            this.especie="Agua";
            this.nombre="Tentacool";
            this.NivelMaximo=100;
            this.Vida=200;
            this.VidaMaxima=200;
            this.Habilidades.add(new Habilidad("acua jet"));
            this.Habilidades.add(new Habilidad("rayo burbuja"));
            this.Habilidades.add(new Habilidad("salmuera"));
            this.NumerHabilidades=3;
        }
        
        
        //de fuego
        else if (NombredePokemonDefecto=="Charmander"){
            this.especie="Fuego";
            this.nombre="Charmander";
            this.NivelMaximo=110;
            this.Vida=200;
            this.VidaMaxima=200;
            this.Habilidades.add(new Habilidad("incendio"));
            this.Habilidades.add(new Habilidad("calor"));
            this.Habilidades.add(new Habilidad("quemadura"));
            this.NumerHabilidades=3;
        }
        else if (NombredePokemonDefecto=="Ponyta"){
            this.especie="Fuego";
            this.nombre="Ponyta";
            this.NivelMaximo=110;
            this.Vida=200;
            this.VidaMaxima=200;
            this.Habilidades.add(new Habilidad("llamarada"));
            this.Habilidades.add(new Habilidad("anillo igneo"));
            this.Habilidades.add(new Habilidad("sofoco"));
            this.NumerHabilidades=3;
        }
        else if (NombredePokemonDefecto=="Magmar"){
            this.especie="Fuego";
            this.nombre="Magmar";
            this.NivelMaximo=110;
            this.Vida=200;
            this.VidaMaxima=200;
            this.Habilidades.add(new Habilidad("incendio"));
            this.Habilidades.add(new Habilidad("anillo igneo"));
            this.Habilidades.add(new Habilidad("lanzallamas"));
            this.NumerHabilidades=3;
        }
        
        //venenosos
        else if (NombredePokemonDefecto=="Gastly"){
            this.especie="Veneno";
            this.nombre="Gastly";
            this.NivelMaximo=70;
            this.Vida=300;
            this.VidaMaxima=300;
            this.Habilidades.add(new Habilidad("acido"));
            this.Habilidades.add(new Habilidad("bomba lodo"));
            this.Habilidades.add(new Habilidad("lanzamugre"));
            this.NumerHabilidades=3;
        }
        else if (NombredePokemonDefecto=="Ekans"){
            this.especie="Veneno";
            this.nombre="Ekans";
            this.NivelMaximo=70;
            this.Vida=300;
            this.VidaMaxima=300;
            this.Habilidades.add(new Habilidad("veneno X"));
            this.Habilidades.add(new Habilidad("veneno Y"));
            this.Habilidades.add(new Habilidad("bomba acida"));
            this.NumerHabilidades=3;
        }
        else if (NombredePokemonDefecto=="Muk"){
            this.especie="Veneno";
            this.nombre="Muk";
            this.NivelMaximo=70;
            this.Vida=300;
            this.VidaMaxima=300;
            this.Habilidades.add(new Habilidad("veneno X"));
            this.Habilidades.add(new Habilidad("bomba lodo"));
            this.Habilidades.add(new Habilidad("bomba acida"));
            this.Habilidades.add(new Habilidad("lanzamugre"));
            this.NumerHabilidades=4;
        }
        
        
        //planta
        else if (NombredePokemonDefecto=="Bulbasur"){
            this.especie="Planta";
            this.nombre="Bulbasur";
            this.NivelMaximo=90;
            this.Vida=250;
            this.VidaMaxima=250;
            this.Habilidades.add(new Habilidad("hoja afilada"));
            this.Habilidades.add(new Habilidad("tormenta floral"));
            this.Habilidades.add(new Habilidad("ciclon de hojas"));
            this.NumerHabilidades=3;
        }
        else if (NombredePokemonDefecto=="Gloom"){
            this.especie="Planta";
            this.nombre="Gloom";
            this.NivelMaximo=90;
            this.Vida=250;
            this.VidaMaxima=250;
            this.Habilidades.add(new Habilidad("hierba lazo"));
            this.Habilidades.add(new Habilidad("semilladora"));
            this.Habilidades.add(new Habilidad("bomba germen"));
            this.NumerHabilidades=3;
        }
        else if (NombredePokemonDefecto=="Venusaur"){
            this.especie="Planta";
            this.nombre="Venusaur";
            this.NivelMaximo=90;
            this.Vida=250;
            this.VidaMaxima=250;
            this.Habilidades.add(new Habilidad("hoja afilada"));
            this.Habilidades.add(new Habilidad("semilladora"));
            this.Habilidades.add(new Habilidad("latigo cepa"));
            this.NumerHabilidades=3;
        }
        
    }
    
    
    public String lanzarHabilidad(int h,Pokemon p){
    	//lanza la habilidad escogida por el usuario contra el pokemon rival
    	
       Habilidad ha=this.Habilidades.get(h);
       return
       p.quitarVida((int) (ha.getFuerza()*ha.getDebilidad(p.getEspecie())))+
               ("\t\tSe Ha lanzado "+ha.getNombre()+" a "+p.getNombre()+"\n"+"\t\tLa vida de "+p.getNombre()+" a reducido "+ha.getFuerza()*ha.getDebilidad(p.getEspecie()));

    }
    public String quitarVida(int r){
    	//quita vida al pokemon rival
    	
        if (this.Vida-r<=0) {
            this.Vida=0;
            return ("\t\tha muerto "+this.nombre+"\n");
        }
        else{
            this.Vida = this.Vida - r;
            return "";
        }
    }
    public String pokvid(){ 
    	// Lo que va a mostar en la informacion de batalla
        return this.nombre+"\tVida :\t"+this.Vida+"/"+this.VidaMaxima;
    }

    @Override
    public String toString() {
    	//metodo toString
        return "Especie :\t" +this.especie+"\n" +
               "nombre :\t"+this.nombre+"\n" +
               "Nivel :\t\t"+this.Nivel+"/"+this.NivelMaximo+"\n" +
               "Vida :\t\t"+this.Vida+"/"+this.VidaMaxima 
               + "\n";
    }
    //getters
    public String getNombre(){
        return this.nombre;
    }

    public int getNumeroHabiidades(){
        return this.NumerHabilidades;
    }
    public void setNombre(String nuevoNom){
        this.nombre = nuevoNom;
    }
    
    public ArrayList<Habilidad> getHabilidades(){
        return this.Habilidades;
    }
    public int getVida(){
        return this.Vida;
    }
    public int getVidaMaxima(){
        return this.VidaMaxima;
    }
    public void setvida(int aumento){
        this.Vida = this.Vida + aumento;
    }
    
    public String getEspecie(){
        return this.especie;
    }

}
