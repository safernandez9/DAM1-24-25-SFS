package ud2.ejemplos;

// Rectángulo sólido de asteriscos.
import java.util.Scanner;

public class EjemploBuclesAnidados1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas;
        // leer número de filas hasta que sea un número > 1
        do {
            System.out.print("Introduce número de filas: ");
            filas = sc.nextInt();
            if (filas < 2)
                System.out.println("El número debe ser mayor de 1.");
        } while (filas < 2);

        // leer número de columnas hasta que sea un número > 1
        do {
            System.out.print("Introduce número de columnas: ");
            columnas = sc.nextInt();
            if (columnas < 2)
                System.out.println("El número debe ser mayor de 1.");            
        } while (columnas < 2);
        sc.close();

        for (int i = 0; i < filas; i++) { // for para las filas
            for (int j = 0; j < columnas; j++) { // for para las columnas
                System.out.print(" * ");
            } // fin del for para las columnas

            System.out.println();
        } // fin del for para las filas
    }
}
