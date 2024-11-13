package ud2.ejercicioscondicionales;

import java.time.LocalTime;
import java.util.Scanner;

public class EP0217_Bis {
    public static void main(String[] args) {
        // Genera un número entero entre 1 y 99
        int MAX = 99;
        int MIN = 1;

        int num1 = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        int num2 = (int) (Math.random() * (MAX - MIN + 1)) + MIN;

        Scanner sc = new Scanner(System.in);
        LocalTime horaInicial = LocalTime.now();
        System.out.printf("Escribe el resultado de sumar %d y %d: ", num1, num2);
        int sumaUsuario = sc.nextInt();
        sc.close();
        LocalTime horaFinal = LocalTime.now();

        if (sumaUsuario == num1 + num2) {
            System.out.println("Enhorabuena!! Has acertado!!");
            System.out.printf("Has tardado %d segundos %n", horaFinal.toSecondOfDay() - horaInicial.toSecondOfDay());
        } else {
            System.out.printf("ERROR!! El resultado era %d%n", num1 + num2);
        }

    }
}
