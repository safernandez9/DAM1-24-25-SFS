package ud2.ejemplos;

import java.util.*;

public class EjemploSwitch4 {
    public static void main(String[] args) {

        int numeroDia;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el numero del día de la semana (1 a 7): ");
        numeroDia = sc.nextInt();
        sc.close();

        switch (numeroDia) {                              //IMPORTANTE, SI NO HAY BREAK, EJECUTA EL CASE Y LAS LINEAS HASTA EL PRIMER BREAK
            case 1:                                       //Ejemplo de otra version del switch en apuntes de Oscar
            case 3:                                       //Ejemplo tambien del uso de yield
            case 5:
                System.out.println("Tenemos clase de programación");
                break;
            case 2:
            case 4:
                System.out.println("Vaya, que pena");
                System.out.println("Hoy no tenemos clase de programación");
                break;
            case 6:
            case 7:
                System.out.println("Estoy deseando que llegue el lunes!!");
                break;
            default:
                System.out.println("Número de día no válido");
        }
    }
}
