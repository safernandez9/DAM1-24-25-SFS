package ud4.arraysapuntes;

import java.util.Arrays;

public class E0510 {
    /**
     * Elimina los elementos mayores que un valor de un array de enteros.
     * @param t
     * @param valor
     * @return
     */
    static int[] eliminarMayores(int t[], int valor) {
        // Si el array es nulo devolvemos null.
        if (t == null) {
            return null;
        }

        // Resuelve el problema recorriendo el array inicial y copiando los valores menores o iguales al valor
        int[] aux = new int[0];

        for (int val : t) {
            if (val <= valor) {
                aux = Arrays.copyOf(aux, aux.length + 1);
                aux[aux.length - 1] = val;
            }
        }

        return aux;
    }
}
