/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooaunidad4;

/**
 *
 * @author paveg
 */
public class Cilindro extends Circulo implements FiguraTridimensional{
    private int altura;

    public Cilindro(int altura, int radio) {
        super(radio);
        this.altura = altura;
    }
    
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro() {
        return super.calcularPerimetro()*2+altura*2; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double calcularArea() {
        return super.calcularArea()*2+altura*super.calcularPerimetro(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public double calcularVolumen() {
        return super.calcularArea()*altura;
    }
    
}
