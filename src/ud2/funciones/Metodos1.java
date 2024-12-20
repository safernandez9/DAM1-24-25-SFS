package ud2.funciones;

import java.util.Scanner;

public class Metodos1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero1, numero2, resultado;
        System.out.print("Introduce primer número: ");                                             
        numero1 = sc.nextInt();
        System.out.print("Introduce segundo número: ");
        numero2 = sc.nextInt();
        sc.close();
        
        resultado = sumar(numero1, numero2);
        System.out.println("Suma: " + resultado);
    }

    //método sumar
    public static int sumar(int a, int b){
           int c;
           c = a + b;
           return c;
    }

}
