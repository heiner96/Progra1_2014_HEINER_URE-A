/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg19;

/**
 *
 * @author Estudiante
 */
public class NodoDeLista
{
    private String dato;
    private NodoDeLista siguiente;
    
    public NodoDeLista()
    {
        dato="";
        siguiente=null;
    }

    public String getDato() 
    {
        return dato;
    }

    public void setDato(String dato)
    {
        this.dato = dato;
    }

    public NodoDeLista getSiguiente() 
    {
        return siguiente;
    }

    public void setSiguiente(NodoDeLista siguiente) 
    {
        this.siguiente = siguiente;
    }
}
