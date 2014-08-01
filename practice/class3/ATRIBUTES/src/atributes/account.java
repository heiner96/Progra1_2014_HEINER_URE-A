/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atributes;

/**
 *
 * @author hei
 */
public class account                                   // {}
{
     //Declaracion de variables
     double saldoInicial;
     private boolean hayError;
    //parametro para recibir el nuevo monto
    public account()
    {
        saldoInicial=0;
        hayError=false;
    }
    //Este metodo sirve para aumentar la cuenta de un usauario
    //parametro para recibirel nuevo monto
    public void Deposito(double monto)
    {
        setSaldoInicial(getSaldoInicial() + monto);
    }
    //Este metodo sirve para disminuir la cuenta de un usauario
    //parametro para recibirel nuevo monto
    public void Retiro(double monto)
    {
        if(getSaldoInicial()>= monto)
            setSaldoInicial(getSaldoInicial() - monto);
        else
            setHayError(true);       
    }

    /**
     * @return the saldoInicial
     */
    public double getSaldoInicial()
    {
        return saldoInicial;
    }

    /**
     * @param saldoInicial the saldoInicial to set
     */
    public void setSaldoInicial(double saldoInicial)
    {
        this.saldoInicial = saldoInicial;
    }

    /**
     * @return the hayError
     */
    public boolean isHayError() {
        return hayError;
    }

    /**
     * @param hayError the hayError to set
     */
    public void setHayError(boolean hayError) {
        this.hayError = hayError;
    }
}
