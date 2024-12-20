package ud3.apuntes.ejerciciosmath;

import java.math.BigInteger;

public class FactorialBigInteger {
    public static void main(String[] args) {
        int numero = 50;

        BigInteger factorial = factorial(numero);

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }

    private static BigInteger factorial(int n) {
        // Inicializa el acumulador multiplicador a 1
        BigInteger resultado = BigInteger.ONE;

        // Iterativamente multiplica el número desde 1 hasta n
        for (int i = 1; i <= n; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }

        return resultado;
    }
}
