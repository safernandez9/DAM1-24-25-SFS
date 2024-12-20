package ud3.apuntes;

import java.util.Scanner;

public class FechaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fecha fecha = new Fecha();
        int d, m, a;
        System.out.println("Introduce fecha: ");
        System.out.println("dia: ");
        d = sc.nextInt();
        System.out.println("mes: ");
        m = sc.nextInt();
        System.out.println("año: ");
        a = sc.nextInt();
        fecha.asignarFecha(d, m, a);
        if (fecha.fechaCorrecta()) {
            System.out.println(fecha.getDia() + "-" + fecha.getMes()+ "-" + fecha.getAño());                      
        } else {
            System.out.println("Fecha no valida");
        }
    }
}    

