/*
 * Programa que pide una nota por teclado y muestra dos mensajes si la nota es                              
 * mayor o igual que 5
 */

package ud2.ejemplos;

import java.util.*;

public class CondicionalSimple1 {
    public static void main(String[] args) {

        int nota;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nota: ");
        nota = sc.nextInt();
        sc.close();

        if (nota >= 5) {// ----------------------inicio de la condición
            System.out.println("Enhorabuena!!");
            System.out.println("Has aprobado");
        } // -------------------------------------fin de la condición
        System.out.println("Hasta Pronto!");
    }
}