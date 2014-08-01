/*
   * Name: class1
  
   *Information: this is the first practice 
  
   * date: 9/5/2014
  
   *copyright 
 */
package clase2;
import java.io.IOException;
import static java.lang.System.in;
import java.util.Scanner;
/**
 *
 * @author HEINER ANTONIO UREÑA ZUÑIGA
 */
public class Clase2 {

    
    /**
     * @param args the command line arguments
     * This is the main method 
     */
    public static void main(String[] args) throws IOException {
        
        int n=0;
        double a=0;
        char c=0;
        double suma;
        double resta;
         Scanner teclado = new Scanner(System.in);
         System.out.print("digite el valor de n" + "\n");
         n = Integer.parseInt(teclado.nextLine());
         System.out.print("digite el valor de a" + "\n");
         a =Double.parseDouble(teclado.nextLine());
         System.out.print("digite el valor de c" + "\n");
         c =(teclado.nextLine()).charAt(0);
         suma = n+a;
         resta = a-n;
         System.out.print("los valores digitados fueron :" +  n + "\n" +  a  
         + "\n" + c + "\n" + " el resultado de sumarlos fue de : " + suma + 
         "\n" + "el resultado de restar a-n fue de: " + resta + "\n" + 
         "el valor de c fue de: " + c + "\n");
         
         ////////////////////////////////////////////////////////////////////////////
         int x =0;
         int y = 0;
         double N =0; 
         double M =0;     
         double division=0;
         double multiplicacion=0;
         double Suma=0;
         double Resta=0;
         double division1=0;
         double multiplicacion1=0;
         double Suma1=0;
         double Resta1=0;
         
         System.out.print("digite el valor de x" + "\n");
         x = Integer.parseInt(teclado.nextLine());
         System.out.print("digite el valor de y" + "\n");
         y = Integer.parseInt(teclado.nextLine());
         System.out.print("digite el valor de N" + "\n");
         N = Double.parseDouble(teclado.nextLine());
         System.out.print("digite el valor de M" + "\n");
         M = Double.parseDouble(teclado.nextLine());
         suma= x+y;
         Suma1= N+M;
         resta=x-y;
         Resta1=N-M;
         multiplicacion=x*y;
         multiplicacion1=N*M;
         division=x/y;
         division1=N/M;
         System.out.print("La resta de x - y = " + resta + "\n" + 
         " La suma de x + y =" + suma + "\n" +  "La division de x / y = " +
         division + "\n" + "La multiplacacion de x * y = " + multiplicacion +
         "\n" + "La resta de N - M = " + Resta1 + "\n" + " La suma de N + M ="                  
         + Suma1 + "\n" +  "La division de N / M = " + division1 + "\n" + 
         "La multiplacacion de N * M = " + multiplicacion1 + "\n");
         
         ///////////////////////////////////////////////////////////////////
         int n3;
         
         System.out.print("digite el valor de n3" + "\n");
         n3 = Integer.parseInt(teclado.nextLine());
         n3 = (((n3+77)-3)*2);
         System.out.print("El valor obtenido fue de : " + n3 + "\n" );
          ///////////////////////////////////////////////////////////////////
         
         int A;
         int B;
         int C;
         int D;
         int E;
         int F;
         int G;
         int H;
         System.out.print("Digite el valor de A" + "\n");
         A = Integer.parseInt(teclado.nextLine());
         System.out.print("Digite el valor de B" + "\n");
         B = Integer.parseInt(teclado.nextLine());
         System.out.print("Digite el valor de C" + "\n");
         C= Integer.parseInt(teclado.nextLine());
         System.out.print("Digite el valor de D" + "\n");
         D= Integer.parseInt(teclado.nextLine());
         E=A;
         F=B;
         G=C;
         H=D;
         A=D;
         B=C;
         C=E;
         D=F;
         System.out.print("Los valores digitados fueron :" +  A + "\n" +  B  + 
         "\n" + C + "\n" + D + " El resultado al intercambiar los valores "
         + "digitados  : " + "\n" + "donde B tome el valor de C, C tome el "
         + "valor de A, A tome el valor de D, D tome el valor de B  " + "\n" + 
         "A = " + H + "\n"  +  " B = " + G + "\n" + "C = " + C + "\n" + "D = " 
         + D + "\n");
         ///////////////////////////////////////////////////////////////////
         
         int A2;
         double esPar;
         System.out.print("Digite el valor de A2" + "\n");
         A2 = Integer.parseInt(teclado.nextLine());
         esPar = A2%2;
         if(esPar == 0)
         {
              System.out.print("El numero que has digitado es par " + "\n");
         }
         else
         {
             System.out.print("El numero que has digitado no es par " + "\n");
         }
          ///////////////////////////////////////////////////////////////////
         
         int B3;         
         System.out.print("Digite el valor de B3" + "\n");
         B3 = Integer.parseInt(teclado.nextLine());
        if(B3 >= 0)
         {
              System.out.print("El numero es positivo " + "\n");
         }
         else
         {
             System.out.print("El numero es negativo " + "\n");
         }
         ///////////////////////////////////////////////////////////////////
        int C3;
        int esPar2;
        int esPar3;
        int esPar4;
        int esNegativo2;
        System.out.print("Digite el valor de C3" + "\n");
        C3 = Integer.parseInt(teclado.nextLine());
        if(C3 >= 0)
         {
              System.out.print("El numero es positivo " + "\n");
         }
         else
         {
             System.out.print("El numero es negativo " + "\n");
         }
          esPar2 = C3%2;
         if(esPar2 == 0)
         {
              System.out.print("El numero que has digitado es par " + "\n");
         }
         else
         {
             System.out.print("El numero que has digitado no es par " + "\n");
         }
         esPar3 = C3%5;
         if(esPar3 == 0)
         {
              System.out.print("El numero que has digitado es divisor de 5 " +
              "\n");
         }
         else
         {
             System.out.print("El numero que has digitado no es divisor de 5 "
             + "\n");
         }
          esPar4 = C3%10;
         if(esPar4 == 0)
         {
              System.out.print("El numero que has digitado es divisor de 10 " 
               + "\n");
         }
         else
         {
             System.out.print("El numero que has digitado no es divisor de 10  "
             + "\n");
         }
         if(C3>= 100)
         {
              System.out.print("El numero es mayor que 100 " + "\n");
         }
         else
         {
             System.out.print("El numero es menor que 100 " + "\n");
         }
    }
}
