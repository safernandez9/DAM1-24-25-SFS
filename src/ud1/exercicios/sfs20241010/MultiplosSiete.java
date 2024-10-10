package ud1.exercicios.sfs20241010;

import java.util.Scanner;

public class MultiplosSiete {

    public static void main(String[] args) {

        final int NUMERO = 7;
        int numeroUsuario;
        int resto;
        int resultado;

        Scanner sc = new Scanner(System.in);

        System.out.printf(
                "Introduzca un número entero y se le mostrará la cantidad a sumarle para obtener un múltiplo de %d:",
                NUMERO);
        numeroUsuario = sc.nextInt();
        sc.close();

        resto = numeroUsuario % NUMERO;
        resultado = NUMERO - resto;

        System.out.printf("Para obtener %d debes sumarle a %d %d unidades", NUMERO, numeroUsuario, resultado);

    }
}