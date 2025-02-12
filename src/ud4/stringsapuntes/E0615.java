package ud4.stringsapuntes;

import java.util.Random;
import java.util.Scanner;

/**
 * E0615. Modificar la Actividad E0614 para que el programa indique al jugador 2 cuántas
 * letras coinciden (son iguales y están en la misma posición) entre el texto introducido por
 * él y el original.
 */

public class E0615 {
    public static void main(String[] args) {
        // Leer Palabra Original
        Scanner sc = new Scanner(System.in);
        System.out.print("Jugador 1: Introduzca una palabra: ");
        String palabra;
        do {
            palabra = sc.nextLine();
        } while (palabra.isEmpty());

        // Generar Anagrama
        char[] letras = palabra.toCharArray();
        for (int i = 0; i < letras.length; i++) {
            Random rnd = new Random(0);
            int nuevaPosicion = rnd.nextInt(letras.length);
            char letra = letras[nuevaPosicion];
            letras[nuevaPosicion] = letras[i];
            letras[i] = letra;
        }
        String anagrama = String.valueOf(letras);
        System.out.println("Anagrama: " + anagrama);

        // System.out.println(E0612.sonAnagrama(palabra, anagrama));

        // El jugador 2 debe adivinar la palabra
        final int MAX_INTENTOS = 3;
        int intentos = 0;
        String palabraJ2;
        do {
            System.out.println(
                    "Jugador 2: Adivina la palabra original. Te quedan " + (MAX_INTENTOS - intentos) + " intentos.");
            palabraJ2 = sc.nextLine();
            intentos++;

            int coincidencias = contarCaracteresIguales(palabra, palabraJ2);
            System.out.println("Caracteres que coinciden en el mismo lugar: " + coincidencias);

        } while (!palabraJ2.equalsIgnoreCase(palabra) && intentos < MAX_INTENTOS);

        if (palabraJ2.equalsIgnoreCase(palabra)) {
            System.out.println("Enhorabuena!! Has acertado en " + intentos + " intentos.");
        } else {
            System.out.println("No has acertado!! y has consumido tus " + intentos + " intentos.");
        }
        sc.close();
    }

    private static int contarCaracteresIguales(String palabra, String palabraJ2) {
        int coincidencias = 0;
        int repeticiones = Math.min(palabra.length(), palabraJ2.length());
        for (int i = 0; i < repeticiones; i++) {
            if (palabra.charAt(i) == palabraJ2.charAt(i)) {
                coincidencias++;
            }
        }
        return coincidencias;
    }

}
