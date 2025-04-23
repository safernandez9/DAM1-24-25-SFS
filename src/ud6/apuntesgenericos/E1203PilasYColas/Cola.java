package ud6.apuntesgenericos.E1203PilasYColas;

/**
 * E1203. Define la interfaz Pila con parámetros genéricos. A continuación, implementa la interfaz 
 * Pila genérica en la clase ContenedorLista. Deberá tener dos métodos genéricos: 
 *  
 * ● public void apilar(T e); 
 * ● public T desapilar(); 
 * Por último, escribe un programa donde se utilice un objeto contenedor como pila. En ella apilamos 
 * números enteros positivos leídos del teclado hasta que se introduzca un -1. Después, mediante un 
 * bucle, se desapilan todos los números hasta que la pila esté vacía y los mostramos por consola. 
 * 
 * Define la interfaz Cola con parámetros genéricos. A continuación, implementa también la interfaz 
 * Cola genérica en la clase ContenedorLista. Deberá tener dos métodos genéricos:  
 * ● public void encolar(T e); 
 * ● public T desencolar(); 
 * Por último, escribe un programa donde se utilice un objeto contenedor como cola. En ella encolamos 
 * números enteros positivos leídos del teclado hasta que se introduzca un -1. Después, mediante un 
 * bucle, se desencolan todos los números hasta que la cola esté vacía y los mostramos por consola.
 */

public interface Cola <T> {
    public void encolar(T e);
    public T desencolar();
}
