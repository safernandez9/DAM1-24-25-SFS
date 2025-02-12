package ud4.stringsapuntes;

/**
 * E0601. Escribir un programa que muestre todos los caracteres Unicode junto a su code
 * point, cuyo valor esté comprendido entre \u0000 y \uFFFF.
 * ¿Qué caracteres se representan en la consola?
 */

public class E0601 {
    public static void main(String[] args) {
        for (int i = 0; i < 512; i++) // máximo = 65536
            System.out.println(i + " -> " + (char) i );        
    }
}
