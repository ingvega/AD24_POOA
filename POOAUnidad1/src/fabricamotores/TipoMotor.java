package fabricamotores;

public class TipoMotor {
    private int clave;
    private String nombre;
    private String descripcion;
    private double costo;
    private double precio;

    public Empleado responsable;
    public Empleado trabajadores[];
    private Seccion seccion;
    private TipoMotorPieza tipoMotorPiezas[];
    private DescuentoAplicable descuentosAplicables[];
}