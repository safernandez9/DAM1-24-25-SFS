package ud2.ejercicioscondicionales;

import java.util.Scanner;

/**
 * E0209. Escribir una aplicación que indique cuántas cifras tiene un número entero
 * introducido por teclado, que estará comprendido entre 0 y 99999.
 *  Realiza una versión del programa anterior para que indique cuantes cifras tiene un
 * número comprendido entre -99999 y 99999.
 */

public class E0209 {
    public static void main(String[] args) {
        int numero;
        int cifras = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número entre -99999 y 99999: ");
        numero = Math.abs(sc.nextInt());
        sc.close();

        if (numero / 10000 > 0) {
            cifras = 5;
        } else if (numero / 1000 > 0) {
            cifras = 4;
        } else if (numero / 100 > 0) {
            cifras = 3;
        } else if (numero / 10 > 0) {
            cifras = 2;
        }

        System.out.println("Número de cifras: " + cifras);

    }
}
