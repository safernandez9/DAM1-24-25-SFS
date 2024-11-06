package ud2.ejemplos;

public class EjemploBuclesAnidados3 {
    public static void main(String[] args) {
        int x, n;
        // mostrar la cabecera de la tabla
        System.out.printf("%10s%10s%10s%10s%n", "x", "x^2", "x^3", "x^4");
        for (x = 1; x <= 10; x++) { // filas
            for (n = 1; n <= 4; n++) { // columnas
                System.out.printf("%10.0f", Math.pow(x, n));
            } // fin del for para las columnas
            System.out.println();
        } // fin del for para las filas
    }
}
