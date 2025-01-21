package ud4.arraysapuntes;

import java.util.Random;

public class E0501 {
    public static void main(String[] args) {
        // Crea una tabla de longitud 10 que se inicializará con números aleatorios comprendidos entre 1 y 100.
        int[] t = arrayAleatorio(10, 1, 100);
        // Muestra la suma de todos los números aleatorios que se guardan en la tabla.
        System.out.println("La suma es " + sumar(t));
    
    }

    public static int[] arrayAleatorio(int n, int rndInicio, int rndFin) {
        int[] t = new int[n];
        Random rnd = new Random();

        for(int i = 0; i < n; i++) {
            t[i] = rnd.nextInt(rndFin - rndInicio + 1) + rndInicio; 
        }

        return t;        
    }

    public static int sumar(int[] t) {
        int suma = 0;
        for (int i : t) {
            suma += i;
        }
        return suma;
    }
}
