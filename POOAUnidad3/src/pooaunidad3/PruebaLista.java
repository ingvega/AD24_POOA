/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooaunidad3;

import java.util.ArrayList;

/**
 *
 * @author paveg
 */
public class PruebaLista {
    public static void main(String[] args) {
        //Alumno[] alumnos=new Alumno[20];
        ArrayList<Alumno> lista=new ArrayList<>();
        Alumno a=new Alumno();
        a.setNoControl("S23120001");
        a.setNombre("Juan");
        a.setApellidos("Perez");
        a.setCarrera("Sistemas Computacionales");
        //alumnos[0]=a;
        lista.add(a);
        
        a=new Alumno();
        a.setNoControl("G22120034");
        a.setNombre("Ana");
        a.setApellidos("Hernandez");
        a.setCarrera("Gestion Empresarial");
        //alumnos[0]=a;
        lista.add(a);
        
        a=new Alumno();
        a.setNoControl("E24120050");
        a.setNombre("Adrian");
        a.setApellidos("Lopez");
        a.setCarrera("Electronica");
        //alumnos[0]=a;
        lista.add(a);
        
        //Crear el alumno prototipo (solo con el numero de control)
        a=new Alumno();
        a.setNoControl("S23120251");
        
        System.out.println(lista.contains(a));
        a.setNoControl("E24120050");
        System.out.println(lista.contains(a));
        
        
        
        
        
        
        
        
    }
}
