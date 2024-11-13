package ud2.ejercicioscondicionales;

import java.util.Scanner;

/**
 * E0204. Implementar un programa que pida por teclado un número decimal e indique si es un
 * número casi-cero que son aquellos, positivos o negativos, que se acercan a 0 por menos de 1
 * unidad, aunque curiosamente el 0 no se considera un número casi-cero. Ejemplos de númeroscasi-cero son el 0,3, el -0,99 o el 0,123; algunos números que no se consideran casi-ceros son: el
 * 12,3, el 0 o el -1.
 */

public class E0204_CasiCero {

    public static void main(String[] args) {

        double num;

        Scanner sc = new Scanner(System.in);

        System.err.println("Por favor, introduzca un número:");
        num = sc.nextDouble();
        sc.close();

        if (num != 0 && num < 1 && num > -1) {
            System.out.println("El número es casi cero");

        } else {
            System.out.println("El numero no es casi cero");
        }

    }
}