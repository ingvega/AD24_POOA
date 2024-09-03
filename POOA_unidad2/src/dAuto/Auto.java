package dAuto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class Auto {
    private String marca;
    private String modelo;
    private int velocidad;
    private int velocidadMaxima;
    private boolean encendido;
    
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getVelocidad(){
        return velocidad;
    }
    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }
    public boolean isEncendido(){
        return encendido;
    }
    
    public void setMarca(String marca){
        this.marca=marca;
    } 
    public void setModelo(String modelo){
        this.modelo=modelo;
    } 
    public void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima=velocidadMaxima;
    } 
    
    public void encender(){
        if (encendido==true){
            //if(isEncendido()==true){
            System.out.println("El auto ya esta encendido");
        }else{
            encendido=true;
        }
    }
    public void apagar(){
        if (encendido==false){
            System.out.println("El auto ya esta apagado");
        }else{
            velocidad=0;
            encendido=false;
        }
    }
    public Auto(String marca, String modelo, int velocidadMaxima){}
}
