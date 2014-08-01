/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea;

/**
 *
 * @author heiner
 */
public class clsTarea 
{   
        
    public double ordenamiento(double [] arreglo)
    {
        double retorno=0;
        int indice2;
        int indice=0;
        double auxiliar;
        for(indice2=0; indice2<(((arreglo.length)-indice)-1); indice2++)
            {
                if(arreglo[indice2+1]<arreglo[indice2])
                {
                    auxiliar=arreglo[indice+1];
                    arreglo[indice2+1]=arreglo[indice2];
                    arreglo[indice2]=auxiliar;
                }
            }
        
        
        return retorno;
    }

    
    
}
