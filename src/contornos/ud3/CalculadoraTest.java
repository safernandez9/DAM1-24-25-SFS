package contornos.ud3;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculadoraTest {
    @Test
    public void testDivisionPorCero() {
        Calculadora calcu = new Calculadora(10, 0);
        try {
            int resultado = calcu.divide();
            fail ("Debería das una excepción");
        } catch (Exception e) {
            // TODO: handle exception
            // Prueba OK
        }
    }

    @ParameterizedTest
    @CsvSource({ "10, 20, 0",
                 "30, -2, -15",
                 "8, 3, 2" })
    public void testDivide1(int a, int b, int valorEsperado) {
        Calculadora calcu = new Calculadora(a, b);
        int resultado = calcu.divide();
        assertEquals(valorEsperado, resultado);
    }

    @ParameterizedTest
    @CsvSource({ "10, 0, 0",
                 "10, -1, -10",
                 "-10, -1, 10",
                 "10, 10, 100" })    
    void testMultiplica(int a, int b, int valorEsperado) {
        Calculadora calcu = new Calculadora(a, b);
        int resultado = calcu.multiplica();
        assertEquals(valorEsperado, resultado);
    }

    @Test
    void testResta() {
        double valorEsperado = 10;
        Calculadora calcu = new Calculadora(20, 10);
        double resultado = calcu.resta();
        assertEquals(valorEsperado, resultado, 0);
    }

    @Test
    void testSuma() {
        double valorEsperado = 30;
        Calculadora calcu = new Calculadora(20, 10);
        double resultado = calcu.suma();
        assertEquals(valorEsperado, resultado, 0);
    }
}
