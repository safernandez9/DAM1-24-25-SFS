package ud3.apuntes.ejerciciostime;

import java.time.LocalTime;
import java.util.Scanner;

/**
 * Escribe un programa que ofrezca al usuario la posibilidad de iniciar un
 * cronómetro pulsando enter.
 * Una vez iniciado, el programa quedará a la espera de la entrada del usuario.
 * Cuando el usuario pulse ENTER de nuevo, el programa mostrará el tiempo
 * transcurrido desde el inicio del cronómetro, en minutos y segundos. También
 * mostrará el tiempo parcial desde la última vez que se pulsó ENTER.
 * 
 * El programa terminará cuando el usuario introduce un cero (0).
 */
public class Cronometro {
    public static void main(String[] args) {
        String entrada = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Pulsa Enter para iniciar el cronómetro");
        sc.nextLine();

        LocalTime inicio = LocalTime.now();
        System.out.println("Cronómetro iniciado a las " + inicio);

        System.out.println("Pulsa Enter para registrar una marca de tiempo");
        System.out.println("Introduce 0 para finalizar el cronómetro");
        do {
            entrada = sc.nextLine();
            LocalTime marcaTiempo = LocalTime.now();
            System.out.println("Marca de tiempo registrada a las " + marcaTiempo);
            // Obtiene el tiempo transcurrido desde el inicio del cronómetro convirtiendo las horas a segundos
            long segundosTranscurridos = marcaTiempo.toSecondOfDay() - inicio.toSecondOfDay();
            System.out.println("Tiempos transcurrido: " + segundosTranscurridos / 60 + " minutos y "
                    + segundosTranscurridos % 60 + " segundos");

        } while (entrada == "" || entrada.charAt(0) != '0');

        sc.close();
    }
}
