/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacolaspilas;

/**
 *
 * @author Estudiante
 */
public class NodoDeLista
{
    private NodoDeLista  raiz;
    
    public NodoDeLista()
    {
        raiz=null;
    }
   
    public void Insertar(int dato)
    {
        Nodo nuevo;
        nuevo =new Nodo();
        nuevo.setDatos(dato);
        if(raiz==null)
        {
            nuevo.setSiguiente(null);
            raiz = nuevo;        
        }
        else
        {   
            Nodo auxiliar = raiz;
            while(auxiliar.getSiguiente()!=null)
            {
                
            }
        
        }
    }
}
