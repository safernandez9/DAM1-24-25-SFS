package ud4.stringsapuntes;

import java.util.Scanner;

/**
 * E0611. Se dispone de los siguientes conjuntos de letras:
 * conjunto 1:
 * e i k m p q r s t u v
 * conjunto 2:
 * p v i u m t e r k q s
 * Con esta información es posible codificar un texto, convirtiendo cada letra del conjunto 1
 * en su correspondiente del conjunto 2. El resto de las letras no se modifican. Los conjuntos
 * se utilizan tanto para codificar mayúsculas como minúsculas, mostrando siempre el
 * resultado de la codificación en minúsculas. 
 * Un ejemplo: la palabra "PaquiTo" se codifica como "matqvko".
 *  Realizar un programa que codifique un texto. Para ello implementar una de las siguientes
 * funciones:
 * static char codifica(char conjunto1[],char conjunto2[], char c)
 * static char codifica(String conjunto1,String conjunto2, char c)
 * que devuelve el carácter c codificado según los conjuntos 1 y 2 que se le pasan.
 * Implementa también uno de los siguientes métodos para codificar una palabra o frase
 * entera:
 * static String codifica(char[] conjunto1, char[] conjunto2, String palabra)
 * static String codifica(String conjunto1, String conjunto2, String palabra)
 * Crea un programa principal o tests unitarios para probar los métodos anteriore
 */

public class E0611 {
    public static void main(String[] args) {
        String conjunto1 = "eikmpqrstuv";
        String conjunto2 = "pviumterkqs";

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase para codificar: ");
        String frase = sc.nextLine();

        String fraseCodificada = codifica(conjunto1, conjunto2, frase);
        System.out.println(fraseCodificada);

        String fraseCodificada2 = codifica(conjunto1.toCharArray(), conjunto2.toCharArray(), frase);
        System.out.println(fraseCodificada2);

        sc.close();
    }

    static char codifica(char[] conjunto1, char[] conjunto2, char c) {
        return ' ';
    }

    static char codifica(String conjunto1, String conjunto2, char c) {
        return ' ';
    }

    static String codifica(char[] conjunto1, char[] conjunto2, String frase) {
        // FALLA: Puede sustituir algunas letras varias veces
        frase = frase.toLowerCase();
        for (int i = 0; i < conjunto1.length; i++) {
            frase = frase.replace(conjunto1[i], conjunto2[i]);
        }
        return frase;
    }

    static String codifica(String conjunto1, String conjunto2, String frase) {
        String fraseCodificada = "";

        for (int i = 0; i < frase.length(); i++) {
            char letraActual = Character.toLowerCase(frase.charAt(i));
            int posicion = conjunto1.indexOf(letraActual);
            if (posicion == -1)
                fraseCodificada += letraActual;
            else
                fraseCodificada += conjunto2.charAt(posicion);
        }
        return fraseCodificada;
    }

}
