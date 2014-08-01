/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica.de.arreglos;

/**
 *
 * @author hei
 */
public class ejercicio1 
{
    private int numeros[]=new int[8];

    public String mayores36()
    {
        String retorno="";
        int cantidadMayores36=0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]>36)
            {
                cantidadMayores36++;
                retorno=retorno+"-"+ numeros;
            }
                    
        }
        
        return retorno;
    }
    
    public int acumulado()
    {
        int acumulado=0;
        for (int i = 0; i <numeros.length; i++) 
        {
            acumulado+=numeros[i];
        }
        
        return acumulado;
    }
    public String NumerosMayoresA50()
    {
        String retorno="";
         int cantidadMayores50=0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]>50)
            {
                cantidadMayores50++;
                retorno=retorno+ "-" + numeros;
            }
                    
        }
    
        return retorno;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
        
   
   
    
}
