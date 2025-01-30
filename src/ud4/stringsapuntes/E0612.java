package ud4.stringsapuntes;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class E0612 {

    public static void main(String[] args) {
        System.out.println(sonAnagrama("amor", "roma")); // true
        System.out.println(sonAnagrama("Amor", "Roma")); // true
        System.out.println(sonAnagrama("amor", "rollo")); // false

        System.out.println("askjdh as  alksjdh  aslkdjhasd   alskjdhaskljdhs adasd".replaceAll("\\s", ""));
    }

    private static boolean sonAnagrama(String cad1, String cad2) {
        char[] t1 = cad1.toLowerCase().toCharArray();
        char[] t2 = cad2.toLowerCase().toCharArray();

        Arrays.sort(t1);
        Arrays.sort(t2);

        return Arrays.equals(t1, t2);
    }

    @Test
    void testAnagramas() {
        assertTrue(sonAnagrama("amor", "roma"));
        assertTrue(sonAnagrama("Listen", "Silent"));
    }

    @Test
    void testNoAnagramas() {
        assertFalse(sonAnagrama("hola", "adios"));
        assertFalse(sonAnagrama("perro", "gato"));
    }

    @Test
    void testCadenasVacias() {
        assertTrue(sonAnagrama("", ""));
    }

    @Test
    void testCadenasConEspacios() {
        assertTrue(sonAnagrama("a b c", "c b a"));
        assertFalse(sonAnagrama("a b c", "ab c"));
    }

    @Test
    void testComparacionSinSensibilidadAMayusculas() {
        assertTrue(sonAnagrama("aBc", "cBA"));
        assertFalse(sonAnagrama("abc", "abcd"));
    }

    @Test
    void testCadenasDeLongitudDiferente() {
        assertFalse(sonAnagrama("abc", "abcd"));
        assertFalse(sonAnagrama("cat", "dogs"));
    }

    @Test
    void testCaracteresEspeciales() {
        assertTrue(sonAnagrama("¡Hola!", "¡aloH!"));
        assertTrue(sonAnagrama("#123", "321#"));
    }

    @Test
    void testCadenasConNumeros() {
        assertTrue(sonAnagrama("12345", "54321"));
        assertTrue(sonAnagrama("1234", "4321"));
    }

    @Test
    void testSonAnagrama_CasosBasicos() {
        assertTrue(sonAnagrama("listen", "silent"));
        assertTrue(sonAnagrama("triangle", "integral"));
        assertTrue(sonAnagrama("debit card", "bad credit"));
    }

    @Test
    void testSonAnagrama_CasosConDiferentesMayusculasYMinusculas() {
        assertTrue(sonAnagrama("Listen", "Silent"));
        assertTrue(sonAnagrama("Triangle", "Integral"));
        assertTrue(sonAnagrama("Debit Card", "Bad Credit"));
    }

    @Test
    void testSonAnagrama_CasosConEspacios() {
        assertTrue(sonAnagrama("astronomer", "moon starer"));
        assertTrue(sonAnagrama("the eyes", "they see"));
    }

    @Test
    void testSonAnagrama_CasosConCaracteresEspeciales() {
        assertTrue(sonAnagrama("dormitory", "dirty room"));
        assertTrue(sonAnagrama("eleven plus two", "twelve plus one"));
    }

    @Test
    void testSonAnagrama_CasosNoAnagramas() {
        assertFalse(sonAnagrama("hello", "world"));
        assertFalse(sonAnagrama("apple", "pale"));
        assertFalse(sonAnagrama("cat", "dog"));
    }

    @Test
    void testSonAnagrama_CasosConLongitudesDiferentes() {
        assertFalse(sonAnagrama("short", "longer"));
        assertFalse(sonAnagrama("one", "three"));
    }

    @Test
    void testSonAnagrama_CasosConCadenasVacias() {
        assertTrue(sonAnagrama("", ""));
        assertFalse(sonAnagrama("", "not empty"));
        assertFalse(sonAnagrama("not empty", ""));
    }

    @Test
    void testSonAnagrama_CasosConUnSoloCaracter() {
        assertTrue(sonAnagrama("a", "a"));
        assertFalse(sonAnagrama("a", "b"));
    }

    @Test
    void testSonAnagrama_CasosConNumeros() {
        assertTrue(sonAnagrama("123", "321"));
        assertFalse(sonAnagrama("123", "1234"));
    }

    @Test
    void testSonAnagrama_CasosConCaracteresUnicode() {
        assertTrue(sonAnagrama("café", "éfac"));
        assertFalse(sonAnagrama("café", "cafe"));
    }

}
