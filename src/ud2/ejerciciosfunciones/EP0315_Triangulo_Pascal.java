package ud2.ejerciciosfunciones;

/**
 * 
 */

public class EP0315_Triangulo_Pascal {
    
    public static void trianguloPascal(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                long valor = factorial(i) / (factorial(j) * factorial(i - j));
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    // Método Java recursivo para calcular el factorial de un número entero positivo
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        trianguloPascal(10);
    }

}
