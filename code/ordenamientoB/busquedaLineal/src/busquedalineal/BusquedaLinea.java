/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedalineal;

/**
 *
 * @author estudiante
 */
public class BusquedaLinea 
{
    public int BucarNombre (String[] nombres, String busqueda)
    {
        for (int i = 0; i < nombres.length; i++) 
        {
            if(nombres[i].equals(busqueda))            
            {
                return i;
            }
        }
        return -1;
    }
}
