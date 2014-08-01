/*
   * Name: class1
  
   *Information: this is the first practice 
  
   * date: 9/5/2014
  
   *copyright 
 */
package ciclos;
import java.io.IOException;
import static java.lang.System.in;
import java.util.Scanner;
/**
 *
 * @author HEINER ANTONIO UREÑA ZUÑIGA
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        /*
        *ciclo for 
        */
        int cantidad;
        int suma=0;
        Scanner teclado=new Scanner(System.in);
        
        System.out.print("Digite la cantidad de impresiones que desea ver" + "\n");
        
        cantidad = Integer.parseInt(teclado.nextLine());
        
        for (int i = 0; i <= cantidad; i++) 
        {
            System.out.print( i + "\n");
        }
          System.out.print("Inverso" + "\n");
        for (int i = cantidad ; i >=0 ; i--) 
        {
             System.out.print( i + "\n");
        }
        /*
        *ciclo while
        */
        
        while(suma <= cantidad)
        {
            System.out.print(suma);
            System.out.print( " - ");
            suma=suma+1;
        }
        System.out.print("\n");
        suma=cantidad;
        while(suma>=0)
        {
            System.out.print(suma);
            System.out.print( " - ");
            suma=suma-1;
        }
         /*
        *ciclo do-while
        */
        
        suma=0;
        System.out.print("\n");
        do
        {
            System.out.print(suma);
            System.out.print( " _ ");
            suma=suma+1;
        }while(suma<=cantidad);
        
        System.out.print("\n");
        suma=cantidad;
          do
        {
            System.out.print(suma);
            System.out.print( " _ ");
            suma=suma-1;
        }while(suma<=0);
    }
    
    
    
}
