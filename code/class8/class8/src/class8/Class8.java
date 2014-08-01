/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package class8;

import java.util.Scanner;

/**
 *
 * @author hei
 */
public class Class8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception
    {
        // TODO code application logic here
         Scanner oScanner=new Scanner(System.in);
         
         int opcion=0;
         int desde=0;
         int hasta=0;
           do
        {
            System.out.println("Digite la opcion : ");
            System.out.println("1.Ejercicio 1 ");
            System.out.println("2.Ejercicio 2 ");            
            opcion=oScanner.nextInt();            
            switch(opcion)
            {
                case 1:
                     System.out.println("Digite la cadena de caracteres a evaluar" + "\n");
                     oScanner=new Scanner(System.in);
                     patitos patitos1 = new patitos();                     
                     patitos1.setCadena(oScanner.nextLine());
                     System.out.print(patitos1.Alrevez() + "\n");
                     System.out.println(patitos1.palindromo()+ "\n");
                     System.out.print("Digite la frase que desea evaluar"+ "\n");
                     oScanner=new Scanner(System.in);                    
                     patitos1.setCadenaEvaluar(oScanner.nextLine()); 
                     System.out.print("Digite la palabra que desea que cuente de la frase anterior"+ "\n");
                     oScanner=new Scanner(System.in);
                     patitos1.setCadenaContar(oScanner.nextLine());
                     System.out.println(patitos1.cantidadPalabras()+ "\n");
                    break;
                    
                case 2:
                    System.out.println("Digite la cadena de caracteres a evaluar" + "\n");
                    oScanner=new Scanner(System.in);
                    patitos patitos2 = new patitos();                     
                    patitos2.setCadena(oScanner.nextLine());
                    System.out.println("Digite desde donde desea ver la cadena"+ "\n");
                    desde=Integer.parseInt(oScanner.nextLine());                    
                    patitos2.setDesde(desde);
                    System.out.println("Digite hasta donde desea ver la cadena"+ "\n");
                    hasta=Integer.parseInt(oScanner.nextLine());                   
                    patitos2.setHasta(hasta);
                    System.out.println(patitos2.primero() + "\n");
                    System.out.println(patitos2.Mayuculas());
                    System.out.println("Digite el numero que desea pasar a String");
                    int numero=Integer.parseInt(oScanner.nextLine());                    
                    patitos2.setNumero(numero);
                    System.out.println(patitos2.parse());
                    
                    break;
            }
        
        }while(opcion<=3); 
    }
    
}
/*
el proyecto es de tipo String y de bera hacer los siguietes pasos: en el problema 1 este de debera solicitar la usuario una cadena de caracteres y luego debera imprimirlos alreves de lo digitado
y imprimir se es o no palindromo osea que la palabra al revez y al derecho se leeexactamente igual. luego debera solicitar al usuario una frase y debera contar la cantidad de veces que aparece un palabra 
que el usuario solicita en la frase "hola companneros fue un gusto, con su permiso me retiro copanneros" en este caso deberis de devolver la 2. 
en el problema 2 se le solisitara una cadena y de la misma cadena se le solicitara al usuario  que digite desde donde hasta donde desea ver la cadena observada.
*/
