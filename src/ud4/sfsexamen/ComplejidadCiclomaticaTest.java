package ud4.sfsexamen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ComplejidadCiclomaticaTest {

    @Test
    void testGrafo1() {
        int[][] grafo1 = {
                {1},
                {3, 5},
                {1},
                {2, 4},
                {6},
                {6},
                {}
        };
        assertEquals(3, ComplejidadCiclomatica.complejidadCiclomatica(grafo1));
    }

    @Test
    void testGrafo2() {
        int[][] grafo2 = {
                {1, 6},
                {2, 5},
                {3, 4},
                {4},
                {1},
                {0},
                {}
        };
        assertEquals(4, ComplejidadCiclomatica.complejidadCiclomatica(grafo2));
    }

    @Test
    void testGrafoSinCiclos() {
        int[][] grafoSinCiclos = {
                {1},
                {2},
                {3},
                {}
        };
        assertEquals(1, ComplejidadCiclomatica.complejidadCiclomatica(grafoSinCiclos));
    }

    @Test
    void testGrafoConUnSoloNodo() {
        int[][] grafoUnNodo = {
                {}
        };
        assertEquals(1, ComplejidadCiclomatica.complejidadCiclomatica(grafoUnNodo));
    }

    @Test
    void testGrafoComplejo1() {
        int[][] grafoComplejo1 = {
                {1, 2},
                {3},
                {3},
                {4, 5},
                {6},
                {6, 7},
                {8},
                {8},
                {9},
                {}
        };
        assertEquals(4, ComplejidadCiclomatica.complejidadCiclomatica(grafoComplejo1));
    }

    @Test
    void testGrafoComplejo2() {
        int[][] grafoComplejo2 = {
                {1, 2, 3},
                {4},
                {4, 5},
                {5},
                {6},
                {6, 7},
                {8},
                {8, 9},
                {10},
                {10},
                {}
        };
        assertEquals(6, ComplejidadCiclomatica.complejidadCiclomatica(grafoComplejo2));
    }
}