package ud5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
    static final int MAX_NUM = 25;
    static Jugador[] jugadores;
    static int[] numerosSorteados = new int[0];
    static boolean linea = false;
    static boolean bingo = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nBINGO");
        System.out.println("=====\n");

        System.out.print("Número de jugadores: ");
        int numJugadores = sc.nextInt();
        jugadores = new Jugador[numJugadores];

        System.out.println("\nIntroduce los datos de los jugadores:");

        for (int i = 1; i <= numJugadores; i++) {
            sc.nextLine(); // Limpio el buffer de entrada de teclado
            System.out.print("Nombre jugador" + i + ": ");
            String nombre = sc.nextLine();
            System.out.print("Número de cartones: ");
            int numCartones = sc.nextInt();
            System.out.println();

            Jugador jugador = new Jugador(nombre, numCartones);
            jugadores[i - 1] = jugador;
            System.out.println(jugador);
        }

        // Comienza el Juego
        System.out.println("Comienza el juego");
        System.out.println("-----------------");
        // Dos Modalidades
        System.out.println("Que modalidad prefieres? (N - Número a número)  (A - Automática)");
        sc.nextLine(); // Limpio el buffer de entrada de teclado
        int opcion = sc.nextLine().toUpperCase().charAt(0);
        switch (opcion) {
            case 'N':
                modoNumeroANumero();
                break;
            case 'A':
                modoAutomatico();
                break;
            default:
                System.out.println("Opción incorrecta. Fin del programa");
        }
    }

    private static void modoAutomatico() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modoAutomatico'");
    }

    private static void modoNumeroANumero() {
        do {
            // El programa saca un bola aleatoria, no repetida
            int numero = sortearNumero();
            System.out.println("Número que sale del bombo: " + numero);
            System.out.println("Números sorteados: " + Arrays.toString(numerosSorteados));
            // Revisar Cartones Jugadores
            revisarCartonesJugadores();
            System.out.println("Pulsa ENTER para continuar");
            // new Scanner(System.in).nextLine();
        } while (!bingo);

        System.out.println("Fin del programa!");
    }

    /**
     * Revisa los cartones de cada jugador
     * Si no hay líneas ni bingos imprime un mensaje indicándolo y termina.
     * Si hay líneas por primera vez, imprime los nombres de los jugadores y el
     * número de cartón en que se consiguió la línea.
     * Puede haber más de una línea en el mismo turno.
     * Una vez se han cantado líneas en los turnos anteriores ya no se imprimirán
     * nuevas líneas.
     * Si hay bingo por primera vez imprime el nombre o los nombres de los jugadores
     * y el número de cartón en que se consiguió el bingo.
     */
    private static void revisarCartonesJugadores() {
        boolean nuevaLinea = false;
        boolean nuevoBingo = false;
        for (Jugador jugador : jugadores) {
            for (Carton carton : jugador.cartones) {
                switch (carton.revisarCarton(numerosSorteados)) {
                    case 0:
                        break;
                    case 1: // Línea (La cantamos si no se ha cantado en un turno anterior)
                        if (!linea) {
                            System.out.println(jugador.nombre + " canta línea con este cartón:");
                            System.out.println(carton);
                            nuevaLinea = true;
                        }
                        break;
                    case 2: // Bingo (Lo cantamos si no se ha cantado en un turno anterior)
                        if (!bingo) {
                            System.out.println(jugador.nombre + " canta BINGO!! con este cartón:");
                            System.out.println(carton);
                            nuevoBingo = true;
                        }
                        break;
                }
            }
        }
        if (nuevaLinea)
            linea = true;
        if (nuevoBingo)
            bingo = true;
    }

    /**
     * Sortea un nuevo número y lo añade al array de números sorteados
     * 
     * @return
     */
    private static int sortearNumero() {
        Random rnd = new Random();
        int numRandom;
        boolean repetido;
        do {
            numRandom = rnd.nextInt(MAX_NUM) + 1;
            repetido = false;
            int i = 0;
            while (i < numerosSorteados.length && !repetido) {
                if (numerosSorteados[i] == numRandom)
                    repetido = true;
                i++;
            }
        } while (repetido);

        numerosSorteados = Arrays.copyOf(numerosSorteados, numerosSorteados.length + 1);
        numerosSorteados[numerosSorteados.length - 1] = numRandom;
        return numRandom;
    }
}

class Jugador {
    String nombre;
    Carton[] cartones;

    public Jugador(String nombre, int numCartones) {
        this.nombre = nombre;
        // TODO Instanciar cartones
        cartones = new Carton[numCartones];
        for (int i = 0; i < cartones.length; i++) {
            cartones[i] = new Carton();
        }
    }

    @Override
    public String toString() {
        String str = "Jugador: " + nombre + " (" + cartones.length + " cartones)\n\n";
        for (int i = 0; i < cartones.length; i++) {
            str += cartones[i] + "\n";
        }
        return str;
    }
}

class Carton {
    static final int MAX_FILAS = 3;
    static final int MAX_COLS = 5;

    int[][] numeros;

    public Carton() {
        this.numeros = new int[MAX_FILAS][MAX_COLS];
        // Rellenar con números aleatorios distintos.
        for (int i = 0; i < MAX_FILAS; i++) {
            for (int j = 0; j < MAX_COLS; j++) {
                // Genera un número aleatorio
                Random rnd = new Random();
                boolean repetido;
                int numRandom;
                do {
                    numRandom = rnd.nextInt(Bingo.MAX_NUM) + 1;
                    // TODO Comprobar que el número no está repetido
                    repetido = false;
                    int ii = 0;
                    while (ii < MAX_FILAS && !repetido) {
                        int jj = 0;
                        while (jj < MAX_COLS && !repetido) {
                            if (numeros[ii][jj] == numRandom)
                                repetido = true;
                            jj++;
                        }
                        ii++;
                    }
                } while (repetido);

                numeros[i][j] = numRandom;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < MAX_FILAS; i++) {
            for (int j = 0; j < MAX_COLS; j++) {
                str.append(numeros[i][j] + " ");
            }
            str.append("\n");
        }
        return str.toString();
    }

    /**
     * Revisa el cartón comparando los números del mismo con los números sorteados
     * que se pasan como parámetro
     * Devuelve 0 sin tras la revisión no hay línea ni bingo
     * Devuelve 1 si hay línea pero no bingo
     * Devuelve 2 si hay bingo
     * 
     * @param numerosSorteo
     * @return
     */
    public int revisarCarton(int[] numerosSorteo) {
        boolean linea = false;
        boolean bingo = false;
        int total = 0;
        for (int i = 0; i < MAX_FILAS; i++) {
            int fila = 0;
            for (int j = 0; j < MAX_COLS; j++) {
                for (int n = 0; n < numerosSorteo.length; n++) {
                    if (numeros[i][j] == numerosSorteo[n]) {
                        fila++;
                    }
                }
            }
            if (fila == MAX_COLS) {
                linea = true;
                total++;
            }
        }
        if (total == MAX_FILAS)
            bingo = true;
        if (bingo) {
            return 2;
        } else if (linea) {
            return 1;
        } else
            return 0;
    }
}
