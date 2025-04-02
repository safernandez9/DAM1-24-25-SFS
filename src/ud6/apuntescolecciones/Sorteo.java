package ud6.apuntescolecciones;

import java.util.*;

/**
 * E1213. Implementar la clase Sorteo con parámetros genéricos. Deberá guardar
 * un
 * conjunto de valores distintos de tipo genérico, suministrados por consola y
 * será capaz de
 * generar una combinación premiada de un tamaño determinado. Deberán
 * implementarse.
 * como minimo, los métodos:
 * ● boolean add (T elemento) que añadirá un elemento nuevo al conjunto de
 * valores posibles en una apuesta. Si el elemento se añade, devuelve true y, en
 * caso contrario, debido a que ya estaba presente, false.
 * ● Set<T> premiados (int numPremiados) que devolverá una combinación
 * ganadora de numPremiados elementos distintos
 */

public class Sorteo<T> {

    private Set elementos;
    private Random random;

    public Sorteo() {
        this.elementos = new HashSet<>();
        this.random = new Random();
    }

    public boolean add(T elemento) {
        return elementos.add(elemento);
    }

    public Set<T> premiados(int numPremiados) {
        if (numPremiados > elementos.size()) {
            throw new IllegalArgumentException("No hay suficientes elementos para premiar");
        }

        List<T> listaElementos = new ArrayList<>(elementos);
        Collections.shuffle(listaElementos, random);
        return new HashSet<>(listaElementos.subList(0, numPremiados));
    }

    public static void main(String[] args) {
        Sorteo sorteo = new Sorteo<>();
        sorteo.add(1);
        sorteo.add(2);
        sorteo.add(3);
        sorteo.add(4);
        sorteo.add(5);

        System.out.println("Premiados: " + sorteo.premiados(3));
    }

}
