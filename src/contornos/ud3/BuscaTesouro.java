package contornos.ud3;

import java.util.Random;
import java.util.Scanner;

public class BuscaTesouro {    
    public static void main(String[] args) {
        final int MAX_FILA_COL = 40;
        final int PORCENTAJE_INTENTOS = 10;

        System.out.println("\nBUSCA EL TESORO EN EL MAPA");
        System.out.println("==========================\n");
        
        // Solicitar dimensiones del mapa
        System.out.print("Número de filas del mapa: ");
        int numFilas = leerEntero(2, MAX_FILA_COL);
        System.out.print("Número de columnas del mapa: ");
        int numColumnas = leerEntero(2, MAX_FILA_COL);

        // Esconder el tesoro en una casilla al azar
        Random rnd = new Random();
        int filaTesoro = rnd.nextInt(numFilas);
        int columnaTesoro = rnd.nextInt(numColumnas);

        // Calcular número máximo de intentos (como mínimo 1)
        final int MAX_INTENTOS = Math.max(numFilas * numColumnas * PORCENTAJE_INTENTOS / 100, 1);
        System.out.println("Comienza el juego!! Busca el tesoro introduciendo números de filas y columnas.");

        int intentos = 0;
        boolean tesoroEncontrado = false;
        // Repetir 
        do {
            // Incrementar número de intentos
            intentos++;
            System.out.printf("Intento %d / %d %n", intentos, MAX_INTENTOS);

            // solicitar coordenadas
            System.out.printf("Fila (0 - %d): ", numFilas - 1);
            int fila = leerEntero(0, numFilas - 1);
            System.out.printf("Columna (0 - %d): ", numColumnas - 1);
            int columna = leerEntero(0, numColumnas - 1);

            // Comprobar coordenadas
            if (fila == filaTesoro && columna == columnaTesoro) {
                tesoroEncontrado = true;
            } else {
                // Dar Pista
                String pista; 
                if (fila == filaTesoro) { 
                    pista = columna < columnaTesoro ? "este" : "oeste";
                } else if (fila < filaTesoro) {
                    if (columna == columnaTesoro)
                        pista = "Sur";
                    else {
                        pista = columna < columnaTesoro ? "sureste" : "suroeste";
                    }
                } else {
                    if (columna == columnaTesoro)
                        pista = "Norte";
                    else {
                        pista = columna < columnaTesoro ? "nordeste" : "noroeste";
                    }                    
                }
                System.out.printf("El tesoro está más al %s.%n%n", pista);
            } 
        } while (intentos < MAX_INTENTOS && !tesoroEncontrado);
        // Mientras intentos < MAX_INTENTOS && !tesoroEncontrado

        // Mostrar Resultado
        if (tesoroEncontrado) 
            System.out.printf("Enhorabuena!! Has encontrado el tesoro en %d intentos.%n%n", intentos);
        else
            System.out.printf("Has perdido!! Has agotado el máximo de intentos.%n%n");
    }

    static int leerEntero(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("El valor mínimo no puede ser mayor que el máximo.");
        }        

        int num = -1;
        boolean numCorrecto = false;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        do {
            try {
                num = sc.nextInt();
                if (num < min || num > max) 
                    System.out.printf("Debe ser un número entero entre %d y %d%n", min, max);
                else
                    numCorrecto = true;
            } catch (Exception e) {
                System.out.printf("Debe ser un número entero entre %d y %d%n", min, max);
                sc.nextLine();
            }
            
        } while (!numCorrecto);

        return num;
    }


}
