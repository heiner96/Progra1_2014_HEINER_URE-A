/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea;

import java.util.Scanner;

/**
 *
 * @author heiner
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        Scanner oScanner = new Scanner(System.in);
        clsTarea otarea = new clsTarea();
        int cantidad=0;
        System.out.println("Digite cuantos puntos desea perra?");
        cantidad = oScanner.nextInt();        
        double [] arreglo = new double[cantidad];
        double r;        
        for (int i = 0; i <cantidad; i++) 
        {
            r = (double) (Math.random() * 1000);           
            arreglo[i]=r;
        }        
         otarea.ordenamiento(arreglo);
         System.out.println("El mayor de los punto es : " + otarea.ordenamiento(arreglo));
    }
    
}
