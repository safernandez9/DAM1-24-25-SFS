package ud2.practicas;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.junit.Test;

@SuppressWarnings("resource")

/**
 * Radar.java
 * 
 * Os radares de tramo consisten en colocar dúas cámaras en dous puntos dunha
 * estrada para
 * comprobar canto tempo tarda un vehículo en percorrer ese tramo. Segundo o
 * teorema de
 * Bonnet-Lagrange ou do valor medio, se a velocidade media dun vehículo ao
 * recorrer o tramo supera
 * a velocidade máxima permitida, podemos asegurar (aínda que non o viramos) que
 * nalgún punto do
 * traxecto superouse a velocidade permitida.
 * 
 * Por exemplo: si colocamos as cámaras separadas 10Km nun tramo cuxa velocidade
 * está limitada a 110Km/h, e un coche tarda 5 minutos (300) en ser visto pola
 * segunda cámara,
 * saberemos que a súa velocidade media foi de 120Km/h, e polo tanto nalgún
 * sitio superou o límite
 * de velocidade aínda que ao pasar por debaixo das dúas cámaras o coche fose a
 * 80Km/h.
 * Implementa unha función coa seguinte declaración que acepte como parámetros
 * de entrada a
 * distancia en km, o tempo en segundos e o límite de velocidade en km/h e que
 * devolva 0 se non se
 * superou o límite ou, en caso contrario, o exceso de velocidade en km/h.
 * 
 * static int excesoVelocidade(double distancia, int tempo, int limite);
 * 
 * Implementa unha función coa seguinte declaración que acepte o límite e o
 * exceso de velocidade e
 * devolva o importe da multa corrspondente:
 * 
 * static int multaInfraccion(int limite, double excesoVelocidade);
 * 
 * Usando as funcións anteriores, deseña un programa que simule o funcionamento
 * dun radar de tramo
 * onde os parámetros de distancia e límite de velocidade estean codificados
 * como constantes cos
 * valores 10 e 120 respectivamente.. O programa recibirá por teclado o tempo en
 * segundos que tardou
 * un vehiculo en percorrer a distancia indicada e amosará unha das seguintes
 * mensaxes:
 * 
 * a. “Velocidade dentro do límite”, se non hai exceso de velocidada.
 * b. “Infracción por exceso de velocidade!! Multa de XXX €!!”, se hai un exceso
 * de
 * velocidade, sendo XXX o importe da sanción.
 */
public class Radar {

    public static void main(String[] args) {

        int distancia, tiempo, limite;
        int exceso;
        double importeMulta;

        distancia = comprobarDatoDistancia();
        tiempo = comprobarDatoTiempo();
        limite = comprobarDatoTiempo();

        exceso = excesoVelocidad(distancia, tiempo, limite);

        if (exceso != 0) {
            importeMulta = multaInfraccion(limite, exceso);
            System.out.printf("\nInfracción por exceso de velocidad!! Multa de %f €!!\n", importeMulta);
        } else {
            System.out.println("Velocidad dentro del límite.");
        }

    }

    /**
     * Velocidad excedida o falso en función de si excede velocidad o no
     * 
     * @param distancia
     * @param tiempo
     * @param limite
     * @return
     */
    static int excesoVelocidad(double distancia, int tiempo, int limite) {

        int velocidadVehiculo;
        int sobrepasaLimite;

        velocidadVehiculo = (int) (distancia / convertirSegundosAHoras(tiempo));
        sobrepasaLimite = (velocidadVehiculo > limite) ? velocidadVehiculo - limite : 0;

        return sobrepasaLimite;
    }

    /**
     * Calcula el imorte de la multa
     * 
     * @param limite
     * @param excesoVelocidad
     * @return
     */
    static int multaInfraccion(int limite, double excesoVelocidad) {

        int multa = 0;

        switch (limite) {
            case 20, 30, 40, 50:
                if (excesoVelocidad == 0) {
                    multa = 0;
                } else if (excesoVelocidad <= 20) {
                    multa = 100;
                } else if (excesoVelocidad <= 30) {
                    multa = 300;
                } else if (excesoVelocidad <= 40) {
                    multa = 400;
                } else if (excesoVelocidad <= 50) {
                    multa = 500;
                } else {
                    multa = 600;
                }
                break;

            case 60, 70, 80, 90, 100, 110, 120:
                if (excesoVelocidad == 0) {
                    multa = 0;
                } else if (excesoVelocidad <= 30) {
                    multa = 100;
                } else if (excesoVelocidad <= 50) {
                    multa = 300;
                } else if (excesoVelocidad <= 60) {
                    multa = 400;
                } else if (excesoVelocidad <= 70) {
                    multa = 500;
                } else {
                    multa = 600;
                }
                break;

        }

        return multa;

    }

    /**
     * Convierte segundos a horas
     * 
     * @param tiempo
     * @return
     */
    public static double convertirSegundosAHoras(int tiempo) {

        double tiempoEnHoras;

        tiempoEnHoras = tiempo / 60;

        return tiempoEnHoras;
    }

    /**
     * Funciones para la solicitud por teclado y comprobación de tipo de datos y de
     * parámetros
     */
    public static int comprobarDatoLimite() {

        Scanner sc = new Scanner(System.in);

        int dato;

        do {
            System.out.println("Introduzca el límite de velocidad en el tramo: ");
            try {
                dato = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Debe introducir un número entero");
                sc.nextLine();
                dato = -1;
            }
        } while (dato < 20 || dato > 120 || dato % 10 != 0);

        return dato;

    }

    public static int comprobarDatoDistancia() {

        Scanner sc = new Scanner(System.in);

        int dato;

        do {
            System.out.println("Introduzca la distancia recorrida: ");
            try {
                dato = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Debe introducir un número entero");
                sc.nextLine();
                dato = -1;
            }
        } while (dato <= 0);

        return dato;
    }

    public static int comprobarDatoTiempo() {

        Scanner sc = new Scanner(System.in);

        int dato;

        do {
            System.out.println("Introduzca el tiempo en el que se recorrió dicha distancia: ");
            try {
                dato = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Debe introducir un número entero");
                sc.nextLine();
                dato = -1;
            }
        } while (dato <= 0);

        return dato;
    }

    @Test
    public void pruebasRadar() {
        assert multaInfraccion(20, 0) == 0;
        assert multaInfraccion(20, 15) == 100;
        assert multaInfraccion(30, 21) == 300;
        assert multaInfraccion(40, 31) == 400;
        assert multaInfraccion(50, 50) == 500;
        assert multaInfraccion(50, 51) == 600;
        assert multaInfraccion(60, 0) == 0;
        assert multaInfraccion(70, 30) == 100;
        assert multaInfraccion(80, 31) == 300;
        assert multaInfraccion(90, 51) == 400;
        assert multaInfraccion(100, 61) == 500;
        assert multaInfraccion(110, 71) == 600;
        assert multaInfraccion(120, 1) == 100;
    }
}