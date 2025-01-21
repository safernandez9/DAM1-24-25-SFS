package ud4.arraysapuntes;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

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
