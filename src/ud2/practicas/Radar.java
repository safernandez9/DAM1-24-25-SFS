package ud2.practicas;

/**
 * Radar.java
 * 
 * Os radares de tramo consisten en colocar dúas cámaras en dous puntos dunha estrada para
 * comprobar canto tempo tarda un vehículo en percorrer ese tramo. Segundo o teorema de
 * Bonnet-Lagrange ou do valor medio, se a velocidade media dun vehículo ao recorrer o tramo supera
 * a velocidade máxima permitida, podemos asegurar (aínda que non o viramos) que nalgún punto do
 * traxecto superouse a velocidade permitida.
 * 
 * Por exemplo: si colocamos as cámaras separadas 10Km nun tramo cuxa velocidade
 * está limitada a 110Km/h, e un coche tarda 5 minutos (300) en ser visto pola segunda cámara,
 * saberemos que a súa velocidade media foi de 120Km/h, e polo tanto nalgún sitio superou o límite
 * de velocidade aínda que ao pasar por debaixo das dúas cámaras o coche fose a 80Km/h.
 * Implementa unha función coa seguinte declaración que acepte como parámetros de entrada a
 * distancia en km, o tempo en segundos e o límite de velocidade en km/h e que devolva 0 se non se
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
 * Usando as funcións anteriores, deseña un programa que simule o funcionamento dun radar de tramo
 * onde os parámetros de distancia e límite de velocidade estean codificados como constantes cos
 * valores 10 e 120 respectivamente.. O programa recibirá por teclado o tempo en segundos que tardou
 * un vehiculo en percorrer a distancia indicada e amosará unha das seguintes mensaxes:
 * 
 * a. “Velocidade dentro do límite”, se non hai exceso de velocidada.
 * b. “Infracción por exceso de velocidade!! Multa de XXX €!!”, se hai un exceso de
 * velocidade, sendo XXX o importe da sanción.
 */
public class Radar {

    public static void main(String[] args) {

        final static int DISTANCIA = 10;
        final static int LIMITE = 100;
    
        int tiempo;


        if(excesoVelocidad(DISTANCIA, tiempo, LIMITE))
        
    }

    /**
     * Velocidad excedida o falso en función de si excede velocidad o no
     * @param distancia
     * @param tiempo
     * @param limite
     * @return
     */
    static int excesoVelocidad(double distancia, int tiempo, int limite) {

        int velocidadVehiculo;
        int sobrepasaLimite;

        velocidadVehiculo = (int) (distancia / convertirAHoras(tiempo));
        sobrepasaLimite = (velocidadVehiculo > limite) ? velocidadVehiculo - limite : 0;

        return sobrepasaLimite;
    }

    static int multaInfraccion(int limite, double excesoVelocidad) {

        int velocidadExcedida;

        velocidadExcedida = excesoVelocidad - limite;
        switch (limite) {
            case 20, 30, 40, 50:
                break;

            case 60, 70, 80, 90, 100, 110, 120:
                break;
        }

        return 0;

    }

    public static double convertirAHoras(int tiempo) {

        double tiempoEnHoras;

        tiempoEnHoras = tiempo / 60;

        return tiempoEnHoras;
    }

}