package ud3.ejemplos;

/**
 * Los métodos dejan de ser estaticos. Para poder usar Persona new y usar los metodos con p.metodo() debe mantenerse así.
 * Lo mismo aplica a las variables
 */
public class Persona {
    // Datos
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private double estatura = 1.80;
    private final String dni = null;

    // Métodos
    public void inicializar(String n, String a1, String a2, int e) {
        nombre = n;
        apellido1 = a1;
        apellido2 = a2;
        edad = e;
    }

    public String nombreCompleto() {
        return nombre + " " + apellido1 + " " + apellido2;
    }

    public boolean esMayorEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }
}