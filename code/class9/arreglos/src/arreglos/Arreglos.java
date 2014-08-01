/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;


import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double[] salarios = new double[5];
        int opcion = 0;
        boolean continuar = false;
        double salario=0;
        double salario1=0;
        Scanner teclado = new Scanner(System.in);

        do {

            System.out.println("Ingrese la opción del ejercicio a evaluar.");
            System.out.println("1. Ejercicio 1.");
            System.out.println("2. Ejercicio 2.");
            System.out.println("3. Ejercicio 3.");
            System.out.println("4. Salir.");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    ejercicio1 oEjercicio1 = new  ejercicio1();
                    for (int i = 0; i < 5; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println("Ingrese el número del trabajador # " + (i + 1));
                        oEjercicio1.AgregarSalario(teclado.nextDouble());
                    }
                    System.out.println(oEjercicio1.ImprimirSueldos());
                    break;
                case 2:
                   ejercicio2  Aejercicio2 =new ejercicio2 ();
                    for (int i = 0; i < 5; i++) 
                    {
                        teclado=new Scanner(System.in);
                        System.out.println("Digite la altura de la persona # " + (i+1 ));
                       Aejercicio2.AgregarAltura(teclado.nextFloat());
                    }
                    System.out.println("El promedio es de : " +  Aejercicio2.promedio());
                    System.out.println(Aejercicio2.ContarPersonas());
                    break;
                case 3:
                {
                    ejercicio3 lejercicio3 =new ejercicio3();
                    for (int i = 0; i <4; i++) 
                    {                             
                        teclado= new Scanner(System.in);
                        System.out.println("Digite el salario de el trabajador Diurno #: " + (i+1) );
                        salario=Double.parseDouble(teclado.nextLine()); 
                        lejercicio3.mannana(salario);
                        System.out.println(lejercicio3.mannana);
                    }
                    for (int i = 0; i < 4; i++)
                    {
                        teclado= new Scanner(System.in);
                        System.out.println("Digite el salario de el trabajador notucno #: " + (i+1) );
                        salario1=Double.parseDouble(teclado.nextLine()); 
                        lejercicio3.tarde(salario1);  
                        System.out.print(lejercicio3.tarde);
                        
                    }
                
                
                
                }
                default:
                    break;
            }

        } while (opcion < 5);

    }
}
