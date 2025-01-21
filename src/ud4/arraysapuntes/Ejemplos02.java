package ud4.arraysapuntes;

import java.util.Random;

public class Ejemplos02 {
    public static void main(String[] args) {
        final int NUM = 100;
        int[] edad; // Declaración Variable
        Random rnd = new Random();

        edad = new int[NUM]; // Crea/instancia el array

        for (int i = 0; i < NUM; i++) {
            edad[i] = rnd.nextInt(18, 41);
        }

        long suma = 0;
        for (int i = 0; i < NUM; i++) {
            suma += edad[i];
        }

        long media = suma / NUM;     
        
        System.out.println("La media de edad de " + NUM + " personas es " + media + " años.");

        System.out.println("Fin de Programa");
    }
}
