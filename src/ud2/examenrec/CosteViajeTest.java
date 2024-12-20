package ud2.examenrec;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CosteViajeTest {
    final double PRECIO_LITRO_GASOLINA = 1.521;
    final double PRECIO_LITRO_DIESEL = 1.435;
    final double PRECIO_KWH = 0.16591;

    @Test
    public void testCosteViajeGasolina() {
        double km = 100;
        byte combustible = 0; // Gasolina
        double consumoMedio = 7.5;

        double costeEsperado = (km / 100.0) * consumoMedio * PRECIO_LITRO_GASOLINA;
        double costeCalculado = CosteViaje.costeViaje(km, combustible, consumoMedio);

        assertEquals(costeEsperado, costeCalculado, 0.001);
    }

    @Test
    public void testCosteViajeDiesel() {
        double km = 150;
        byte combustible = 1; // Diesel
        double consumoMedio = 6.0;

        double costeEsperado = (km / 100.0) * consumoMedio * PRECIO_LITRO_DIESEL;
        double costeCalculado = CosteViaje.costeViaje(km, combustible, consumoMedio);

        assertEquals(costeEsperado, costeCalculado, 0.001);
    }

    @Test
    public void testCosteViajeElectricidad() {
        double km = 80;
        byte combustible = 2; // Electricidad
        double consumoMedio = 15.0;

        double costeEsperado = (km / 100.0) * consumoMedio * PRECIO_KWH;
        double costeCalculado = CosteViaje.costeViaje(km, combustible, consumoMedio);

        assertEquals(costeEsperado, costeCalculado, 0.001);
    }


}
