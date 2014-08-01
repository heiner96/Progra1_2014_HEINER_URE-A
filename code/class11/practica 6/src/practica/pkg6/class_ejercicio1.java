/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica.pkg6;

import java.util.Scanner;

/**
 *
 * @author hei
 */
public class class_ejercicio1 
{
    private int [][] matriz;
    private Scanner teclado;
    
       public void CargarMatriz()
    {
        teclado=new Scanner(System.in);      
        matriz=new int[5][2];
        for(int c=0;c<5;c++) 
        {           
            for(int f=0;f<2;f++)
            {
                System.out.print("Ingrese componente : ");
                matriz[c][f]=teclado.nextInt();
                //asi se le van asignando los valores a la matriz[un valor];[otro valor] 
            }
            System.out.println();
        }       
    }
       public void Imprimir()
       {
           for (int c = 0; c < 5; c++) 
           {
               for (int f = 0; f < 2; f++)
               {
                   System.out.print(matriz [f][c] + " ");
               }
               System.out.println();
           }
       
       
       }
       
       
}
