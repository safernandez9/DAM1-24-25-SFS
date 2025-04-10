package ud6.apuntescolecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class E1209 {
    public static void main(String[] args) {
        // Declara la lista
        List<Integer> numeros;

        // Crea la lista
        numeros = new ArrayList<>();

        // Añade 20 números aleatorioa a la lista
        for (int i = 0; i < 20; i++) {
            numeros.add((int) (Math.random() * 100));
        }

        System.out.println("\nELEMENTOS CON VALOR PAR\n");
        System.out.println("Recorrido con bucle for-i");
        // Imprime índice y valor de los elementos con valor par
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0) {
                System.out.println(i + ": " + numeros.get(i));
            }
        }

        System.out.println("\nRecorrido con bucle for-each");
        int i = 0;
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(i + ": " + numero);
            }
            i++;
        }

        System.out.println("\nRecorrido iterator");
        i = 0;
        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            Integer numero = it.next();
            if (numero % 2 == 0) {
                System.out.println(i + ": " + numero);
            }
            i++;            
        }


        System.out.println("\nELEMENTOS CON VALOR IMPAR\n");
        // Imprime índice y valor de los elementos con valor impar
        for (i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 != 0) {
                System.out.println(i + ": " + numeros.get(i));
            }
        }

    }
}
