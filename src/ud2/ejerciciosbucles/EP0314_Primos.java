/*EP0314_Primos. Realiza un programa que nos pida un número n, y nos diga cuántos
números hay entre 1 y n que sean primos. Un número primo es aquel mayor que 1 y que
solo es divisible por 1 y por él mismo. 
*/

//NO ACABADO
package ud2.ejerciciosbucles;

import java.util.Scanner;
import java.lang.Math;

public class EP0314_Primos {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        int num, i;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduzca un número mayor que 1: ");
            num = sc.nextInt();
        } while (num == 0 || num == 1);

        sc.close();

        
        for (i = 2; i <= num; i++) {
            for (int j = 2; i <= Math.sqrt(i); i++) {
                if (num % i == 0) {
                    System.out.printf("%d no es primo.");
                }
            }
        }
    }
}