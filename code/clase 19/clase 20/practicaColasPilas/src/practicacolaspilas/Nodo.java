/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacolaspilas;

/**
 *
 * @author Estudiante
 */
class Nodo 
{
  //datos de nodo o lista
    private int datos;
    //el siguiente dato de la lista
    private Nodo siguiente;
    
    //metodo contructor para inicializar las variables
    public Nodo()
    {
        //inizalizo las variables
        datos=0;
        siguiente=null;
    }

    public int getDatos() {
        return datos;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setDatos(int datos) {
        this.datos = datos;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
