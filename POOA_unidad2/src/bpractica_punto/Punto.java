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

    /**
     * Crea un punto en la coordenada 1,1
     */
    public Punto() {
        x = 1;
        y = 1;
    }
    /**
     * Construye un punto, que si se recibe True en el parametro
     * aleatorio, sus coordenadas son valores aleatorios entre 0 
     * y limite (inclusivos), de lo contrario, el punto construido 
     * tendrá coordenadas iguales al limite
     * @param limite Valor límite para el aleatorio o valor a asignar
     * @param aleatorio Con un <b>true</b> indica que se generen 
     * coordenadas aleatorias, con un <b>false</b> se indica que
     * la x y y se asignen con el valor de limite
     */
    public Punto(int limite,boolean aleatorio) {
        //int x=(int)(Math.random()*(limite+1));
        if(aleatorio){
            setX((int)(Math.random()*(limite+1)));
            //x = (int)(Math.random()*(limite+1));
            y = (int)(Math.random()*(limite+1));
        }else{
            x=limite;
            y=limite;
        }
    }

    public Punto(int x, int y){
        setX(x);
        //this.x=x;
        setY(y);
        //this.y=y;
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x >= 0) {
            this.x = x;
        } else {
            System.err.println("El valor de x no acepta negativos");
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y >= 0) {
            this.y = y;
        } else {
            System.err.println("El valor de y no acepta negativos");
        }
    }
}
