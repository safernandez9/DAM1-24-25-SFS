//Saúl Fernández Salgado
package ud5.SFSexamen;

import java.util.Arrays;
import java.util.Comparator;

public class Servidor extends Host {

    private static final int MAX_SERVICIOS = 100;

    private String[] servicios;
    private int[] puertos;
    private String[] protocolos;
    private static int numServicios;

    public Servidor(String nombre, String mac, String ip) {
        super(nombre, ip, mac);
        this.servicios = new String[MAX_SERVICIOS];
        this.puertos = new int[MAX_SERVICIOS];
        this.protocolos = new String[MAX_SERVICIOS];
        this.numServicios = 0;

    }

    public static void main(String[] args) {
        System.out.println("\nClase Servidor");
        System.out.println("==============\n");
        Servidor s1 = new Servidor("dam1", "192.168.0.117", "CC-11-22-33-44-AA");
        s1.addServicio("MySQL", 3306, "TCP");
        Servidor s2 = new Servidor("seixo", "192.168.0.11", "BB:11:22:33:44:55");
        s2.addServicio("HTTP", 80, "TCP");
        s2.addServicio("Proxy", 3128, "TCP");
        Servidor s3 = new Servidor("lapaman", "192.168.0.9", "AA:11:22:33:44:55");
        s3.addServicio("HTTP", 80, "TCP");
        s3.addServicio("Web", 80, "TCP");
        s3.addServicio("DNS", 53, "UDP");
        s3.addServicio("FTP", 21, "TCP");
        s3.addServicio("SSH", 22, "TCP");

        Servidor[] servidores = { s1, s2, s3 };
        for (Servidor s : servidores) {
            System.out.println(s);
        }

        Arrays.sort(servidores, Comparator.comparingInt(Servidor.numServicios).reversed());
        System.out.println("\nClientes ordenados por resolución");
        System.out.println("=============\n");
        for (Servidor s : servidores) {
            System.out.println(s);
        }

    }

    public boolean addServicio(String nombreServicio, int puerto, String protocolo) {

    }

}
