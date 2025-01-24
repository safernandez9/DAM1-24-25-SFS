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

            System.out.printf("Se pueden construir un total de %d abadías en los picos: ", abadias[0]);
            for (int i = 1; i < abadias.length; i++) {
                System.out.println(" " + abadias[i]);
            }
        }

        sc.close();
    }

    static int[] getMontanasAbadias(int[] MontanasCordillera) {

        int picoMax;
        int[] abadias = new int[1];

        //Cargo en el primer elemento del array la montaña mas al este y guardo su altura

        abadias[0] = MontanasCordillera.length;
        picoMax = MontanasCordillera[MontanasCordillera.length - 1];

        //Comparo cada montaña con la mas alta a su este (drch), si es mayor la guardo como abadia
        //El Array abadia se incrementa por cada pico con abadia

        for (int i = MontanasCordillera.length - 2; i > 0; i--) {
            if (MontanasCordillera[i] > picoMax) {
                picoMax = MontanasCordillera[i];
                abadias = Arrays.copyOf(abadias, abadias.length + 1);
                abadias[abadias.length -1] = i + 1;
            }
        }

        //Incremento el Array una posicion mas para guardar el nº de abadias (esta celda queda a 0)
        abadias = Arrays.copyOf(abadias, abadias.length + 1);
        
        //Con el sort la celda con el 0 queda primera
        Arrays.sort(abadias);

        //Cargo en la primera celda el numero de abadías
        abadias[0] = abadias.length - 1;

        return abadias;
    }
}
