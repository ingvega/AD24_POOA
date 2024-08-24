package fabricamotores;

import java.time.LocalDate;

public class Curso {
    private String nombre;
    private String instructor;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private byte cupo;
    private byte inscritos;
    private short duracion;

    private EmpleadoCurso empleadosCurso[];
}