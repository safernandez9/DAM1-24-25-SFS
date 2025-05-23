package ud4.arraysapuntes;

import java.util.Arrays;

/**
 * E0502. Diseña un programa que solicite al usuario que introduzca por teclado 5 números
 * decimales. A continuación muestra los números en el mismo orden en que se han
 * introducido.
 */

public class E0502 {
    public static void main(String[] args) {
        int[] t = E0501.arrayAleatorio(5, -10, 10);

        System.out.println(Arrays.toString(t));

        for (int e : t)
            System.out.print(e + " ");
        System.out.println();

        for(int i = 0; i < t.length; i++) 
            System.out.print(t[i] + " ");
        System.out.println();        
    }
}
