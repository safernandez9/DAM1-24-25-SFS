//Eloy Eidon Loila (copiloto) Saul Fernandez Salgado (Piloto)

/* Dada la siguiente receta de compota de manzana, pensada para 6 personas, u otra similar que encuentres en Internet,
 * realiza un programa que haga lo siguiente:
 * 
 * 
 * 1. Mostrar un nombre o título adecuado en pantalla.
 * 2. Mostrar la URL de la receta elegida.
 * 3. Mostrar el número de personas y las cantidades necesarias de manzana, agua, azúcar y limón para las que 
 * está pensada la receta elegida.
 * 4. Opcionalmente puedes mostrar los otros ingredientes en otra línea de salida.
 * 
 * Solicitar por teclado al usuario un número de personas para el cual adaptar la receta.
 * Mostrar por pantalla las cantidades de manzana, agua, azúcar y limón necesarias para elaborar la receta 
 * para el número de personas introducido.
 */

package ud1.ejercicios.parejas;

import java.util.Scanner;

public class RecetaDeCompota {

    public static void main(String[] args) {

        final double PERSONAS_BASE = 6;

        double personas;
        double manzanaKg = 1.5;
        double aguaMl = 330;
        double azucarGr = 120;
        double limonCu = 1;
        double naranjaPl = 1;
        double canelaRm = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("RECETA DE COMPOTA DE MANZANA\n");
        System.out.println(
                "Puede consultarla en el siguiente enlace ----> https://www.recetasderechupete.com/compota-de-manzana-casera/12509/\n");

        System.out.println("Las cantidades de ingredientes para seis persona son las siguientes:");
        System.out.println("1kg y medio de Manzanas");
        System.out.println("330 ml de Agua");
        System.out.println("120 g de Azucar");
        System.out.println("1 cucharadita de zumo de limon");
        System.out.println("La piel sin el blanco de una naranja");
        System.out.println("Una ramita de canela");

        System.out.println("Por favor, introduzca la cantidad de personas para la que se hara la receta");
        personas = sc.nextDouble();

        manzanaKg = personas * manzanaKg/PERSONAS_BASE;
        aguaMl = personas * aguaMl/PERSONAS_BASE;
        azucarGr = personas * azucarGr/PERSONAS_BASE;
        limonCu = personas * limonCu/PERSONAS_BASE;
        naranjaPl = personas * naranjaPl/PERSONAS_BASE;
        canelaRm = personas * canelaRm/PERSONAS_BASE;

        System.out.printf("Las cantidades de ingredientes para %f persona son las siguientes:\n", personas);
        System.out.printf("%.2f kg de Manzanas\n", manzanaKg);
        System.out.printf("%.2f ml de Agua\n", aguaMl);
        System.out.printf("%.2f g de Azucar\n", azucarGr);
        System.out.printf("%.0f cucharaditas de zumo de limon\n", limonCu);
        System.out.printf("Las pieles sin el blanco de %.0f naranja\n", naranjaPl);
        System.out.printf("%.0f ramitas de canela\n", canelaRm);

        sc.close();
    }

}