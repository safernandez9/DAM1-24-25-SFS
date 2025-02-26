//Saúl Fernández Salgado

package ud4.sfsexamen;

/**
 * ComplejidadCiclomatica.java
 * La complejidad ciclomática es una métrica utilizada en ingeniería del software para medir
 * cuantitativamente la complejidad lógica de un programa. Su cálculo se basa en el diagrama
 * de flujo determinado por las estructuras de control usadas en el código y el resultado define
 * el número de caminos independientes dentro de un fragmento de código.
 * Para calcular la complejidad ciclomática de un algoritmo con una única entrada y salida se
 * confeccionará, en primer lugar, un grafo de flujo como los de las figuras, en los que cada
 * nodo (N) representa una sentencia, o un bloque de sentencias secuenciales, o la evaluación
 * de una condición se una sentencia alternativa o repetitiva. Estos últimos nodos también se
 * llaman Nodos Predicado (NP). Las aristas (A) por su parte representan los flujos posibles
 * del programa, de un nodo a otro u otros.
 * Una vez confeccionado el grafo, la complejidad ciclomática (V(G)) se puede calcular se 3 formas:
 * 
 * 1. V(G) = número de regiones. Entendiendo por región cada área distinta encerrada
 * por notods y aristas e incluyendo también como una región más el área abierta
 * exterior.
 * 2. V(G) = A - N + 2
 * 3. V(G) = NP + 1
 * Para los grafos de la imagen anterior la complejidad ciclomática sería de 3 para el de la
 * izquierda y 4 para el de la derecha.
 * Podemos codificar un grafo como una matriz irregular, modificando la numeración de los
 * nodos para que comience en cero, y en la que cada fila representa un nodo y contiene lo
 * números de los nodos a los que apunta
 * 
 * Implementa el siguiente método que recibe un grafo en el formato anterior y devuelve la
 * complejidad ciclomática correspondiente:
 * static int complejidadCiclomatica(int[][] grafo)
 */

public class ComplejidadCiclomatica {
    
    public static void main(String[] args) {
        
        int[][] grafo1 = {
            {1},
            {3, 5},
            {1},
            {2, 4},
            {6},
            {6},
            {}
           };

           
        int[][] grafo2 = {
            {1, 6},
            {2, 5},
            {3, 4},
            {4},
            {1},
            {0},
            {}
           };

        System.out.println(complejidadCiclomatica(grafo1));
        System.out.println(complejidadCiclomatica(grafo2));
           
    }


static int complejidadCiclomatica(int[][] grafo){

    int aristas = 0;
    int nodos = grafo.length;
    int complejidad;
       
    for(int i = 0; i < grafo.length; i++){
        aristas += grafo[i].length;
    }

    complejidad = aristas - nodos + 2;

    return complejidad;

}

}
