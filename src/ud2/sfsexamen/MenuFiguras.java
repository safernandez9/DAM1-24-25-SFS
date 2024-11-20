//Saúl Fernández Salgado

package ud2.sfsexamen;

import java.util.InputMismatchException;
import java.util.Scanner;

//Todos los System.out.printf a excepción de los de los bucles for son para mejorar la presentación.
public class MenuFiguras {

    public static void main(String[] args) {

        boolean salir = false;
        int opcion, error = 0;
        int nivelesTriangulo, filasRectangulo, columnasRectangulo;

        Scanner sc = new Scanner(System.in);

        // Menú, selección de opciones y comprobación de errores
        do {

            System.out.printf("\n");
            presentarMenu();

            System.out.println("Introduzca una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    nivelesTriangulo = comprobarDatoTriangulo();
                    imprimirTriangulo(nivelesTriangulo);
                    break;
                case 2:

                    filasRectangulo = comprobarDatoFilaRectangulo();
                    columnasRectangulo = comprobarDatoColumnaRectangulo();
                    imprimirRectangulo(filasRectangulo, columnasRectangulo);
                    break;
                case 0:
                    salir = true;
                    System.out.println("Adiós!!");
                    break;
                default:
                    error++;
                    System.out.printf("Error número %d, opción inválida. \n", error);
                    if (error == 3) {
                        System.out.println("Se ha superado el número maximo de errores. Adiós!!");
                        salir = true;
                    }
                    break;
            }

        } while (!salir);

        System.out.println("Fin del programa");
        sc.close();

    }

    /**
     * Impresión rectángulo
     * 
     * @param filasRectangulo
     * @param columasRectangulo
     */
    public static void imprimirRectangulo(int filasRectangulo, int columasRectangulo) {

        System.out.printf("\n");

        for (int i = 0; i < filasRectangulo; i++) {
            for (int j = 0; j < columasRectangulo; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }

    /**
     * Impresión triángulo
     * 
     * @param nivelesTriangulo
     */
    public static void imprimirTriangulo(int nivelesTriangulo) {

        System.out.printf("\n");

        for (int i = 1; i <= nivelesTriangulo; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }

    /**
     * Muestra el menú
     */
    public static void presentarMenu() {
        System.out.println("1. Triángulo");
        System.out.println("2. Rectángulo");
        System.out.println("0. Salir");
    }

    /**
     * Pide y comprueba los parámetros del triángulo
     * 
     * @return
     */
    public static int comprobarDatoTriangulo() {

        Scanner sc = new Scanner(System.in);

        int dato;
        do {

            System.out
                    .println(
                            "Se imprimirá un triángulo. Introduzca el número de niveles (entre 2 y 20) que lo formarán:");
            try {
                dato = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Debe introducir un número entero");
                sc.nextLine();
                dato = 100;
            }
        } while (dato > 20 || dato < 2);

        return dato;
    }

    /**
     * Comprueba los parámetros de la fila del rectángulo
     * @return
     */
    public static int comprobarDatoFilaRectangulo() {

        Scanner sc = new Scanner(System.in);

        int dato;
        do {

            System.out
                    .println(
                            "Se imprimirá un rectangulo. Introduzca el número de filas (entre 2 y 20) que lo formarán:");
            try {
                dato = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Debe introducir un número entero");
                sc.nextLine();
                dato = 100;
            }
        } while (dato > 20 || dato < 2);

        return dato;
    }

    /**
     * Comprueba los datos de las columnas del rectángulo
     * @return
     */
    public static int comprobarDatoColumnaRectangulo() {

        Scanner sc = new Scanner(System.in);

        int dato;
        do {

            System.out
                    .println(
                            "Se imprimirá un rectangulo. Introduzca el número de columnas (entre 2 y 20) que lo formarán:");
            try {
                dato = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Debe introducir un número entero");
                sc.nextLine();
                dato = 100;
            }
        } while (dato > 20 || dato < 2);

        return dato;
    }
}
