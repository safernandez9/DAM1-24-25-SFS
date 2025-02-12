package ud4.stringsapuntes;

import java.util.Scanner;

/**
 * E0608. Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan
 * siempre comienzan sus frases con “Javalín, javalón”, para después hacer una pausa más
 * o menos larga (la pausa se representa mediante espacios en blanco o tabuladores) y a
 * continuación expresan el mensaje.
 * Existe un dialecto que no comienza sus frases con la muletilla anterior, pero siempre las
 * terminan con un silencio, más o menos prolongado y la coletilla “javalén, len, len”.
 * Se pide diseñar un traductor que, en primer lugar, nos diga si la frase introducida está
 * escrita en el idioma de Javalandia (en cualquiera de sus dialectos), y en caso afirmativo,
 * nos muestre solo el mensaje sin muletillas.
 */

public class E0608 {
    public static void main(String[] args) {
        final String PREFIJO = "Javalín, javalón";
        final String SUFIJO = "javalén, len, len";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase normal o en dialecto: "
                + "que comience por \"" + PREFIJO + "\""
                + "o termine en \"" + SUFIJO + "\".");
        String frase = sc.nextLine();

        if (frase.startsWith(PREFIJO)) {
            System.out.println("La frase está escrita en idioma de Javalandia.");
            String traduccion = frase.substring(PREFIJO.length()).strip();
            System.out.println("Traducción: " + traduccion);
        } else if (frase.endsWith(SUFIJO)) {
            System.out.println("La frase está escrita en dialecto de Javalandia.");
            String traduccion = frase.substring(0, frase.length() - SUFIJO.length()).strip();
            System.out.println("Traducción: " + traduccion);
        }
        sc.close();
    }
}
