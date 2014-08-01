/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice2;

/**
 *
 * @author hei
 */
public class mesesMes 
{                   
        int elevado;
        int multiplicacion;
          
        public int getElevado() {
        return elevado;
    }

    public int getMultiplicacion() {
        return multiplicacion;
    }
     public void setElevado(int elevado) {
        this.elevado = elevado;
    }

    public void setMultiplicacion(int multiplicacion) {
        this.multiplicacion = multiplicacion;
    }
        
         public int elevado(int pnumeroDeseado) 
         {
             elevado= (int) Math.pow(pnumeroDeseado,2);
            return(elevado);
         }
         public int multiplicacion(int pnumeroDeseado)
         {
             multiplicacion=pnumeroDeseado*5;
            return(multiplicacion);
         }

     

}
