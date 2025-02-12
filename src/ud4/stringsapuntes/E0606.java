package ud4.stringsapuntes;

import java.util.Scanner;

/**
 * E0606. Escribir un programa que pida el nombre completo al usuario y lo muestre sin
 * vocales (mayúsculas, minúsculas y acentuadas). Por ejemplo, “Álvaro Pérez” quedaría
 * como “lvr Prz”.
 * Implementa un método con el siguiente prototipo:
 * static String sinVocales(String cad)
 */

public class E0606 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un nombre: ");
        String nombre = sc.nextLine();

        System.out.println(sinVocales(nombre));
        sc.close();
    }

    static String sinVocales(String cad) {
        String sinVocales = "";
        String vocales = "aeiouáéíóúAEIOUÁÉÍÓÚüÜ";

        for (int i = 0; i < cad.length(); i++) {
            char ch = cad.charAt(i);
            if (vocales.indexOf(ch) == -1) { // Si no es vocal...
                // ... lo añado al resultado
                sinVocales += ch;
            }
        }

        return sinVocales;
    }
}
