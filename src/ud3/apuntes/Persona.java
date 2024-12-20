package ud3.apuntes;

public class Persona {
    // Datos
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private double estatura = 1.80;
    private final String dni = null;
    enum Sexo {HOMBRE, MUJER, NO_BINARIO}
    private Sexo sexo;
    DiaDeLaSemana diaPreferido;

    public static int contadorPersonas;

    // CONSTRUCTORES
    public Persona() {
    }

    

    public Persona(String nombre, Sexo sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public Persona(String nombre, String sexo) {
        this.nombre = nombre;
        this.sexo = Sexo.valueOf(sexo);
    }

    public Persona(String nombre) {
        this(nombre, 0, 0.4);
    }

    public Persona(String nombre, int edad, double estatura) {
        this.nombre = nombre; // asigna el parámetro al atributo
        this.edad = edad;
        this.estatura = estatura;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        contadorPersonas++;
    }

    // Otros Métodos

    public void inicializar(String n, String a1, String a2, int e) {
        nombre = n;
        apellido1 = a1;
        apellido2 = a2;
        edad = e;
        contadorPersonas++;
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

    public void cumplirAnhos() {
        edad++;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        if (estatura > 0)
            this.estatura = estatura;
    }

    void crecer(double incremento) {
        estatura += incremento;
    }

    public void setEdad(int edad) {
        if (edad >= 0)
            this.edad = edad;
    }

    public static void incrementarContador() {
        contadorPersonas++;
    }

    void saludar() {
        System.out.println("Hola. Mi nombre es " + nombre);
        System.out.println("Encantado de conocerte.");
    }

}
