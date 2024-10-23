package ud2.ejemplos;

// Programa que pide un nombre de mes y muestra el número de días correspondiente                           
import java.util.Scanner;

public class EjemploSwitch2 {
    public static void main(String[] args) {
        String mes;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un nombre de mes: ");
        mes = sc.nextLine();
        sc.close();
        switch (mes.toUpperCase()) {
            case "ENERO":
                System.out.println("31 DÍAS");
                break;
            case "FEBRERO":
                System.out.println("28 ó 29 DÍAS");
                break;
            case "MARZO":
                System.out.println("31 DÍAS");
                break;
            case "ABRIL":
                System.out.println("30 DÍAS");
                break;
            case "MAYO":
                System.out.println("31 DÍAS");
                break;
            case "JUNIO":
                System.out.println("30 DÍAS");
                break;
            case "JULIO":
                System.out.println("31 DÍAS");
                break;
            case "AGOSTO":
                System.out.println("31 DÍAS");
                break;
            case "SEPTIEMBRE":
                System.out.println("30 DÍAS");
                break;
            case "OCTUBRE":
                System.out.println("31 DÍAS");
                break;
            case "NOVIEMBRE":
                System.out.println("30 DÍAS");
                break;
            case "DICIEMBRE":
                System.out.println("31 DÍAS");
                break;
            default:
                System.out.println("Mes no válido");
        }
    }
}