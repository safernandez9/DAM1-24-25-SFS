package ud6.apuntescolecciones;

import java.util.*;

import ud5.rol.Personaje;

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
        // Crea un sorteo entre 4 personajes para seleccionar los 2 que se enfrentarán
        // en combate singular
        Sorteo<Personaje> sorteo = new Sorteo<>();
        sorteo.add(new Personaje("Aragorn", Raza.HUMANO, 90, 90, 90, 10, 16252, 125));
        sorteo.add(new Personaje("Mara", Raza.ELFO, 100, 100, 100));
        sorteo.add(new Personaje("Dodol Bazbal", Raza.ENANO));
        sorteo.add(new Personaje("Lady Jet"));

        Set<Personaje> elegidos = sorteo.premiados(2);

        System.out.println(elegidos);
    }

}
