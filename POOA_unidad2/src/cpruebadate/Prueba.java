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
        fecha1.setMonth(15); 
        System.out.println(fecha1);
        System.out.println(fecha1.getDate());
        System.out.println(fecha2);
        System.out.println(fecha2.getDayOfMonth());
        
    }
}
