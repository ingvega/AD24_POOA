/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooaunidad4;

/**
 *
 * @author paveg
 */
public class Circulo  extends Figura implements FiguraBidimensional{  
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
    
    @Override
    public void ajustarTamanio(int ajuste){
        if(ajuste < 0 && this.radio+ajuste<1){
            System.out.println("Uy no, no se redujo :/");
        }else{
            this.radio+=ajuste;
        }
    }

    @Override
    public String toString() {
        return "Circulo con radio " + radio 
                + ' ' + super.toString();
    }

    @Override
    public double calcularArea() {
        return Math.PI*radio*radio;
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI*radio*2;
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








