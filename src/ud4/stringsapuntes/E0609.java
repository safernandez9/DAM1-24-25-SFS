package ud4.stringsapuntes;

import java.util.Scanner;

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

    }
}
