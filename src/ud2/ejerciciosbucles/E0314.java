package ud2.ejerciciosbucles;

/**
 * E0314. Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.
 */

public class E0314 {
    public static void main(String[] args) {
        // Proceso & Salida
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla de multiplicar del " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}
