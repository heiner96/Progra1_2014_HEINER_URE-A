/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matrizpractica2;

import java.util.Scanner;

/**
 *
 * @author hei
 */
public class Practica1
{
    private int [] [] matriz;
     private Scanner teclado;
    
    public void CargarMatriz()
    {
        teclado=new Scanner(System.in);  
        
        matriz=new int[3][5];
        
        for(int f=0;f<3;f++) 
        {
            for(int c=0;c<5;c++) 
            {
                System.out.print("Ingrese componente de la matriz:");
                matriz[f][c]=teclado.nextInt();
            }
        }
        
    }
    
    public float Promedio()
    {
        int suma=0;
        float promedio=0;
        for (int f = 0; f < 3; f++) 
        {
            for (int c = 0; c < 5; c++)
            {
                 suma+= matriz[f][c];
            }
        }
       promedio=suma/15;
       return promedio;
    
    }
    public int  MayoresDePares()
    {
        int NMayor=0;
        int cont=0;
        for (int f = 0; f <3; f++)
        {
            for (int c = 0; c < 5; c++) 
            {
                if(matriz[f][c]%2==0)
                {
                    if(matriz[f][c]>cont)
                    {
                         NMayor=matriz[f][c];
                         cont=NMayor;
                
                        
                    }
                }                   
                
            }       
             
        }
       return cont;
    
    }
    public int MayoresDeImpares()
    {
        int NMayor=0;
        int cont=0;
        for (int f = 0; f < 3; f++) 
        {
            for (int c = 0; c < 5; c++) 
            {
                if(matriz[f][c]%2==1)
                {
                    if(matriz[f][c]>cont)
                    {
                        NMayor=matriz[f][c];
                        cont=NMayor;
                    }
                }
            }
        }
        return cont;
    
    }
    public float PromedioDeNPares()
    {
        float promedio=0;
        int pares=0;
        int cantidadPares=0;
        for (int f = 0; f < 3; f++)
        {
            for (int c = 0; c < 5; c++)
            {
                if(matriz[f][c]%2==0)
                {
                  cantidadPares++;
                  pares+=matriz[f][c];                 
                }
            }
        }
          promedio=pares/cantidadPares;
          return promedio;
    }
    public float PorcentajeFila0()
    {
        float Porcentaje=0;
        int CantidadDeImpares=0;
        for (int f = 0; f < 3; f++)
        {
            for (int c = 0; c <5; c++)
            {
                if(matriz[f][c]%2==1)
                {
                    CantidadDeImpares++;                    
                }
            }
            Porcentaje=(CantidadDeImpares*100)/15;
        }
        return Porcentaje;
    }
    
    public void CadaFila()
    {
        String Filas="";
        for (int f = 0; f < 1; f++)
        {
            for (int c = 0; c < 5; c++) 
            {                              
                Filas+=matriz[f][c] + " ";
            }
        }
         System.out.println("La fila #1 contiene a :" + Filas);
    }
    
    public void CadaFila2()
    {
        String Filas="";
        for (int f = 1; f <2 ; f++)
        {
            for (int c = 0; c < 5; c++) 
            {                              
                Filas+=matriz[f][c] + " ";
            }
        }
         System.out.println("La fila #2 contiene a :" + Filas);
    
    }
    
    public void CadaFila3()
    {
         String Filas="";
        for (int f = 2; f <3 ; f++)
        {
            for (int c = 0; c < 5; c++) 
            {                              
                Filas+=matriz[f][c] + " ";
            }
        }
         System.out.println("La fila #3 contiene a :" + Filas);   
        
    }
    public void OrdenarMatriz0()
    {  
        int numeros[];       
        numeros = new int[6];
        int temporal=0;
        
        for (int f = 0; f < 3; f++)
        {
            for (int c = 0; c < 5; c++) 
            {
                for (int m = 0; m < 5; m++)
                    {
                        temporal=matriz[0][c];
                        if(matriz[f][c]>temporal)
                        {
                            numeros[m]=temporal;
                            matriz[f][c]=temporal;
                        }                       
                    }
                 numeros[c]= temporal;               
            }
          
        }
        for (int f = 0; f <3; f++)
        {
            for (int c = 0; c < 5; c++) 
            {
                System.out.println(matriz[f][c]);
            }
           
        }
        
        
    }
    public int MayorDeFila0()
    {
        int mayor=matriz[0][1];
        for (int f = 0; f <= 0; f++)
        {
            for (int c = 0; c <5; c++) 
            {
                if(matriz[f][c]>mayor)
                {
                    mayor=matriz[f][c];
                }                
            }
        } 
            return mayor;
    }
    
    public int MayorDeFila1()
    {
        int mayor=matriz[1][1];        
        
        for (int f = 1; f <= 1; f++)
        {
            for (int c = 0; c <5; c++) 
            {
                if(matriz[f][c]>mayor)
                {
                    mayor=matriz[f][c];
                }                
            }
        } 
        
        return mayor;
    }
        public int MayorDeFila2()
        {
             int mayor=matriz[2][1];        
        
        for (int f = 2; f <= 2; f++)
        {
            for (int c = 0; c <5; c++) 
            {
                if(matriz[f][c]>mayor)
                {
                    mayor=matriz[f][c];
                }                
            }
        } 
        
        return mayor;
            
        }
        
        
        
        
    
    
    
}
