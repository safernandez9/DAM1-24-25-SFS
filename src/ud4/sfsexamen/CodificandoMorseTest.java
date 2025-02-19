package ud4.sfsexamen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CodificandoMorseTest {
    @Test
    void testNumPuntosMorseLetra() {
        assertEquals(1, CodificandoMorse.numPuntosMorse("E"));
        assertEquals(15, CodificandoMorse.numPuntosMorse("?"));
        assertEquals(19, CodificandoMorse.numPuntosMorse("!"));
    }

    @Test
    void testNumPuntosMorseLetras() {
        assertEquals(11, CodificandoMorse.numPuntosMorse("SI"));
        assertEquals(23, CodificandoMorse.numPuntosMorse("OK"));
        assertEquals(33, CodificandoMorse.numPuntosMorse("VALE"));
    }

    @Test
    void testNumPuntosMorsePalabras() {
        assertEquals(73, CodificandoMorse.numPuntosMorse("YA NACIO"));
        assertEquals(55, CodificandoMorse.numPuntosMorse("SI VOY"));
        assertEquals(81, CodificandoMorse.numPuntosMorse("SI YA VOY"));
    }


    @Test
    void testCodificaMorse() {
        assertEquals(". . ... ... . .", CodificandoMorse.codificaMorse("?"));
        assertEquals("... . ... . ... ...", CodificandoMorse.codificaMorse("!"));
        assertEquals(". . .   . .", CodificandoMorse.codificaMorse("SI"));
        assertEquals("... . ... ...   . ...     ... .   . ...   ... . ... .   . .   ... ... ...", CodificandoMorse.codificaMorse("YA NACIO"));
        assertEquals(". . .   . .     . . . ...   ... ... ...   ... . ... ...", CodificandoMorse.codificaMorse("SI VOY"));
    }


}
