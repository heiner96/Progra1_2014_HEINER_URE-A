/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedalineal;

/**
 *
 * @author estudiante
 */
public class busquedaBinaria 
{
    public int BucarNombre (String[] pnombres, String busqueda)
    {
        int inicial=0;
        int elementoFinal=pnombres.length-1;
        while(inicial<elementoFinal)
        {
            int central=(inicial+elementoFinal)/2;
            if(busqueda.compareTo(pnombres[central])>0)
            {
                inicial=central+1;            
            }
            else
            {
                if(busqueda.compareTo(pnombres[central])<0)
                {
                      elementoFinal=central-1;  
                }
                else
                {
                    return central;
                }
            }                
        }        
        return -1;
    }    
}
