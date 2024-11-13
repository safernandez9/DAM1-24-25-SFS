package ud2.ejercicioscondicionales;

import java.util.Scanner;

public class EP0217_Random {
    public static void main(String[] args) {
        // Genera un número entero entre 1 y 99
        int MAX = 99;
        int MIN = 1;

        int num1 = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        int num2 = (int) (Math.random() * (MAX - MIN + 1)) + MIN;

        Scanner sc = new Scanner(System.in);
        System.out.printf("Escribe el resultado de sumar %d y %d: ", num1, num2);
        int sumaUsuario = sc.nextInt();
        sc.close();

        if (sumaUsuario == num1 + num2) {
            System.out.println("Enhorabuena!! Has acertado!!");
        } else {
            System.out.printf("ERROR!! El resultado era %d%n", num1 + num2);
        }

    }
}
