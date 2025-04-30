package ud6.xxxexamen.festivalmeigas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class AppFestival {

    public static void main(String[] args) {
        System.out.println("\nFESTIVAL DE MEIGAS");
        System.out.println("==================\n");
        // Crea un array de meigas de exemplo
        Meiga[] meigasExemplo = Meiga.crearMeigasExemplo(Feitizo.crearFeitizosExemplo());

        // TODO: Ordena as Meigas de menor a maior número de feitizos

        // Para cada meiga do festival, imprime os seus datos, lanza os
        // feitizos posibles, e imprime os puntos obtidos.
        for (Meiga meiga : meigasExemplo) {
            System.out.println("MEIGA: ");
            System.out.println(meiga);
            int puntos = meiga.lanzarFeitizos();
            System.out.println("TOTAL PUNTOS: " + puntos + "\n\n");

            // TODO: Engade o código que necesites...

        }

        // Amosa a clasificación final do festival
        System.out.println("Clasificación Final do Festival: ");
        // TODO: Engade o código que necesites...

        System.out.println("\nFIN DO FESTIVAL DE MEIGAS\n");
    }

}
