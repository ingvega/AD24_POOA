/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bpractica_punto;

/**
 *
 * @author paveg
 */
public class Prueba {
    public static void main(String[] args) {
        
        Punto p1=new Punto();
        System.out.println(p1.getX() + ","+p1.getY());
        p1.setX(-2);
        p1.setY(3);
        //p1.setX(p1.getX()+10);
        int nuevaX=p1.getX()+10;
        //p1.getX()+=10;//error
        p1.setX(nuevaX);
        System.out.println(p1.getX() + ","+p1.getY());
    }
}
