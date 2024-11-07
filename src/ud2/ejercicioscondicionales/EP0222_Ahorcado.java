/*
 * EP0222_Ahorcado. Haz un programa que lea por teclado un número de fallos en el juego
 * del ahorcado, entre 0 y 7, y que imprima un dibujo de un ahorcado más o menos completo
 * en función del número de fallos
*/
package ud2.ejercicioscondicionales;

import java.util.Scanner;

public class EP0222_Ahorcado {

        public static void main(String[] args) {

                final String SINFALLOS = "   _______\n" +
                                "  |       |\n" +
                                "          |\n" +
                                "          |\n" +
                                "          |\n" +
                                "          |\n" +
                                "          |\n" +
                                "__________|\n";
                final String UNFALLOS = "   _______\n" +
                                "  |       |\n" +
                                "  O       |\n" +
                                "          |\n" +
                                "          |\n" +
                                "          |\n" +
                                "          |\n" +
                                "__________|\n";
                final String DOSFALLOS = "   _______\n" +
                                "  |       |\n" +
                                "  O       |\n" +
                                "  |       |\n" +
                                "          |\n" +
                                "          |\n" +
                                "          |\n" +
                                "__________|\n";
                final String TRESFALLOS = "   _______\n" +
                                "  |       |\n" +
                                "  O       |\n" +
                                " /|       |\n" +
                                "          |\n" +
                                "          |\n" +
                                "          |\n" +
                                "__________|\n";
                final String CUATROFALLOS = "   _______\n" +
                                "  |       |\n" +
                                "  O       |\n" +
                                " /|\\      |\n" +
                                "          |\n" +
                                "          |\n" +
                                "          |\n" +
                                "__________|\n";
                final String CINCOFALLOS = "   _______\n" +
                                "  |       |\n" +
                                "  O       |\n" +
                                " /|\\      |\n" +
                                "  |       |\n" +
                                "          |\n" +
                                "          |\n" +
                                "__________|\n";
                final String SEISFALLOS = "   _______\n" +
                                "  |       |\n" +
                                "  O       |\n" +
                                " /|\\      |\n" +
                                "  |       |\n" +
                                " /        |\n" +
                                "          |\n" +
                                "__________|\n";
                final String SIETEFALLOS = "   _______\n" +
                                "  |       |\n" +
                                "  O       |\n" +
                                " /|\\      |\n" +
                                "  |       |\n" +
                                " / \\      |\n" +
                                "          |\n" +
                                "__________|\n";

                int fallos;

                Scanner sc = new Scanner(System.in);

                System.out.println("Introduce un número de fallos: ");
                fallos = sc.nextInt();
                sc.close();

                switch (fallos) {
                        case 0:
                                System.out.println(SINFALLOS);
                                break;
                        case 1:
                                System.out.println(UNFALLOS);
                                break;
                        case 2:
                                System.out.println(DOSFALLOS);
                                break;
                        case 3:
                                System.out.println(TRESFALLOS);
                                break;
                        case 4:
                                System.out.println(CUATROFALLOS);
                                break;
                        case 5:
                                System.out.println(CINCOFALLOS);
                                break;
                        case 6:
                                System.out.println(SEISFALLOS);
                                break;
                        case 7:
                                System.out.println(SIETEFALLOS);
                                break;

                        default:
                                break;
                }

        }

}
