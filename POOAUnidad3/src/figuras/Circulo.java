/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

import java.awt.Color;

/**
 *
 * @author paveg
 */
public class Circulo  extends Figura{  
    private int radio = 1;

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

    public Circulo(int radio, Punto punto) {
        if (radio > 0) {
            this.radio = radio;
        }
        this.setPunto(punto);
    }
    
    public int getRadio(){
        return radio;
    }
    
    public void agrandar(int aumento){
        if(aumento<=0){
            System.out.println("NO SE AGRANDO, POR QUE ES NEGATIVO O CERO :3");
        }else{
            this.radio+=aumento;
        }
    }
    
    public void reducir(int decremento){
        if(decremento <= 0){
            System.out.println("Uy no, no se redujo :/");
        }else{
            this.radio-=decremento;
        }
    }
    
}
