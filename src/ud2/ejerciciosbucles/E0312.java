package ud2.ejerciciosbucles;

import java.util.Scanner;

/**
 * E0312. Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
 */

public class E0312 {
    public static void main(String[] args) {
        final int NUM_ALUMNOS = 5;
        boolean haySuspensos = false;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= NUM_ALUMNOS; i++) {
            System.out.print("Escribe la nota del alumno " + i + ": ");
            int nota = sc.nextInt();
            if (nota < 5)
                haySuspensos = true;
        }
        sc.close();

        if (haySuspensos) {
            System.out.println("Hubo suspensos... :(");
        } else {
            System.out.println("Ningún suspenso!!! :)");
        }

    }
}
