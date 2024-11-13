package ud2.ejerciciosbucles;

import java.util.Scanner;

/**
 * E0311. Pedir un número y calcular su factorial. Por ejemplo el factorial de 5 se denota 5! y
 * es igual a 5 x 4 x 3 x 2 x 1 = 120.
 */

public class E0311_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int n = sc.nextInt();
        sc.close();

        int factorial = 1;
        for (int i = n; i > 1; i--){
            factorial *= i;
        }

        System.out.printf("El factorial de %s es %s %n", n, factorial);

    }
}
