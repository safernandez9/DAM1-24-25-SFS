//Eloy Eidon Loila (copiloto) Saul Fernandez Salgado (Piloto)

/*Realiza un programa que sirva para evaluar un ejercicio práctico de programación con una nota entre 1 y 10 
 * (con decimales), basado en los criterios de la siguiente tabla que el usuario deberá introducir por teclado.
 * La puntuación del ejercicio será la obtenida al sumar el resultado del evaluar los criterios 1 a 6.
 */

package ud1.exercicios.parejas;

import java.util.Scanner;

public class Evaluacion {
    
    public static void main (String[] args){

        double nota;

        Scanner sc = new Scanner(System.in);   

        System.out.println("A continuación se pedirá que introduzca una serie de valores para evaluar el ejercicio");
        
        System.out.println("El programa funciona? Opciones: 4 para Sí, 2 para A medias, 0 para No: ");
        nota = sc.nextDouble();

        System.out.println("¿El programa funciona? Opciones: 4 para Sí, 0,5 para Regular, 0 para No: ");
        nota = nota + sc.nextDouble();
        
        System.out.println("¿El programa funciona y es eficiente? Opciones: 1 para Siempre, 0,5 para A veces, 0 para Nunca: ");
        nota = nota + sc.nextDouble();

        System.out.println("¿El programa funciona? Opciones: 1,5 para Siempre, 0,75 para A veces, 0 para Nunca: ");
        nota = nota + sc.nextDouble();

        System.out.println("¿El programa funciona? Opciones: 1,5 para Mucho, 0,75 para Regular, 0 para Poco: ");
        nota = nota + sc.nextDouble();

        System.out.println("¿El programa funciona? Opciones: 1 para Sí, 0,5 para Regular, 0 para No: ");
        nota = nota + sc.nextDouble();

        System.out.printf("La nota final es un %.2f", nota);

        sc.close();
    }
}
