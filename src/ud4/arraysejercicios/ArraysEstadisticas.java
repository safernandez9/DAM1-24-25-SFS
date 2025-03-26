package ud4.arraysejercicios;

import java.util.Arrays;

/**
 * static int suma(int[] numeros)
 * Devuelve la suma de los elementos del array.
 * 
 * static int minimo(int[] numeros)
 * Devuelve el valor mínimo contenido en el array.
 * 
 * static int maximo(int[] numeros)
 * Devuelve el valor máximo contenido en el array.
 * 
 * static double media(int[] numeros)
 * Devuelve la media aritmética de los elementos del array, es decir, el
 * promedio del conjunto de valores que
 * contiene.
 * 
 * static double mediana(int[] numeros)
 * Devuelve la mediana de los elementos del array.
 * La mediana en un conjunto de datos ordenados es aquel valor que ocupa la
 * posición central. El array de
 * entrada no se presupone ordenado, por lo que para realizar el cálculo de la
 * mediana será necesario ordenarlo
 * previamente. En caso de que el número de elementos del array sea par y no hay
 * un único elemento central
 * sino dos, la mediana será la media aritmética de los dos valores centrales.
 * 
 * static int moda(int[] numeros)
 * Devuelve la moda de los elementos del array.
 * La moda es el valor que aparece con mayor frecuencia en un conjunto de datos,
 * es decir, el que más veces
 * se repite. En caso de que el array de entrada contenga dos o más modas,
 */

public class ArraysEstadisticas {

    public static void main(String[] args) {
        // Declaración de variables y constantes
        int[] numeros1 = { 2, 4, 6, 7, 4, 7, 9, 2, 5, 6, 7 };
        int[] numeros2 = { 2, 4, 6, 7, 4, 9, 2, 5, 6, 7 };
        // Proceso y salida
        imprimeEstadisticas(numeros1);
        imprimeEstadisticas(numeros2);
    }

    static void imprimeEstadisticas(int[] numeros) {
        System.out.println("ARRAY ORIGINAL: " + Arrays.toString(numeros));
        System.out.println("---------------------------------------------");
        System.out.println("Longitud: " + numeros.length);
        System.out.println("Suma: " + suma(numeros));
        System.out.println("Máximo: " + maximo(numeros));
        System.out.println("Mínimo: " + minimo(numeros));
        System.out.println("Media: " + media(numeros));
        System.out.println("Mediana: " + mediana(numeros));
        System.out.println("Moda: " + moda(numeros));
        Arrays.sort(numeros);
        System.out.println("ARRAY ORDENADO: " + Arrays.toString(numeros));
        System.out.println("---------------------------------------------\n\n");
    }

    static int suma(int[] numeros) {

        int suma = 0;

        for (int n : numeros) {
            suma += n;
        }

        return suma;
    }

    static int minimo(int[] numeros) {

        int minimo = numeros[0];

        for (int i : numeros) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        return minimo;
    }

    static int maximo(int[] numeros) {

        int maximo = numeros[0];

        for (int i : numeros) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        return maximo;
    }

    static double media(int[] numeros) {

        return ((double) suma(numeros) / numeros.length);
    }

    static double mediana(int[] numeros) {

        double mediana;
        int[] copia;

        copia = Arrays.copyOf(numeros, numeros.length);
        Arrays.sort(copia);

        if (copia.length % 2 == 0) {
            mediana = (double) (copia[copia.length / 2 - 1] + copia[copia.length / 2]) / 2;
        } else {
            mediana = copia[copia.length / 2];
        }

        return mediana;
    }

    static int moda(int[] numeros) {

        int moda = numeros[0];
        int cont = 0;
        int contModa = 0;
                return contModa;
        
       

    }
}
