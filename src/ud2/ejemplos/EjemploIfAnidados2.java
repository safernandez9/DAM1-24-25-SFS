package ud2.ejemplos;

// programa que lee una nota y escribe la calificación correspondiente
import java.util.*;

public class EjemploIfAnidados2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.println("Introduzca una nota entre 0 y 10: ");
        nota = sc.nextDouble();
        sc.close();

        System.out.println("La calificación del alumno es ");
        if (nota < 0 || nota > 10) {
            System.out.println("Nota no válida");
        } else if (nota == 10) {
            System.out.println("Matrícula de Honor");
        } else if (nota >= 9) {
            System.out.println("Sobresaliente");
        } else if (nota >= 7) {
            System.out.println("Notable");
        } else if (nota >= 6) {
            System.out.println("Bien");
        } else if (nota >= 5) {
            System.out.println("Suficiente");
        } else {
            System.out.println("Suspenso");
        }
    }
}
