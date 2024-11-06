package ud2.ejemplos;

// Programa que lee un número entre 1 y 10 
import java.util.Scanner;

public class EjemploDoWhile2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do { // inicio del do .. while
            System.out.print("Escribe un número entero entre 1 y 10: ");
            n = sc.nextInt();
            if (n < 1 || n > 10) {
                System.out.println("Valor no válido");
            }
        } while (n < 1 || n > 10); // fin del do .. while
        sc.close();

        System.out.println("Ha introducido: " + n);
    }
}
