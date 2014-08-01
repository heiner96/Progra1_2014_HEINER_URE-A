/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matrizpractica2;

/**
 *
 * @author hei
 */
public class MatrizPractica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Practica1 oclase=new Practica1();
       
       oclase.CargarMatriz();
       
       System.out.println("El promedio de los numeros digitados en la matriz fue de: " + oclase.Promedio());
       
       System.out.println("El numero mayor digitado en la matriz fue de: " + oclase.MayoresDePares());
       
       System.out.println("El numero mayor de los impares fue de : " + oclase.MayoresDeImpares());
       
       System.out.println("El promedio de los numeros pares digitados en la matriz fue de : " + oclase.PromedioDeNPares());
       
       System.out.println("El porcentaje de los numeros impares digitados en la fila #1 fue de : " + oclase.PorcentajeFila0());
       
       oclase.CadaFila();
       oclase.CadaFila2();
       oclase.CadaFila3();              
       oclase.MayorDeFila0();
       System.out.println("El mayor de la fila #1 es : "+oclase.MayorDeFila0());
       oclase.MayorDeFila1();
       System.out.println("El mayor   de la fila #2 es : " + oclase.MayorDeFila1());
       oclase.MayorDeFila2();
       System.out.println("El mayor  de la fila #3 es : " + oclase.MayorDeFila2());
    }
    
}
