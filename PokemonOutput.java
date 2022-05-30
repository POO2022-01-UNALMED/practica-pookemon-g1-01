import gestorAplicacion.pokemon.Pokemon;

import java.io.*;
public class PokemonOutput
{
    private FileOutputStream file;
    private ObjectOutputStream output;
    // Abrir el fichero
    public void abrir()
            throws IOException
    {
        file = new FileOutputStream( "pokemones.ser" );
        output = new ObjectOutputStream(file);
    }
    // Cerrar el fichero
    public void cerrar()
            throws IOException
    {
        if (output!=null)
            output.close();
    }
    // Escribir en el fichero
    public void escribir (Pokemon pokemon)
            throws IOException
    {
        if (output!=null)
            output.writeObject(pokemon);
    }
}
