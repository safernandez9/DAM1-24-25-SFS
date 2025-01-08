package ud4.apuntes;

import java.util.Random;
import java.util.Scanner;

public class FucionBuscar {

    final static int TAMANO = 20;

    public static void main(String[] args) {

        int[] numeros = new int[TAMANO];
        construirArray(numeros);
    }

    public static void construirArray(int[] numeros){ // Acepta Arrays de cualquier tamaño

        Random ran = new Random();
        
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = ran.nextInt(101);
        }

    }

    public static void buscar (int lista[], int clave){

        for()
    }
}
