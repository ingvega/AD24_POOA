/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eCirculo;

/**
 *
 * @author paveg
 */
public class Referencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=5;
        modificar(n);
        System.out.println(n);
        Circulo c=new Circulo(4);
        modificar(c);
        System.out.println(c.datosCirculo());
    }
    
    public static void modificar(int x){
        x++;
    }
    public static void modificar(Circulo x){
        x.aumentarRadio();
    }
    
}
