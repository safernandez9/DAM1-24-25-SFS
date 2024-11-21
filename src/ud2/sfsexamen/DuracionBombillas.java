//Saúl Fernández Salgado

package ud2.sfsexamen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class DuracionBombillas {

    public static String causaFinBombilla(int nHoras, int nEncendidos, int horasEstimadas) {

        int encendidosPosibles;
        String causa = "";

        // Manejo entradas incorrectas
        if (nHoras <= 0 || nEncendidos <= 0 || horasEstimadas < 0 || horasEstimadas > 10 || horasEstimadas == 0) {
            return "ERROR";
        }
        
        encendidosPosibles = nHoras / horasEstimadas;

        // Manejo los 3 posibles casos
        if (encendidosPosibles < nEncendidos) {
            causa = "HORAS";
        } else if (encendidosPosibles > nEncendidos) {
            causa = "ENCENDIDOS";
        } else if (encendidosPosibles == nEncendidos) {
            causa = "ENCENDIDOS + HORAS";
        }

        return causa;

    }

    @Test
    public void causaFinBombillaTest() {
        assertEquals("ERROR", causaFinBombilla(100, 100, 100));
        assertEquals("ERROR", causaFinBombilla(1000, -10, 10));
        assertEquals("ERROR", causaFinBombilla(1000, 10, 0));
        assertEquals("HORAS", causaFinBombilla(1000, 200, 10));
        assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 1));
        assertEquals("ENCENDIDOS + HORAS", causaFinBombilla(1000, 100, 10));
    }

}
