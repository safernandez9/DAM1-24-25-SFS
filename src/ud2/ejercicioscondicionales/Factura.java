/* Factura (Factura.java). Escribe un programa para emitir la factura de compra de un producto,
 * introduciendo el precio del producto y el número de unidades compradas. La factura deberá añadir
 * al total un IVA (Impuesto del Valor Añadido) del 21%. Si el precio final con IVA es superior a 100
 * euros se aplicará un descuento del 5%.
*/

package ud2.ejercicioscondicionales;

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
