/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooaunidad4;

import java.awt.Color;

/**
 *
 * @author paveg
 */
public abstract class Figura  {
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
    
    
    
    public void mover(int x,int y) {
        punto.setX(x);
        punto.setY(y);
    }
    //public void incrementar() {  
    //}

    @Override
    public String toString() {
        return "ubicado en " + punto;
    }
    
    public abstract void ajustarTamanio(int ajuste);
    
}
