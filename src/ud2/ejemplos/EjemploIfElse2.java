/*
 * Programa que pide un número por teclado y muestra si es par o impar                                      
 */

package ud2.ejemplos;

import java.util.*;

public class EjemploIfElse2 {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número entero: ");
        num = sc.nextInt();
        sc.close();
        
        if (num % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }
}