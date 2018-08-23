/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ipn.cecyt9.customer;

/**
 *
 * @author Olguin Hernandez Karol 5IM9
 */
public abstract class  ChicasAbs {
    
    public String BajaPeso(float altura, float peso){
        String Msx="Sigue asi";
        float imc=0;
        imc=peso/(altura*altura);
        if(imc>25)
            Msx="Necesitas hacer ejercicio";
        return Msx;
    }
    public boolean Asistencia(char falta){
        boolean asis;
        if(falta=='F')
            asis=false;
        else 
            asis=true;
        return asis;
    }
    public String CambiarNombre(String Nombre){
        String Nnom=Nombre;
        return Nnom;
    }
    public abstract int PagarSueldo();
    public abstract String LlevarOrden(String orden);
    
}
