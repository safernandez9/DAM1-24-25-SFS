package ud2.ejercicios;

import java.util.Scanner;

public class HoraMasUnSegundo {
    public static void main(String[] args) {

        int hora, minuto, segundo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la hora");
        hora = sc.nextInt();
        if(hora >= 24 || hora < 0){
            System.out.println("Error");
        }
        System.out.println("Introduzca el minuto");
        minuto = sc.nextInt();
        if(minuto >= 60 || minuto < 0){
            System.out.println("Error");
        }
        System.out.println("Introduzca el segundo");
        segundo = sc.nextInt();
        if(hora >= 24 || hora < 0){
            System.out.println("Error");
        }
        sc.close();

        if (segundo + 1 == 60) {
            minuto += 1;
            segundo = 0;
            if (minuto == 60) {
                hora += 1;
                minuto = 0;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }

        System.out.printf("La hora un segundo después será %d:%d:%d", hora, minuto, segundo);
    }
}
