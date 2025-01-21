package ud4.arraysapuntes;

import java.util.Random;

public class FuncionBuscar {
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
    
    static int contar(int t[], int clave) {
        int contar = 0;

        for (int i = 0; i < t.length; i++)
            if (t[i] == clave)
                contar++;

        return contar;
    }    

    public static void main(String[] args) {
        int[] numeros;
        numeros = arrayAleatorio(100);

        int pos = buscar(numeros, 5);

        System.out.println("En el array de números hay " + contar(numeros, 5) + " cincos.");

        if (pos != -1)
            System.out.println("Hay un 5 en la posición " + pos);
        else
            System.out.println("No hay ningún 5");

    }
}
