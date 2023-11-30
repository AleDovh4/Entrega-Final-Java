/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alexa
 */
public class Familiar extends Persona{
    
    private int alojamiento;

    public Familiar() {
    }

    public Familiar(int alojamiento) {
        this.alojamiento = alojamiento;
    }

    public Familiar(int alojamiento, String rut, String nombre, String apellidoPaterno, String apellidoMaterno, int edad, int telefono) {
        super(rut, nombre, apellidoPaterno, apellidoMaterno, edad, telefono);
        this.alojamiento = alojamiento;
    }

    public int getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(int alojamiento) {
        this.alojamiento = alojamiento;
    }

    @Override
    public void cambiarEstado() {
        if(alojamiento == 1)
            alojamiento =0;
        else
            alojamiento=1;
    }
    
    
    
    
}
