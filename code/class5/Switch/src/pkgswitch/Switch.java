/*
   * Name: Switch
  
   *Information: this is the practice od sentence Switch 
  
   * date: 21/5/2014
  
   *copyright 
 */

package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author heiner
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
         boolean validar=true;
        double valor1=0;
        double valor2=0;
        double resultado;
        char continuar;
        int opcion=0;
        
        operaciones oOperaciones=new operaciones();
        Scanner teclado=new Scanner(System.in);
        do
        {
            System.out.print( "Digite la operacion a evaluar " +  "\n");
            System.out.print( "1.Suma " +  "\n");
            System.out.print( "2.Resta " +  "\n");
            System.out.print( "3.Division"  +  "\n");
            System.out.print( "4.Multiplicacion " +  "\n");
            System.out.print( "5.Raiz " +  "\n");
            System.out.print( "6.Potencia " +  "\n");
            
            opcion=Integer.parseInt(teclado.nextLine());
            switch(opcion)
            {
                case 1:
                    System.out.print( "Digite el valor del primer valor " +  "\n");
                    valor1= Double.parseDouble(teclado.nextLine());
                    System.out.print( "Digite el valor del segundo valor " +  "\n");
                    valor2= Double.parseDouble(teclado.nextLine());
                    resultado=oOperaciones.Sumar(valor1, valor2);
                    System.out.print( resultado +  "\n");
                    break;
                case 2:
                    System.out.print( "Digite el valor del primer valor " +  "\n");
                    valor1= Double.parseDouble(teclado.nextLine());
                    System.out.print( "Digite el valor del segundo valor " +  "\n");
                    valor2= Double.parseDouble(teclado.nextLine());
                    resultado=oOperaciones.Restar(valor1, valor2);
                    System.out.print( resultado +  "\n");
                    break;
                case 3:
                    System.out.print( "Digite el valor del primer valor " +  "\n");
                    valor1= Double.parseDouble(teclado.nextLine());
                    System.out.print( "Digite el valor del segundo valor " +  "\n");
                    valor2= Double.parseDouble(teclado.nextLine());
                    resultado=oOperaciones.Division(valor1, valor2);
                    System.out.print( resultado +  "\n");
                    break;
                case 4:
                    System.out.print( "Digite el valor del primer valor " +  "\n");
                    valor1= Double.parseDouble(teclado.nextLine());
                    System.out.print( "Digite el valor del segundo valor " +  "\n");
                    valor2= Double.parseDouble(teclado.nextLine());
                    resultado=oOperaciones.Multiplicacion(valor1, valor2);
                    System.out.print( resultado +  "\n");
                    break;
                case 5:
                     System.out.print( "Digite el valor del primer valor " +  "\n");
                    valor1= Double.parseDouble(teclado.nextLine());                   
                    resultado=oOperaciones.Raiz(valor1);
                    System.out.print( resultado +  "\n");
                    break;
                case 6:
                    System.out.print( "Digite el valor del primer valor " +  "\n");
                    valor1= Double.parseDouble(teclado.nextLine());
                    System.out.print( "Digite el valor del segundo valor " +  "\n");
                    valor2= Double.parseDouble(teclado.nextLine());
                    resultado=oOperaciones.Potencia(valor1, valor2);
                    System.out.print( resultado +  "\n");
                    break;
                default:
                    break;
            }
           
        
            
            System.out.print( "Desea contuar con otra operacion  S/N " +  "\n");
            continuar = teclado.nextLine().charAt(0); 
            if((continuar=='S')||(continuar=='s'))
            {
                validar=true;
            }
            else
            {
                validar=false;
            }
                
        }while(validar);
    }
    
}
