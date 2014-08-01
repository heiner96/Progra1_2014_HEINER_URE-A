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
public class ejercicio1 
{
    private int [][] matriz;
    private Scanner teclado;
    public void CargarMatriz()
    {
        teclado=new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        int filas=teclado.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        int columnas=teclado.nextInt();
        matriz=new int[filas][columnas];
        for(int f=0;f<matriz.length;f++) {
            for(int c=0;c<matriz[f].length;c++) {
                System.out.print("Ingrese componente:");
                matriz[f][c]=teclado.nextInt();
            }
        }
       
    }
    public void imprimir()
    {
        for(int f=0;f<matriz.length;f++)
    {
            for(int c=0;c<matriz[f].length;c++) 
    {
                System.out.print(matriz[f][c]+" ");
            }
            System.out.println();
        }
    
    
    }
    /*
    public void cargar() {
        teclado=new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        int filas=teclado.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        int columnas=teclado.nextInt();
        mat=new int[filas][columnas];
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                System.out.print("Ingrese componente:");
                mat[f][c]=teclado.nextInt();
            }
        }
    }
    
    public void imprimir() 
    {
        for(int f=0;f<mat.length;f++)
    {
            for(int c=0;c<mat[f].length;c++) 
    {
                System.out.print(mat[f][c]+" ");
            }
            System.out.println();
        }
    }

    */
}
