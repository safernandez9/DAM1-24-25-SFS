package ud2.practicas;

import java.lang.Math;

/**
 * Dado.java
 * Diseñar un programa que simule el lanzamiento de un dado de 6 caras un número
 * de veces codificado como una constante NUM_LANZAMIENTOS.
 * El programa mostrará una estadística final que recoja el número de veces que
 * ha salido cada cara del dado y el porcentaje
 * sobre el total de lanzamientos.
 * El porcentaje se mostrará como un número entero o como un número real con un
 * máximo de 2 decimales.
 * 
 */
public class Dado {

    final static int CARAS_MAX = 6;
    final static int CARAS_MIN = 1;
    final static int NUM_LANZAMIENTOS = 100;

    public static void main(String[] args) {

        int lanzamientos = 0;
        int caraUno = 0, caraDos = 0, caraTres = 0, caraCuatro = 0, caraCinco = 0, caraSeis = 0;

        presentarPrograma();
        do {
            switch (lanzarDado()) {
                case 1:
                    caraUno++;
                    break;
                case 2:
                    caraDos++;
                    break;
                case 3:
                    caraTres++;
                    break;
                case 4:
                    caraCuatro++;
                    break;
                case 5:
                    caraCinco++;
                    break;
                case 6:
                    caraSeis++;
                    break;
                default:
                    System.out.println("Error. Numero de dado incorrecto.");
                    break;
            }
            lanzamientos++;
        } while (lanzamientos != NUM_LANZAMIENTOS);

        mostrarResultados(caraUno, caraDos, caraTres, caraCuatro, caraCinco, caraSeis);
    }

    public static void presentarPrograma() {
        System.out.println("Bienvenido a Lanzar Un Dado");
        System.out.println("El dado se lanzará " + NUM_LANZAMIENTOS + " veces.");
    }

    /**
     * Lanzamiento del dado
     * @return
     */
    public static int lanzarDado() {

        int resultado;

        resultado = (int) (Math.random() * (CARAS_MAX - CARAS_MIN + 1)) + CARAS_MIN;
        return resultado;
    }

    /**
     * Calcula los porcentajes de la cara solicitada
     * @param cara
     * @param caraUno
     * @param caraDos
     * @param caraTres
     * @param caraCuatro
     * @param caraCinco
     * @param caraSeis
     * @return
     */
    public static float calcularPorcentaje(int cara, int caraUno, int caraDos, int caraTres, int caraCuatro,
            int caraCinco,
            int caraSeis) {

        float porcentaje;

        switch (cara) {
            case 1:
                porcentaje = ((float) caraUno / NUM_LANZAMIENTOS) * 100;
                break;
            case 2:
                porcentaje = ((float) caraDos / NUM_LANZAMIENTOS) * 100;
                break;
            case 3:
                porcentaje = ((float) caraTres / NUM_LANZAMIENTOS) * 100;
                break;
            case 4:
                porcentaje = ((float) caraCuatro / NUM_LANZAMIENTOS) * 100;
                break;
            case 5:
                porcentaje = ((float) caraCinco / NUM_LANZAMIENTOS) * 100;
                break;
            case 6:
                porcentaje = ((float) caraSeis / NUM_LANZAMIENTOS) * 100;
                break;
            default:
                System.out.println("Error. Numero de dado incorrecto.");
                porcentaje = -1;
                break;
        }

        return porcentaje;
    }

    /**
     * Muestra los resultados finales
     * @param caraUno
     * @param caraDos
     * @param caraTres
     * @param caraCuatro
     * @param caraCinco
     * @param caraSeis
     */
    public static void mostrarResultados(int caraUno, int caraDos, int caraTres, int caraCuatro, int caraCinco,
            int caraSeis) {

        float porcentajeUno, porcentajeDos, porcentajeTres, porcentajeCuatro, porcentajeCinco, porcentajeSeis;

        porcentajeUno = calcularPorcentaje(1, caraUno, caraDos, caraTres, caraCuatro, caraCinco,
                caraSeis);
        porcentajeDos = calcularPorcentaje(2, caraUno, caraDos, caraTres, caraCuatro, caraCinco,
                caraSeis);
        porcentajeTres = calcularPorcentaje(3, caraUno, caraDos, caraTres, caraCuatro, caraCinco,
                caraSeis);
        porcentajeCuatro = calcularPorcentaje(4, caraUno, caraDos, caraTres, caraCuatro, caraCinco,
                caraSeis);
        porcentajeCinco = calcularPorcentaje(5, caraUno, caraDos, caraTres, caraCuatro, caraCinco,
                caraSeis);
        porcentajeSeis = calcularPorcentaje(6, caraUno, caraDos, caraTres, caraCuatro, caraCinco,
                caraSeis);

        System.out.println("Resultados:");
        System.out.printf("Ha salido 1: %d veces  ( %.2f %%) \n", caraUno, porcentajeUno);
        System.out.printf("Ha salido 2: %d veces  ( %.2f %%) \n", caraDos, porcentajeDos);
        System.out.printf("Ha salido 3: %d veces  ( %.2f %%) \n", caraTres, porcentajeTres);
        System.out.printf("Ha salido 4: %d veces  ( %.2f %%) \n", caraCuatro, porcentajeCuatro);
        System.out.printf("Ha salido 5: %d veces  ( %.2f %%) \n", caraCinco, porcentajeCinco);
        System.out.printf("Ha salido 6: %d veces  ( %.2f %%) \n", caraSeis, porcentajeSeis);
    }

}
