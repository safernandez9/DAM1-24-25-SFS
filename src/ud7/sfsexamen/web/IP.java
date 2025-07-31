package ud7.sfsexamen.web;

public class IP implements Comparable {

    private int numeroRepeticionesIP = 1;
    private String numIP;

    public IP(String iP) {
        numIP = iP;
    }

    public int getNumeroRepeticionesIP() {
        return numeroRepeticionesIP;
    }

    public void setNumeroRepeticionesIP(int numeroRepeticionesIP) {
        this.numeroRepeticionesIP = numeroRepeticionesIP;
    }

    public String getIP() {
        return numIP;
    }

    public void setIP(String iP) {
        numIP = iP;
    }

    public void incrementarRepeticiones() {
        numeroRepeticionesIP++;

    }

    @Override
    public String toString() {
        return "\n" + numIP + " se repite " + numeroRepeticionesIP + " veces";
    }

    //De mayor a menor número de repeticiones
    @Override
    public int compareTo(Object o) {
        return ((IP) o).numeroRepeticionesIP - this.numeroRepeticionesIP;
    }
}
