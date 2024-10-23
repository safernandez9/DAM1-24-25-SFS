package ud2.ejercicios;

import java.util.Scanner;

public class AñoCorrecto {

    public static void main(String[] args) {

        int dia, mes, anho;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el dia");
        dia = sc.nextInt();
        System.out.println("Introduzca el mes");
        mes = sc.nextInt();
        System.out.println("Introduzca el año");
        anho = sc.nextInt();
        sc.close();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (dia <= 31 && dia > 0) {
                    System.out.println("La fecha es correcta");
                } else {
                    System.out.println("Fecha incorrecta");
                }
                break;
            case 4, 6, 9, 11:
                if (dia <= 30 && dia > 0) {
                    System.out.println("La fecha es correcta");
                } else {
                    System.out.println("Fecha incorrecta");
                }
                break;
            case 2:
                if (dia <= 28 && dia > 0) {
                    System.out.println("La fecha es correcta");
                } else {
                    System.out.println("Fecha incorrecta");
                }
            default:
                System.out.println("La fecha es incorrecta");
                break;
        }

    }
}
