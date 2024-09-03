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
        Punto pA=new Punto();
        Punto pB=new Punto(-20,true);
        Punto pD=new Punto(20,false);
        Punto pC=new Punto(3,-10);
        System.out.println(pA.getX() + ","+pA.getY());
        System.out.println(pB.getX() + ","+pB.getY());
        System.out.println(pC.getX() + ","+pC.getY());
        System.out.println(pD.getX() + ","+pD.getY());
        
        
//        Punto p1=new Punto();
//        System.out.println(p1.getX() + ","+p1.getY());
//        p1.setX(-2);
//        p1.setY(3);
//        //p1.setX(p1.getX()+10);
//        int nuevaX=p1.getX()+10;
//        //p1.getX()+=10;//error
//        p1.setX(nuevaX);
//        System.out.println(p1.getX() + ","+p1.getY());
    }
}
