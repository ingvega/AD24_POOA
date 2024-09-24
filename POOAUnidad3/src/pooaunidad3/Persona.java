/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooaunidad3;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author paveg
 */
public class Persona {
    private String clave;
    private String nombre;
    private String apellidos;
    private String direccion;
    private LocalDate fechaNacimiento;
    private String curp;

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        //4 letras 6 digitos M o H 5 letras 2 digitos
        this.curp = curp;
    }

    
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaNacimiento() {
        //0 1  2 3 4 5 6 7 8 9 10
        //A B C D 0 0 0 1 0 1 HGTABC01
        
        int anio=Integer.parseInt(curp.substring(4,6));
        int mes=Integer.parseInt(curp.substring(6,8));
        int dia=Integer.parseInt(curp.substring(8,10));
        int anioActual=Integer.parseInt((LocalDate.now().getYear()+"").substring(2));
        if(anio<=anioActual)
            anio+=2000;
        else
            anio+=1900;
        return LocalDate.of(anio, mes, dia);
    }

    
    
}
