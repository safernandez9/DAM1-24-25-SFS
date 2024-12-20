package ud2.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones1_3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int x = 0, y = 0, z = 0, k = 0;

        x = leerEntero("Introduce primer número entero: ");
        y = leerEntero("Introduce segundo número entero: ");
        z = leerEntero("Introduce tercer número entero: ");
        k = leerEntero("Introduce cuarto número entero: ");

        System.out.println("int introducido -> " + x);
        System.out.println("int introducido -> " + y);
        System.out.println("int introducido -> " + z);
        System.out.println("int introducido -> " + k);
    }

    public static int leerEntero(String s) {
        boolean repetir;
        int n = 0;
        do {
            repetir = false;
            try {
                System.out.print(s);
                n = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido");
                repetir = true;
                sc.nextLine();
            }
        } while (repetir);
        return n;
    }

}
