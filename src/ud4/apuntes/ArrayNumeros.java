package ud4.apuntes;

import java.util.Scanner;

/**
 * ArrayNumeros. Introduce un número n por teclado. A continuación, solicita al
 * usuario que teclee n
 * números y almacénalos en un array. A continuación realiza y muestra la media
 * de los números
 * positivos, la media de los negativos y cuenta el número de ceros introducidos
 */
public class ArrayNumeros {

    public static void main(String[] args) {

        int tamano;
        int contCeros = 0, contNegativos = 0, contPositivos = 0, sumPositivos = 0, sumNegativos = 0;
        float mediaNegativos, mediaPositivos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número:");
        tamano = sc.nextInt();

        int[] numeros = new int[tamano];

        System.out.println("Intoduzca " + tamano + " números:");

        for (int i = 0; i < tamano; i++) {

            numeros[i] = sc.nextInt();

            if (numeros[i] == 0) {
                contCeros++;
            } else if (numeros[i] < 1) {
                sumNegativos += Math.abs(numeros[i]);
                contNegativos++;
            } else {
                sumPositivos += numeros[i];
                contPositivos++;
            }
        }

        sc.close();

        mediaPositivos = (contPositivos > 0) ? ((float) sumPositivos / contPositivos) : 0;
        mediaNegativos = (contNegativos > 0) ? ((float) sumNegativos / contNegativos) : 0;

        System.out.println("La media de números es " + mediaPositivos + ". La media de números negativos es -"
                + mediaNegativos + ". El número de ceros es " + contCeros);
    }

    /**
     * Alternativa de funcion aparte para construir vector
     * 
     * @param t
     */
    /*
     * public void construirArray(int[] numeros){ //Acepta Arrays de cualquier
     * tamaño
     * 
     * Scanner sc = new Scanner(System.in);
     * 
     * for (int i = 0; i < numeros.length; i++) {
     * numeros[i] = sc.nextInt();
     * }
     * 
     * 
     * }
     */
}
