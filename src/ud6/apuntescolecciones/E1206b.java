package ud6.apuntescolecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class E1206b {
    public static void main(String[] args) {
        Collection<Integer> numerosPositivos = new ArrayList<>();
        Collection<Integer> numerosNegativos = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 100; i++) {
            int e = rnd.nextInt(201) - 100;
            if (e >= 0)
                numerosPositivos.add(e);
            else if (e < 0)
                numerosNegativos.add(e);
        }

        System.out.println("numerosPositivos: " + numerosPositivos);
        getSuma(numerosPositivos);

        System.out.println("numerosNegativos: " + numerosNegativos);
        getSuma(numerosNegativos);

        Iterator<Integer> it = numerosPositivos.iterator();
        while (it.hasNext()) {
            Integer numero = it.next();
            if (numero > 10) 
                it.remove();
        }
        System.out.println(numerosPositivos);

        it = numerosNegativos.iterator();
        while (it.hasNext()) {
            Integer numero = it.next();
            if (numero < -10) 
                it.remove();
        }
        System.out.println(numerosNegativos);

    }

    private static void getSuma(Collection<Integer> numeros) {
        int suma = 0;
        for (Integer numero : numeros) {
            suma += numero;
        }
        System.out.println("suma: " + suma);
    }
}
