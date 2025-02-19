package ud5.rol;

import java.util.Random;

// Creo una excepción para controlar los errores en la creación de personajes super() mostrará el mensaje de error
class PersonajeNoValido extends Exception {
    public PersonajeNoValido(String mensaje) {
        super(mensaje);
    }
}

public class Personaje {

    private String nombre;
    private String raza;
    private int fuerza, agilidad, constitucion, inteligencia, intuicion, presencia;
    private int nivel, experiencia;
    private int puntosDeVida;

    private static final int PUNTOS_VIDA_BASE = 50;
    private static final String[] RAZAS_VALIDAS = { "HUMANO", "ELFO", "ENANO", "HOBBIT", "ORCO", "TROLL" };

    
    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getConstitucion() {
        return constitucion;
    }

    public void setConstitucion(int constitucion) {
        this.constitucion = constitucion;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getIntuicion() {
        return intuicion;
    }

    public void setIntuicion(int intuicion) {
        this.intuicion = intuicion;
    }

    public int getPresencia() {
        return presencia;
    }

    public void setPresencia(int presencia) {
        this.presencia = presencia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public static int getPuntosVidaBase() {
        return PUNTOS_VIDA_BASE;
    }

    public static String[] getRazasValidas() {
        return RAZAS_VALIDAS;
    }

    
    // Métodos

    /**
     * Crea un personaje con todas las características. Valida que la raza sea valida y
     * valida que sean mayores o iguales a 1 antes de crearlo. (excepto experiencia que puede ser 0).
     * @param nombre
     * @param raza
     * @param fuerza
     * @param agilidad
     * @param constitucion
     * @param inteligencia
     * @param intuicion
     * @param presencia
     * @throws PersonajeNoValido
     */
    public Personaje(String nombre, String raza, int fuerza, int agilidad, int constitucion,
            int inteligencia, int intuicion, int presencia) throws PersonajeNoValido {

                
        validarRaza(raza);
        validarCaracteristicas(fuerza, agilidad, constitucion, inteligencia, intuicion, presencia);

        this.nombre = nombre;
        this.raza = raza;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.constitucion = constitucion;
        this.inteligencia = inteligencia;
        this.intuicion = intuicion;
        this.presencia = presencia;
        this.nivel = 1;
        this.experiencia = 0;
        this.puntosDeVida = PUNTOS_VIDA_BASE + constitucion;
    }

    /**
     * Crea un personaje cubriendo solo los campos físicos. 
     * En este caso el nivel se inicializará a 1 y la experiencia a 0 y los puntos de vida al 50 más el valor de constitución.
     * @param nombre
     * @param raza
     * @param fuerza
     * @param agilidad
     * @param constitucion
     * @throws PersonajeNoValido
     */
    public Personaje(String nombre, String raza, int fuerza, int agilidad, int constitucion) throws PersonajeNoValido {
        this(nombre, raza, fuerza, agilidad, constitucion, 1, 1, 1);
    }

    /**
     * Crea un personaje de la raza elegida con características aleatorias
     * @param nombre
     * @param raza
     * @throws PersonajeNoValido
     */
    public Personaje(String nombre, String raza) throws PersonajeNoValido {
        Random rand = new Random();
        this.nombre = nombre;
        this.raza = raza;
        this.fuerza = rand.nextInt(100) + 1;
        this.agilidad = rand.nextInt(100) + 1;
        this.constitucion = rand.nextInt(100) + 1;
        this.inteligencia = rand.nextInt(100) + 1;
        this.intuicion = rand.nextInt(100) + 1;
        this.presencia = rand.nextInt(100) + 1;
        this.nivel = 1;
        this.experiencia = 0;
        this.puntosDeVida = PUNTOS_VIDA_BASE + this.constitucion;
        validarRaza(raza);
    }


    /**
     * Constructor de personaje a partir de nombre. Crea un personaje con características aleatorias de raza HUMANO
     * @param nombre
     * @throws PersonajeNoValido
     */
    public Personaje(String nombre) throws PersonajeNoValido {
        this(nombre, "HUMANO");
    }

    /** 
     * Valida que la raza sea una de las válidas
     * @param raza
     * @throws PersonajeNoValido
     */
    private void validarRaza(String raza) throws PersonajeNoValido {
        boolean esValida = false;
        for (String razaValida : RAZAS_VALIDAS) {
            if (razaValida.equalsIgnoreCase(raza)) {
                esValida = true;
                break;
            }
        }
        if (!esValida)
            throw new PersonajeNoValido("Raza no válida: " + raza);
    }

    /**
     * Valida que las caracteristicas sean iguales o superiores a 1
     * @param caracteristicas
     * @throws PersonajeNoValido
     */
    private void validarCaracteristicas(int... caracteristicas) throws PersonajeNoValido {
        for (int c : caracteristicas) {
            if (c < 1)
                throw new PersonajeNoValido("Las características deben ser mayores o iguales a 1");
        }
    }

    
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Agilidad: " + agilidad);
        System.out.println("Constitución: " + constitucion);
        System.out.println("Inteligencia: " + inteligencia);
        System.out.println("Intuición: " + intuicion);
        System.out.println("Presencia: " + presencia);
        System.out.println("Nivel: " + nivel);
        System.out.println("Experiencia: " + experiencia);
        System.out.println("Puntos de vida: " + puntosDeVida);
    }

    @Override
    public String toString() {
        return nombre + " (" + puntosDeVida + "/" + (PUNTOS_VIDA_BASE + constitucion) + ")";
    }

}
