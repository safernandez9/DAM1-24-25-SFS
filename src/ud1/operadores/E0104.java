package ud1.operadores;

import java.util.Scanner;

public class E0104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el año actual: ");
        int anhoActual;
        anhoActual = sc.nextInt();

        System.out.print("Introduce el año de nacimiento: ");
        int anhoNacimiento;
        anhoNacimiento = sc.nextInt();
        sc.close();

        int edad = anhoActual - anhoNacimiento;

        System.out.println("Tienes " + edad + " años .. \n ..suponiendo que ya haya pasado tu cumpleaños..)");
    }
}
