package ud2.ejemplos;

import java.util.Scanner;

public class EjemploBuclesAnidados2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas;
        // leer número de filas del cuadrado
        do {
            System.out.print("Introduce número de filas del cuadrado: ");
            filas = sc.nextInt();
        } while (filas < 2);
        sc.close();

        for (int i = 1; i <= filas; i++) { // filas
            for (int j = 1; j <= filas; j++) { // columnas = filas
                System.out.print((int)(Math.random() * 10) + " ");
            } // fin del for para las columnas
            System.out.println();
        } // fin del for para las filas
    }
}
