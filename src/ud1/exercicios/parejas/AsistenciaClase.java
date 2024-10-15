// Eloy Eidon Loira (piloto) y Saul Fernandez Salgado (copiloto)

/* A partir del nombre y horas de un módulo de FP, por ejemplo, “Programación”, 240 horas. 
 * No es necesario pedir estos datos por teclado. Codifícalos como constantes en tu programa y 
 * utiliza el tipo de dato String para almacenar el nombre del módulo.
 * Calcula y muestra por pantalla:
 * nº de sesiones de 50’.
 * número de faltas sin justificar que implican un apercibimiento (>6%)
 * número de faltas sin justificar para pérdida de evaluación continua (>10%)
 * 
 * Solicita por teclado un número de faltas de un alumno concreto e indica si implica apercibimiento, 
 * pérdida de evaluación continua o ningún problema.
*/

package ud1.exercicios.parejas;

import java.util.Scanner;

public class AsistenciaClase {
    

    // Constantes para el módulo
    public static final String NOMBRE_MODULO = "Programación";
    public static final int HORAS_MODULO = 240;
    public static final int DURACION_SESION = 50;  // Duración de cada sesión en minutos
    
    public static void main(String[] args) {
        // Cálculo del número de sesiones de 50 minutos
        int sesiones = (HORAS_MODULO * 60) / DURACION_SESION;
        
        // Cálculo de las faltas para apercibimiento (>6%) y pérdida de evaluación (>10%)
        int faltas_apercibimiento = (int) (HORAS_MODULO * 0.06);  
        int faltas_perdida_evaluacion = (int) (HORAS_MODULO * 0.10);  
        
        // Mostrar los resultados
        System.out.println("Módulo: " + NOMBRE_MODULO);
        System.out.println("Número total de horas: " + HORAS_MODULO);
        System.out.println("Número de sesiones de 50 minutos: " + sesiones);
        System.out.println("Faltas para apercibimiento (>6%): " + faltas_apercibimiento);
        System.out.println("Faltas para pérdida de evaluación (>10%): " + faltas_perdida_evaluacion);
        
        // Solicitar el número de faltas de un alumno
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de faltas del alumno: ");
        int faltas_alumno = scanner.nextInt();
        
        
        String[] mensajes = {
            "El alumno no tiene ningún problema.",
            "El alumno recibe un apercibimiento.",
            "El alumno ha perdido la evaluación continua."
        };
        
        // Determinar el mensaje a mostrar
        int indice = (faltas_alumno > faltas_perdida_evaluacion) ? 2 : (faltas_alumno > faltas_apercibimiento) ? 1 : 0;
        System.out.println(mensajes[indice]);
        
        scanner.close();
    }
}

    





       