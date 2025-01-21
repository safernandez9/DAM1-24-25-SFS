package ud4.arraysapuntes;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class E0511 {
    public static void main(String[] args) {
        int longCombinacion;

        Scanner sc = new Scanner(System.in);
        System.out.println("Adivina la combinación secreta");
        System.out.print("Cuántos dígitos tendrá la combinación? ");
        longCombinacion = sc.nextInt();

        int[] combinacionSecreta = generarCombinacion(longCombinacion);

        int[] combinacionUsuario = leerCombinacion(longCombinacion);
        while (!Arrays.equals(combinacionSecreta, combinacionUsuario)) {
            mostrarPistas(combinacionSecreta, combinacionUsuario);
            combinacionUsuario = leerCombinacion(longCombinacion);
        }

        System.out.println("ENHORABUENA!!");
    }

    static void mostrarPistas(int[] tSecreto, int[] tUsuario) {
        for (int i = 0; i < tUsuario.length; i++) {
            if (tSecreto[i] == tUsuario[i])
                System.out.print("= ");
            else if (tSecreto[i] > tUsuario[i])
                System.out.print("> ");
            else 
                System.out.print("<");
        }
        System.out.println();
    }

    static int[] leerCombinacion(int n) {
        Scanner sc = new Scanner(System.in);
        int[] combinacion = new int[n];
        System.out.println("Introduce los " + n + " dígitos de la combinación");
        for (int i = 0; i < combinacion.length; i++) {
            combinacion[i] = sc.nextInt();
        }
        return combinacion;
    }

    static int[] generarCombinacion(int n) {
        Random rnd = new Random();
        int[] combinacion = new int[n];
        for (int i = 0; i < combinacion.length; i++)
            combinacion[i] = rnd.nextInt(5) + 1;
        return combinacion;
    }

}
