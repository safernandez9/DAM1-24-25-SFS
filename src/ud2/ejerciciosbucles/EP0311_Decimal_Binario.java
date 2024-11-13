package ud2.ejerciciosbucles;

import java.util.Scanner;

/**
 * Realiza un programa que convierta un número entero decimal en su representación binaria. Hay que tener en cuenta que desconocemos cuántas cifras tiene el número que introduce el usuario.
Por simplicidad, iremos mostrando el número binario con un digito por línea.
 */

public class EP0311_Decimal_Binario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número en base decimal: ");
        int n = sc.nextInt();
        sc.close();
        String binario = "";

        while (n / 2 > 0) {
            binario = (n % 2) + binario;
            n = n / 2;
        }
        binario = n + binario;

        System.out.println(binario);
    }
}
