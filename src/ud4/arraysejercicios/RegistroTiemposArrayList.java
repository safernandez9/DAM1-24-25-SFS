package ud4.arraysejercicios;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RegistroTiemposArrayList {
    public static void main(String[] args) {

        // Entrada de datos
        LocalTime inicio = LocalTime.now();
        Scanner sc = new Scanner(System.in);
        String entrada;
        ArrayList<Integer> tiempos = new ArrayList<>();

        do {
            entrada = sc.nextLine();
            // Procesar tiempo y registrarlo
            LocalTime nuevoTiempo = LocalTime.now();
            int segundosTranscurridos = nuevoTiempo.toSecondOfDay() - inicio.toSecondOfDay();
            tiempos.add(segundosTranscurridos);

            System.out.println("Segundos transcurridos = " + segundosTranscurridos);

        } while (!entrada.equalsIgnoreCase("F"));

        sc.close();

        // Proceso y Resultados
        System.out.println(tiempos);
        int suma = 0;
        for (int t : tiempos)
            suma += t;
        double media = (double) suma / tiempos.size();
        System.out.println("Media: " + String.format("%.2f", media));
        
        int contMayores = 0;
        for (int t : tiempos) {
            if (t > media)
                contMayores++;
        }
        System.out.println("Número de registros por encima de la media: " + contMayores);



    }
}
