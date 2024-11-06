package ud2.ejemplos;

import java.util.Scanner;

public class EjemploSwitchFlechaNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una nota entera entre 0 y 10: ");
        int nota = sc.nextInt();
        sc.close();
        switch (nota) {
            case 0, 1, 2, 3, 4 -> {
                System.out.println("Suspenso");
                System.out.println("Ánimo!");
            }
            case 5, 6 -> System.out.println("Bien");
            case 7, 8 -> System.out.println("Notable");
            case 9, 10 -> System.out.println("Sobresaliente");
            default -> System.out.println("Nota inválida");
        }
    }

}
