/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooaunidad4;

/**
 *
 * @author paveg
 */
public class Rectangulo extends Figura {
    private int base=1;
    private int altura=1;

    public Rectangulo(int base,int altura) {
        this(base,altura, new Punto(0, 0));
    }

    public Rectangulo(int base,int altura, Punto punto) {
        if (base > 0) {
            this.base = base;
        }
        if (altura > 0) {
            this.altura = altura;
        }
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
    
    public void agrandar(int aumento){
        if(aumento<=0){
            System.out.println("NO SE AGRANDO, POR QUE ES NEGATIVO O CERO :3");
        }else{
            this.base+=aumento;
            this.altura+=aumento;
        }
    }
    
    public void reducir(int decremento){
        if(decremento <= 0){
            System.out.println("Uy no, no se redujo :/");
        }else{
            this.base-=decremento;
            this.altura-=decremento;
        }
    }

    @Override
    public String toString() {
        return "Rectangulo con base " + base + " altura " 
                + altura + ' ' + super.toString();
    }

    @Override
    double calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
