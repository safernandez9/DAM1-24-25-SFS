package ud4.arraysapuntes;

import ud3.sfsexamen.CocheCarreras;

/**
 * Referencias. Construye una tabla de 10 elementos del tipo que desees. Declara
 * diferentes variables de tabla que referenciarán la tabla creada. Comprueba, imprimiendo
 * por pantalla, que todas las variables contienen la misma referencia.
 */

public class Referencias {
    public static void main(String[] args) {
        CocheCarreras[] coches = new CocheCarreras[10];
        CocheCarreras[] coches2;

        coches[4] = new CocheCarreras("Rayo", 100, 180);

        coches2 = coches;

        coches2[4].mostrar();

        System.out.println("Fin de Programa");
    }
}
