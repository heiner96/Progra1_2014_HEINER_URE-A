/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg19;

/**
 *
 * @author Estudiante
 */
public class Clase19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        pila opila=new pila();       
        String[] datos=new String[4]; 
        datos[0]="HEINER";
        datos[1]="KARINA";
        datos[2]="MONICA";
        datos[3]="MARIO";       
        opila.BorrarUltimo(datos);        
        opila.Push("Efren");
        opila.Push("Joss");
        opila.Push("Andrey");
        opila.Push("Jose");
        opila.imprimir();
        System.out.println("La cantidad de elementos es " + opila.cantidad());
        if(!opila.Vacia())
        {
            System.out.println("La pila no esta vacia");
        }
        else
        {
            System.out.println("La pila esta vacia");    
        }
        opila.pop();
        opila.pop();
        opila.imprimir();
              

    }
}
