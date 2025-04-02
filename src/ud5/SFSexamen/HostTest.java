package ud5.SFSexamen;

import static org.junit.Assert.fail;

import org.junit.Test;

public class HostTest {
    @Test
    public void testConstructor_ValidValues() {
        Host host = new Host("Servidor1", "192.168.1.1", "00:1A:2B:3C:4D:5E");
    }

    @Test
    public void testConstructor_NombreNulo() {
        try {
            new Host(null, "192.168.1.1", "00:1A:2B:3C:4D:5E");
            fail ("El nombre es nulo. Debería generar una excepción");
        } catch (Exception e) {
        }
    }

    @Test
    public void testConstructor_IPInvalida() {
        try {
            new Host("Servidor1", "999,999,999.999", "00:1A:2B:3C:4D:5E");
            fail ("IP inválida. Debería generar una excepción");
        } catch (Exception e) {
        }
    }

    @Test
    public void testConstructor_IPNula() {
        new Host("Servidor1", null, "00:1A:2B:3C:4D:5E");
    }    
   
    
    @Test
    public void testConstructor_MACInvalida() {
        try {
            new Host("Servidor1", null, "HH:1A:2B:3C:4D:5E");
            fail ("Dirección MAC inválida. Debería generar una excepción");
        } catch (Exception e) {
        }
    }
    
    @Test
    public void testConstructor_MACNula() {
        try {
            new Host("Servidor1", null, null);
            fail ("Dirección MAC nula. Debería generar una excepción");
        } catch (Exception e) {
        }
    }
    
}
