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
public class Main {
    public static void main(String[] args) {
        String nom="";    
        String ap="";
        String am="";
        int Edad=0;
        float Altura=0;
        float Peso=0;
        String ColCab="";
        String TipCab="";
        String Test="";
        int Clave=0;
        String Profe="";
        float Sueldo=10;
         
        Chicas ch= new Chicas(nom, ap, am);
        Chicas chi= new Chicas(Edad, Altura, Peso);
        Chicas chic= new Chicas(ColCab, TipCab);
        Chicas chica= new Chicas(Profe, Sueldo);
        Chicas chicab= new Chicas(Test, Clave);
    }
    
}
