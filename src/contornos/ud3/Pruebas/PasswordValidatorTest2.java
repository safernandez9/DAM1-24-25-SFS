package contornos.ud3.Pruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordValidatorTest2 {
    @Test
    void testIsValid() {

         assertEquals(false, PasswordValidator.isValid("hola"));
         
    }
}
