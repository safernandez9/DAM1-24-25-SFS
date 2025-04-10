package ud6.apuntescolecciones;

import java.util.Set;
import java.util.TreeSet;

public class Conjunto {
    static <E> Set<E> union(Set<E> A, Set<E> B) {
        Set<E> union = new TreeSet<>(A);
        union.addAll(B);
        return union;
    }

    static <E> Set<E> interseccion(Set<E> A, Set<E> B) {
        Set<E> interseccion = new TreeSet<>(A);
        interseccion.retainAll(B);
        return interseccion;
    }

    static <E> Set<E> except(Set<E> A, Set<E> B) {
        Set<E> except = new TreeSet<>(B);
        except.removeAll(A);
        return except;
    }
}
