package ud2.ejercicioscondicionales;

import java.util.Scanner;

/**
 * E0203. Solicitar dos números distintos y mostrar cuál es el mayor.
 */

public class E0203 {
    public static void main(String[] args) {
        // Declaración de variables y constantes
        int num1, num2;

        // Entrada de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        num1 = sc.nextInt();
        System.out.println("Introduce otro número entero distinto:");
        num2 = sc.nextInt();
        sc.close();

        // Proceso y Salida
        if (num1 == num2) {
            System.out.println("son iguales, te pedí números distintos....");
        } else {
            // Imprime el mayor
            if (num1 > num2) {
                System.out.println(num1 + " es el mayor.");
            } else {
                System.out.println(num2 + " es el mayor.");
            }
        }
        System.out.println("Fin del programa");
    }

}
