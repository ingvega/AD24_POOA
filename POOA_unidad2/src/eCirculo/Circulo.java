/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eCirculo;

/**
 *
 * @author paveg
 */
public class Circulo {

    private int radio = 1;
    public Punto centro;

    public Circulo(int radio) {
        //Punto origen = new Punto(0, 0);
        //this(radio,origen);
        //Uso de una instancia anónima
        this(radio, new Punto(0, 0));
//        Punto origen = new Punto(0, 0);
//        Circulo(radio,origen);
//        if (radio > 0) {
//            this.radio = radio;
//        }

//        else
//            this.radio=1;
    }

    public Circulo(int radio, Punto centro) {
        if (radio > 0) {
            this.radio = radio;
        }
        this.centro = centro;
    }

    public void aumentarRadio() {
        radio++;
    }

    public void aumentarRadio(int cantidad) {
        if (radio - cantidad >= 1) {
            radio += cantidad;
        }else{
            System.err.println("El radio no puede tener valores negativos o cero");
        }
    }
    
    public void mueveX(int x){
        int nuevaX=centro.getX()+x;
        centro.setX(nuevaX);
    }
    
    public void mueveY(int y){
        centro.setY(centro.getY()+y);
    }

    public String datosCirculo(){
        return "Circulo con posicion: ("
                + centro.getX() + ", "
                + centro.getY() + "). Radio: " + radio;
    }
}
