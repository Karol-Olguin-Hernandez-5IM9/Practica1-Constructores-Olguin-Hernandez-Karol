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
public class Chicas {
    private String nombre;
    private String ApePa;
    private String ApeMa;
    private int Edad;
    private float Altura;
    private float Peso;
    private String ColCab;
    private String TipCab;
    private String Test;
    private int Clave;
    private String Profe;
    private float Sueldo;
    
    public Chicas(String nom, String ap, String am){
        this.nombre=nom;
        this.ApePa=ap;
        this.ApeMa=am;
        System.out.println("La chica es:" + nombre + ApePa + ApeMa);
    }
    public Chicas(int ed, float alt, float pes){
        this.Edad=ed;
        this.Altura=alt;
        this.Peso=pes;
        System.out.println("La chica tiene:" + Edad + "Su Altura es:" + Altura + "Su Peso es:"+ Peso);
    }
    public Chicas(String Colorca, String Tipoca){
        this.ColCab=Colorca;
        this.TipCab=Tipoca;
        System.out.println("La chica tiene el cabello:" + TipCab + ColCab);
    }
    
    public Chicas(String te, int cla){
        this.Test=te;
        this.Clave=cla;
        System.out.println("La chica tiene el color de piel:" + Test+ "Su clave es:"+Clave);
    }
    public Chicas(String pr, float su){
        this.Profe=pr;
        this.Sueldo=su;
        System.out.println("La chica es:" + Profe+ "Y gana:" +Sueldo);
    }
}
