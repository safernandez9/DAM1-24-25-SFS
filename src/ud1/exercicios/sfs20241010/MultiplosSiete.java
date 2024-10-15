//Ejercicio de simulacro de examen 1

/*
 * Escribe un programa que tome como entrada un número entero e indique qué cantidad hay que sumarle para que el 
 * resultado sea múltiplo de 7. Un ejemplo:
 * A 2 hay que sumarle 5 para que el resultado (2+5=7) sea múltiplo de 7.
 * A 13 hay que sumarle 1 para que el resultado (13+1=14) sea múltiplo de 7.
 * A 14 no hay que sumarle nada (0) para que sea múltiplo de 7
*/

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