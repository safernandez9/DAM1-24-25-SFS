package ud4.stringsapuntes;

import java.util.Arrays;
import java.util.Scanner;

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
    }

    private static boolean esPalindromo(String frase) {
        String fraseSinEspacios = sinEspacios(frase);
        String fraseInvertidaSinEspacios = invertirSinEspacios(frase);

        return fraseSinEspacios.equalsIgnoreCase(fraseInvertidaSinEspacios);
    }

    static String invertirSinEspacios(String frase) {
        String fraseInvertida = "";
        for (int i = frase.length() - 1; i >=0 ; i--) {
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

        for (int i = 0; i < frase.length() ; i++) {
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
