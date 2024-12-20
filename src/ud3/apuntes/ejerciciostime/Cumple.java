package ud3.apuntes.ejerciciostime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario su fecha de nacimiento y
 * calcule el tiempo restante hasta su próximo cumpleaños.
 * Muestra el resultado en días, horas y minutos.
 */
public class Cumple {
    public static void main(String[] args) {
        LocalDate nacimiento = null;

        // Obtiene la fecha actual
        LocalDate hoy = LocalDate.now();

        // Solicita la fecha de nacimiento. La fecha debe ser anterior a la fecha actual
        // Se controla que el formato de la fecha sea correcto.
        boolean fechaCorrecta = false;
        Scanner sc = new Scanner(System.in);
        do {
            // Solicita la fecha de Nacimiento
            System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
            String fecha = sc.nextLine();

            // Formatea la fecha a un objeto LocalDate
            DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            try {
                nacimiento = LocalDate.parse(fecha, formatoFecha);
                if (hoy.isAfter(nacimiento))
                    fechaCorrecta = true;
                else
                    System.out.println("La fecha de nacimiento no puede ser igual o posterior a la fecha actual.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!fechaCorrecta);
        sc.close();

        // Calcula la diferencia entre el mes y día del cumple y la fecha actual
        if (hoy.getMonthValue() == nacimiento.getMonthValue() &&
                hoy.getDayOfMonth() == nacimiento.getDayOfMonth()) {
            // Es tu cumpleaños
            System.out.println("Hoy es tu cumpleaños!! Falta un año para el siguiente.");

        } else if (hoy.getMonthValue() < nacimiento.getMonthValue() ||
                (hoy.getMonthValue() == nacimiento.getMonthValue()
                        && hoy.getDayOfMonth() < nacimiento.getDayOfMonth())) {
            // Tu cumple será más adelante en el año en curso
            LocalDate proximoCumple = LocalDate.of(hoy.getYear(), nacimiento.getMonthValue(),
                    nacimiento.getDayOfMonth());
            Period duracion = Period.between(hoy, proximoCumple);
            System.out.println(
                    "Faltan " + duracion.getMonths() + " meses y " + duracion.getDays() + " días para tu cumple.");

        } else {
            // Tu cumple ya pasó en el año en curso. Tu próximo curso será el año que viene
            LocalDate proximoCumple = LocalDate.of(hoy.getYear() + 1, nacimiento.getMonthValue(),
                    nacimiento.getDayOfMonth());
            Period duracion = Period.between(hoy, proximoCumple);
            System.out.println(
                    "Faltan " + duracion.getMonths() + " meses y " + duracion.getDays() + " días para tu cumple.");
        }
    }

}
