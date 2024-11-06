package ud2;

public class Util {

    /**
     * esPar:
     * Comprueba si un número es par o no.
     */
    static boolean esPar(int num) {
        return (num % 2 == 0);
    }

    /**
     * esMayor:
     * Devuelve el mayor de dos números diferentes.
     */
    static int esMayor(int a, int b) {
        return (a > b ? a : b);
    }

    /**
     * esCasiCero:
     * Comprueba si un número es casi-cero o no. Un número casi-cero es
     * aquel, positivo o negativo (distinto de 0), que se acercan a 0 por
     * menos de 1 unidad.
     */
    static boolean esCasiCero(int num) {
        return true;
    }

    /**
     * esBisiesto
     * Comprueba si un año es bisiesto o no.
     */
    static boolean esBisiesto(int anho) {
        return (anho % 4 == 0 && anho % 100 != 0) || (anho % 4 == 0 && anho % 100 == 0 && anho % 400 == 0);
    }
}
