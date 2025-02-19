package ud5.rol;

import java.util.Scanner;

public class AppCreaPersonaje {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del personaje:");
        String nombre = sc.nextLine();

        System.out.println("Introduce la raza del personaje (HUMANO, ELFO, ENANO, HOBBIT, ORCO, TROLL):");
        String raza = sc.nextLine();

        try {
            System.out.println("¿Quieres especificar las características físicas? (S/N):");
            String opcion = sc.nextLine();

            Personaje personaje;

            if (opcion.equalsIgnoreCase("S")) {
                System.out.println("Introduce fuerza:");
                int fuerza = sc.nextInt();
                System.out.println("Introduce agilidad:");
                int agilidad = sc.nextInt();
                System.out.println("Introduce constitución:");
                int constitucion = sc.nextInt();

                personaje = new Personaje(nombre, raza, fuerza, agilidad, constitucion);
            } else {
                personaje = new Personaje(nombre, raza);
            }

            personaje.mostrar();

        } catch (PersonajeNoValido e) {
            System.out.println("Error al crear personaje: " + e.getMessage());
        }
    sc.close();
    }   
}
