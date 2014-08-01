/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice2;

import java.util.Random;

/**
 *
 * @author hei
 */
public class numerosAleatorios 
{
    int numeroAleatorio;
    int numeroRomanoGenerado=0;
    int y=1;
    String numerosRomanos;
    String cadenaNumerosMilenarios="";
    String cadenaNumerosCentenarios="";
    String cadenaNumerosDecimales="";
    String cadenaNumerosUnitarios="";
    
    
    public void numeroAleatorio ()
    {      
        Random o = new Random();
        int rango=3000-1+1;
        setNumeroAleatorio(o.nextInt(rango)+1);
    }
    public void numerosRomanos()
    {
        if(getNumeroAleatorio()>=1000)
        {
            numeroRomanoGenerado=getNumeroAleatorio()%1000;
            if(numeroRomanoGenerado==3)
            {
                cadenaNumerosMilenarios ="MMM";
            }
            else
            {
                if(numeroRomanoGenerado==2)
                {
                    cadenaNumerosMilenarios = "MM";
                }
                else
                {
                    cadenaNumerosMilenarios= "M";
                }
            }
        }
        else
        {
            if((getNumeroAleatorio()>=100)&&(getNumeroAleatorio()<1000))
                    {
                        numeroRomanoGenerado=getNumeroAleatorio()/100;
                        if(numeroRomanoGenerado==9)
                        {
                            cadenaNumerosCentenarios="CM";                            
                        }
                        else
                        {
                            if(numeroRomanoGenerado==8)
                            {
                                cadenaNumerosCentenarios="DCCC";
                            }
                            else
                            {
                                if(numeroRomanoGenerado==7)
                                {
                                    cadenaNumerosCentenarios="DCC";                                    
                                }
                                else
                                {
                                    if(numeroRomanoGenerado==6)
                                    {
                                        cadenaNumerosCentenarios="DC";
                                    }
                                    else
                                    {
                                        if(numeroRomanoGenerado==5)
                                        {
                                            cadenaNumerosCentenarios="D";
                                        }
                                        else
                                        {
                                            if(numeroRomanoGenerado==4)
                                            {
                                                cadenaNumerosCentenarios="CD";
                                            }
                                            else
                                            {
                                                if(numeroRomanoGenerado==3)
                                                {
                                                    cadenaNumerosCentenarios="CCC";
                                                }
                                                else
                                                {
                                                    if(numeroRomanoGenerado==2)
                                                    {
                                                        cadenaNumerosCentenarios="CC";
                                                    }
                                                    else
                                                    {
                                                        if(numeroRomanoGenerado==1)
                                                        {
                                                            cadenaNumerosCentenarios="C";
                                                        }
                                                        else
                                                        {
                                                            if((getNumeroAleatorio()<100)&&(getNumeroAleatorio()>=10))
                                                            {
                                                                numeroRomanoGenerado=getNumeroAleatorio()/10;
                                                                if(numeroRomanoGenerado==9)
                                                                {
                                                                    cadenaNumerosDecimales="XC";
                                                                }
                                                                else
                                                                {
                                                                    if(numeroRomanoGenerado==8)
                                                                    {
                                                                        cadenaNumerosDecimales="LXXX";
                                                                    }
                                                                    else
                                                                    {
                                                                        if(numeroRomanoGenerado==7)
                                                                        {
                                                                            cadenaNumerosDecimales="LXX";
                                                                        }
                                                                        else
                                                                        {
                                                                            if(numeroRomanoGenerado==6)
                                                                            {
                                                                                cadenaNumerosDecimales="LX";
                                                                            }
                                                                            else
                                                                            {
                                                                                if(numeroRomanoGenerado==5)
                                                                                {
                                                                                    cadenaNumerosDecimales="L";
                                                                                }
                                                                                else
                                                                                {
                                                                                    if(numeroRomanoGenerado==4)
                                                                                    {
                                                                                        cadenaNumerosDecimales="XL";
                                                                                    }
                                                                                    else
                                                                                    {
                                                                                        if(numeroRomanoGenerado==3)
                                                                                        {
                                                                                            cadenaNumerosDecimales="XXX";
                                                                                        }
                                                                                        else
                                                                                        {
                                                                                            if(numeroRomanoGenerado==2)
                                                                                            {
                                                                                                cadenaNumerosDecimales="XX";
                                                                                            }
                                                                                            else
                                                                                            {
                                                                                                if(numeroRomanoGenerado==1)
                                                                                                {
                                                                                                cadenaNumerosDecimales="X";
                                                                                                }
                                                                                                else
                                                                                                {
                                                                                                    if((getNumeroAleatorio()<10)&&(getNumeroAleatorio()>0))
                                                                                                    {
                                                                                                        if(getNumeroAleatorio()==9)
                                                                                                        {
                                                                                                            cadenaNumerosUnitarios="IX";
                                                                                                        }
                                                                                                        else
                                                                                                        {
                                                                                                            if(getNumeroAleatorio()==8)
                                                                                                            {
                                                                                                                cadenaNumerosUnitarios="VII";
                                                                                                            }
                                                                                                            else
                                                                                                            {
                                                                                                                if(getNumeroAleatorio()==7)
                                                                                                                {
                                                                                                                    cadenaNumerosUnitarios="XII";
                                                                                                                }
                                                                                                                else
                                                                                                                {
                                                                                                                    if(getNumeroAleatorio()==6)
                                                                                                                    {
                                                                                                                        cadenaNumerosUnitarios="VI";
                                                                                                                    }
                                                                                                                    else
                                                                                                                    {
                                                                                                                        if(getNumeroAleatorio()==5)
                                                                                                                        {
                                                                                                                            cadenaNumerosUnitarios="V";
                                                                                                                        }
                                                                                                                        else
                                                                                                                        {
                                                                                                                            if(getNumeroAleatorio()==4)
                                                                                                                            {
                                                                                                                                cadenaNumerosUnitarios="IV";
                                                                                                                            }
                                                                                                                            else
                                                                                                                            {
                                                                                                                                if(getNumeroAleatorio()==3)
                                                                                                                                {
                                                                                                                                    cadenaNumerosUnitarios="III";
                                                                                                                                }
                                                                                                                                else
                                                                                                                                {
                                                                                                                                    if(getNumeroAleatorio()==2)
                                                                                                                                    {
                                                                                                                                        cadenaNumerosUnitarios="II";
                                                                                                                                    }
                                                                                                                                    else
                                                                                                                                    {
                                                                                                                                        if(getNumeroAleatorio()==1)
                                                                                                                                        {
                                                                                                                                            cadenaNumerosUnitarios="I";
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }                                                                                         
                                                                                                                                                                                            
                                                                                            
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                            
                    }
        }
        
        
        
        
        
    }

    public String getNumerosRomanos()
    {
        return numerosRomanos;
    }

    public String getCadenaNumerosMilenarios()
    {
        return cadenaNumerosMilenarios;
    }

    public String getCadenaNumerosCentenarios()
    {
        return cadenaNumerosCentenarios;
    }

    public String getCadenaNumerosDecimales() 
    {
        return cadenaNumerosDecimales;
    }

    public String getCadenaNumerosUnitarios() 
    {
        return cadenaNumerosUnitarios;
    }
    
    public int getNumeroAleatorio() 
    {
        return numeroAleatorio;
    }

    public void setNumeroAleatorio(int numeroAleatorio)
    {
        this.numeroAleatorio = numeroAleatorio;
    }

    public void setNumeroRomanoGenerado(int numeroRomanoGenerado)
    {
        this.numeroRomanoGenerado = numeroRomanoGenerado;
    }

    public void setY(int y) 
    {
        this.y = y;
    }

    public void setNumerosRomanos(String numerosRomanos) 
    {
        this.numerosRomanos = numerosRomanos;
    }

    public void setCadenaNumerosMilenarios(String cadenaNumerosMilenarios)
    {
        this.cadenaNumerosMilenarios = cadenaNumerosMilenarios;
    }

    public void setCadenaNumerosCentenarios(String cadenaNumerosCentenarios) 
    {
        this.cadenaNumerosCentenarios = cadenaNumerosCentenarios;
    }

    public void setCadenaNumerosDecimales(String cadenaNumerosDecimales)
    {
        this.cadenaNumerosDecimales = cadenaNumerosDecimales;
    }

    public void setCadenaNumerosUnitarios(String cadenaNumerosUnitarios)
    {
        this.cadenaNumerosUnitarios = cadenaNumerosUnitarios;
    }
    
}
