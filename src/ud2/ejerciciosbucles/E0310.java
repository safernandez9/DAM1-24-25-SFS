package ud2.ejerciciosbucles;

/*
 * E0310. Diseñar un programa que muestre la suma de los 10 primeros números impares.
 */

public class E0310 {
    public static void main(String[] args) {
        final int NUM_REP = 100;
        int n = 3;
        for (int i = 0; i < NUM_REP; i++) {
            System.out.println(n);
            n += 3;
        }
    }
}
