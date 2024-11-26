//Saúl Fernández Salgado

package ud2.sfsexamen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class ChiclesRegalo {

    public static void main(String[] args) {
        int a;

        a = totalChicles(20, 2, 2);
        System.out.println(a);
    }
    public static int totalChicles(int nChiclesComprados, int nEnvoltoriosOferta, int nChiclesGratis) {

        int chiclesExtra = 0;
        int chiclesTotales;
        int premios;

        // Caso número negativo
        if (nChiclesComprados < 0 || nEnvoltoriosOferta < 0 || nChiclesGratis < 0) {
            return -1;
        }

        // Caso "No hay oferta"
        if (nEnvoltoriosOferta == 0) {
            return nChiclesComprados;
        }

        // Caso "Se dan mas chicles gratis que envoltorios se entregan"
        if (nChiclesGratis >= nEnvoltoriosOferta) {
            return -1;
        }

        // Cargo ya en el total los chicles comprados
        chiclesTotales = nChiclesComprados;

        // Numero de chicles extra que conseguimos con los chicles comprados
        do {
            premios = nChiclesComprados / nEnvoltoriosOferta;
            chiclesExtra = premios * nChiclesGratis;

            // Sumamos los chicles extra a los totales
            chiclesTotales += chiclesExtra;

            // Y si tenemos sudicientes para otro premio volvemos a ejecutar el bucle
            // usando como nChiclesComprados los extra

            nChiclesComprados = chiclesExtra + nChiclesComprados % nEnvoltoriosOferta;
            chiclesExtra = 0;
        } while (nChiclesComprados / nEnvoltoriosOferta != 0);

        return chiclesTotales;
    }

    @Test
    public void ChiclesRegaloTest() {
        assertEquals(31, totalChicles(25, 5, 1));
        assertEquals(6, totalChicles(5, 5, 1));
        assertEquals(111, totalChicles(100, 10, 1));
        assertEquals(-1, totalChicles(20, 2, 5));
        assertEquals(-1, totalChicles(10, -1, 0));
        assertEquals(-1, totalChicles(-1, 2, 1));
        assertEquals(-1, totalChicles(10, 1, -1));
        assertEquals(-1, totalChicles(20, 2, 2));
        assertEquals(10, totalChicles(7, 3, 1));
        assertEquals(40, totalChicles(27, 3, 1));
        assertEquals(21, totalChicles(11, 2, 1));
        assertEquals(31, totalChicles(16, 2, 1));
        assertEquals(100, totalChicles(100, 0, 0));
        assertEquals(100, totalChicles(100, 0, 1));
        assertEquals(0, totalChicles(0, 0, 1));
        assertEquals(0, totalChicles(0, 2, 1));
    }
}