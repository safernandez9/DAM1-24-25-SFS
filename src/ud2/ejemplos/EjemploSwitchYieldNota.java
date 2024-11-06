package ud2.ejemplos;

import java.util.Scanner;

public class EjemploSwitchYieldNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una nota entera entre 0 y 10: ");
        int nota = sc.nextInt();
        sc.close();
        String msg = switch (nota) {
            case 0, 1, 2, 3, 4 -> {
                yield "Suspenso \n Ánimo!";
            }
            case 5, 6 -> {yield "Bien";}
            case 7, 8 -> {yield "Notable";}
            case 9, 10 -> {yield "Sobresaliente";}
            default -> {yield "Nota inválida";}
        };

        System.out.println(msg);
    }

}
