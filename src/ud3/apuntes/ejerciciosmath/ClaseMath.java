package ud3.apuntes.ejerciciosmath;

import java.util.Scanner;

public class ClaseMath {
    public static void main(String[] args) {        
        final int MIN = -360;
        final int MAX = 360;
        // Generación de un número aleatorio aproximado entre MIN y MAX
        double x = Math.random() * (MAX - MIN) - 360;

        // Otra forma más compleja de generar el número incluyendo 360
        //double f = Math.random() / Math.nextDown(1.0);
        //double x = MIN * (1.0 - f) + MAX * f;

        System.out.println("Número aleatorio entre -360 y 360: " + x);        
        
        System.out.println("Raíz cuadrada: " + Math.sqrt(x));
        System.out.println("Redondeo al entero más cercano: " + Math.round(x));
        System.out.println("Redondeo hacia arriba: " + Math.ceil(x));
        System.out.println("Redondeo hacia abajo: " + Math.floor(x));
        System.out.println("Valor absoluto: " + Math.abs(x));
        System.out.println("Potencia al cubo: " + Math.pow(x, 3));
        System.out.println("Logaritmo natural: " + Math.log(x));
        System.out.println("Seno: " + Math.sin(x));
        System.out.println("Coseno: " + Math.cos(x));

        System.out.print("Introduce dos números para comparar con el anterior: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.close();
        System.out.println("El mayor de los 3 es: " + Math.max(x, Math.max(a, b)));
        System.out.println("El menor de los 3 es: " + Math.min(x, Math.min(a, b)));
    }
}
