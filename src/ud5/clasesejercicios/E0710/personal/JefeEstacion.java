package ud5.clasesejercicios.E0710.personal;

import java.time.LocalDate;

public class JefeEstacion {
    String nombre;
    String dni;
    LocalDate fechaNombramiento;

    public JefeEstacion(String nombre, String dni, LocalDate fechaNombramiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNombramiento = fechaNombramiento;
    }
    
}
