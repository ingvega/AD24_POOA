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
    private char sexo;
    private int edad;
    private String curp;

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        //4 letras 6 digitos M o H 5 letras 2 digitos
        curp = curp.toUpperCase().trim();
        String patron = "[A-Z]{4}[0-9]{6}[MH][A-Z]{5}[A-Z0-9][0-9]";
        if (curp.matches(patron)) {
            this.curp = curp;
            obtenerFechaNacimiento();
            calcularEdad();
            sexo = curp.charAt(10);
        } else {
            System.out.println("La CURP debe tener un formato válido");
        }
    }

    private void calcularEdad() {
        int anioActual = LocalDate.now().getYear();
        edad = anioActual - fechaNacimiento.getYear();

        if (fechaNacimiento.getMonthValue() > LocalDate.now().getMonthValue()) {
            edad--;
        } else if (fechaNacimiento.getMonthValue() == LocalDate.now().getMonthValue()) {
            if (fechaNacimiento.getDayOfMonth() > LocalDate.now().getDayOfMonth()) {
                edad--;
            }
        }
    }

    private void obtenerFechaNacimiento() {
        int anio = Integer.parseInt(curp.substring(4, 6));
        int mes = Integer.parseInt(curp.substring(6, 8));
        int dia = Integer.parseInt(curp.substring(8, 10));
        int anioActual = Integer.parseInt((LocalDate.now().getYear() + "").substring(2));
        if (anio <= anioActual) {
            anio += 2000;
        } else {
            anio += 1900;
        }
        fechaNacimiento = LocalDate.of(anio, mes, dia);
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
        nombre = nombre.trim().replaceAll(" +", " ");
        if (nombre.length() >= 2 && nombre.length() <= 30) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre debe tener entre 2 y 30 caracteres");
        }
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
        return fechaNacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

}
