package contornos.ud3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
//import java.util.NoSuchElementException;

public class LeerEnteroTest {

    private int simularEntrada(String input, int min, int max) {
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            return BuscaTesouro.leerEntero(min, max);
        } finally {
            System.setIn(stdin); // Restauramos a entrada estándar
        }
    }

    @Test
    void testEntradaValida() {
        int resultado = simularEntrada("5\n", 1, 10);
        assertEquals(5, resultado);
    }

    @Test
    void testNumeroForaDeRango() {
        int resultado = simularEntrada("15\n5\n", 1, 10);
        assertEquals(5, resultado);
    }

    @Test
    void testEntradaNonNumerica() {
        int resultado = simularEntrada("a\n5\n", 1, 10);
        assertEquals(5, resultado);
    }

    @Test
    void testMultiplesErrosAntesDeAcerto() {
        int resultado = simularEntrada("a\n15\n5\n", 1, 10);
        assertEquals(5, resultado);
    }

    @Test
    void testMinMaiorQueMaxLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> BuscaTesouro.leerEntero(10, 1));
    }
}

