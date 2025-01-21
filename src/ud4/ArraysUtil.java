package ud4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysUtil {

    /**
     * Genera y devuelve un array de n números aleatorios entre -9 y 9, incluyendo el 0.
     * @param n
     * @return
     */
    static int[] arrayAleatorio(int n) {
        int[] t = new int[n];
        Random rnd = new Random();

        for(int i = 0; i < n; i++) {
            t[i] = rnd.nextInt(19) - 9; // Asigna un número entre -9 y 9
        }

        return t;
    }

    /**
     * Genera y devuelve un array de n números aleatorios entre un número de inicio y uno de fin.
     * @param n
     * @param rndInicio
     * @param rndFin
     * @return
     */
    public static Integer[] arrayAleatorio(int n, int rndInicio, int rndFin) {
        Integer[] t = new Integer[n];
        Random rnd = new Random();

        for(int i = 0; i < n; i++) {
            t[i] = rnd.nextInt(rndFin - rndInicio + 1) + rndInicio; 
        }

        return t;        
    }
    
    /**
     * Rellena una tabla con números enteros leídos de teclado.
     * @param t
     */
    public static void leerNumeros(int[] t) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }
        sc.close();
    }    

    /**
     * Crea y devuelve una tabla ordenada de la longitud especificada rellena con números pares aleatorios en el rango desde 2 hasta el valor de fin inclusive.
     * @param longitud
     * @param fin
     * @return
     */
    static int[] rellenaPares(int longitud, int fin) {
        int[] t = new int[longitud];

        for(int i = 0; i < t.length; i++) {
            Random rnd = new Random();
            do
                t[i] = rnd.nextInt(2, fin + 1);
            while (t[i] % 2 != 0);
        }

        Arrays.sort(t);

        return t;
    }


    /**
     * Cuenta las apariciones de un número (clave) en un array de enteros
     * @param t
     * @param clave
     * @return
     */
    public static int contar(int t[], int clave) {
        int contar = 0;

        for (int i = 0; i < t.length; i++)
            if (t[i] == clave)
                contar++;

        return contar;
    } 

    /**
     * 
     * @param t
     * @param clave
     * @return
     */
    static int buscar(int t[], int clave) {
        for(int i = 0; i < t.length; i++)
            if (t[i] == clave)
                return i;
        return -1;
    }

    /**
     * Suma los elementos de un array de enteros
     * @param t
     * @return
     */
    public static int sumar(int[] t) {
        int suma = 0;
        for (int i : t) {
            suma += i;
        }
        return suma;
    }

    public static Integer maximo(int t[]) {
        if (t == null || t.length == 0)
            return null;

        Integer maximo = t[0];

        for(int i = 1; i < t.length; i++)
            if (t[i] > maximo)
                maximo = t[i];

        return maximo;
    }

}
