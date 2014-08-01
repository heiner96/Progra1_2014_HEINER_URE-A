/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg19;

/**
 *
 * @author Estudiante
 */
public class pila 
{                  
    private NodoDeLista raiz;
    private String dato;
    private NodoDeLista siguiente;
    
    public pila()
    {
        dato="";
        siguiente=null;
    }
    public void Push(String dato)
    {
        NodoDeLista nuevo;
        nuevo=new NodoDeLista();
        nuevo.setDato(dato);
        if(raiz==null)
        {
            nuevo.setSiguiente(null);
            raiz=nuevo;
        }
        else
        {
            nuevo.setSiguiente(raiz);
            raiz=nuevo;
        }
    }
    public Object pop()
    {
        if(raiz!=null)
        {
            Object info = raiz.getDato();
            raiz=raiz.getSiguiente();
            return info;
        }
        return new Object();
    }
    
    public void imprimir()
    {
        NodoDeLista recorrido=raiz;
        System.out.println("Lista de todos los elementos de la pila.");
        while(recorrido!=null)
        {
            System.out.println(recorrido.getSiguiente()+"-");
            recorrido=recorrido.getSiguiente();
        }
        System.out.println();
    }
    public boolean Vacia()
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
    public int cantidad()
    {
        int cantidad=0;
        NodoDeLista recorrido=raiz;
        while(recorrido!=null)
        {
            cantidad++;
            recorrido=recorrido.getSiguiente();
        }
        return cantidad;
    }
    public void BorrarUltimo(String[] pDatos)
    {          
        String[] retorno =new String[4];
        retorno=pDatos;
        retorno[3]=" ";           
        System.out.println("    " + retorno );
    }
    
}
