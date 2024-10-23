package ud2.ejemplos;

//Programa que pide dos números y un operador y muestra el resultado de la operación                        
import java.util.*;
import java.io.*;

public class EjemploSwitch3 {
    public static void main(String[] args) throws IOException {

        int a, b, resultado = 0;
        char operador;
        boolean calculado = true;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero entero:");
        a = sc.nextInt();
        
        System.out.print("Introduzca otro numero entero:");
        b = sc.nextInt();
        sc.close();

        System.out.print("Introduzca un operador (+,-,*,/):");
        operador = (char) System.in.read();

        // o puedo: operador = sc.nextLine().charAt(0);
        
        switch (operador) {
            case '-':
                resultado = a - b;
                break;
            case '+':
                resultado = a + b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("\nNo se puede dividir por cero");
                    calculado = false;
                }
                break;
            default:
                System.out.println("\nOperador no valido");
                calculado = false;
        }
        if (calculado) {
            System.out.println("\nEl resultado es: " + resultado);
        }
    }
}