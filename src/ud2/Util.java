package ud2;

import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("resource")

public class Util {

    /**
     * esPar:
     * Comprueba si un número es par o no.
     * 
     * @param num
     * @return
     */
    public static void esPar(int num) {
        if(num % 2 == 0){
            System.out.println("Es par");
        }else{
            System.out.println("No es par");
        }
    }

    /**
     * esMayor:
     * Devuelve el mayor de dos números diferentes.
     * 
     * @param a
     * @param b
     * @return
     */
    public static int mayor(int a, int b) {
        if(a == b){
            return ;
        }
        return (a > b ? a : b);
    }

    public static float mayor(float a, float b) {
        return (a > b ? a : b);
    }

    public static double mayor(double a, double b) {
        return (a > b ? a : b);
    }

    /**
     * esCasiCero:
     * Comprueba si un número es casi-cero o no. Un número casi-cero es
     * aquel, positivo o negativo (distinto de 0), que se acercan a 0 por
     * menos de 1 unidad.
     * 
     * @param num
     * @return
     */
    public static boolean esCasiCero(double num) {
        return (num > 0 && num < 1) || (num < 0 && num > -1);
    }

    public static boolean esCasiCero(float num) {
        return (num > 0 && num < 1) || (num < 0 && num > -1);
    }

    /**
     * esBisiesto
     * Comprueba si un año es bisiesto o no.
     * 
     * @param anho
     * @return
     */
    public static boolean esBisiesto(int anho) {
        return (anho % 4 == 0 && (anho % 100 != 0 || anho % 400 == 0));
    }

    /**
     * numCifras()
     * Función que indique cuántas cifras tiene un número entero
     * 
     * @param nota
     * @return
     */
    public static int numCifras(int num) {

        int cifras = 0;

        do {
            num = num / 10;
            cifras++;
        } while (num != 0);

        return cifras;
    }

    /**
     * notaEnTexto()
     * Función que reciba una nota entera de 0 a 10 y devuelva el equivalente en
     * texto según la siguiente escala:
     * insuficiente (de 0 a 4)
     * suficiente (5)
     * bien (6)
     * notable (7 y 8)
     * sobresaliente (9 y 10)
     * 
     * @param nota
     * @return
     */
    public static String notaEnTexto(double nota) {

        String notaEnTexto = "";

        if (nota < 0 || nota > 10) {
            notaEnTexto = "Error";
        } else if (nota >= 0 && nota < 5) {
            notaEnTexto = "Suspenso";
        } else if (nota >= 5 && nota < 6) {
            notaEnTexto = "Suficiente";
        } else if (nota >= 6 && nota < 7) {
            notaEnTexto = "Bien";
        } else if (nota >= 7 && nota < 9) {
            notaEnTexto = "Notable";
        } else if (nota >= 9 && nota <= 10) {
            notaEnTexto = "Sobresaliente";
        }

        return notaEnTexto;
    }

    public static String notaEnTexto(int nota) {

        String notaEnTexto = "";

        if (nota < 0 || nota > 10) {
            notaEnTexto = "Error";
        } else if (nota >= 0 && nota < 5) {
            notaEnTexto = "Suspenso";
        } else if (nota >= 5 && nota < 6) {
            notaEnTexto = "Suficiente";
        } else if (nota >= 6 && nota < 7) {
            notaEnTexto = "Bien";
        } else if (nota >= 7 && nota < 9) {
            notaEnTexto = "Notable";
        } else if (nota >= 9 && nota <= 10) {
            notaEnTexto = "Sobresaliente";
        }

        return notaEnTexto;
    }

    /**
     * diaSemana()
     * Función que reciba un número comprendido entre 1 y 7, correspondiente a un
     * día
     * de la semana y que devuelva el día en texto.
     * 
     * @param dia
     * @return
     */
    public static String diaSemana(int dia) {

        String diaATexto = "";

        switch (dia) {
            case 1:
                diaATexto = "Lunes";
                break;
            case 2:
                diaATexto = "Martes";
                break;
            case 3:
                diaATexto = "Miércoles";
                break;
            case 4:
                diaATexto = "Jueves";
                break;
            case 5:
                diaATexto = "Viernes";
                break;
            case 6:
                diaATexto = "Sábado";
                break;
            case 7:
                diaATexto = "Domingo";
                break;

            default:
                diaATexto = "Número de día de la semana incorrecto";
                break;
        }

        return diaATexto;

    }

    /**
     * esFechaCorrecta()
     * Función que recibe el día, mes y año de una fecha y devuelve si la fecha es
     * correcta o no. Ten en cuenta los años bisiestos.
     * 
     * @param dia
     * @param mes
     * @param anho
     * @return
     */
    public static boolean esFechaCorrecta(int dia, int mes, int anho) {

        boolean correcto;

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (dia <= 31 && dia > 0) {
                    correcto = true;
                } else {
                    correcto = false;
                }
                break;
            case 4, 6, 9, 11:
                if (dia <= 30 && dia > 0) {
                    correcto = true;
                } else {
                    correcto = false;
                }
                break;
            case 2:
                if (dia <= 28 && dia > 0 || (dia <= 29 && dia > 0 && esBisiesto(anho))) {
                    correcto = true;
                } else {
                    correcto = false;
                }
            default:
                correcto = false;
                break;
        }

        return correcto;

    }

    /**
     * esHoraCorrecta()
     * Repite la función anterior para validar una hora.
     * 
     * @return
     */
    public static boolean esHoraCorrecta() {

        boolean correcto = true;

        return correcto;
    }

    /**
     * Plantilla editable para la realización de comprobaciones de tipos y de
     * parametros
     * 
     * @return
     */
    public static int plantillaComprobarTipoEntero(String texto) {

        Scanner sc = new Scanner(System.in);

        int dato;

        do {
            System.out.println(texto);
            try {
                dato = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Debe introducir un número entero");
                sc.nextLine();
                dato = -1;
            }
        } while (dato < 0);

        return dato;

    }

    public static float plantillaComprobarTipoFloat(String texto) {

        Scanner sc = new Scanner(System.in);

        int dato;

        do {
            System.out.println(texto);
            try {
                dato = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Debe introducir un número entero");
                sc.nextLine();
                dato = -1;
            }
        } while (dato < 0);

        return dato;

    }

    public static double plantillaComprobarTipoDouble(String texto) {

        Scanner sc = new Scanner(System.in);

        int dato;

        do {
            System.out.println(texto);
            try {
                dato = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Debe introducir un número entero");
                sc.nextLine();
                dato = -1;
            }
        } while (dato < 0);

        return dato;

    }

}
