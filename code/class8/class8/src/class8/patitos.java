/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package class8;

/**
 *
 * @author hei
 */
public class patitos 
{
    String cadena="";
    String cadenaEvaluar="";
    String cadenaContar="";
    int desde=0;
    int hasta=0;
    int numero=0;
    public String Alrevez()
    {
        String retorno="";
        for (int i =getCadena().length()-1; i >= 0; i--) 
        {
            retorno+=getCadena().charAt(i);
        }
        return retorno;    
    }
    public String palindromo()
     {
        String retorno=getCadena();
        for (int i =getCadena().length()-2; i >= 0 ; i--)                  
        {
            retorno+=getCadena().charAt(i);
        }
        return(retorno);    
     }
    public int cantidadPalabras()
    {        
        char letra='h';
        char letra2='0';
        int cantidad=0;
        int i = 0; 
        int cantidadProvisional=0;
        while(i <= getCadenaEvaluar().length())
        {   
            if(i==0)
            {                              
               letra=getCadenaEvaluar().charAt(i);
               letra2=getCadenaEvaluar().charAt(i);
               if(letra==letra2)
               {
                   while(i<=getCadenaEvaluar().length()-1)
                   { 
                       if(letra==letra2)
                       {
                           cantidadProvisional++;
                           if(cantidadProvisional==getCadenaContar().length())
                           {
                               cantidad++;
                           }
                       }
                       i++;
                        letra=getCadenaEvaluar().charAt(i);
                        letra2=getCadenaEvaluar().charAt(i);
                   }                   
               }
            }
            else
            {
                 while(i<=getCadenaEvaluar().length())
                   {
                       if(letra==letra2)
                       {
                           cantidadProvisional++;
                           if(cantidadProvisional==getCadenaContar().length())
                           {
                               cantidad++;
                           }
                       }
                       i++;
                        letra=getCadenaEvaluar().charAt(i);
                        letra2=getCadenaEvaluar().charAt(i);
                   }
            }
            letra=getCadenaEvaluar().charAt(i);
            letra2=getCadenaEvaluar().charAt(i);
       
            i++;
        }        
        return(cantidad);
    }

    public String primero()throws Exception
    {
        if(getHasta()<getDesde())
            throw new Exception("Error el final no puede ser menor al inicio");
        if(getCadena().length()<0)
        {
            throw new Exception("La cadena debe contener caracteres");
        }
        String retorno2="";
        for (int i = getDesde(); i < getHasta(); i++) 
        {
           retorno2+=getCadena().charAt(i);
        }
        return retorno2;
    }
    public String Mayuculas()
    {
        String retorno="";
        String mayuscula="ABCDEFGHIJKLMNNNOPQRSTUVWXYZ";
        char temporal;
        int index=0;
        String minusculas="abcdefghijklmnnnopqrstuvwxyz";
        for (int i = 0; i < getCadena().length(); i++)
        {
            
            if(Character.isLowerCase(getCadena().charAt(i)))
            {
                index=minusculas.indexOf(getCadena().charAt(i));
                retorno+=mayuscula.charAt(index);
            }
            else
            {
                retorno+=getCadena().charAt(i);          }
        }
       
        return retorno;
    }
    public String parse()
    {
        String retorno="";       
        retorno=getCadena().valueOf(getNumero());
        return retorno;
    }
    
     public void setCadena(String cadena)
    {
        this.cadena = cadena;
    }      

    public String getCadenaEvaluar()
    {
        return cadenaEvaluar;
    }

    public String getCadenaContar()
    {
        return cadenaContar;
    }

    public void setCadenaEvaluar(String cadenaEvaluar)
    {
        this.cadenaEvaluar = cadenaEvaluar;
    }

    public void setCadenaContar(String cadenaContar) 
    {
        this.cadenaContar = cadenaContar;
    }
    
    public String getCadena() 
    {
        return cadena;
    }

    public int getDesde() {
        return desde;
    }

    public int getHasta() {
        return hasta;
    }

    public void setDesde(int desde) {
        this.desde = desde;
    }

    public void setHasta(int hasta) {
        this.hasta = hasta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}

//String retorno="";
      //  for (int i = 0; i < getCadena().length()/2; i++)
       // {
     //       retorno+=getCadena().charAt(i);
      //  }
     //   return(retorno);