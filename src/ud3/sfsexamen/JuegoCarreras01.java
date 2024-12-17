package ud3.sfsexamen;

import java.util.Random;

public class JuegoCarreras01 {

    final static int DISTANCIA_CARRERA = 500;

    public static void main(String[] args) {

        System.out.println("RAYO");
        System.out.println("====");
        CocheCarreras rayo = new CocheCarreras("Rayo", 90, 400);
        rayo.mostrar();

        System.out.println("TRUENO");
        System.out.println("======");
        CocheCarreras trueno = new CocheCarreras("Trueno", 60, 5, 300);
        trueno.mostrar();

        do {

            if (rayo.getVmax_ms() > trueno.getVmax_ms()) {
                rayo.turno();
                if (rayo.getDistanciaRecorrida() >= DISTANCIA_CARRERA) {
                    System.out.println(" " + rayo.getNombre() + " es el ganador.");
                    break;
                }
                trueno.turno();
                if (trueno.getDistanciaRecorrida() >= DISTANCIA_CARRERA) {
                    System.out.println(" " + rayo.getNombre() + " es el ganador.");
                    break;
                }
            } else {
                trueno.turno();
                if (trueno.getDistanciaRecorrida() >= DISTANCIA_CARRERA) {
                    System.out.println(" " + trueno.getNombre() + " es el ganador.");
                    break;
                }
                rayo.turno();
                if (rayo.getDistanciaRecorrida() >= DISTANCIA_CARRERA) {
                    System.out.println(" " + rayo.getNombre() + " es el ganador.");
                    break;
                }
            }
        } while (true);

    }
}
