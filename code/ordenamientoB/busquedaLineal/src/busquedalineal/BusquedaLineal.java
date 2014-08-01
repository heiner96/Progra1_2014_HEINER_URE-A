/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedalineal;

/**
 *
 * @author estudiante
 */
public class BusquedaLineal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String [] arreglo={"Mario","Efren","Susana","Campbell","Agustin","Elias"};
        BusquedaLinea bl=new BusquedaLinea();
        System.out.println("La busqueda  lineal es : " + bl.BucarNombre(arreglo, "Efren"));
        System.out.println(" ");
        String [] arreglo2={"Campbell","Agustin","Susana","Elias","Efren","Mario"};
        busquedaBinaria bb=new busquedaBinaria();
        System.out.println("La busqueda  lineal es : " + bb.BucarNombre(arreglo2, "Campbell"));
        System.out.println(" ");
    }
}
