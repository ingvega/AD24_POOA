/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bpractica_punto;

/**
 *
 * @author paveg
 */
public class Punto {
    private int x;
    private int y;
    
    public int getX(){
        return x;
    }
    public void setX(int x){
        if(x>=0){
            this.x=x;
        }else{
            System.err.println("El valor de x no acepta negativos");
        }
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        if(y>=0){
            this.y=y;
        }else{
            System.err.println("El valor de y no acepta negativos");
        }
    }
}
