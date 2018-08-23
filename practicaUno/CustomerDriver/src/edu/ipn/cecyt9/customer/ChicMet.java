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
public interface ChicMet {
    public void Hablar();
    public String RecibirOrden(String orden);
    public float ObtenerPropina(int cash);
    public float RealizarPafo(float cash);
    public String CambiarHorario(String nom1, String nom2);
}
