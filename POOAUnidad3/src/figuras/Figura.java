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
public class Figura {
    private Punto punto;
    private Color color;

    public Punto getPunto() {
        return punto;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    
    
    public void moverX(int cantidad) {
        punto.setX(punto.getX()+cantidad);
    }
    public void moverY(int cantidad) {
        punto.setY(punto.getY()+cantidad);
    }
    //public void incrementar() {  
    //}
    
}
