//Saul Fernandez Salgado 
package contornos.ud3.examenUD3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmailValidatorTest {
    @Test
    void testIsValidNull() {
        assertEquals(false, EmailValidator.isValid(null));
    }

    @Test
    void testIsValidOK() {
        assertEquals(true, EmailValidator.isValid("safernandez9@gmail.com"));
    }

    @Test
    void testIsValidNoArroba() {
        assertEquals(false, EmailValidator.isValid("safernandez9gmail.com"));
    }

    @Test
    void testIsValidDosArroba() {
        assertEquals(false, EmailValidator.isValid("safernandez9@@gmail.com"));
    }

    @Test
    void testIsValidNoPunto() {
        assertEquals(false, EmailValidator.isValid("safernandez9@gmailcom"));
    }

    @Test
    void testIsValidVacioAntes() {
        assertEquals(false, EmailValidator.isValid("@gmail.com"));
    }

   
}
