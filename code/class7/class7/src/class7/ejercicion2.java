/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package class7;

/**
 *
 * @author hei
 */
public class ejercicion2 
{
    private String cadena="";
    
    public String MediaCadena()
    {
        String retorno="";
        for (int i = 0; i < getCadena().length()/2; i++)
        {
            retorno+=getCadena().charAt(i);
        }
        return(retorno);
    }
    public String UltimoValor()
    {
        return(getCadena().charAt(getCadena().length()-1)+ "");
    }
    public String Alrevez()
    {
        String retorno="";
        for (int i =getCadena().length()-1; i >= 0; i--) 
        {
            retorno+=getCadena().charAt(i);
        }
        return retorno;
    }
    public String guion()
    {
        String retorno="";
        for (int i = 0; i < getCadena().length(); i++)
        {
            if(getCadena().length()-1==i)
            {
            retorno+=getCadena().charAt(i);
            }
            else 
            {
                retorno+=getCadena().charAt(i)+"-";
            }
        }
        
        
        return(retorno);
        
    }
    public int vocales()
    {
        int cantidadVocales=0;
        for(int i=0; i < getCadena().length();i++)
        {
             if((getCadena().charAt(i)=='a')||
                (getCadena().charAt(i)=='A') || 
                (getCadena().charAt(i)=='e')||
                (getCadena().charAt(i)=='E')||
                (getCadena().charAt(i)=='I')||
                (getCadena().charAt(i)=='i')||
                (getCadena().charAt(i)=='O')||
                (getCadena().charAt(i)=='o')||
                (getCadena().charAt(i)=='U')||
                (getCadena().charAt(i)=='u'))
             {
             cantidadVocales++;
             }        
           
        }
        return(cantidadVocales);
    }
    public boolean palindromo()
    {
        String palabraAlrevez="";
        for (int i = getCadena().length()-1 ; i >= 0; i--) 
        {
        palabraAlrevez+=getCadena().charAt(i);
        }
        if(getCadena().equals(palabraAlrevez))
        {
            return(true);
        }
        else
        {
            return(false);
        }
    }
    
    

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String getCadena() {
        return cadena;
    }
    
    
}
