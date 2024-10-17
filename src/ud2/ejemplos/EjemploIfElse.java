package ud2.ejemplos;

/*
 * Programa que pide una nota por teclado y muestra si se ha aprobado o no
 */
import java.util.*;

public class EjemploIfElse {
    public static void main(String[] args) {

        int nota;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nota: ");
        nota = sc.nextInt();
        sc.close();

        if (nota >= 5) {
            System.out.println("Enhorabuena!!");
            System.out.println("Has aprobado");
        } else {
            System.out.println("Lo siento, has suspendido");
        }

        System.out.println("Hasta Pronto!");
    }
}