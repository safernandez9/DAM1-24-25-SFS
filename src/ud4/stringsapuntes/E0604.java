package ud4.stringsapuntes;

import java.util.Scanner;

/**
 * E0604. Diseña una aplicación que pida al usuario que introduzca una frase por teclado e
 * indique cuántos espacios en blanco tiene.
 * Implementa un método con el siguiente prototipo:
 * static int contarEspacios(String cad)
 */

public class E0604 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase: ");
        String frase = sc.nextLine();
        System.out.println("Las frase tiene " + contarEspacios(frase) + " espacios");

        sc.close();
    }

    static int contarEspacios(String cad) {
        int contEspacios = 0;
        for (int i = 0; i < cad.length(); i++) {
            if (Character.isSpaceChar(cad.charAt(i)))
                contEspacios++;
        }
        return contEspacios;
    }
}
