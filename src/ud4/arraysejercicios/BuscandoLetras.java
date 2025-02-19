package ud4.arraysejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class BuscandoLetras {

    public static void main(String[] args) {

        String conceptos[] = { "Algoritmo",
                "Lenguaje de programación",
                "Entorno de desarrollo",
                "Compilación",
                "Ejecución",
                "Código fuente",
                "Bytecode",
                "Código objeto"
        };

        String fraseAleatoria = fraseAleatoria(conceptos);

        System.out.println(fraseAleatoria);

        Scanner sc = new Scanner(System.in);
        int[] posiciones;
        System.out.println("Escribe letras para comprobar su posición en la frase aleatoria:");
        do {
            char letra = sc.next().charAt(0);
            posiciones = buscarLetra(fraseAleatoria, letra);
            System.out.println("Se encuentra en las posiciones: " + Arrays.toString(posiciones));
        } while (posiciones.length != 0);

        System.out.println("La última letra no aparecía en la frase. FIN.");
        sc.close();
    }

    static int[] buscarLetra(String cadena, char letra) {
        char[] t = cadena.toCharArray();

        int[] posiciones = new int[0];

        for (int i = 0; i < t.length; i++) {
            if (t[i] == letra) {
                posiciones = Arrays.copyOf(posiciones, posiciones.length + 1);
                posiciones[posiciones.length - 1] = i;
            }
        }

        return posiciones;
    }

    static String fraseAleatoria(String[] t) {
        return (t[(int) (Math.random() * t.length)]);
    }

}
