import java.util.HashMap;
import java.util.Map;
public class Habilidad{
    private String  Nombre;
    private int     Fuerza;
    private String  tipo;
    private Boolean EsCuracion ;
    Map<String, Float> Debilidades = new HashMap<String, Float>();


   public Habilidad(String NombreHb){
       //HABILIDADES DE AGUA
       if (NombreHb=="chapuzon"){
           this.Nombre=NombreHb;
           this.tipo="Agua";
           this.Fuerza=20;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Electrico", 1.5F);
           }
       
       if (NombreHb=="agua lodosa"){
           this.Nombre=NombreHb;
           this.tipo="Agua";
           this.Fuerza=45;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Electrico", 1.5F);
       }
       if (NombreHb=="cascada"){
           this.Nombre=NombreHb;
           this.tipo="Agua";
           this.Fuerza=30;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Electrico", 1.5F);
       }
       //HABILIDADES ELECTRICAS
       if (NombreHb=="Carga"){
           this.Nombre=NombreHb;
           this.tipo="Electrico";
           this.Fuerza=34;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Fuego", 0.5F);
       }
       if (NombreHb=="Rayo"){
           this.Nombre=NombreHb;
           this.tipo="Electrico";
           this.Fuerza=38;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Fuego", 0.5F);
       }
       if (NombreHb=="Chispa"){
           this.Nombre=NombreHb;
           this.tipo="Electrico";
           this.Fuerza=40;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Fuego", 0.5F);
       }
   }
    @Override
    public String toString() {
        return this.Nombre+"\t"+this.Fuerza;
    }

    public int getFuerza(){
       return this.Fuerza;
    }

    public float getDebilidad(String r) {
        if (Debilidades.get(r)==null){
            return 1F;
        }else {
            return Debilidades.get(r);
        }
    }
    public String getNombre() {
       return this.Nombre;
    }
}