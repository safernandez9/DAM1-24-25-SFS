package ud4.stringsapuntes;

import java.util.Scanner;

/**
 * E0609. Introducir por teclado una frase, palabra a palabra, y mostrar la frase completa
 * separando las palabras introducidas con espacios en blanco. Terminar de leer la frase
 * cuando alguna de las palabras introducidas sea la cadena “fin” escrita con cualquier
 * combinación de mayúsculas y minúsculas. La cadena “fin” no aparecerá en la frase final.
 */

public class E0609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "";
        System.out.println("Introduzca palabras separadas por ENTER para componer una frase. \"Fin\" para terminar: ");
        // Lectura anticipada
        String palabra = sc.nextLine();
        while (!palabra.toUpperCase().equals("FIN")) {
            if (!palabra.isEmpty())
                frase += palabra + " ";
            // Leer siguiente palabra
            palabra = sc.nextLine();
        }

        frase = frase.stripTrailing();

        System.out.println(frase);

        sc.close();
    }
}
