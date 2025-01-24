package ud4.arraysejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class AbadiasPirenaicas {

    public static void main(String[] args) {

        final int MAX_MONTANAS = 1000;
        int alturaMontana;

        int[] mont = new int[0];
        int[] abadias;

        Scanner sc = new Scanner(System.in);

        // Lectura anticipada que valida el primer dato de entrada

        System.out.println("Introdzca la altura de la montaña en metros o un número negativo en caso de querer salir");
        alturaMontana = sc.nextInt();

        while (mont.length != MAX_MONTANAS && alturaMontana > 0) {

            // Por cada elemento válido se amplia el array y se carga el nuevo elemento en
            // la celda que antes era la última

            mont = Arrays.copyOf(mont, mont.length + 1);
            mont[mont.length - 1] = alturaMontana;

            System.out.println(
                    "Introdzca la altura de la montaña en metros o un número negativo en caso de querer salir");
            alturaMontana = sc.nextInt();

        }

        if (mont.length > 0) {

            // Puedo inicializar el array así ya que solo hace falta copiar la referencia,
            // no es necesario volver a reservar memoria

            abadias = getMontanasAbadias(mont);

            System.out.printf("Se pueden construir un total de %d abadías en los picos: ", abadias[abadias.length - 1]);
            for (int i = 0; i < abadias.length - 2; i++) {
                System.out.println(" " + abadias[i]);
            }
        }

        sc.close();
    }

    static int[] getMontanasAbadias(int[] MontanasCordillera) {

        int picoMax;
        int[] abadias = new int[1];

        abadias[0] = MontanasCordillera.length;
        picoMax = MontanasCordillera[MontanasCordillera.length - 1];

        for (int i = MontanasCordillera.length - 2; i > 0; i--) {
            if (MontanasCordillera[i] > picoMax) {
                picoMax = MontanasCordillera[i];
                abadias = Arrays.copyOf(abadias, abadias.length + 1);
                abadias[abadias.length -1] = i + 1;
            }
        }

        abadias = Arrays.copyOf(abadias, abadias.length + 1);
        Arrays.sort(abadias);
        abadias[0] = abadias.length - 1;

        return abadias;
    }
}
