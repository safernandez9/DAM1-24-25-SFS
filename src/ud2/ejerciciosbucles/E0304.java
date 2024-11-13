package ud2.ejerciciosbucles;

import java.util.Scanner;

/**
 * E0304. Un centro de investigación de la flora urbana necesita una aplicación que muestre
 * cuál es el árbol más alto. Para ello introducirá por teclado la altura (en centímetros) de
 * cada árbol (terminando la introducción de datos cuando se utilice el -1 como altura). Los
 * árboles se identifican mediante etiquetas con números únicos consecutivos, comenzando
 * en 0. Diseñar una aplicación que, al terminar la introducción de datos, muestre el número
 * y la altura del árbol más alto.
 */

public class E0304 {
    public static void main(String[] args) {
        int numArbol = 0;
        int altura = 0;
        int alturaMaxima = -1;
        int numArbolMasAlto = -1;
        Scanner sc = new Scanner(System.in);

         do {
            System.out.print("Introduce la altura en centímetros del árbol número " + numArbol + " (-1 para terminar): ");
            altura = sc.nextInt();

            if (altura > alturaMaxima) {
                alturaMaxima = altura;
                numArbolMasAlto = numArbol;
            }
            numArbol++;
        }  while (altura != -1);

        if (alturaMaxima != -1) {
            System.out.println("El árbol más alto es el número " + numArbolMasAlto +
                    " con una altura de " + alturaMaxima + " centímetros.");
        } else {
            System.out.println("No has introducido ninguna altura.");
        }

        sc.close();
    }
}
