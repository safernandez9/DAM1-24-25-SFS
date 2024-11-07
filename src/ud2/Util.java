package ud2;

public class Util {

    /**
     * esPar:
     * Comprueba si un número es par o no.
     * 
     * @param num
     * @return
     */
    static boolean esPar(int num) {
        return (num % 2 == 0);
    }

    /**
     * esMayor:
     * Devuelve el mayor de dos números diferentes.
     * 
     * @param a
     * @param b
     * @return
     */
    static int esMayor(int a, int b) {
        return (a > b ? a : b);
    }

    static float esMayor(float a, float b) {
        return (a > b ? a : b);
    }

    static double esMayor(double a, double b) {
        return (a > b ? a : b);
    }

    /**
     * esCasiCero:
     * Comprueba si un número es casi-cero o no. Un número casi-cero es
     * aquel, positivo o negativo (distinto de 0), que se acercan a 0 por
     * menos de 1 unidad.
     * 
     * @param num
     * @return
     */
    static boolean esCasiCero(double num) {
        return (num > 0 && num < 1) || (num < 0 && num > -1);
    }

    static boolean esCasiCero(float num) {
        return (num > 0 && num < 1) || (num < 0 && num > -1);
    }

    /**
     * esBisiesto
     * Comprueba si un año es bisiesto o no.
     * 
     * @param anho
     * @return
     */
    static boolean esBisiesto(int anho) {
        return (anho % 4 == 0 && anho % 100 != 0) || (anho % 4 == 0 && anho % 100 == 0 && anho % 400 == 0);
    }

    /**
     * numCifras()
     * Función que indique cuántas cifras tiene un número entero
     * 
     * @param nota
     * @return
     */
    static int numCifras(int num) {

        int cifras = 0;

        do{
            num = num / 10;
            cifras++; 
        }
        while(num!=0);
           
        
        return cifras;
    }

    /**
     * notaEnTexto()
     * Función que reciba una nota entera de 0 a 10 y devuelva el equivalente en
     * texto según la siguiente escala:
     * insuficiente (de 0 a 4)
     * suficiente (5)
     * bien (6)
     * notable (7 y 8)
     * sobresaliente (9 y 10)
     * 
     * @param nota
     * @return
     */
    static String notaEnTexto(double nota) {

        String notaEnTexto = "";

        if (nota < 0 || nota > 10) {
            notaEnTexto = "Error";
        } else if (nota >= 0 && nota < 5) {
            notaEnTexto = "Suspenso";
        } else if (nota >= 5 && nota < 6) {
            notaEnTexto = "Suficiente";
        } else if (nota >= 6 && nota < 7) {
            notaEnTexto = "Bien";
        } else if (nota >= 7 && nota < 9) {
            notaEnTexto = "Notable";
        } else if (nota >= 9 && nota <= 10) {
            notaEnTexto = "Sobresaliente";
        }

        return notaEnTexto;
    }

    static String notaEnTexto(int nota) {

        String notaEnTexto = "";

        if (nota < 0 || nota > 10) {
            notaEnTexto = "Error";
        } else if (nota >= 0 && nota < 5) {
            notaEnTexto = "Suspenso";
        } else if (nota >= 5 && nota < 6) {
            notaEnTexto = "Suficiente";
        } else if (nota >= 6 && nota < 7) {
            notaEnTexto = "Bien";
        } else if (nota >= 7 && nota < 9) {
            notaEnTexto = "Notable";
        } else if (nota >= 9 && nota <= 10) {
            notaEnTexto = "Sobresaliente";
        }

        return notaEnTexto;
    }

     
 
}
