package ud2.ejerciciosbucles;

/**
 * E0307. Escribir todos los múltiplos de 7 menores que 100.
 */

public class E0307 {
    public static void main(String[] args) {
        final int MAX = 1000;

        for (int i = 7; i <= MAX; i += 7) {
            System.out.println(i);
        }
    }
}
