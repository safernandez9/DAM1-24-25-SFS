package ud6.apuntescolecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class E1206 {
    public static void main(String[] args) {
        Collection<Integer> numeros = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 100; i++) {
            numeros.add(rnd.nextInt(10) + 1);
        }

        System.out.println(numeros);

        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            Integer numero = it.next();
            if (numero == 5)
                it.remove();
        }

        System.out.println(numeros);

        it = numeros.iterator();
        while (it.hasNext()) {
            Integer numero = it.next();
            if (numero == 7)
                it.remove();
        }

        System.out.println(numeros);


    }
}
