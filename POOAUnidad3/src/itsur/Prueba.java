/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itsur;

/**
 *
 * @author paveg
 */
public class Prueba {
    public static void main(String[] args) {
        Persona p=new Persona();
        p.setNombre("Juan");
        p.setApellidos("Perez");
        System.out.println(p.getNombre());
        System.out.println(p.getSexo());
        Docente d=p;
        
    }
}
