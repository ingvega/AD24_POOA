package ejercicio1;
public class Proveedor extends Persona{
    private String organizacion;
    
    public String getOrganizacion(){
        return organizacion;
    }
    public void setOrganizacion(String organizacion){
        this.organizacion = organizacion;
    }
    
    @Override
    public String toString(){
        return "\nNombre: "+ getNombre() +
                "\nDirección: " + getDireccion() + 
                "\nTelefono: " + getTelefono() +
                "\nEmail: " + getEmail() +
                "\nOrganizacion: " + organizacion; 
    }
    
    @Override
    public boolean equals(Object o){
        if(o == null){
            return false;
        }
        
        if(!this.getClass().equals(o.getClass())){
            return false;
        }
        
        Proveedor otroProveedor = (Proveedor)o;
        if(this.getOrganizacion().equalsIgnoreCase(
                otroProveedor.getOrganizacion())){
            return true;
        }
        else{
            return false;
        }
    }
}
