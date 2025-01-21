package ud4.arraysapuntes;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import ud4.ArraysUtil;

public class EjemplosOrdenar {

    public static void burbuja(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }

    public static void seleccion(int A[]) {
        int i, j, menor, pos, tmp;
        for (i = 0; i < A.length - 1; i++) { // tomamos como menor el primero
            menor = A[i]; // de los elementos que quedan por ordenar
            pos = i; // y guardamos su posición
            for (j = i + 1; j < A.length; j++) { // buscamos en el resto
                if (A[j] < menor) { // del array algún elemento
                    menor = A[j]; // menor que el actual
                    pos = j;
                }
            }
            if (pos != i) { // si hay alguno menor se intercambia
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }
    }

    public static void insercionDirecta(int A[]) {
        int p, j;
        int aux;
        for (p = 1; p < A.length; p++) { // desde el segundo elemento hasta
            aux = A[p]; // el final, guardamos el elemento y
            j = p - 1; // empezamos a comprobar con el anterior
            while ((j >= 0) && (aux < A[j])) { // mientras queden posiciones y el
                                               // valor de aux sea menor que los
                A[j + 1] = A[j]; // de la izquierda, se desplaza a
                j--; // la derecha
            }
            A[j + 1] = aux; // colocamos aux en su sitio
        }
    }

    public static void quicksort(int A[], int izq, int der) {
        int pivote = A[izq]; // tomamos primer elemento como pivote
        int i = izq; // i realiza la búsqueda de izquierda a derecha
        int j = der; // j realiza la búsqueda de derecha a izquierda
        int aux;

        while (i < j) { // mientras no se crucen las búsquedas
            while (A[i] <= pivote && i < j)
                i++; // busca elemento mayor que pivote
            while (A[j] > pivote)
                j--; // busca elemento menor que pivote
            if (i < j) { // si no se han cruzado
                aux = A[i]; // los intercambia
                A[i] = A[j];
                A[j] = aux;
            }
        }

        A[izq] = A[j]; // se coloca el pivote en su lugar de forma que tendremos
        A[j] = pivote; // los menores a su izquierda y los mayores a su derecha

        if (izq < j - 1)
            quicksort(A, izq, j - 1); // ordenamos subarray izquierdo
        if (j + 1 < der)
            quicksort(A, j + 1, der); // ordenamos subarray derecho
    }

    public static void mergesort(int A[], int izq, int der) {
        if (izq < der) {
            int m = (izq + der) / 2;
            mergesort(A, izq, m);
            mergesort(A, m + 1, der);
            merge(A, izq, m, der);
        }
    }

    public static void merge(int A[], int izq, int m, int der) {
        int i, j, k;
        int[] B = new int[A.length]; // array auxiliar
        for (i = izq; i <= der; i++) // copia ambas mitades en el array auxiliar
            B[i] = A[i];

        i = izq;
        j = m + 1;
        k = izq;

        while (i <= m && j <= der) // copia el siguiente elemento más grande
            if (B[i] <= B[j])
                A[k++] = B[i++];
            else
                A[k++] = B[j++];

        while (i <= m) // copia los elementos que quedan de la
            A[k++] = B[i++]; // primera mitad (si los hay)
    }

    public static void main(String[] args) {
        Integer[] t = ArraysUtil.arrayAleatorio(100, 1, 100);

        System.out.println(Arrays.toString(t));

        // ALGORITMOS DE ORDENACIÓN CLÁSICOS
        //burbuja(t, 0, t.length - 1);
        //seleccion(t, 0, t.length - 1);
        //insercionDirecta(t, 0, t.length - 1);
        //quicksort(t, 0, t.length - 1);
        //mergesort(t, 0, t.length - 1);

        // Método sort() de la clase Arrays
        Arrays.sort(t);

        // Método sort() sobrecargado para ordenar en orden inverso.
        // Requiere usar el método reverseOrder() de la clase Collections como segundo parámetro
        // Requiere que los elementos del array a ordenar NO sean de tipo primitivo (SÍ clases envolventes)
        //Arrays.sort(t, Collections.reverseOrder());

        System.out.println(Arrays.toString(t));

        Scanner sc = new Scanner(System.in);
        System.out.print("Número a buscar: ");
        int clave = sc.nextInt();

        int pos = Arrays.binarySearch(t, clave);

        if (pos >= 0) {
            System.out.println("El número está en la posición: " + pos);
        } else {
            System.out.println("El número no se encuentra. Debería insertarse en la posición ... " + (-pos -1));
        }
        

    }
}
