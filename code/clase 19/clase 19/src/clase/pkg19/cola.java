/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg19;

/**
 *
 * @author Estudiante
 */
public class cola 
{
    private NodoDeLista raiz;
    private NodoDeLista ultimo;
    
    public cola()
    {
        raiz=null;
    }
    
    private boolean Vacia()
    {
        if(raiz==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void Encontrar(String dato)
    {
        NodoDeLista nuevo;
        nuevo=new NodoDeLista();
        nuevo.setDato(dato);
        nuevo.setSiguiente(null);
        if(Vacia())
        {
            raiz= nuevo;
            ultimo=nuevo;
        }
        else
        {
            ultimo.setSiguiente(nuevo);
            ultimo=nuevo;
        }
    }
    
    public Object Desencolar()
    {
        if(Vacia())
        {
            Object Dato = raiz.getDato();
            if(raiz==ultimo)
            {
                raiz= null;
                ultimo=null;
            }
            else
            {
                raiz=raiz.getSiguiente();
            }
            return Dato;
       
       }
        return new Object();
    }
    
    public void Imprimir()
    {
        NodoDeLista recorrido=raiz;
        System.out.println("Listado de todos los elementos de la cola.");
        while(recorrido!=null)
        {
            System.out.println(recorrido.getDato() + " - ");
            recorrido=recorrido.getSiguiente();
        }
        System.out.println();
    }
    
}
