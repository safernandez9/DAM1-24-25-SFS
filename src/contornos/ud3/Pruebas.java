package contornos.ud3;

import java.util.Scanner;

public class Pruebas {

    public boolean esNumeroPerfecto(int num) {
        int divisor, sumaDivisores;
        divisor = 1;
        sumaDivisores = 0;

        while (divisor < num / 2) {
            if (num % divisor == 0)
                sumaDivisores = sumaDivisores + divisor;
            divisor++;
        }
        
        if (num == sumaDivisores)
            return true;
        else
            return false;

    }

    // Método que cuente cuántos número de un array de entrada son pares y cuántos
    // son impares
    static int[] contarParesImpares(int[] numeros) {
        // NODO 1
        int contPares = 0;
        int contImpares = 0;

        // NODO 2
        for (int n : numeros) {
            // NODO 3
            if (n % 2 == 0) {
                // NODO 4
                contPares++;
            } else {
                // NODO 5
                contImpares++;
            } // NODO 7
        }

        // NODO 8
        int[] contadores = { contPares, contImpares };
        return contadores;
    }

    // Método que lea 10 números de teclado y muestre cuántos son pares y cuántos
    // son impares
    static void contarParesImpares() {
        // NODO 1
        int contPares = 0;
        int contImpares = 0;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese 10 números: ");

        // NODO 2
        for (int i = 0; i < 10; i++) {
            // NODO 3
            int num = sc.nextInt();
            // NODO 4
            if (num % 2 == 0) {
                // NODO 5
                contPares++;
            } else {
                // NODO 6
                contImpares++;
            } // NODO 7
        }

        // NODO 8
        System.out.printf("Pares: %d\nImpares: %d ", contPares, contImpares);

    }

}
