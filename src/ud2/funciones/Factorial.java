package ud2.funciones;

public class Factorial {


    // Método Java iterativo para calcular el factorial de un número entero positivo
    public static long factorialIterativo(int n) {
        long factorial = 1;


        if (n == 0) {
            factorial = 1;
        } else {
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
        }
        return factorial;
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
        System.out.println(factorialIterativo(5));


        System.out.println(factorial(5));
    }
}

