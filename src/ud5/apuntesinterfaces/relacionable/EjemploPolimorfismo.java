package ud5.apuntesinterfaces.relacionable;

import java.util.ArrayList;

public class EjemploPolimorfismo {
    public static void main(String[] args) {

        Relacionable rr = new Linea(0.1, 0.2, 0.3, 0.4);
        rr = new Fraccion(5, 3);

        ArrayList<Relacionable> array = new ArrayList();
        array.add(new Linea(15, 3, 9, 5));
        array.add(new Fraccion(10, 7));
        array.add(new Fraccion(6, 25));
        array.add(new Linea(3, 4, 10, 15));
        array.add(new Fraccion(8, 3));
        array.add(new Linea(0, 7, 1, 4));
        array.add(new Linea(2, -1, 3, 5));
        array.add(new Fraccion(1, 9));
        array.add(new Linea(1, 9, 0, -3));
        array.add(new Fraccion(3, 8));
        array.add(new Fraccion(-2, 3));

        for (Relacionable r : array) {
            System.out.println(r.nombreClase());
            System.out.println(r);
        }
    }

}
