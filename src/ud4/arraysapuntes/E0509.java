package ud4.arraysapuntes;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * E0509. Diseña una aplicación para gestionar un campeonato de programación donde se
 * introduce la puntuación obtenida por 5 programadores, conforme van terminando la
 * prueba, en forma de números enteros. La aplicación debe mostrar las puntuaciones
 * ordenadas de los 5 participantes. En ocasiones, cuando finalizan los 5 participantes
 * anteriores, se suman al campeonato programadores de exhibición cuyas puntuaciones se
 * incluyen con el resto. La forma de especificar que no intervienen más programadores de
 * exhibición es introducir como puntuación un -1. Por último, la aplicación debe mostrar los
 * puntos ordenados de todos los participantes.
 */

public class E0509 {
    public static void main(String[] args) {
        final int NUM = 5;
        Scanner sc = new Scanner(System.in);
        Double[] puntuaciones = new Double[NUM];

        System.out.println("Introduce las puntuaciones de l@s " + NUM + " programador@s.");
        for (int i = 0; i < NUM; i++) {
            puntuaciones[i] = sc.nextDouble();
        }

        Arrays.sort(puntuaciones, Collections.reverseOrder());
        System.out.println("Mejores puntuaciones: " + Arrays.toString(puntuaciones));

        System.out.println("Introduce las puntuaciones de l@s programador@s de exhibición. Introduce -1 para terminar");
        // Bucle de lectura anticipada
        double nota = sc.nextDouble();
        while (nota != -1) {
            // Proceso: Añadir ordenado
            Double[] tAux = new Double[puntuaciones.length + 1];
            int posicion = Arrays.binarySearch(puntuaciones, nota, Collections.reverseOrder());
            if (posicion < 0)
                posicion = -posicion - 1;
            System.arraycopy(puntuaciones, 0, tAux, 0, posicion);
            tAux[posicion] = nota;
            System.arraycopy(puntuaciones, posicion, tAux, posicion + 1, puntuaciones.length - posicion);
            puntuaciones = tAux;

            // Siguiente lectura
            nota = sc.nextDouble();
        }

        System.out.println("Puntuaciones finales: " + Arrays.toString(puntuaciones));
    }
}
