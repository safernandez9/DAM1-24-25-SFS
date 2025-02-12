package ud4.stringsapuntes;

import java.util.Scanner;

/**
 * E0603. Diseñar el juego de “Acierta la contraseña”, que funciona así: un primer jugador
 * introduce una contraseña. A continuación, un segundo jugador debe teclear palabras
 * hasta que acierte.
 * Prueba variaciones del programa:
 * 1. ignorando la diferencia entre mayúsculas y minúsculas
 * 2. Añadiendo un número máximo de intentos para acertar
 * 3. ec
 */

public class E0603 {
    public static void main(String[] args) {
        int MAX_INTENTOS = 3;
        int intentos = 0;
        Scanner sc = new Scanner(System.in);
        // LECTURA DE LA CONTRASEÑA
        System.out.println("Introduzca la contraseña: ");
        String password = sc.nextLine();

        // Imprime líneas en blandco para "ocultar" la contraseña
        for (int i = 0; i < 50; i++)
            System.out.println();

        // LECTURA DE LOS INTENTOS
        System.out.println(
                "Introduzca la contraseña repetidamente hasta acertar (máximo " + MAX_INTENTOS + " intentos): ");
        String passwordJugador;
        do {
            passwordJugador = sc.nextLine();
            intentos++;
        } while (!password.equalsIgnoreCase(passwordJugador) && intentos < MAX_INTENTOS);

        if (password.equals(passwordJugador))
            System.out.println("Enhorabuena! Acertaste la contraseña!!");
        else
            System.out.println("Lo sentimos! Agotaste el número máximo de intentos");
        sc.close();
    }
}
