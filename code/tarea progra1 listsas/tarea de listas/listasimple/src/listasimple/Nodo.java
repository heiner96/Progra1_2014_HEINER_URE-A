/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listasimple;

/**
 *
 * @author hei
 */
public class Nodo {
    public String dato;
    public Nodo siguiente;
    
    public Nodo()
    {
        dato="";
        siguiente=null;
    }
    public Nodo(String dat)
    {
        dato=dat;
        siguiente=null;
    }
    
}
