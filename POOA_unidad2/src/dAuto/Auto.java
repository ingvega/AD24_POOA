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
//30 H 29 30 R
    private String marca;
    private String modelo;
    private int velocidad;
    private int velocidadMaxima;
    private boolean encendido;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void encender() {
        if (encendido == true) {
            //if(isEncendido()==true){
            System.out.println("El auto ya esta encendido");
        } else {
            encendido = true;
        }
    }

    public void apagar() {
        if (encendido == false) {
            System.out.println("El auto ya esta apagado");
        } else {
            //TODO: Frenar paulatinamente
            int decremento = velocidad / 10;
            System.out.println("bajando velocidad");
            for (int i = 0; i < 10; i++) {
                velocidad -= decremento;
                System.out.print(" " + velocidad);
            }
            if (velocidad > 0) {
                velocidad = 0;
                System.out.print(" 0");
            }

            encendido = false;
        }
    }

    public Auto(String marca, String modelo, int velocidadMaxima) {
        if (marca.length() > 1 && marca.length() < 51) {
            this.marca = marca;
        } else {
            System.out.println("La marca no es valida");
        }
    }
}
