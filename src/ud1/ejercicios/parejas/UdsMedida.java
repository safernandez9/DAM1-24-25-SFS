// Eloy Eidon Loira (piloto) y Saul Fernandez Salgado (copiloto)

/*
 * Realiza un programa que acepte por teclado un número de hectáreas e imprima a cuántos campos de fútbol equivale.
 * Calcula e imprime el valor de superficie introducido en número de campos de baloncesto, de tenis, etc.
 * 
 * Para los cálculos puedes usar las siguientes dimensiones:
 * 1 hectárea = 100 x 100 metros = 10000 m2
 * Campo de fútbol según la FIFA (media): 105 x 70 metros 
 * Cancha de baloncesto: 28 x 15 metros
 * Pista de tenis (dobles): 23,77 x 10,97 metros
 * Parque del Retiro: 125 hectáreas
 * 
 * Formatea y redondea la salida de resultados a tu criterio (dos decimales como máximo) para favorecer la legibilidad.
 */




package ud1.ejercicios.parejas;

import java.util.Scanner;

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