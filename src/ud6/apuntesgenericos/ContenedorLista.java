package ud6.apuntesgenericos;

import java.util.Arrays;

import ud5.apuntesherencia.Persona;

public class ContenedorLista<T> {
    T[] objetos;

    
    public ContenedorLista(T[] t) {
        objetos = t;
    }

    void insertarAlPrincipio(T nuevo){
        objetos = Arrays.copyOf(objetos,objetos.length + 1); 
        System.arraycopy(objetos, 0, objetos, 1, objetos.length);
        objetos[0] = nuevo;
    }
    void insertarAlFinal(T nuevo){
        objetos = Arrays.copyOf(objetos,objetos.length + 1);
        objetos[objetos.length - 1] = nuevo;
    }
    T extraerDelPrincipio(){
        return null;
    }
    T extraerDelFinal(){
        return null;
    }
    void ordenar(){

    }
    @Override
    public String toString() {
        return Arrays.toString(objetos);
    }

    public static void main(String[] args) {
        ContenedorLista<Integer> lista = new ContenedorLista<>(new Integer[0]);
        lista.insertarAlFinal(1);
        lista.insertarAlFinal(2);
        lista.insertarAlFinal(3);
        System.out.println(lista);

        ContenedorLista<Persona> listaP = new ContenedorLista<>(new Persona[0]);
        listaP.insertarAlFinal(new Persona("Pepe"));
        listaP.insertarAlFinal(new Persona("Maria"));
        listaP.insertarAlFinal(new Persona("Lola"));
        System.out.println(listaP);

    }
    

}
