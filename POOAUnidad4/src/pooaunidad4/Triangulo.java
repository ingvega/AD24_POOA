/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooaunidad4;

/**
 *
 * @author paveg
 */
public class Triangulo 
        extends Figura 
        implements FiguraBidimensional
{
    //int id;
    private int base=1;
    private int altura=1;
    private boolean rectangulo=true;

    public Triangulo(int base,int altura) {
        this(base,altura, true, new Punto(0, 0));
    }
    public Triangulo(int base,int altura, boolean rectangulo) {
        this(base,altura, rectangulo, new Punto(0, 0));
    }

    public Triangulo(int base,int altura, boolean rectangulo, Punto punto) {
        if (base > 0) {
            this.base = base;
        }
        if (altura > 0) {
            this.altura = altura;
        }
        this.rectangulo=rectangulo;
        this.setPunto(punto);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isRectangulo() {
        return rectangulo;
    }

    public void setRectangulo(boolean rectangulo) {
        this.rectangulo = rectangulo;
    }
    
    public void agrandar(int aumento){
        if(aumento<=0){
            System.out.println("NO SE AGRANDO, POR QUE ES NEGATIVO O CERO :3");
        }else{
            this.base+=aumento;
            this.altura+=aumento;
        }
    }
    
    @Override
    public void reducir(int decremento){
        if(decremento <= 0 || base-decremento<=0 || altura-decremento<=0){
            System.out.println("Uy no, no se redujo :/");
        }else{
            this.base-=decremento;
            this.altura-=decremento;
        }
    }
    
    public double calcularArea(){
        return base*altura/2.0;
    }
    
    @Override
    public String toString() {
        return "Triangulo "+
                (rectangulo?"rectangulo":"isosceles")
                +" con base " + base + " altura " 
                + altura + ' ' + super.toString();
    }

    @Override
    public double calcularPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
