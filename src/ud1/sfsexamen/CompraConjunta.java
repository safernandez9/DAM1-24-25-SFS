//Saúl Fernández Salgado

package ud1.sfsexamen;

import java.util.Scanner;

public class CompraConjunta {

    public static void main(String[] args) {

        final String MONEDA = "EUROS";
        double precioTotalProducto;
        double precio1, precio2, precio3;
        double bote;
        double sobrante;
        double restante;
        String respuesta;

        // Pido datos por pantalla

        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa pedirá el precio de un artículo por" +
                " pantalla y la cantidad de dinero aportada por cada uno de los tres individuos" +
                " que participan en el pago");
        System.out.println();

        System.out.println("Introduzca el precio del artículo a comprar:");
        precioTotalProducto = sc.nextDouble();

        System.out.println("Por favor, introduzca la cantidad que pagará el primer individuo:");
        precio1 = sc.nextDouble();

        System.out.println("Por favor, introduzca la cantidad que pagará el segundo individuo:");
        precio2 = sc.nextDouble();

        System.out.println("Por favor, introduzca la cantidad que pagará el tercer individuo:");
        precio3 = sc.nextDouble();

        sc.close();

        // Realizo los calculos

        bote = precio1 + precio2 + precio3;

        restante = (bote < precioTotalProducto) ? precioTotalProducto - bote : -1;
        sobrante = (bote >= precioTotalProducto) ? bote - precioTotalProducto : -1;

        respuesta = (restante > 0) ? "Faltan " + restante + " " + MONEDA + " para poder comprar el producto"
                : "El dinero es suficiente para comprar el producto y han sobrado " + sobrante + " " + MONEDA
                        + " de bote para futuras compras";

        // Imprimo la respuesta

        System.out.println(respuesta);

    }
}
