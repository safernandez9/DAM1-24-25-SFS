package contornos.ud3.Pruebas;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
    @Test
    void testIsValid() {

        //Password menor de 8 dígitos
        assertEquals(false, PasswordValidator.isValid("hola"));

        //Password correcta
        assertEquals(true, PasswordValidator.isValid("Holaxxxx1"));

        //Password sin mayúscula
        assertEquals(false, PasswordValidator.isValid("holaxxxx1"));

        //No contiene un número
        assertEquals(false, PasswordValidator.isValid("Holaxxxxx"));

        //8 letras justas
        assertEquals(false, PasswordValidator.isValid("Holaxxx1"));
    }
}
