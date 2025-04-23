package ud6.apuntesgenericos;

import java.util.Arrays;
import java.util.Comparator;

import ud5.apuntesherencia.Persona;
import ud5.rol.Personaje;

public class ContenedorLista<T> implements Pila<T>, Cola<T> {
    T[] objetos;

    public ContenedorLista(T[] t) {
        objetos = t;
    }

    void insertarAlPrincipio(T nuevo) {
        objetos = Arrays.copyOf(objetos, objetos.length + 1);
        for (int i = objetos.length - 1; i > 0; i--) {
            objetos[i] = objetos[i - 1];
        }
        objetos[0] = nuevo;
    }

    void insertarAlFinal(T nuevo) {
        objetos = Arrays.copyOf(objetos, objetos.length + 1);
        objetos[objetos.length - 1] = nuevo;
    }

    T extraerDelPrincipio() {
        T valor = null;
        if (objetos.length > 0) {
            valor = objetos[0];
            for (int i = 0; i < objetos.length - 1; i++)
                objetos[i] = objetos[i + 1];
            objetos = Arrays.copyOf(objetos, objetos.length - 1);
        }
        return valor;
    }

    T extraerDelFinal() {
        T valor = null;
        if (objetos.length > 0) {
            valor = objetos[objetos.length - 1];
            objetos = Arrays.copyOf(objetos, objetos.length - 1);
        }
        return valor;
    }

    void ordenar() {
        /*
         * Generará una excepción si T no es Comparable
         * "T cannot be cast to class java.lang.Comparable"
         * Se puede arreglar indicando que T debe implementar Comparable
         * "T extends Comparable"
         */
        Arrays.sort(objetos);
    }

    @Override
    public String toString() {
        return Arrays.toString(objetos);
    }

    T get(int indice) {
        return objetos[indice];
    }

    void ordenar(Comparator<T> c) {
        Arrays.sort(objetos, c);
    }

    public static void main(String[] args) {
        ContenedorLista<Integer> lista = new ContenedorLista<>(new Integer[0]);
        lista.insertarAlFinal(1);
        lista.insertarAlFinal(2);
        lista.insertarAlFinal(3);
        lista.insertarAlPrincipio(4);
        System.out.println(lista);
        // Ordenar descendentemente
        Comparator<Integer> comp = Comparator.naturalOrder();
        lista.ordenar(comp.reversed());
        System.out.println(lista);

        // Ordenar ascendentemente
        lista.ordenar();
        System.out.println(lista);

        System.out.println(lista.extraerDelPrincipio());
        System.out.println(lista);
        System.out.println(lista.extraerDelFinal());

        Pila<Integer> pila = lista;
        pila.apilar(5);
        System.out.println(pila.desapilar());

        Cola<Integer> cola = lista;
        cola.encolar(5); // 2, 3, 5
        System.out.println(cola.desencolar()); // Saco el 2, Quedan 3, 5

        /*
         * ContenedorLista<Persona> listaP = new ContenedorLista<>(new Persona[0]);
         * listaP.insertarAlFinal(new Persona("Pepe"));
         * listaP.insertarAlFinal(new Persona("Maria"));
         * listaP.insertarAlFinal(new Persona("Lola"));
         * System.out.println(listaP);
         * 
         * listaP.ordenar();
         * 
         * System.out.println(listaP);
         */

        /*
         * ContenedorLista<Personaje> p = new ContenedorLista<>(new Personaje[0]);
         * p.insertarAlFinal(new Personaje("Pepe"));
         * p.insertarAlFinal(new Personaje("Maria"));
         * p.ordenar();
         */

    }

    @Override
    public void apilar(T e) {
        insertarAlFinal(e);
    }

    @Override
    public T desapilar() {
        return extraerDelFinal();
    }

    @Override
    public void encolar(T e) {
        insertarAlFinal(e);
    }

    @Override
    public T desencolar() {
        return extraerDelPrincipio();
    }

}
