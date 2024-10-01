package ejercicio1;
public class Prueba {
    public static void main(String[] args) {
        
        Persona per = new Persona();
        per.setNombre("Dafne Guadalupe Orozco     Aguirre");
        per.setDireccion("Pedro Guzman");
        per.setEmail("dafne.aguirre12@gmail.com");
        per.setTelefono("4451401257");
        System.out.println(per);
        
        
        //Prueba empleados
        Empleado e = new Empleado();
        e.setNombre("James Beautfort");
        e.setDireccion("Pipila #32");
        e.setTelefono("4451234567");
        e.setEmail("jamesbeaut@gmail.com");
        e.setSueldoXHora(50);
        e.setNumHoras(7);
        e.setTurno("Matutino");
        
        System.out.println(e.toString()+"\n");
        System.out.println(e+"\n");
        System.out.println(e.convertirATexto()+"\n");
        
        Empleado e2 = new Empleado();
        e2.setNombre("James Beautfort");
        e2.setDireccion("Pipila #32");
        e2.setTelefono("4451234567");
        e2.setEmail("jamesbeaut@gmail.com");
        e2.setSueldoXHora(50);
        e2.setNumHoras(7);
        e2.setTurno("Matutino");
        
        
        
        if(e.equals(e2)){
            System.out.println("Iguales");
        }
        else{
            System.out.println("Diferentes");
        }
        
        //Prueba clientes
        Cliente c = new Cliente();
        c.setNombre("Paola Garcia");
        c.setDireccion("San Luis #125");
        c.setTelefono("4451234567");
        c.setEmail("paogarcia2@gmail.com");
        c.setTipoCliente("Comun   ");
        c.setOrganizacion("Pan");
        
        System.out.println(c.toString()+"\n");
        
        Cliente c2 = new Cliente();
        c2.setNombre("Paola Lara");
        c2.setDireccion("Guanajuato #125");
        c2.setTelefono("4451234567");
        c2.setEmail("paogarcia2@gmail.com");
        c2.setTipoCliente("Preferencial");
        c2.setOrganizacion("Pan");
        
        System.out.println(c2.toString() + "\n");
        
        if(c.equals(c2)){
            System.out.println("Iguales");
        }
        else{
            System.out.println("Diferentes");
        }
        
        //Prueba proveedores
        Proveedor p = new Proveedor();
        p.setNombre("Jesus Alvarez");
        p.setDireccion("Rio yaqui #21");
        p.setTelefono("4451234567");
        p.setEmail("jalvarez@gmail.com");
        p.setOrganizacion("Pan");
        
        System.out.println(p.toString()+"\n");
        
        Proveedor p2 = new Proveedor();
        p2.setNombre("Jesus Alvarez");
        p2.setDireccion("Rio yaqui #21");
        p2.setTelefono("4451234567");
        p2.setEmail("jalvarez@gmail.com");
        p2.setOrganizacion("Pan");
        
        System.out.println(p2.toString() + "\n");
        
        if(p.equals(p2)){
            System.out.println("Iguales");
        }
        else{
            System.out.println("Diferentes");
        }
    }
}
