import java.util.ArrayList;

public class Pokemon {
    private String especie;
    private String nombre;

    private ArrayList<Habilidad> Habilidades= new ArrayList<Habilidad>();

    private int NivelMaximo;
    private int Nivel=0;
    private int VidaMaxima;
    private int Vida;


    public Pokemon(String NombredePokemonDefecto){
        if (NombredePokemonDefecto=="Pikachu"){
            this.especie="Electrico";
            this.nombre="Pikachu";
            this.NivelMaximo=20;
            this.Vida=20;
            this.VidaMaxima=20;
            this.Habilidades.add(new Habilidad("Carga"));
            this.Habilidades.add(new Habilidad("Rayo"));
            this.Habilidades.add(new Habilidad("Chispa"));

        }
        else if (NombredePokemonDefecto=="Bulbasaur"){
            this.especie="Planta";
            this.nombre="Bulbasaur";
            this.NivelMaximo=100;
            this.Vida=40;
            this.VidaMaxima=40;
            this.Habilidades.add(new Habilidad("chapuzon"));
        }
        else if (NombredePokemonDefecto=="Charmander"){
            this.especie="Fuego";
            this.nombre="Charmander";
            this.NivelMaximo=40;
            this.Vida=20;
            this.VidaMaxima=20;
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
    public ArrayList<Habilidad> getHabilidades(){
       return Habilidades;
    }
}
