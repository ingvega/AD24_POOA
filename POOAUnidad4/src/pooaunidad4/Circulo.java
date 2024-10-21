/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooaunidad4;

/**
 *
 * @author paveg
 */
public class Circulo  extends Figura{  
    private int radio = 1;

    public Circulo(int radio) {
        this(radio, new Punto(0, 0));
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
        if(decremento <= 0 || this.radio-decremento<1){
            System.out.println("Uy no, no se redujo :/");
        }else{
            this.radio-=decremento;
        }
    }

    @Override
    public String toString() {
        return "Circulo con radio " + radio 
                + ' ' + super.toString();
    }

    @Override
    double calcularArea() {
        return Math.PI*radio*radio;
    }
    
    
}



/*
Clase abstracta
- Evitar que se creen instancias de ese tipo
- Atributos
- Métodos
  -> Concretos
  -> Abstractos

Interfaces
- Solo métodos abstractos (PUBLICOS)
- Atributos (se asumen constantes)
- Clases 100% abstractas
- Para aplicarla a una clase debe usarse "implements"

*/








