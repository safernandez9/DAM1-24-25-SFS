package ud4.arraysapuntes;

import java.util.Random;

public class BuscarUltimo {
    /**
     * 
     * @param t
     * @param clave
     * @return
     */
    static int buscarUltimo(int t[], int clave) {
        for(int i = t.length - 1; i >= 0; i--)
            if (t[i] == clave)
                return i;
        return -1;
    }

    static int buscarDesde(int t[], int clave, int pos) {
        for(int i = pos; i < t.length; i++)
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


    public static void main(String[] args) {
        int[] numeros;
        numeros = arrayAleatorio(100);

        int pos = buscarUltimo(numeros, 5);

        if (pos != -1)
            System.out.println("Hay un 5 en la posición " + pos);
        else
            System.out.println("No hay ningún 5");

    }
}
