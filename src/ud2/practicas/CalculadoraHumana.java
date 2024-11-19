package ud2.practicas;

import java.util.Scanner;

/**
 * El veterano concurso de La2 “Saber y Ganar” incluye un juego denominado la
 * “Calculadora
 * Humana” en la que el concursante debe resolver operaciones matemáticas
 * encadenadas en
 * un tiempo límite.
 * Las operaciones se realizan con números enteros e incluyen la suma, resta,
 * división y
 * multiplicación de números elegidos aleatoriamente.
 * El juego comienza presentando al usuario una primera operación (a elegir
 * aleatoriamente) entre
 * dos números enteros (también aleatorios) y solicitando que escriba el
 * resultado por teclado.
 * Si el usuario escribe un resultado incorrecto se le solicitará que introduzca
 * un nuevo valor por
 * teclado.
 * Si el usuario acierta, se presentará una nueva operación (la segunda) en la
 * que el primer
 * operando será el resultado de la primera, mientras que el operador y el
 * segundo operando serán
 * elegidos aleatoriamente.
 * Resuelta la segunda operación se presentará la tercera, luego la cuarta y así
 * sucesivamente.
 * El juego termina cuando el jugador resuelve 7 operaciones correctamente,
 * independientemente
 * del número de fallos que haya cometido.
 * En el programa de TV, el juego termina también cuando expira un temporizador
 * definido
 * previamente (por ejemplo 59 segundos). Alternativamente a la implementación
 * del temporizador
 * se puede establecer el fin del juego cuando el jugador supera un número
 * máximo de fallos
 * permitido.
 * Implementa el programa del juego con las siguentes especificaciones
 * adicionales:
 * 1. El número de operaciones, el número de segundos y el número de fallos
 * permitidos se
 * definirán como constantes al inicio del programa para facilitar adaptar el
 * juego y su
 * dificultad.
 * 2. Tanto los operandos como los resultados de las operaciones planteadas por
 * el juego
 * estarán limitados a un valor máximo (por ejemplo 200). Es decir, si se le
 * plantea al
 * usuario una multiplicación, el resultado no deberá superar este límite, por
 * lo que habrá
 * que tenerlo en cuenta a la hora de generar los datos aleatorios. Se
 * recomienda definir
 * también este valor como una constante
 * 3. En el caso de las divisiones, el programa deberá asegurar que el resultado
 * es un número
 * entero.
 * 
 * @param args
 */

public class CalculadoraHumana {

    final static int NUMERO_OPERACIONES = 4;
    final static int NUMEROS_MAX = 200;
    final static int NUMEROS_MIN = 1;

    public static void main(String[] args) {

        int aciertos = 0;
        int fallos = 0;
        boolean resultado;

        presentacion();

        do {
            resultado = realizarJuego();
            if (resultado) {
                aciertos++;
            } else {
                fallos++;
            }
            if(!resultado){
                System.out.println("Error. Nueva operación:");
            }
        } while (aciertos != 7 || fallos != 7);

        
    }

    private static void presentacion() {
        System.out.println("Bienvenido a la CALCULADORA HUMANA !!!");
        System.out.println("A continuación se empezará el juego con la primera operación. " +
                "Deberá acertar 7 operaciones correctamente");
    }

    private static boolean realizarJuego() {

        int num1, num2, tipoOperacion;
        int respuesta;
        int resultadoCorrecto;
        boolean acierto;

        Scanner sc = new Scanner(System.in);

        // Genero la operación

        num1 = calcularNumero(NUMEROS_MIN, NUMEROS_MAX);
        num2 = calcularNumero(NUMEROS_MIN, NUMEROS_MAX);
        tipoOperacion = calcularOperacion(NUMERO_OPERACIONES);

        // Presento la operación y pido el resultado
        switch (tipoOperacion) {
            case 1:
                resultadoCorrecto = num1 + num2;
                System.out.printf("Su operación es: %d + %d = ?");
                System.out.println("Introduzca el resultado:");
                respuesta = sc.nextInt();
                break;

            case 2:
                resultadoCorrecto = num1 - num2;
                System.out.printf("Su operación es: %d - %d = ?");
                System.out.println("Introduzca el resultado:");
                respuesta = sc.nextInt();
                break;

            case 3:
                resultadoCorrecto = num1 * num2;
                System.out.printf("Su operación es: %d * %d = ?");
                System.out.println("Introduzca el resultado:");
                respuesta = sc.nextInt();
                break;

            case 4:
                resultadoCorrecto = num1 / num2;
                System.out.printf("Su operación es: %d / %d = ?");
                System.out.println("Introduzca el resultado:");
                respuesta = sc.nextInt();
                break;

            default:
                return false;
        }

        // Valido resultado y devuelvo si es correcto o no
        acierto = validarResultado(resultadoCorrecto, respuesta);
        return acierto;

    }

    public static boolean validarResultado(int resultadoCorrecto, int respuesta) {
        return ((resultadoCorrecto == respuesta) ? true : false);
    }

    public static int calcularOperacion(int NUMERO_OPERACIONES) {
        int num = (int) (Math.random() * (NUMERO_OPERACIONES - 1 + 1)) + 1;
        return num;
    }

    public static int calcularNumero(int NUMERO_MIN, int NUMEROS_MAX) {
        int num = (int) (Math.random() * (NUMEROS_MAX - NUMERO_MIN + 1)) + NUMERO_MIN;
        return num;
    }
}
