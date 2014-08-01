/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase16;

/**
 *
 * @author estudiante
 */
public class Clase16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] arreglo={56,4,85,42};
        int[] arregloOrdenamiento;     
        ordenamiento Ordenamiento=new ordenamiento();
        arregloOrdenamiento=Ordenamiento.OrdenamientoB(arreglo,"A");
        System.out.println("Ordenamiento burbuja");
        for (int i = 0; i < arregloOrdenamiento.length; i++) 
        {
            System.out.println(arregloOrdenamiento[i]);
        }
    }
}
