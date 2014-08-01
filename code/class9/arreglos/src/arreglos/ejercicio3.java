/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arreglos;

/**
 *
 * @author hei
 */
public class ejercicio3
{
    
    private double mannana[]=new double[4];
    private double tarde[]=new double[4];
    
    public String mannana(double psalario)
    {   
        double salario=0;
        for (int i = 0; i <mannana.length; i++) 
        {
            salario=salario+psalario;
            
        }
    return "El salario total por el turno de la tarde es de : " + salario;
        
    }
    
    public String tarde(double ppsalario)
    {
        double ssalario=0;
        for (int i = 0; i <tarde.length; i++) 
        {
            ssalario=ssalario+ppsalario;
            
            
        }  
               
       
        
    return "El salario total por el turno de la tarde es de : " + ssalario;
    }
    
    
    
}
