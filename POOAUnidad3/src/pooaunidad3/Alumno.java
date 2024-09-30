/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooaunidad3;

/**
 *
 * @author paveg
 */
public class Alumno extends Persona {

    private String noControl;
    private String carrera;

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    //NoControl Nombre Completo Carrera
//    public String convertirATexto(){
//    }
    //Sobrecarga
//    public String toString(boolean mayuscula){
//        return "";
//    }
    //Sobreescritura(reemplazar el comportamiento heredado)
    @Override
    public String toString() {
        return "NoControl: " + noControl
                + "\nNombre: " + getNombre() + " " + getApellidos()
                + "\nCarrera: " + carrera;
    }

//    @Override
//    public boolean equals(Object otro) {
//        if (otro == null) {
//            return false;
//        }
//        //Evaluar si son del mismo tipo
////        if(!(otro instanceof Alumno)){
////            return false;
////        }
//        if(!this.getClass().equals(otro.getClass())){
//            return false;
//        }
//        Alumno otroAlumno = (Alumno) otro;
//        //return this.noControl.equalsIgnoreCase(otroAlumno.getNoControl());
//        if (this.noControl.equalsIgnoreCase(otroAlumno.getNoControl())) {
//            return true;
//        } else {
//            return false;
//        }
//    }
}
