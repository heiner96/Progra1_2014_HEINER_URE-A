/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metodo.de.seleccion;

/**
 *
 * @author hei
 */
public class MetodoDeSeleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {        
        int[] arreglo={56,4,85,90,42};
        int[] arregloOrdenado;
        ejercicio1 os = new ejercicio1();
        arregloOrdenado=os.ordens(arreglo, "A");
        for (int i = 0; i < arregloOrdenado.length; i++)
        {
            System.out.println(arregloOrdenado[i]);    
        }
        
        
    }
    
}
