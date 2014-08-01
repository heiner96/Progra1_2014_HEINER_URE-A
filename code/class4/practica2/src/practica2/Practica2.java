/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica2;

import java.util.Scanner;

/**
 *
 * @author hei
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int cantidad;
        int cont=0;   
        int y;
        int x;
        int operador;
        boolean hayAsterisco;  
        float valorInicial=0;
        float valorFinal=0;
        float incrementadoDeseado;
        double base;
        int elevado;
        Double bi;
        int combinacion=0000;
        int N;
        int cantidad2;
        int contador=0;
        int esPar;
        int  cantidadPares=0;
        int cantidadImpares=0;
        int resultado;
        int numeroMultiplicar;
        int hastaNumero;
        int resultadoMulti;
        int cantidadNumeros=0;
        int sumatoriaPromedio=0;
        int promedio=0;
        int numeroPromedio=0;
        int calificaciones=1;
        int multiplicar=0;     
        double porcentaje=0;
        double cantidad89=1000;
        int minutos=0;
        int horas=0;
        int segundos=0;
        int contadorSegundos=0;
        int contadorHoras=0;
        int contadorMinutos=0;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Digite la cantidad de asteriscos que desea ver" + "\n");
        cantidad = Integer.parseInt(teclado.nextLine());
        while(cont < cantidad)      
        {
             System.out.print( " * " );
             cont++;
        }  
        ////////////////////////////////////////////////////////////////////////
        cont=0;
        System.out.print("\n");
        System.out.print("Digite un numero " + "\n");
        x = Integer.parseInt(teclado.nextLine());
        System.out.print("Digite el numero para saber si es multiplo " + "\n");
        y = Integer.parseInt(teclado.nextLine());
        while(cont <= x)
        {
            operador=cont%y;
            if(operador == 0)
            {
                  hayAsterisco=true;
            }
            else
            {               
                hayAsterisco=false;
            }            
           if(hayAsterisco == true)
           {              
               System.out.print("*" + "\n");
           }
           else
           {
               System.out.print(cont + "\n");
           }
              cont++;
        }
        ////////////////////////////////////////////////////////////////////////
       System.out.print("Digite un numero inicial " + "\n");
       valorInicial = Float.parseFloat(teclado.nextLine());
       System.out.print("Digite un numero final " + "\n");
       valorFinal = Float.parseFloat(teclado.nextLine());
       System.out.print("Digite de cuanto desea incrementarlo " + "\n");
       incrementadoDeseado= Float.parseFloat(teclado.nextLine());
       
        for (int i = 0; valorInicial < valorFinal; i+=incrementadoDeseado)
        {
            valorInicial=valorInicial+incrementadoDeseado;
             System.out.print(valorInicial + "\n");
        }
        ////////////////////////////////////////////////////////////////////////
        System.out.print("Digite un numero decimal para ser usado como base " + "\n");
        base = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite un numero para elevar el numero anterior " + "\n");
        elevado = Integer.parseInt(teclado.nextLine());
        bi=base;
        for (int i = 0; i < elevado ; i++) 
        {                       
                base = base*bi;
                System.out.print(base + "\n");
                i++;
        }
        ////////////////////////////////////////////////////////////////////////
        while(combinacion < 9999)
        {
            combinacion=combinacion+1;
            System.out.print(combinacion + "\n");
        }
        ///////////////////////////////////////////////////////////////////////
        
         System.out.print("Digite cuantos numeros va a digitar" + "\n");
         cantidad2 = Integer.parseInt(teclado.nextLine());
        do
        {   
            System.out.print("Digite los numeros " + "\n");
            N = Integer.parseInt(teclado.nextLine());
            esPar=N%2;
            if(esPar==0)
            {
                cantidadPares++;
            }
            else
            {
                cantidadImpares++;
            }
            contador++;
        
        }while(contador < cantidad2);
        System.out.print("La cantidad de numeros Pares es de: " + cantidadPares 
        + "\n" + "La cantidad de Impares es de:" + cantidadImpares + "\n");
        ////////////////////////////////////////////////////////////////////////
        
        System.out.print("Digite el numero que desea multiplcar  " + "\n");
        numeroMultiplicar = Integer.parseInt(teclado.nextLine());
        System.out.print("Digite el numero hasta el que desea multiplcar  " + "\n");
        hastaNumero = Integer.parseInt(teclado.nextLine());
        for (int i = 0; i <= hastaNumero; i++)
        {
          resultadoMulti= numeroMultiplicar*i;
          System.out.print( numeroMultiplicar + "*"+ i + "=" + resultadoMulti +"\n");
        }
        ////////////////////////////////////////////////////////////////////////
        
        while(cantidadNumeros<=10)
        {
             
             System.out.print("Digite un numero  " + "\n");
             numeroPromedio= Integer.parseInt(teclado.nextLine());            
             sumatoriaPromedio= sumatoriaPromedio + numeroPromedio;
             cantidadNumeros++;
         }
        promedio=sumatoriaPromedio/10;
        System.out.print("El promedio de sus numeros fue de: " + promedio + "\n");
        
        ////////////////////////////////////////////////////////////////////////
        sumatoriaPromedio=0;
        promedio=0;
        cantidad=0;
        do
        {
            System.out.print("Digite una calificacion " + "\n");
            calificaciones= Integer.parseInt(teclado.nextLine()); 
            cantidad++;
            sumatoriaPromedio = sumatoriaPromedio + calificaciones;
            promedio = sumatoriaPromedio/cantidad;
        }while(calificaciones>0
                && calificaciones<=10);
        System.out.print("El promedio obtenido fue de: "+ promedio + "\n");
        ////////////////////////////////////////////////////////////////////////
               
       resultado=0;
        for (int i = 0; i <= 10; i++) 
        {
               resultado=i*560;
               System.out.print(i + " dolares " + " = " + resultado + "\n");
            
        }
        ////////////////////////////////////////////////////////////////////////        
        resultado=0;
        for (int i = 0; i <= 12; i++) 
        {
            porcentaje = cantidad89 * 0.02;
            cantidad89 = cantidad89 + porcentaje;           
        }
              System.out.print( "La inversion que usted ah realizado fue de :  "
              + cantidad89 +  "\n");
        ////////////////////////////////////////////////////////////////////////
            while(horas<24)
            {
                while(segundos<60)
                {
                    segundos++;         
                     System.out.print( horas + " : " + minutos + " : " + segundos 
                       +   "\n");
                }        
                minutos++;
                segundos=0;
                while(minutos<60)
                  {
                      while(segundos<60)
                       {                 
                                                            
                          System.out.print( horas + " : " + minutos + " : " +
                                  segundos +   "\n");                          
                          segundos++;
                        }
                      minutos++;
                  }
                horas++;
                segundos=0;
                minutos=0;
                while(horas<24)
                {
                     while(minutos<60)
                  {
                      while(segundos<60)
                 {
                    segundos++;         
                    
                      minutos++;                        
                     
                 }
                    horas++;
                    segundos++;
                    minutos++;  
                    System.out.print( horas + " : " + minutos + " : " + segundos 
                    +   "\n");
                  }                                   
                 
              }
            } 
            
    }
}
