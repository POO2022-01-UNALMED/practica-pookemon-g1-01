public class Pokemon {
    private String especie;
    private String nombre;
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
        }
        else if (NombredePokemonDefecto=="bulbasaur"){
            this.especie="Planta";
            this.nombre="Bulbasaur";
            this.NivelMaximo=20;
            this.Vida=20;
            this.VidaMaxima=20;
        }
    }

    @Override
    public String toString() {
        return "Especie :\t" +this.especie+"\nnombre :\t"+this.nombre+"\nNivel :\t"+this.Nivel+"/"+this.NivelMaximo+"\nVida :\t"+this.Vida+"/"+this.VidaMaxima;
    }
}
