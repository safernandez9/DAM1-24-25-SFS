package ud3.apuntes.ejerciciosmath;

import java.util.Random;

public class RandomEjemplo {
    public static void main(String[] args) {
        final int MIN = 100;
        final int MAX = 200;

        Random rndRandom = new Random();
        // Si inicializamos la semilla con un valor fijo, los números "aleatorios" serán siempre los mismos.
        //Random rndRandom = new Random(7);

        // Número entero aleatorio
        System.out.println(rndRandom.nextInt());
        // Número entero aleatorio entre 0 y MAX - 1
        System.out.println(rndRandom.nextInt(MAX));
        // Número entero aleatorio entre MIN y MAX - 1
        System.out.println(rndRandom.nextInt(MIN, MAX));

        // Número real aleatorio. Similar a Math.random()
        System.out.println(rndRandom.nextDouble());
        // Número real aleatorio. 0 <= n < MAX
        System.out.println(rndRandom.nextDouble(MAX));
        // Número real aleatorio. MIN <= n < MAX
        System.out.println(rndRandom.nextDouble(MIN, MAX));

        // Valor booleano aleatorio
        System.out.println(rndRandom.nextBoolean());

    }
}
