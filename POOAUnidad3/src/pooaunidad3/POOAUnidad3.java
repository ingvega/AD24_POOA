/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooaunidad3;

import java.time.LocalDate;

/**
 *
 * @author paveg
 */
public class POOAUnidad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String valor="12345";
        //Caracteres especiales \\d digitos [0-9]  [12]
        //String patron="[0-9][0-9][0-9][0-9][0-9]";
        String patron="[0-9]{5}";
        System.out.println(valor.matches(patron));
        valor="4";
        System.out.println(valor.matches(patron));
        patron="[a-zA-Z]+";
        valor="ejemplo3";
        System.out.println(valor.matches(patron));
        valor="          A                 B  C                     D    ";
        valor=valor.replaceAll(" +", " ");
        System.out.println("------"+valor+"-------");
        
        Alumno a=new Alumno();
        a.setNombre("Juan");
        a.setApellidos("Perez");
        //a.nombre="Juan";
        
    }
    
    
    
}
