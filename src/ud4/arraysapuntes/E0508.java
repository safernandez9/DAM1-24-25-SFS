package ud4.arraysapuntes;

import java.util.Arrays;

/**
 * E0507. Implementar la función int[] sinRepetidos(int t[]) que construye y
 * devuelve una tabla de la longitud apropiada, con los elementos de t, donde se han
 * eliminado los datos repetidos.
 * Implementa una función que genere y devuelva un array de n números enteros aleatorios
 * usando el siguiente prototipo:
 * int[] tablaRandom(int n)
 */

public class E0508 {
    public static void main(String[] args) {
        int[] t = {5, 2, 7, 9, 4, 1, 8, 5, 4, 2, 8};

        int[] pares = new int[0];
        int[] impares = new int[0];

        for (int e : t) {
            if (e % 2 == 0) {
                pares = Arrays.copyOf(pares, pares.length + 1);
                pares[pares.length - 1] = e;
            } else {
                impares = Arrays.copyOf(impares, impares.length + 1);
                impares[impares.length - 1] = e;
            }
        }

        Arrays.sort(pares);
        Arrays.sort(impares);

        System.out.println(Arrays.toString(t));
        System.out.println(Arrays.toString(pares));
        System.out.println(Arrays.toString(impares));
    }
}
