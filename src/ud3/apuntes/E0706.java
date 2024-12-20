package ud3.apuntes;

import java.util.Scanner;

public class E0706 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe una hora: (horas, minutos y segundos):");
        Hora hora = new Hora(sc.nextInt(), sc.nextInt(), sc.nextInt());

        hora.mostrar();

        System.out.println("Número de incrementos de 1 segundo (n): ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            hora.incrementar1Segundo();
            hora.mostrar();
        }
    }                
}
