//Saúl Fernández Salgado
package ud5.SFSexamen;

import java.util.Arrays;
import java.util.Comparator;

public class Cliente extends Host {

    private enum SO { WINDOWS, LINUX, MAC, ANDROID, IOS}

    private SO sistemaOperativo;
    private String resolucion;


    public Cliente(String nombre, String IP, String mac, SO sistemaOperativo, String resolucion) {
        super(nombre, IP, mac);
        this.sistemaOperativo = sistemaOperativo;
        this.resolucion = resolucion;
    }

    @Override
    public String toString(){
        return super.getNombre() + " (" + sistemaOperativo + " " + resolucion + ")";
    }

    /**
     * Calcula el número de pixeles
     * @return
     */
    public int getTotalPixeles(){
        String[] partes = resolucion.split("x");
        int ancho = Integer.parseInt(partes[0]);
        int alto = Integer.parseInt(partes[1]);
        return ancho * alto;
    }

    public SO getSistemaOperativo() {
        return sistemaOperativo;
    }

    public static void main(String[] args) {
        System.out.println("\nClase Cliente");
        System.out.println("=============\n");        
        Cliente cWin1 = new Cliente("Cliente1", "192.168.1.2", "02:1A:2B:3C:4D:5E", SO.WINDOWS, "1920x1080");
        Cliente cLin2 = new Cliente("Cliente2", "192.168.1.3", "01:1A:2B:3C:4D:5F", SO.LINUX, "1366x768");
        Cliente cMac3 = new Cliente("Cliente3", "192.168.1.4", "04:1A:2B:3C:4D:60", SO.MAC, "2560x1440");
        Cliente cAnd4 = new Cliente("Cliente4", "192.168.1.5", "03:1A:2B:3C:4D:61", SO.ANDROID, "1080x2340");
        Cliente cIos5 = new Cliente("Cliente5", "192.168.1.6", "05:1A:2B:3C:4D:62", SO.IOS, "1170x2532");

        Cliente[] clientes = { cWin1, cLin2, cMac3, cAnd4, cIos5 };
        Arrays.sort(clientes);
        for (Cliente c : clientes) {
            System.out.println(c);
        }

        // Ordenación alfabéticamente por sistema operativo
        Arrays.sort(clientes, Comparator.comparing(Cliente::getSistemaOperativo));
        System.out.println("\nClientes ordenados por SO");
        System.out.println("=============\n");  
        for (Cliente c : clientes) {
        System.out.println(c);
        }

        //Ordenación de mayor a menor resolución de pantalla, calculando el número de píxeles resultantes de 
        //multiplicar el ancho por el alto.
        Arrays.sort(clientes, Comparator.comparingInt(Cliente::getTotalPixeles).reversed());
        System.out.println("\nClientes ordenados por resolución");
        System.out.println("=============\n");  
        for (Cliente c : clientes) {
        System.out.println(c);
        }
 



    }
    
}
