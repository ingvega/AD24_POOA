package ejercicio1;
public class Empleado extends Persona{
    private double sueldoXHora;
    private int numHoras;
    private String turno;
    private double sueldo;
    
    public Empleado(String nombre, String direccion, 
            String telefono, String email,
            double sueldoXHora,int numHoras, 
            String turno){
        super(nombre,direccion,telefono,email);
//        setNombre(nombre);
//        setDireccion(direccion);
//        setEmail(email);
//        setTelefono(telefono);
        this.sueldoXHora=sueldoXHora;
        setNumHoras(numHoras);
        setTurno(turno);
    }
    
    public double getSueldoXHora(){
        return sueldoXHora;
    }
    public void setSueldoXHora(double sueldoXHora){
        this.sueldoXHora = sueldoXHora;
    }
    
    public int getNumHoras(){
        return numHoras;
    }
    public void setNumHoras(int numHoras){
        this.numHoras = numHoras;
    }
    
    public String getTurno(){
        return turno;
    }
    public void setTurno(String turno){
        turno = turno.trim();
        
        if(turno.length() >= 5){
            this.turno = turno;
        }
        else{
            System.out.println("Turno no valido " + turno);
        }
    }
    
    public double calcularSueldo(){
        sueldo = numHoras * sueldoXHora * 2;        
        return sueldo;
    }
    
    
    public String convertirATexto(){
        return super.toString() +
                "\nSueldo por hora: " + sueldoXHora +
                "\nNumero de horas: " + numHoras + 
                "\nTurno: " + turno +
                "\nSueldo total: " + calcularSueldo(); 
    }
    @Override
    public String toString(){
        return super.toString() +
                "\nSueldo por hora: " + sueldoXHora +
                "\nNumero de horas: " + numHoras + 
                "\nTurno: " + turno +
                "\nSueldo total: " + calcularSueldo(); 
    }
    
    @Override
    public boolean equals(Object o){
        if(o == null){
            return false;
        }
        
        if(!this.getClass().equals(o.getClass())){
            return false;
        }
        Empleado otroEmpleado = (Empleado)o;
        if(this.getNombre().equalsIgnoreCase(otroEmpleado.getNombre()) && 
                this.getDireccion().equalsIgnoreCase(otroEmpleado.getDireccion())){
            return true;
        }
        else{
            return false;
        }
    }
}
