package fabricamotores;

import java.time.LocalDate;

public class Empleado {
    private int clave;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String calle;
    private String numero;
    private String interior;
    private String colonia;
    private String ciudad;
    private String estado;
    private LocalDate fechaContratacion;
    private double pagoXHora;
    
    private Familiar familiares[];
    private Seccion seccion;
    private TipoMotor[] trabajaEnMotores;
    private TipoMotor[] responsableDeMotores;
    private EmpleadoCurso[] empleadoCursos;

}