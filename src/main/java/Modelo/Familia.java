/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author alexa
 */
public class Familia {
    
    private ArrayList<Familiar> listaFamilia;
    private int idCasa;

    public Familia() {
    }

    public Familia(ArrayList<Familiar> listaFamilia, int idCasa) {
        this.listaFamilia = listaFamilia;
        this.idCasa = idCasa;
    }

    public ArrayList<Familiar> getListaFamilia() {
        return listaFamilia;
    }

    public void setListaFamilia(ArrayList<Familiar> listaFamilia) {
        this.listaFamilia = listaFamilia;
    }

    public int getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(int idCasa) {
        this.idCasa = idCasa;
    }
    
    
}
