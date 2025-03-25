package ud6.apuntesgenericos;

import ud5.apuntesherencia.Persona;

class Contenedor<T> {

    private T objeto; // se inicializa a null: contenedor vacío

    public Contenedor() {
    }

    void guardar(T nuevo) {
        objeto = nuevo;
    }

    T extraer() {
        T res = objeto;
        objeto = null; // el contenedor vuelve a estar vacio
        return res;
    }

    public static void main(String[] args) {
        //Contenedor<Integer> c = new Contenedor<Integer>(); 
        // Podemos omitir el tipo en el constructor a la derecha
        Contenedor<Integer> c = new Contenedor<>();

        c.guardar (5);
        Integer n = c.extraer();
        System.out.println(n); //aparece un 5 por consola

        // c.guardar (7.4); // Generaría un error de compilación
        // c.guardar ("Hola"); // Generaría un error de compilación

        Contenedor<Double> c1 = new Contenedor<>(); // Contenedor de números reales
        Contenedor<Persona> c2 = new Contenedor<>(); // Contenedor de
        c2.guardar(new Persona());

        Contenedor<? extends Number> cComodin = c;
        cComodin = c1;
        // cComodin = c2; // Error: CComodin solo puede referenciar contenedores de números




    }
}

 