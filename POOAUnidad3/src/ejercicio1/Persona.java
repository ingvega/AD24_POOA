package ejercicio1;

public class Persona {
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    
    public Persona(){}
    
    public Persona(String nombre, String direccion, 
            String telefono, String email){
        setNombre(nombre);
        setDireccion(direccion);
        setTelefono(telefono);
        setEmail(email);
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        nombre = nombre.trim().replaceAll(" +", " ");
        
        if(nombre.length() >= 2 && nombre.length() <= 40) {
            this.nombre = nombre;
            //System.out.println("Nombre: " + nombre);
        } 
        else{
            System.err.println("Nombre no valido " + nombre);
        }
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        direccion = direccion.trim().replaceAll(" +", " ");
        
        if(direccion.length() >= 2 && direccion.length() <= 40) {
            this.direccion = direccion;
            //System.out.println("Direccion: " + direccion);
        } 
        else{
            System.err.println("Direccion no valida " + direccion);
        }
    }
    
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        telefono = telefono.trim().replaceAll(" +", "");
        
        if(telefono.length() ==  10){
            this.telefono = telefono;
            //System.out.println("Telefono: " + telefono);
        }
        else{
            System.err.println("Telefono no valido " +  telefono);
        }
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        email = email.trim().replaceAll(" +", "");
        
        if(email.length() >= 12 && email.length() <= 35) {
            this.email = email;
            //System.out.println("Email: " + email);
        } 
        else{
            System.err.println("Email no valido" + email);
        }
    }
    
    @Override
    public String toString(){
        return "\nNombre: "+ nombre +
                "\nDirección: " + direccion + 
                "\nTelefono: " + telefono +
                "\nEmail: " + email; 
    }
}


