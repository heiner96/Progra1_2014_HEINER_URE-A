/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicamatrices;

import java.util.Scanner;

/**
 *
 * @author hei
 */
public class ejercicio2
{
         private int [][] matriz;
    private Scanner teclado;
    
    public void CargarMatriz()
    {
        teclado=new Scanner(System.in);      
        matriz=new int[4][4];
        for(int f=0;f<4;f++) {
            for(int c=0;c<4;c++) {
                System.out.print("Ingrese componente:");
                matriz[f][c]=teclado.nextInt();
            }
        }
       
    }
     public void imprimir()
    {
        for(int f=0;f<4;f++)
        {
            for(int c=0;c<4;c++) 
            {
                if(f==c)
                {
                    System.out.print(matriz[f][f] + " " );
                
                }
                else
                {
                    System.out.print(" _ " + " _ ");
                }
            }
            System.out.println();
        }
    
    }
}
