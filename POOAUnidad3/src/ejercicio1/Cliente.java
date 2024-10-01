package ejercicio1;
public class Cliente extends Persona{
    private String tipoCliente;
    private String organizacion;
    
    public Cliente(){
        super(null,null,null,null);
    }
    
    public String getTipoCliente(){
        return tipoCliente;
    }
    public void setTipoCliente(String tipoCliente){
        tipoCliente = tipoCliente.trim().toUpperCase();
        
        if(tipoCliente.equals("PREFERENCIAL") || tipoCliente.equals("FRECUENTE") || tipoCliente.equals("COMUN")){
            this.tipoCliente = tipoCliente;
        }
        else{
            System.err.println("Tipo de cliente no valido " + tipoCliente);
        }
    }
    
    public String getOrganizacion(){
        return organizacion;
    }
    public void setOrganizacion(String organizacion){
        this.organizacion = organizacion;
    }
    
    public double calcularDescuento(){
        if(tipoCliente.equals("PREFERENCIAL")){
            return 13;
        }
        else if(tipoCliente.equals("FRECUENTE")){
            return 9;
        }
        else{
            return 0;
        }
    }
    
    @Override
    public String toString(){
        return "\nNombre: "+ getNombre() +
                "\nDirección: " + getDireccion() + 
                "\nTelefono: " + getTelefono() +
                "\nEmail: " + getEmail() +
                "\nTipo de cliente: " + tipoCliente +
                "\nOrganizacion: " + organizacion +
                "\nDescuento: " + calcularDescuento() + "%"; 
    }
    
    @Override
    public boolean equals(Object o){
        if(o == null){
            return false;
        }
        
        if(!this.getClass().equals(o.getClass())){
            return false;
        }
        Cliente otroCliente = (Cliente)o;
        if(this.getNombre().equalsIgnoreCase(otroCliente.getNombre()) && 
                this.getOrganizacion().equalsIgnoreCase(otroCliente.getOrganizacion())){
            return true;
        }
        else{
            return false;
        }
    }
}
