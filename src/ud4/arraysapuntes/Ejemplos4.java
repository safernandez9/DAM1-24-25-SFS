package ud4.arraysapuntes;

import java.util.Arrays;

public class Ejemplos4 {
    public static void main(String[] args) {
        int[] t = new int[100];

        Arrays.fill(t, 7);
        Arrays.fill(t, 50, 60, 5);
        for(int i = 20; i < 30; i++)
            t[i] = 2;

        // Sintaxis for-each para obtener la suma
        int suma = 0;
        for(int numero : t) {
            suma += numero;
            numero = 1;
        }
        System.out.println("Suma: " + suma);
        
        System.out.println(Arrays.toString(t));
    }
}
