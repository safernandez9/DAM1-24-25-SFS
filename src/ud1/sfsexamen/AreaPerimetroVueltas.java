//Saúl Fernández Salgado

package ud1.sfsexamen;

import java.util.Scanner;
import java.lang.Math;

public class AreaPerimetroVueltas {

    public static void main(String[] args) {

        final double DISTANCIA_CARRERA = 21097;
        double areaCirculo, perimetroCirculo, radioCirculo;
        double largo, ancho;
        double areaRectangulo, largoRectangulo, anchoRectangulo;
        ;
        double areaTotal, perimetroTotal;
        double numeroVueltas, distanciaSobrante;

        // Pido datos por pantalla

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor introduzca el largo del terreno en metros:");
        largo = sc.nextDouble();

        System.out.println("Por favor introduzca el ancho del terreno en metros:");
        ancho = sc.nextDouble();

        sc.close();

        // Calculo medidas del círculo

        radioCirculo = (double) ancho / 2;
        perimetroCirculo = 2 * radioCirculo * Math.PI;
        areaCirculo = Math.pow(radioCirculo, 2) * Math.PI;

        // Calculo medidas rectángulo

        largoRectangulo = largo - radioCirculo * 2;
        anchoRectangulo = ancho;
        areaRectangulo = anchoRectangulo * largoRectangulo;

        // Calculo medidas totales

        perimetroTotal = perimetroCirculo + largoRectangulo * 2;
        areaTotal = areaCirculo + areaRectangulo;

        // Calculo los datos finales del enunciado

        numeroVueltas = (double) DISTANCIA_CARRERA / perimetroTotal;
        distanciaSobrante = DISTANCIA_CARRERA - perimetroTotal * numeroVueltas;

        System.out.printf(
                "El perimetro total del terreno es de %.1f metros y su area total es de %.1f metros cuadrados \n",
                perimetroTotal, areaTotal);
        System.out.printf("Los participantes deberán dar %.0f vueltas completas y les sobraran %.0f metros",
                numeroVueltas, Math.ceil(distanciaSobrante));

    }

}
