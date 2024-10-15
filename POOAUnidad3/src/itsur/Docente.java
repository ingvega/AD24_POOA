/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itsur;

/**
 *
 * @author paveg
 */
public class Docente extends Empleado{
    private String carrera;
    private int horasClase;
    private char edificio;

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(int horasClase) {
        this.horasClase = horasClase;
    }

    public char getEdificio() {
        return edificio;
    }

    public void setEdificio(char edificio) {
        this.edificio = edificio;
    }
    
    
}
