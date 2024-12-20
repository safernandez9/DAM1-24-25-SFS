package ud2.funciones;

import java.util.Scanner;

public class MetodoVoid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.print("Introduce cadena de texto: ");
        cadena = sc.nextLine();
        sc.close();
        cajaTexto(cadena); // llamada al método que crea un recuadro con #

        cajaTexto(cadena, '+'); // llamada al método que crea un recuadro con otro caracter

    }

    // método que muestra un String rodeado por un borde
    public static void cajaTexto(String str) {
        int n = str.length(); // longitud del String

        imprimirLinea(n);
        System.out.println("# " + str + " #"); // cadena con un borde en cada lado
        imprimirLinea(n);
    }

    public static void imprimirLinea(int n) {
        for (int i = 1; i <= n + 4; i++) { // borde de arriba
            System.out.print("#");
        }
        System.out.println();
    }

    // método que muestra un String rodeado por un borde
    public static void cajaTexto(String str, char ch) {
        int n = str.length(); // longitud del String

        imprimirLinea(n, ch);
        System.out.println(ch + " " + str + " " + ch); // cadena con un borde en cada lado
        imprimirLinea(n, ch);
    }

    public static void imprimirLinea(int n, char ch) {
        for (int i = 1; i <= n + 4; i++) { // borde de arriba
            System.out.print(ch);
        }
        System.out.println();
    }

}
