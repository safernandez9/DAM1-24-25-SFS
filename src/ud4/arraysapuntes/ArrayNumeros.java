package ud4.arraysapuntes;

import java.util.Scanner;

/**
 * ArrayNumeros. Introduce un número n por teclado. A continuación, solicita al usuario que teclee n
 * números y almacénalos en un array. A continuación realiza y muestra la media de los números
 * positivos, la media de los negativos y cuenta el número de ceros introducidos.
 */

public class ArrayNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        // Lee n números y los guarda en el array
        System.out.println("Escribe " + n + " números enteros");
        leerNumeros(numeros);
        
        // Procesar datos
        int sumaPos = 0, contPos = 0, sumaNeg = 0, contNeg = 0, contCeros = 0;
        for(int i = 0; i < n; i++) {
            if (numeros[i] > 0) {
                contPos++;
                sumaPos += numeros[i];
            } else if (numeros[i] < 0) {
                contNeg++;
                sumaNeg += numeros[i];
            } else {
                contCeros++;
            }
        }

        // Mostrar resultados
        System.out.println("Media de números positivos: " + sumaPos / contPos); // División entera sin decimales
        System.out.println("Media de números negativos: " + sumaNeg / contNeg); // División entera sin decimales
        System.out.println("Número de ceros: " + contCeros);

        sc.close();
    }
        
        private static void leerNumeros(int[] t) {
            Scanner sc = new Scanner(System.in);
            for(int i = 0; i < t.length; i++) {
                t[i] = sc.nextInt();
            }
            sc.close();
        }
}
