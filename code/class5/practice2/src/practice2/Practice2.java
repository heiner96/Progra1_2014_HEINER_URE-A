/*
   * Name: Switch
  
   *Information: this is the practice od sentence Switch 
  
   * date: 21/5/2014
  
   *copyright 
 */

package practice2;

import java.util.Scanner;
import java.io.IOException;
import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author heiner
 */
public class Practice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
           boolean validar=true;
           char continuar, day2;
           int opcion=0;
           int mesDeseado;
           int numeroDeseado;
           int resultado;
           char letraDeseada='A';
           int numeroDeseado1=0;
           int diaDeseado;          
           int annoDeseado;
           int diaSemana;
           int domingo=0;
           int lunes=1;
           int martes=2;
           int miercoles=3;
           int jueves=4;
           int viernes=5;
           int sabado=6;    
           int day = 0;
           String primerDia="domingo";
           Scanner teclado = new Scanner(System.in);
           mesesMes  numero = new mesesMes(); 
           
       
           numerosAleatorios aleatorio = new numerosAleatorios(); 
        do
        {
            
            System.out.print("1.Digite el NUMERO del mes que desea saber " +  "\n");
            System.out.print( "2.Ingresar un numero para ser prosesado " +  "\n");
            System.out.print( "3.Digitar una letra del alfabeto que este ubicada alfabeticamente desde la A hasta la E " +  "\n");
            System.out.print( "4.Digite el mes del que desea saber cuantos dias posee "  +  "\n");
            System.out.print( "5.Numeros romanos " +  "\n");
            System.out.print( "6.Fecha anterior " +  "\n");
            System.out.print( "7.Dia de la semana " +  "\n");
            System.out.print( "8.Primer dia del mes actual " +  "\n");
            fechaAnterior fecha = new fechaAnterior();
            opcion=Integer.parseInt(teclado.nextLine());
            
             switch(opcion)
            {
                
                 case 1:
                       System.out.print("Digite que mes desea saber" +  "\n");
                        mesDeseado=Integer.parseInt(teclado.nextLine());
                        
                        switch(mesDeseado)
                        {
                            case 1:                        
                             System.out.print("El mes es enero" +  "\n");
                             break;
                            case 2:                        
                             System.out.print("El mes es febrero" +  "\n");
                             break;
                            case 3:                        
                            System.out.print("El mes es marzo" +  "\n");
                            break;
                            case 4:
                            System.out.print("El mes es abril" +  "\n");
                            break;
                            case 5:                        
                            System.out.print("El mes es mayo" +  "\n");
                            break;
                            case 6:                        
                            System.out.print("El mes es junio" +  "\n");
                            break;
                            case 7:                        
                             System.out.print("El mes es julio" +  "\n");
                             break;
                            case 8:                       
                              System.out.print("El mes  es agosto" +  "\n");
                              break;
                            case 9:                        
                              System.out.print("El mes  es septiembre" +  "\n");
                              break;
                            case 10:                        
                              System.out.print("El mes  es octubre" +  "\n");
                              break;
                            case 11:                        
                              System.out.print("El mes  es noviembre" +  "\n");
                              break;
                            case 12:
                              System.out.print("El mes  es diciembre" +  "\n");
                              break;    
                         }    
                        break;
                   case 2:                   
                       System.out.print("Digite el numero que desea prosesar" +  "\n");                    
                       numeroDeseado=Integer.parseInt(teclado.nextLine());                       
                       int n = numero.elevado(numeroDeseado);                                             
                       if(( numeroDeseado > 0 ) && ( numeroDeseado < 10 ))
                       {
                           System.out.print("Digite el numero para de opcion para elevar o multiplicar" +  "\n");
                           numeroDeseado1=Integer.parseInt(teclado.nextLine());                       
                           switch(numeroDeseado1)
                           {
                               case 2:
                                   System.out.print("El numero elevado al cuadrado es : " + n +  "\n");
                                   break;
                               case 5:
                                    System.out.print("El numero elevado al cuadrado es : " + n +  "\n");
                                    break;
                               case 8:
                                    System.out.print("El numero elevado al cuadrado es : " +  n +  "\n");
                                   break;
                               case 4:
                                   System.out.print("El multiplo de 5 numero es : " + numero.multiplicacion(numeroDeseado) +  "\n");
                                   break;
                               case 7:
                                   System.out.print("El multiplo de 5 numero es : " + numero.multiplicacion(numeroDeseado) +  "\n");
                                   break;
                               case 9:
                                   System.out.print("El multiplo de 5 numero es : " + numero.multiplicacion(numeroDeseado) +  "\n");
                                   break;
                                   
                                   default:
                                       System.out.print( numeroDeseado +  "\n");
                                       break;
                           }
                       
                       }
                       else 
                       {
                           resultado=numeroDeseado%10; 
                            switch(resultado)
                           {
                               case 2:
                                   System.out.print("El numero elevado al cuadrado es : " + numero.elevado(opcion) +  "\n");
                                   break;
                               case 5:
                                    System.out.print("El numero elevado al cuadrado es : " + numero.elevado(opcion) +  "\n");
                                    break;
                               case 8:
                                    System.out.print("El numero elevado al cuadrado es : " + numero.elevado(opcion) +  "\n");
                                   break;
                           }
                       }
                     break;
                   case 3:
                        System.out.print("Te recuerdo que la letra que digites debe estar entre la letra A y la letra E " +  "\n");
                        letraDeseada=teclado.nextLine().charAt(0);
                       if((letraDeseada=='A')||(letraDeseada=='a'))
                       {
                           System.out.print("EXCELENTE" +  "\n");
                       }
                       else 
                       {
                           if((letraDeseada=='B')||(letraDeseada=='b'))
                           {
                               System.out.print("BUENO" +  "\n");
                           }
                           else
                           {
                               if((letraDeseada=='C')||(letraDeseada=='c'))
                               {
                                   System.out.print("REGULAR" +  "\n");
                               }
                               else
                               {
                                   if((letraDeseada=='D')||(letraDeseada=='d'))
                                   {
                                       System.out.print("MALO" +  "\n");
                                   }
                                   else
                                   {
                                       if((letraDeseada=='E')||(letraDeseada=='e'))
                                       {
                                           System.out.print("PESIMO" +  "\n");
                                       }
                                       else
                                       {
                                           System.out.print("LA LETRA QUE HAS DIGITADO ESTA FUERA DE RANGO" +  "\n");
                                       }
                                   }
                               }
                           }
                       }                       
                   mesDeseado=0;
                       break;
                   case 4:
                       System.out.print(" Recuerde digitar el mes en numeros " +  "\n");
                       mesDeseado=Integer.parseInt(teclado.nextLine());
                       switch(mesDeseado)
                       {
                           case 1:
                               System.out.print("El mes de enero posee 31 dias " +  "\n");
                               break;
                           case 2:
                               System.out.print("El mes de febrero posee 28 dias " +  "\n");
                               break;
                           case 3:
                               System.out.print("El mes de marzo posee 31 dias " +  "\n");
                               break;
                           case 4:
                               System.out.print("El mes de abril posee 30 dias " +  "\n");
                               break;
                           case 5:
                               System.out.print("El mes de mayo posee 31 dias " +  "\n");
                               break;
                           case 6:
                               System.out.print("El mes de junio posee 30 dias " +  "\n");
                               break;
                           case 7:
                               System.out.print("El mes de julio posee 31 dias " +  "\n");
                               break;
                           case 8:
                               System.out.print("El mes de agosto posee 31 dias " +  "\n");
                               break;
                           case 9:
                               System.out.print("El mes de septiembre posee 30 dias " +  "\n");
                               break;
                           case 10:
                               System.out.print("El mes de octubre posee 31 dias " +  "\n");
                               break;
                           case 11:
                               System.out.print("El mes de noviembre posee 30 dias " +  "\n");
                               break;
                           case 12:
                               System.out.print("El mes de diciembre posee 31 dias " +  "\n");
                               break;
                       
                       
                       }
                   break;
                   case 5:                           
                              aleatorio.numeroAleatorio();
                              aleatorio.numerosRomanos();
                              if(aleatorio.getNumeroAleatorio()>=1000)
                              {
                                  System.out.print( aleatorio.getCadenaNumerosMilenarios() + aleatorio.getCadenaNumerosCentenarios() + aleatorio.getCadenaNumerosDecimales() + aleatorio.getCadenaNumerosUnitarios()+  "\n");
                              } 
                              else
                              {
                                  if(aleatorio.getNumeroAleatorio()<1000)
                                  {
                                      System.out.print( aleatorio.getCadenaNumerosCentenarios() + aleatorio.getCadenaNumerosDecimales()  + aleatorio.getCadenaNumerosUnitarios()+  "\n");
                                  }
                                  else
                                  {
                                      if(aleatorio.getNumeroAleatorio()<100)
                                      {
                                       System.out.print( aleatorio.getCadenaNumerosDecimales()  + aleatorio.getCadenaNumerosUnitarios()+  "\n");
                                      }
                                      else
                                      {
                                          if(aleatorio.getNumeroAleatorio()<10)
                                          {
                                            System.out.print(aleatorio.getCadenaNumerosUnitarios()+  "\n");
                                          }
                                      }
                                  }
                              }
                        break;
                   case 6:
                       mesDeseado=0;
                       System.out.print("Digite el dia de la fecha deseada en un anno normal"+  "\n");
                       diaDeseado=Integer.parseInt(teclado.nextLine());                       
                       
                       System.out.print("Digite el mes de la fecha deseada en un anno normal"+  "\n");
                       mesDeseado=Integer.parseInt(teclado.nextLine());
                       
                       System.out.print("Digite el anno de la fecha deseada "+  "\n");
                       annoDeseado=Integer.parseInt(teclado.nextLine());
                       
                       if((mesDeseado==1)&&(diaDeseado==1))
                       {
                            annoDeseado=annoDeseado-1;
                            mesDeseado=12;
                            diaDeseado=31;
                            System.out.print(diaDeseado + " / " +  mesDeseado + " / " + annoDeseado +  "\n");
                       }
                       else
                       {
                       if(mesDeseado==1)
                        {
                            diaDeseado = diaDeseado-1;
                            System.out.print("La fecha anterior a la digitada fue : " + diaDeseado + " / " +  mesDeseado + " / " + annoDeseado +  "\n");
                        }
                       else 
                       {
                           if((mesDeseado==2)&&(diaDeseado==1))
                           {
                               diaDeseado=31;
                               mesDeseado=1;
                               System.out.print("La fecha anterior a la digitada fue : " + diaDeseado + " / " +  mesDeseado + " / " + annoDeseado +  "\n");
                           }
                           else
                           {
                               if((mesDeseado==3)&&(diaDeseado==1))
                               {
                                   diaDeseado=28;
                                   mesDeseado=2;
                                   System.out.print("La fecha anterior a la digitada fue : " + diaDeseado + " / " +  mesDeseado + " / " + annoDeseado +  "\n");
                               }
                               else
                               {
                                   if((mesDeseado==4)&&(diaDeseado==1))
                                   {
                                       diaDeseado=31;
                                       mesDeseado=3;
                                       System.out.print("La fecha anterior a la digitada fue : " + diaDeseado + " / " +  mesDeseado + " / " + annoDeseado +  "\n");
                                   }
                                   else
                                   {
                                       if((mesDeseado==5)&&(diaDeseado==1))
                                       {
                                            diaDeseado=30;
                                            mesDeseado=4;
                                            System.out.print("La fecha anterior a la digitada fue : " + diaDeseado + " / " +  mesDeseado + " / " + annoDeseado +  "\n");
                                       }
                                       else
                                       {
                                           if((mesDeseado==6)&&(diaDeseado==1))
                                           {
                                               diaDeseado=31;
                                               mesDeseado=5;
                                               System.out.print("La fecha anterior a la digitada fue : " + diaDeseado + " / " +  mesDeseado + " / " + annoDeseado +  "\n");
                                           } 
                                           else
                                           {
                                               if((mesDeseado==7)&&(diaDeseado==1))
                                               {
                                                   diaDeseado=30;
                                                   mesDeseado=6;
                                                   System.out.print("La fecha anterior a la digitada fue : " + diaDeseado + " / " +  mesDeseado + " / " + annoDeseado +  "\n");
                                                         
                                               }
                                               else                                               
                                               {
                                                   if((mesDeseado==8)&&(diaDeseado==1))
                                                   {
                                                       diaDeseado=31;
                                                       mesDeseado=7;
                                                       System.out.print("La fecha anterior a la digitada fue : " + diaDeseado + " / " +  mesDeseado + " / " + annoDeseado +  "\n");
                                                   }
                                                   else
                                                   {
                                                       if((mesDeseado==9)&&(diaDeseado==1))
                                                       {
                                                           diaDeseado=31;
                                                           mesDeseado=8;
                                                           System.out.print("La fecha anterior a la digitada fue : " + diaDeseado + " / " +  mesDeseado + " / " + annoDeseado +  "\n");
                                                       }
                                                       else
                                                       {
                                                           if((mesDeseado==10)&&(diaDeseado==1))
                                                           {
                                                               diaDeseado=30;
                                                               mesDeseado=9;
                                                               System.out.print("La fecha anterior a la digitada fue : " + diaDeseado + " / " +  mesDeseado + " / " + annoDeseado +  "\n");
                                                           }
                                                           else
                                                           {
                                                               if((mesDeseado==11)&&(diaDeseado==1))
                                                               {
                                                                   diaDeseado=31;
                                                                   mesDeseado=10;
                                                                   System.out.print("La fecha anterior a la digitada fue : " + diaDeseado + " / " +  mesDeseado + " / " + annoDeseado +  "\n");
                                                               }
                                                               else
                                                               {
                                                                   if((mesDeseado==12)&&(diaDeseado==1))
                                                                   {
                                                                       diaDeseado=30;
                                                                       mesDeseado=11;
                                                                       System.out.print("La fecha anterior a la digitada fue : " + diaDeseado + " / " +  mesDeseado + " / " + annoDeseado +  "\n");
                                                                   }
                                                                   else
                                                                   {
                                                                       diaDeseado=diaDeseado-1;
                                                                       System.out.print("La fecha anterior a la digitada fue : " + diaDeseado + " / " +  mesDeseado + " / " + annoDeseado +  "\n");                                                                  
                                                                   }
                                                               }
                                                           }
                                                       }
                                                   }
                                               }
                                           }
                                       }
                                   }
                               }
                           }
                       
                       }
                       }                                          
                   case 7:
                       System.out.print("Debes de digitar un numero del 0 al 6 corespondientes al dia de la semana deseado, siendo Domingo 0 y sabado 6"+  "\n");
                       diaSemana=Integer.parseInt(teclado.nextLine());
                       switch(diaSemana)
                       {
                           case 0:
                               System.out.print("El dia de la semana que usted digito pertenece al dia Domingo"+  "\n");
                               break;
                           case 1:
                               System.out.print("El dia de la semana que usted digito pertenece al dia Lunes"+  "\n");
                               break;
                           case 2:
                               System.out.print("El dia de la semana que usted digito pertenece al dia Martes"+  "\n");
                               break;
                           case 3:
                               System.out.print("El dia de la semana que usted digito pertenece al dia Miercoles"+  "\n");
                               break;
                           case 4:
                               System.out.print("El dia de la semana que usted digito pertenece al dia Jueves"+  "\n");
                               break;
                           case 5:
                               System.out.print("El dia de la semana que usted digito pertenece al dia Viernes"+  "\n");
                               break;
                           case 6: 
                               System.out.print("El dia de la semana que usted digito pertenece al dia Sabado"+  "\n");
                               break;
                       }
                           break;
                   case 8:     
                       System.out.println("Ingrese la letra del primer dia del puto mes, suponiendo" + "\n"
                       + "L: Lunes." + "\n" + "K: Martes." + "\n" + "M: Miercoles" + "\n" + "J: Jueves" + "\n" +
                      "V:Viernes " + "\n" + "S: Sabado" + "\n" + "D:Domingo" + "\n");
                       day = teclado.nextLine().charAt(0);       
                       
                                              
             }                                     
            
        
            System.out.print( "Desea contuar con otra operacion  S/N " +  "\n");
            continuar = teclado.nextLine().charAt(0); 
            if((continuar=='S')||(continuar=='s'))
            {
                validar=true;
            }
            else
            {
                validar=false;
            }
            
        }while(validar);
        
    }
    
}
