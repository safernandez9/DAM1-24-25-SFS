package ud2.ejerciciosbucles;

import java.util.Scanner;

/**
 * E0306. Escribir una aplicación para aprender a contar, que pedirá un número n y mostrará
 * todos los números del 1 al n.
 */

public class E0306 {
    public static void main(String[] args) {
        System.out.print("Número: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();


        for(int i = 1; i <= n; i++) {
            System.out.println(i);
        }
            
    }
}
