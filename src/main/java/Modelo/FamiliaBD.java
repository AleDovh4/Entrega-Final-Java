/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author alexa
 */
public interface FamiliaBD {
    
    
    ArrayList<Familia>listaFamilia=new ArrayList<Familia>();
    public void Crear();
    public void Actualizar();
    public void Eliminar();
    public void Leer();
}