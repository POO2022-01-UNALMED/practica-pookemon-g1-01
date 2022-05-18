import java.util.ArrayList;

public class Pokemon {
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
        this(NombredePokemonDefecto);
        this.bot=x;

    }
    public Pokemon(String NombredePokemonDefecto){
        this.bot=false;
        if (NombredePokemonDefecto=="Pikachu"){
            this.especie="Electrico";
            this.nombre="Pikachu";
            this.NivelMaximo=20;
            this.Vida=200;
            this.VidaMaxima=200;
            this.Habilidades.add(new Habilidad("Carga"));
            this.Habilidades.add(new Habilidad("Rayo"));
            this.Habilidades.add(new Habilidad("Chispa"));
            this.NumerHabilidades=3;
        }
        else if (NombredePokemonDefecto=="Bulbasaur"){
            this.especie="Planta";
            this.nombre="Bulbasaur";
            this.NivelMaximo=100;
            this.Vida=400;
            this.VidaMaxima=400;
            this.Habilidades.add(new Habilidad("chapuzon"));
            this.Habilidades.add(new Habilidad("agua lodosa"));
            this.Habilidades.add(new Habilidad("cascada"));
            this.NumerHabilidades=3;
        }
        else if (NombredePokemonDefecto=="Charmander"){
            this.especie="Fuego";
            this.nombre="Charmander";
            this.NivelMaximo=40;
            this.Vida=200;
            this.VidaMaxima=200;
        }
    }
    public void lanzarHabilidad(int h,Pokemon p){
       Habilidad ha=this.Habilidades.get(h);
       System.out.println("\t\tSe Ha lanzado "+ha.getNombre()+" a "+p.getNombre());
       System.out.println("\t\tLa vida de "+p.getNombre()+" a reducido "+ha.getFuerza()*ha.getDebilidad(p.getEspecie()));
       p.quitarVida((int) (ha.getFuerza()*ha.getDebilidad(p.getEspecie())));

    }
    public void quitarVida(int r){
        if (this.Vida-r<=0) {
            this.Vida=0;
            System.out.println("\t\tha muerto "+this.nombre);
        }
        else{
            this.Vida = this.Vida - r;
        }
    }
    public String pokvid(){ // Lo que va a mostar en la informacion de batalla
        return this.nombre+"\tVida :\t"+this.Vida+"/"+this.VidaMaxima;
    }

    @Override
    public String toString() {
        return "Especie :\t" +this.especie+"\nnombre :\t"+this.nombre+"\nNivel :\t"+this.Nivel+"/"+this.NivelMaximo+"\nVida :\t"+this.Vida+"/"+this.VidaMaxima;
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
    public void setvida(int aumento){
        this.Vida = this.Vida + aumento;
    }
    
    public String getEspecie(){
        return this.especie;
    }

}
