package ud2.ejercicios;

import java.util.Scanner;

public class Bisiesto {

    public static void main(String[] args) {

        double anho;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un año:");
        anho = sc.nextDouble();
        sc.close();

        // La primera condición del OR valida los años que son divisibles por 4 pero no
        // por 100
        // La segunda valida que si son divisibles por 4 y 100 tambien lo sean por 4
        
        if ((anho % 4 == 0 && anho % 100 != 0) || (anho % 4 == 0 && anho % 100 == 0 && anho % 400 == 0)) {
            System.out.printf("El año %f es bisiesto", anho);
        } else {
            System.out.printf("El año %f no es bisiesto", anho);
        }
    }
}
