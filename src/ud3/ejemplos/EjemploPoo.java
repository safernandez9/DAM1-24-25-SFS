package ud3.ejemplos;

public class EjemploPoo {
    public static void main(String[] args) {

        // se crea un objeto de tipo Persona
        Persona p = new Persona();
        
        // se utilizan los métodos definidos en la clase Persona
        p.inicializar("Arsenio", "Leante", "Gomez", 30);
        String nombre2 = p.nombreCompleto();
        if (p.esMayorEdad()) {
            System.out.println(nombre2 + " es mayor de edad");
        } else {
            System.out.println(nombre2 + " no es mayor de edad");
        }
    }
}
