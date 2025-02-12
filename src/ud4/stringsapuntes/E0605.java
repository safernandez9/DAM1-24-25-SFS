package ud4.stringsapuntes;

import java.util.Scanner;

/**
 * E0605. Diseña una función a la que se le pase una cadena de caracteres y la devuelva
 * invertida. Por ejemplo: la cadena “Hola mundo” se devolvería como “odnum aloH”.
 * Puedes implementar un método con el siguiente prototipo:
 * static String invertirCadena(String cad)
 */

public class E0605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase: ");
        String frase = sc.nextLine();

        String fraseInvertida = invertirCadena(frase);
        System.out.println(fraseInvertida);
        sc.close();
    }

    static String invertirCadena(String frase) {
        String fraseInvertida = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida += frase.charAt(i);
        }

        return fraseInvertida;
    }
}
