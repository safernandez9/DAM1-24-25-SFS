package ud6.apuntescolecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

public class E1205 {
    public static void main(String[] args) {
        Collection<Integer> numeros = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 100; i++) {
            numeros.add(rnd.nextInt(10) + 1);
        }

        System.out.println(numeros);

        Collection<Integer> sinRepetidos = new HashSet<>();

        for (Integer numero : numeros) {
            sinRepetidos.add(numero);
        }

        System.out.println(sinRepetidos);

    }
}
