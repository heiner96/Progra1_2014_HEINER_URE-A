/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase16;

/**
 *
 * @author estudiante
 */
public class ordenamiento 
{
    public int[] OrdenamientoB(int[] arreglo,String ordenamiento)
    {
    int indice;
    int indice2;
    int auxiliar=0;
    if(ordenamiento.equals("A"))
    {
        for (indice = 0; indice < arreglo.length-1; indice++)
        {
            for(indice2=0; indice2<(((arreglo.length)-indice)-1); indice2++)
            {
                if(arreglo[indice2+1]<arreglo[indice2])
                {
                    auxiliar=arreglo[indice+1];
                    arreglo[indice2+1]=arreglo[indice2];
                    arreglo[indice2]=auxiliar;
                }
            }
        }
    }
    else
    {
    
    
    }
        return arreglo;
    }
}
