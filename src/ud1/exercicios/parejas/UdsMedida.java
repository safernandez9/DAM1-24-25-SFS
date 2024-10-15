// Eloy Eidon Loira (piloto) y Saul Fernandez Salgado (copiloto)
package ud1.ejercicios.parejas;

import java.util.Scanner;

/**
 * UdsMedida
 */
public class UdsMedida {

    public static void main(String[] args) {

        double ht;
        double camposFutbol = 105 * 70;
        double canchaBaloncesto = 28 * 15;
        double pistaTenis = 23.77 * 10.97;
        double parqueRetiro = 125 * 10000;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el número de hectareas");
        ht = sc.nextDouble();
        ht = ht * 10000;

        camposFutbol = ht / camposFutbol;
        canchaBaloncesto = ht / canchaBaloncesto;
        pistaTenis = ht / pistaTenis;
        parqueRetiro = ht / parqueRetiro;

        System.out.printf("La cantidad de hectareas medida en campos de futbol es %.2f\n", camposFutbol);
        System.out.printf("La cantidad de hectareas medida en campos de baloncesto es %.2f\n", canchaBaloncesto);
        System.out.printf("La cantidad de hectareas medida en campos de tenis es %.2f\n", pistaTenis);
        System.out.printf("La cantidad de hectareas medida en el parques de retiro es %.2f\n", parqueRetiro);
        sc.close();

    }
}