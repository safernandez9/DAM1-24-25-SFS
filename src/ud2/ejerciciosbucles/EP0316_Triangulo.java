package ud2.ejerciciosbucles;

import java.util.Scanner;

public class EP0316_Triangulo {
    public static void main(String[] args) {

        int dimension;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número n, que será la base y altura del triangulo: ");
        dimension = sc.nextInt();
        sc.close();

        for (int i = 0; i < dimension; i++) {
            for (int j = dimension; j > 0; j--) {
                System.out.printf("*");
            } 
            

            System.out.println();
        }

    }
}
