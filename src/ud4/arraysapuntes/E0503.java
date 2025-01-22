package ud4.arraysapuntes;

import java.util.Arrays;

/**
 * E0503. Escribir un programa que solicite al usuario cuántos números desea introducir. A
 * continuación introducir por teclado esa cantidad de números enteros. Por último, mostrar
 * los números en el orden inverso al introducido. 
 */

public class E0503 {
    public static void main(String[] args) {
        int[] t = E0501.arrayAleatorio(5, -10, 10);        

        System.out.println(Arrays.toString(t));

        for(int i = t.length - 1; i >= 0; i--)
            System.out.print(t[i] + " ");
        System.out.println();
    }


}
