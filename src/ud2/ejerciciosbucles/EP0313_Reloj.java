/*EP0313_Reloj. Escribe un programa que incremente la hora de un reloj. Se pedirán por
teclado la hora, minutos y segundos, así como cuántos segundos se desea incrementar la
hora introducida. La aplicación mostrará la nueva hora. Por ejemplo, si las 13:59:51 se
incrementan en 10 segundos, resultan las 14:00:01.
*/

package ud2.ejerciciosbucles;

import java.util.Scanner;

public class EP0313_Reloj {

    public static void main(String[] args) {

        int hora, min, seg, incrementoSeg;
        int i;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor introduzca una hora: ");
        hora = sc.nextInt();

        System.out.println("Por favor introduzca un minuto: ");
        min = sc.nextInt();

        System.out.println("Por favor introduzca una segundo: ");
        seg = sc.nextInt();

        System.out.println("Introduzca el número de segundos que quiere incrementar en l ahora introducida: ");
        incrementoSeg = sc.nextInt();

        sc.close();

        for (i = 0; i < incrementoSeg; i++) {
            seg += 1;
            if (seg == 60) {
                seg = 0;
                min++;
                if (min == 60) {
                    min = 0;
                    hora++;
                    if (hora == 24) {
                        hora = 0;
                    }
                }
            }
        }

        System.out.printf("La nueva hora es: %02d:%02d:%02d", hora, min, seg);
    }
}
