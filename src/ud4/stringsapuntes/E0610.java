package ud4.stringsapuntes;

import java.util.Arrays;
import java.util.Scanner;


/**
 * E0610. Realizar un programa que lea una frase del teclado y nos indique si es
 * palíndroma, es decir, que la frase sea igual leyendo de izquierda a derecha, que de
 * derecha a izquierda, sin tener en cuenta los espacios. Un ejemplo de frase palíndroma es:
 * “Dábale arroz a la zorra el abad”
 * Las vocales con tilde hacen que los algoritmos consideren una frase palindroma como si
 * no lo fuese. Por esto, supondremos que el usuario introduce la frase sin tildes.
 * Implementa el siguiente método:
 * public static Boolean esPalindromo(String str)
 * Mejora el método para que se permitan las tildes y la diéresis.
 */

public class E0610 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase: ");
        String frase = sc.nextLine();

        char[] letras = frase.toCharArray();
        System.out.println(Arrays.toString(letras));

        System.out.println(String.valueOf(letras));

        if (esPalindromo(frase))
            System.out.println("Es Palíndromo");
        else
            System.out.println("No es Palíndromo");
        sc.close();
    }

    private static boolean esPalindromo(String frase) {
        String fraseSinEspacios = sinEspacios(frase);
        String fraseInvertidaSinEspacios = invertirSinEspacios(frase);

        return fraseSinEspacios.equalsIgnoreCase(fraseInvertidaSinEspacios);
    }

    static String invertirSinEspacios(String frase) {
        String fraseInvertida = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            char letra = Character.toLowerCase(frase.charAt(i));
            if (letra != ' ') {
                switch (letra) {
                    case 'á' -> letra = 'a';
                    case 'é' -> letra = 'e';
                    case 'í' -> letra = 'i';
                    case 'ó' -> letra = 'o';
                    case 'ú' -> letra = 'u';
                }
                fraseInvertida += letra;
            }

        }
        return fraseInvertida;
    }

    static String sinEspacios(String frase) {
        String fraseSinEspacios = "";

        for (int i = 0; i < frase.length(); i++) {
            char letra = Character.toLowerCase(frase.charAt(i));
            if (letra != ' ') {
                switch (letra) {
                    case 'á' -> letra = 'a';
                    case 'é' -> letra = 'e';
                    case 'í' -> letra = 'i';
                    case 'ó' -> letra = 'o';
                    case 'ú' -> letra = 'u';
                }
                fraseSinEspacios += letra;
            }
        }
        return fraseSinEspacios;
    }

}
