/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atributes;

import java.util.Scanner;

/**
 *
 * @author hei
 */
public class ATRIBUTES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        boolean validar=true;
        int opcion;
        double monto;
        char continuar;
        
        account oAccount = new account();
        Scanner teclado= new Scanner(System.in);
        
        while (validar)
        {               
                System.out.println("Digite 1 si quiere realizar un deposito y 2 si quiere realizar un retiro" + "\n" );
                opcion=Integer.parseInt(teclado.nextLine());
                
                if(opcion==1)
                    {
                        System.out.println("Digite el monto a depositar" + "\n");
                        monto=Double.parseDouble(teclado.nextLine());
                        oAccount.Deposito(monto);
                        
                    }
                if(opcion==2)
                {
                    System.out.println("Digite el monto a retirar" + "\n");
                    monto=Double.parseDouble(teclado.nextLine());
                    oAccount.Retiro(monto);
                    if(oAccount.isHayError())
                    {
                          System.out.println("Digite el monto a depositar" + "\n");
                    }
                }
                System.out.println("El saldo final es de " + oAccount.getSaldoInicial());
                System.out.println("Desea continuar con otra transaccion S/N " + "\n");
                continuar =teclado.nextLine().charAt(0);
                if((continuar== 'S')||(continuar == 's'))
                validar=true;
                 if((continuar== 'N')||(continuar == 'n'))
                validar=false;
                
    }
  }
}
