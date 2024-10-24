/*E0214. Crear una aplicación que solicite al usuario una fecha (día, mes, año) y muestre la
 *fecha correspondiente al día siguiente.
*/

package ud2.ejercicios;

import java.util.Scanner;

public class FechaDiaSiguiente {

    public static void main(String[] args) {

        int dia, mes, anho;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una fecha:");
        System.out.println("Dia:");
        dia = sc.nextInt();

        System.out.println("Mes (En número):");
        mes = sc.nextInt();

        System.out.println("Año");
        anho = sc.nextInt();
        sc.close();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (dia <= 31 && dia > 0) {
                    if (dia == 31) {
                        dia = 1;
                        mes += 1;
                        if (mes >= 12) {
                            mes = 1;
                            anho += 1;
                        }

                    } else {
                        dia += 1;
                        break;
                    }
                    System.out.printf("La fecha del dia siguiente es: %2d/%2d/%2d", dia, mes, anho);
                } else {
                    System.out.println("Fecha incorrecta");
                }
                break;
            case 4, 6, 9, 11:
                if (dia <= 30 && dia > 0) {
                    if (dia == 30) {
                        dia = 1;
                        mes += 1;
                    } else {
                        dia += 1;
                        break;
                    }
                    System.out.printf("La fecha del dia siguiente es: %2d/%2d/%2d", dia, mes, anho);
                } else {
                    System.out.println("Fecha incorrecta");
                }
                break;
            case 2:
                if (dia <= 28 && dia > 0) {
                    if (dia == 28) {
                        dia = 1;
                        mes += 1;
                    } else {
                        dia += 1;
                        break;
                    }
                    System.out.printf("La fecha del dia siguiente es: %2d/%2d/%2d", dia, mes, anho);

                } else {
                    System.out.println("Fecha incorrecta");
                }
            default:
                System.out.println("La fecha es incorrecta");
                break;
        }



    }
}
