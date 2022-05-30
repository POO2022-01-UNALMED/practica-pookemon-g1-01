import gestorAplicacion.pokemon.Pokemon;

import java.io.*;
public class PokemonInput
{
    private FileInputStream file;
    private ObjectInputStream input;
    public void abrir()
            throws IOException
    {
        file = new FileInputStream( "pokemones.ser" );
        input = new ObjectInputStream (file);
    }
    public void cerrar()
            throws IOException
    {
        if (input!=null )
            input.close();
    }
    public Pokemon leer ()
            throws IOException, ClassNotFoundException
    {
        Pokemon pokemon = null;
        if (input!=null) {
            try {
                pokemon = (Pokemon) input.readObject();
            } catch (EOFException eof) {
            }
        }
        return pokemon;
    }
}
