package ud2.ejercicios;

import java.util.Scanner;

public class Factura {

    public static void main(String[] args) {
        
        final double IVA = 0.21;
        final double IVAREDUCIDO = 0.05;

        double precio;
        double cantidad;
        double facturaInicial;
        double facturaIVA;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el precio del producto:");
        precio = sc.nextDouble();

        System.out.println("Introduzca el número de unidades compradas del producto:");
        cantidad = sc.nextDouble();
        
        sc.close();

        facturaInicial = precio * cantidad;
        facturaIVA = facturaInicial + facturaInicial * IVA;

        if(facturaInicial > 100){
            facturaIVA = facturaIVA - facturaInicial * IVAREDUCIDO;
        }
        
        System.out.printf("El precio final es de %.2f\n", facturaIVA);

    }
    
}
