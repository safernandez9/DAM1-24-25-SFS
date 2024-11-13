package ud2.practicas;

import java.util.Scanner;

public class Supermercado {

    public static void main(String[] args) {

        float importeTotal;

        Scanner sc = new Scanner(System.in);

        importeTotal = introducirProductos();
        System.out.printf("El importe total de la compra es de %f euros.", importeTotal);

        System.out.println("Introduzca 1 para el pago en efectivo o 2 para el pago con tarjeta: ");

    }

    static float introducirProductos() {

        int unidadesProducto;
        float precioProducto, importeTotal = 0;
        boolean salir = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al servicio de cobro. Introduzca el precio y" +
                "las unidades de cada producto. Introduzca 0 cuando termine.");

        do {
            System.out.println("Introduzca el precio del producto");
            precioProducto = sc.nextFloat();

            System.out.println("Introduzca las unidades de producto a cobrar:");
            unidadesProducto = sc.nextInt();

            importeTotal += precioProducto * unidadesProducto;

            if (precioProducto == 0 || unidadesProducto == 0)
                salir = true;
        } while (!salir);

        sc.close();

        return importeTotal;

    }
}
