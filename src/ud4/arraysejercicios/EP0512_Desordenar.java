package ud4.arraysejercicios;

import java.util.Arrays;
import java.util.Random;

public class EP0512_Desordenar {

    public static void main(String[] args) {
        int t[] = { 1, 2, 3, 4, 5 };
        desordenar(t);
        for (int i = 0; i < t.length; i++) {
            System.out.println(" " + t[i]);
        }
    }

    public static void desordenar(int t[]) {

        int indiceAleatorio;
        Random random = new Random();
        int aux;
        boolean salir = false;

        for (int i = 0; i < t.length; i++) {
            do {
                indiceAleatorio = random.nextInt(t.length);
                if (indiceAleatorio != i) {
                    aux = t[i];
                    t[i] = t[indiceAleatorio];
                    t[indiceAleatorio] = aux;

                    salir = true;
                }
            } while (!salir);
        }

    }
}
