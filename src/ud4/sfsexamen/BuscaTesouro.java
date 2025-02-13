//Saúl Fernández Salgado

package ud4.sfsexamen;

import java.lang.Math;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class BuscaTesouro {

    public static void main(String[] args) {

        int[][] mapaTesoro;
        int[] coordTesoro;
        int filas, columnas;
        int maxIntentos;
        String[] resultado;

        Scanner sc = new Scanner(System.in);

        while (true) {

            try {

                System.out.println("Por favor, introduzca el numero de filas que tendrá el mapa:");
                filas = sc.nextInt();
                System.out.println("Por favor, introduzca el numero de columnas que tendrá el mapa:");
                columnas = sc.nextInt();

                if (filas > 0 && columnas > 0) {
                    break;
                }

                System.out.println("Los numeros deben ser superiores a 0");
            } catch (InputMismatchException err) {
                System.out.println("Tipo de dato incorrecto.");
                sc.next();
            }
        }
        mapaTesoro = new int[filas][columnas];

        // Calculo máximo de intentos y genero el mapa del juego con el tesoro
        maxIntentos = (int) Math.ceil((filas * columnas) * 0.1);
        coordTesoro = generarMapaJuego(mapaTesoro);
        resultado = buscaTesoro(mapaTesoro, maxIntentos, coordTesoro);

        System.out.println("El resultado ha sido: " + resultado[0] + " en un total de " + resultado[1] + " intentos.");

        sc.close();
    }

    /**
     * Genera el tesoro en el mapa (indicado con un 1) y guarda sus coordenadas
     * en un array
     * 
     * @param mapa
     * @return
     */

    public static int[] generarMapaJuego(int[][] mapa) {

        int[] coordTesoro = new int[2];
        Random rnd = new Random();

        coordTesoro[0] = rnd.nextInt(mapa.length);
        coordTesoro[1] = rnd.nextInt(mapa[0].length);
        mapa[coordTesoro[0]][coordTesoro[1]] = 1;

        return coordTesoro;

    }

    /**
     * Funcion que realiza el juego
     * 
     * @param mapa
     * @param maxIntentos
     * @param coordTesoro
     * @return
     */
    @SuppressWarnings("resource")
    public static String[] buscaTesoro(int[][] mapa, int maxIntentos, int[] coordTesoro) {

        int intentos = 1;
        int tamFila = mapa.length - 1;
        int tamCol = mapa[0].length - 1;
        int jugadorX, jugadorY;
        String[] datosFin = new String[2];

        Scanner sc = new Scanner(System.in);

        System.out.println("Mapa Generado. Empieza el juego.");

        do {
            System.out.println(
                    "Intento " + intentos + " .Introduzca las coordenadas en las que cree que esta el tesoro:");

            while (true) {

                try {

                    System.out.println("Filas (de 0 a " + tamFila + "): ");
                    jugadorX = sc.nextInt();
                    System.out.println("Columnas ( de 0 a " + tamCol + "): ");
                    jugadorY = sc.nextInt();

                    if (jugadorX >= 0 && jugadorY >= 0) {
                        break;
                    }

                    System.out.println("Los numeros deben ser superiores a 0");
                } catch (InputMismatchException err) {
                    System.out.println("Tipo de dato incorrecto.");
                    sc.next();
                }
            }

            if (coordTesoro[0] == jugadorX || coordTesoro[1] == jugadorY) { // Caso en el que alguna de las coordenadas
                                                                            // coincide
                if (coordTesoro[0] == jugadorX && coordTesoro[1] == jugadorY) { // Caso en el que las 2 coinciden
                    datosFin[0] = "Victoria";
                    datosFin[1] = String.valueOf(intentos);
                    return datosFin;
                } else if (coordTesoro[0] == jugadorX) { // Caso en el que solo la coordenada x es igual
                    if (coordTesoro[1] < jugadorY) {
                        System.out.println("Mas al oeste");
                    } else {
                        System.out.println("Mas al este");
                    }
                } else { // Caso en el que solo la coordenada y es igual
                    if (coordTesoro[0] < jugadorX) { // Caso en el que
                        System.out.println("Mas al norte");
                    } else {
                        System.out.println("Mas al sur");
                    }
                }

            } else {
                if (coordTesoro[0] < jugadorX && coordTesoro[1] < jugadorY) {
                    System.out.println("Mas al noroeste");
                } else if (coordTesoro[0] < jugadorX && coordTesoro[1] > jugadorY) {
                    System.out.println("Mas al suroeste");
                } else if (coordTesoro[0] > jugadorX && coordTesoro[1] > jugadorY) {
                    System.out.println("Mas al sureste");
                } else {
                    System.out.println("Mas al noreste");
                }

            }
            intentos++;
        } while (intentos <= maxIntentos);

        datosFin[0] = "Derrota. Máximo de Intentos";
        datosFin[1] = String.valueOf(intentos);

        return datosFin;

    }
}
