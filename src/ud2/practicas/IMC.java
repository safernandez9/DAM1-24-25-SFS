package ud2.practicas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

import org.junit.Test;

@SuppressWarnings("resource")

/**
 * O índice de masa corporal (IMC) é un indicador de saúde que asocia o peso e a
 * altura dunha persoa.
 * É utilizado, entre outros, pola Organización Mundial da Saúde (OMS), para
 * detectar problemas de
 * sobrepeso ou malnutrición en adultos. En nenos e adolescentes o IMC calcúlase
 * do mesmo xeito
 * pero o resultado analízase de xeito distinto segundo a idade e o sexo. (Nota:
 * o IMC é un indicador
 * moi doado de calcular e útil para clasificar o peso, pero con moitas
 * limitacións, xa que non mide o
 * grado de grasa corporal nin ten en conta o tipo e forma do corpo de cada
 * persoa)
 * Calcúlase segundo a operación:
 * onde a masa se expresa en kilogramos e a estatura en metros.
 * Implementa unha función coa seguinte declaración que calcule e devolva o IMC
 * dunha persoa a
 * partir do seu peso e altura, en klos e centimetros respectivamente:
 * 
 * static double imc(double kg, double cm);
 * 
 * Crea un programa que calcule e amose o IMC dunha persoa adulta a partires do
 * seu peso e altura
 * introducidos por teclado. O programa deberá validar que os datos introducidos
 * por teclado sexan números correctos:
 * o peso introducirase en kg, poderá ter decimais e deberá estar entre 20 e 300
 * kg
 * a altura introducirase como un número enteiro de centímetros, e deberá estar
 * entre 50 e 250.
 * No caso de introducir letras, símbolos ou números inválidos ofrecerase ao
 * usuario introducir un novo valor.
 * 
 * O programa deberá amosar o valor calculado e o resultado segundo a seguinte
 * clasificación da OMS.
 * Clasificación IMC (kg/m²)
 * Bajo peso <18,50
 * Normal 18,5 - 24,99
 * Sobrepeso ≥25,00
 * Obesidad ≥30,0
 */

public class IMC {

    public static void main(String[] args) {

        double peso;
        int altura;
        double resultadoIMC;

        peso = leerPeso();
        altura = leerAltura();
        resultadoIMC = imc(peso, (double) altura);

        mostrarResultados(resultadoIMC);
    }

    static double imc(double kg, double cm) {

        double resultadoIMC;

        resultadoIMC = kg / Math.pow(cm, 2);

        resultadoIMC = resultadoIMC * 10000;
        return resultadoIMC;

    }

    public static double leerPeso() {

        double peso = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduzca un peso en kg:");
            try {
                peso = sc.nextDouble();
            } catch (InputMismatchException e) {
                peso = -1;
                System.out.println("Debe introducir un valor numérico.");
                sc.nextLine();
            }
        } while (peso < 20 || peso > 300);

        return peso;
    }

    public static int leerAltura() {

        int altura = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduzca una altura en centímetros:");
            try {
                altura = sc.nextInt();
            } catch (InputMismatchException e) {
                altura = -1;
                System.out.println("Debe introducir un valor numérico entero.");
                sc.nextLine();
            }
        } while (altura < 50 || altura > 250);

        return altura;
    }

    public static void mostrarResultados(double resultadoIMC) {

        System.out.printf("Su IMC es de %.2f", resultadoIMC);
        System.out.println();

        System.out.println("|   Clasificación   |    IMC (kg/m2)    |");
        if (resultadoIMC < 18.50) {
            System.out.println("|     Bajo peso     |      < 18,50      |");
        } else if (resultadoIMC <= 24.99) {
            System.out.println("|      Normal       |   18,50 - 24,99   |");
        } else if (resultadoIMC < 30) {
            System.out.println("|     Soobrepeso    |       >= 25       |");
        } else {
            System.out.println("|     Obesidad      |       >= 30       |");
        }
    }

    @Test
    public void testImc() {
        // Definir casos de prueba y sus resultados esperados
        // Caso 1: Peso 70 kg, Altura 170 cm
        double resultadoCaso1 = imc(70, 170);
        assertEquals(24.22, resultadoCaso1, 0.01);
        // Caso 2: Peso 90 kg, Altura 185 cm
        double resultadoCaso2 = imc(90, 185);
        assertEquals(26.30, resultadoCaso2, 0.01);
        // Caso 3: Peso 60 kg, Altura 160 cm
        double resultadoCaso3 = imc(60, 160);
        assertEquals(23.44, resultadoCaso3, 0.01);
        double resultadoCaso4 = imc(45, 160);
        assertEquals(17.578, resultadoCaso4, 0.01);
        double resultadoCaso5 = imc(65, 165);
        assertEquals(23.875, resultadoCaso5, 0.01);
        double resultadoCaso6 = imc(100, 175);
        assertEquals(32.653, resultadoCaso6, 0.01);
        double resultadoCaso7 = imc(99.98, 200);
        assertEquals(24.995, resultadoCaso7, 0.01);
    }

}
