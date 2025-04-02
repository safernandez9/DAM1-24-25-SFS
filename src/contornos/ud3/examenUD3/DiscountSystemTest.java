//Saúl Fernández Salgado

package contornos.ud3.examenUD3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.Test;

import contornos.ud3.Pruebas.PasswordValidator;

public class DiscountSystemTest {

   /* @Test
    void testApplyDiscountError() {
        assertEquals(, DiscountSystem.applyDiscount(-1, true));
    }
*/

    @Test
    void testApplyDiscountDiez() {
        assertEquals(90.9, DiscountSystem.applyDiscount(101, false));
    }

    @Test
    void testApplyDiscountNada() {
        assertEquals(1, DiscountSystem.applyDiscount(1, false));
    }

    @Test
    void testApplyDiscountCinco() {
        assertEquals(71.25, DiscountSystem.applyDiscount(75, false));
    }

    @Test
    void testApplyDiscountDiezSegundoCamino() {
        assertEquals(184.5, DiscountSystem.applyDiscount(205, false));
    }

    @Test
    void testApplyDiscountFidelizacion() {
        assertEquals(174.25, DiscountSystem.applyDiscount(205, true));
    }

}
