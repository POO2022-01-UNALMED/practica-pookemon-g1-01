package gestorAplicacion.pokemon;

import java.util.HashMap;
import java.io.*;
import java.util.Map;

public class Habilidad implements Serializable{
	
	private static final long serialVersionUID = 1L;
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
           }//
       
       if (NombreHb=="agua lodosa"){
           this.Nombre=NombreHb;
           this.tipo="Agua";
           this.Fuerza=45;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Electrico", 1.5F);
       }//
       if (NombreHb=="cascada"){
           this.Nombre=NombreHb;
           this.tipo="Agua";
           this.Fuerza=30;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Electrico", 1.5F);
       }//
       if (NombreHb=="hidroca�on"){
           this.Nombre=NombreHb;
           this.tipo="Agua";
           this.Fuerza=39;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Electrico", 1.5F);
       }//
       if (NombreHb=="hidrobomba"){
           this.Nombre=NombreHb;
           this.tipo="Agua";
           this.Fuerza=40;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Electrico", 1.5F);
       }//
       if (NombreHb=="hidropulzo"){
           this.Nombre=NombreHb;
           this.tipo="Agua";
           this.Fuerza=60;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Electrico", 1.5F);
       }//
       if (NombreHb=="acua jet"){
           this.Nombre=NombreHb;
           this.tipo="Agua";
           this.Fuerza=50;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Electrico", 1.5F);
       }//
       if (NombreHb=="rayo burbuja"){
           this.Nombre=NombreHb;
           this.tipo="Agua";
           this.Fuerza=45;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Electrico", 1.5F);
       }//
       if (NombreHb=="salmuera"){
           this.Nombre=NombreHb;
           this.tipo="Agua";
           this.Fuerza=60;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Electrico", 1.5F);
       }//
       
       
       
       //HABILIDADES ELECTRICAS
       if (NombreHb=="Carga"){
           this.Nombre=NombreHb;
           this.tipo="Electrico";
           this.Fuerza=34;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Fuego", 0.5F);
       }//
       if (NombreHb=="Rayo"){
           this.Nombre=NombreHb;
           this.tipo="Electrico";
           this.Fuerza=38;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Fuego", 0.5F);
       }//
       if (NombreHb=="Chispa"){
           this.Nombre=NombreHb;
           this.tipo="Electrico";
           this.Fuerza=40;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Fuego", 0.5F);
       }//
       if (NombreHb=="impactrueno"){
           this.Nombre=NombreHb;
           this.tipo="Electrico";
           this.Fuerza=40;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Fuego", 0.5F);
       }//
       if (NombreHb=="electroca�on"){
           this.Nombre=NombreHb;
           this.tipo="Electrico";
           this.Fuerza=50;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Fuego", 0.5F);
       }//
       if (NombreHb=="pu�o trueno"){
           this.Nombre=NombreHb;
           this.tipo="Electrico";
           this.Fuerza=41;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Fuego", 0.5F);
       }
       if (NombreHb=="tecno shock"){
           this.Nombre=NombreHb;
           this.tipo="Electrico";
           this.Fuerza=60;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Fuego", 0.5F);
       }
       
       
       //HABILIDADES DE FUEGO
       if (NombreHb=="incendio"){
           this.Nombre=NombreHb;
           this.tipo="Fuego";
           this.Fuerza=35;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Agua", 1.0F);
       }//
       if (NombreHb=="calor"){
           this.Nombre=NombreHb;
           this.tipo="Fuego";
           this.Fuerza=38;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Agua", 1.0F);
       }//
       if (NombreHb=="quemadura"){
           this.Nombre=NombreHb;
           this.tipo="Fuego";
           this.Fuerza=40;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Agua", 1.0F);
       }//
       if (NombreHb=="llamarada"){
           this.Nombre=NombreHb;
           this.tipo="Fuego";
           this.Fuerza=40;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Agua", 1.0F);
       }//
       if (NombreHb=="anillo igneo"){
           this.Nombre=NombreHb;
           this.tipo="Fuego";
           this.Fuerza=50;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Agua", 1.0F);
       }//
       if (NombreHb=="sofoco"){
           this.Nombre=NombreHb;
           this.tipo="Fuego";
           this.Fuerza=58;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Agua", 1.0F);
       }//
       if (NombreHb=="lanzallamas"){
           this.Nombre=NombreHb;
           this.tipo="Fuego";
           this.Fuerza=36;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Agua", 1.0F);
       }//
       
       
       //HABILIDADES PLANTA
       if (NombreHb=="hoja afilada"){
           this.Nombre=NombreHb;
           this.tipo="Planta";
           this.Fuerza=36;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Fuego", 1.5F);
       }
       if (NombreHb=="tormenta floral"){
           this.Nombre=NombreHb;
           this.tipo="Planta";
           this.Fuerza=45;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Fuego", 1.5F);
       }
       if (NombreHb=="ciclon de hojas"){
           this.Nombre=NombreHb;
           this.tipo="Planta";
           this.Fuerza=50;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Fuego", 1.5F);
       }
       if (NombreHb=="hierba lazo"){
           this.Nombre=NombreHb;
           this.tipo="Planta";
           this.Fuerza=58;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Fuego", 1.5F);
       }
       if (NombreHb=="semilladora"){
           this.Nombre=NombreHb;
           this.tipo="Planta";
           this.Fuerza=60;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Fuego", 1.5F);
       }
       if (NombreHb=="bomba germen"){
           this.Nombre=NombreHb;
           this.tipo="Planta";
           this.Fuerza=49;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Fuego", 1.5F);
       }
       if (NombreHb=="latigo cepa"){
           this.Nombre=NombreHb;
           this.tipo="Planta";
           this.Fuerza=36;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Fuego", 1.5F);
       }
       
       
       // HABILIDADES VENENO 
       if (NombreHb=="acido"){
           this.Nombre=NombreHb;
           this.tipo="Venenoso";
           this.Fuerza=45;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Planta", 1.5F);
       }//
       if (NombreHb=="bomba lodo"){
           this.Nombre=NombreHb;
           this.tipo="Venenoso";
           this.Fuerza=50;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Planta", 1.5F);
       }//
       if (NombreHb=="lanzamugre"){
           this.Nombre=NombreHb;
           this.tipo="Venenoso";
           this.Fuerza=49;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Planta", 1.5F);
       }//
       if (NombreHb=="puya nociva"){
           this.Nombre=NombreHb;
           this.tipo="Venenoso";
           this.Fuerza=20;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Planta", 1.5F);
       }//
       if (NombreHb=="veneno X"){
           this.Nombre=NombreHb;
           this.tipo="Venenoso";
           this.Fuerza=39;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Planta", 1.5F);
       }//
       if (NombreHb=="veneno Y"){
           this.Nombre=NombreHb;
           this.tipo="Venenoso";
           this.Fuerza=50;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Planta", 1.5F);
       }//
       if (NombreHb=="bomba acida"){
           this.Nombre=NombreHb;
           this.tipo="Venenoso";
           this.Fuerza=20;
           this.EsCuracion=Boolean.FALSE;
           this.Debilidades.put("Planta", 1.5F);
       }//
       
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
