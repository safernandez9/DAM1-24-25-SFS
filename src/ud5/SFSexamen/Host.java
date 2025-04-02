//Saúl Fernández Salgado
package ud5.SFSexamen;

import java.util.Arrays;

public class Host implements Comparable<Host>{

    protected static final String MASCARA_RED = "255.255.0.0";
    protected static final String PUERTA_ENLACE = "192.168.0.11";
    protected static final String SERVIDOR_DNS = "192.168.0.9";

    private String nombre;
    private String mac;
    private String IP;

    //Constructor
    public Host(String nombre, String IP, String mac) {

        if(nombre == null || mac == null || IP == null || !validarMAC(mac) || !validarIP(IP)){
            throw new IllegalArgumentException("Parametros Invalidos");
        }
        this.nombre = nombre;
        this.mac = mac;
        this.IP = IP;
    }


    boolean validarIP(String ip) {
        return ip.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
    }

    boolean validarMAC(String mac) {
        return mac.matches("([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})");
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        Host host = (Host) obj;

        String primerMAC = mac.replace("-", ":");
        String segundoMAC = host.mac.replace("-", ":");

        return primerMAC.equalsIgnoreCase(segundoMAC);
    }

    
    @Override
    public String toString(){
        return nombre + " (" + IP + "//" + mac + ")";

    }

    @Override
    public int compareTo(Host otroHost){
        return this.nombre.compareTo(otroHost.nombre);

    }

    
    public String getNombre() {
        return nombre;
    }


    public static void main(String[] args) {
        System.out.println("\nClase Host");
        System.out.println("==========\n");
        Host h100 = new Host("host100", "192.168.117.100", "00:11:22:33:44:55");
        Host h101 = new Host("equipo101", "192.168.117.101", "00:11:22:33:44:55");
        Host h102 = new Host("nodo100", "192.168.117.100", "00-11-22-33-44-AA");
        Host h103 = new Host("host103", "192.168.117.103", "00-11-22-33-44-55");

        Host[] hosts = { h100, h101, h102, h103 };
        Arrays.sort(hosts);
        for (Host h : hosts) {
            System.out.println(h);
        }

        System.out.println(h100.nombre + " = " + h101.nombre + "? " + h100.equals(h101)); // true
        System.out.println(h100.nombre + " = " + h102.nombre + "? " + h100.equals(h102)); // false
        System.out.println(h100.nombre + " = " + h103.nombre + "? " + h100.equals(h103)); // true
    }
}
