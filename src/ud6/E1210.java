package ud6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class E1210 {
    public static void main(String[] args) {
        List lista = new ArrayList<>();
        List listaRepiten = new ArrayList<>();
        List listaNoRepiten = new ArrayList<>();

        Random random = new Random();

        // Generar 20 números aleatorios entre 1 y 10
        for (int i = 0; i < 20; i++) {
            lista.add(random.nextInt(10) + 1);
        }

        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(i).equals(lista.get(j)) && !listaRepiten.contains(lista.get(i))) {
                    listaRepiten.add(lista.get(i));
                    break;
                } else if (!listaNoRepiten.contains(lista.get(i)) && !listaRepiten.contains(lista.get(i))){
                    listaNoRepiten.add(lista.get(i));
                }

            }
        }

        // Imprimir resultados
        System.out.println("Lista generada: " + lista);
        System.out.println("Elementos repetidos: " + listaRepiten);
        System.out.println("Elementos no repetidos: " + listaNoRepiten);
    }

}