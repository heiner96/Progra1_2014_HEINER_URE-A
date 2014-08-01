/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package class7;

import java.util.Scanner;

/**
 *
 * @author hei
 */
public class Class7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner oScanner=new Scanner(System.in);
        int opcion=0;
        do
        {
            System.out.println("Digite la opcion : ");
            System.out.println("1.Ejercicio 1 ");
            System.out.println("2.Ejercicio 2 ");            
            opcion=oScanner.nextInt();            
            switch(opcion)
            {
                case 1: 
                      System.out.print("Digite el correo a evaluar" + "\n");   
                      oScanner=new Scanner(System.in);
                      ejercicio1 oejercicio = new ejercicio1(oScanner.nextLine());        
                      System.out.print(oejercicio.ValidarCorreo());
                break;
                case 2:
                    System.out.println("Digite la cadena a evaluar" + "\n");
                    oScanner=new Scanner(System.in);
                    ejercicion2 oejercicio2=new ejercicion2();
                    oejercicio2.setCadena(oScanner.nextLine());
                    System.out.println(oejercicio2.MediaCadena());
                    System.out.println(oejercicio2.UltimoValor());
                    System.out.println(oejercicio2.Alrevez());
                    System.out.println(oejercicio2.guion());
                    System.out.println(oejercicio2.vocales());
                    System.out.println(oejercicio2.palindromo());                                      
                   
                    
                break;
                    
                
            }
        }while(opcion<=7);      
        
    }
    
}
