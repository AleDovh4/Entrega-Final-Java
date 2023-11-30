/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;



/**
 *
 * @author alexa
 */
public class Tarea {
    
    private String tipoTarea;
    private LocalDate fechaInicio;
    private LocalDate fechaObjetivo;

    public Tarea() {
    }

    public Tarea(String tipoTarea, LocalDate fechaInicio, LocalDate fechaObjetivo) {
        this.tipoTarea = tipoTarea;
        this.fechaInicio = fechaInicio;
        this.fechaObjetivo = fechaObjetivo;
    }

    public String getTipoTarea() {
        return tipoTarea;
    }

    public void setTipoTarea(String tipoTarea) {
        this.tipoTarea = tipoTarea;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaObjetivo() {
        return fechaObjetivo;
    }

    public void setFechaObjetivo(LocalDate fechaObjetivo) {
        this.fechaObjetivo = fechaObjetivo;
    }
    
    
    
}
