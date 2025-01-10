package ud4.arraysejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class EP0514_Sueldos {

    public static void main(String[] args) {

        int[] sueldosTemp = new int[100];

        int numSueldos = 0, suma = 0;
        int sueldo, maxSueldo, minSueldo;
        double mediaSueldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Sueldos y -1 para finalizar");

        while (true) {
            sueldo = sc.nextInt();
            if (sueldo == -1) {
                break;
            }
            sueldosTemp[numSueldos] = sueldo;
            numSueldos++;

        }

        int[] sueldos = Arrays.copyOf(sueldosTemp, numSueldos);

        if (sueldos.length == 0) {
            System.out.println("No hay sueldos");
            return;
        }

        Arrays.sort(sueldos);
        int[] sueldosDesc = new int[sueldos.length];

        for (int i = 0; i < sueldos.length; i++) {
            sueldosDesc[i] = sueldos[sueldos.length - 1 - i];
        }

        maxSueldo = sueldosDesc[0];
        minSueldo = sueldosDesc[sueldosDesc.length - 1];

        for (int i = 0; i < sueldos.length - 1; i++) {
            suma += sueldos[i];
        }

        mediaSueldo = (double) suma / sueldos.length;

        System.out.println("Sueldo Max " + maxSueldo);
        System.out.println("Sueldo Min" + minSueldo);
        System.out.println("Media " + mediaSueldo);

        for (int i = 0; i < sueldos.length - 1; i++) {
            System.out.println("Sueldos descendentes");
            System.out.println(" " + sueldosDesc[i]);
        }

        sc.close();
    }
}
