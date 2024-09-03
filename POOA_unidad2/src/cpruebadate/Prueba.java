/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpruebadate;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author paveg
 */
public class Prueba {
    public static void main(String[] args) {
        Date fecha1=new Date();
        LocalDate fecha2=LocalDate.now();
        //Asigna el mes de octubre
        fecha1.setMonth(9); 
        //El setter asigna el mes dando continuidad 
        //después de diciembre, quedando abril 2025
        /*11 Dic
         12 Enero
        13 Feb
        14Mar
        15Abr*/
        fecha1.setMonth(15); 
        System.out.println(fecha1);
        System.out.println(fecha1.getDate());
        System.out.println(fecha2);
        System.out.println(fecha2.getDayOfMonth());
        String cadena="hola";
        cadena.toUpperCase();
        cadena=cadena.toUpperCase();
        System.out.println(cadena);
        fecha2=fecha2.plusMonths(10-fecha2.getMonthValue());
        System.out.println(fecha2);
        fecha2=fecha2.plusMonths(-1);
        System.out.println(fecha2);
    }
}
