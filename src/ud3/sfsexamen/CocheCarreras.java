package ud3.sfsexamen;

import java.util.Random;

public class CocheCarreras {

    public static void main(String[] args) {

        System.out.println("this");
        System.out.println("====");
        CocheCarreras rayo = new CocheCarreras("this", 90, 400);
        rayo.mostrar();
        rayo.avanzar();
        rayo.usarTurbo();
        rayo.mostrar();
        System.out.println("TRUENO");
        System.out.println("======");
        CocheCarreras trueno = new CocheCarreras("Trueno", 60, 5, 300);
        trueno.mostrar();
        while (trueno.getAutonomiaRestante() != 0)
            trueno.usarTurbo();
        trueno.mostrar();
        trueno.repostar();
        trueno.mostrar();

    }

    // Atributos

    private String nombre;
    private int vmax_ms;
    private int maxTurbos;
    private int autonomia_m;
    private int autonomiaRestante;
    private int turbosRestantes;
    private int distanciaRecorrida;

    // En caso de valores negativos la autonomia será 100, la velocidad maxima 50 y
    // los turbos 3

    public CocheCarreras(String nombre, int vmax, int autonomia) {

        this.nombre = nombre;
        this.vmax_ms = (vmax > 0 && vmax < 101) ? vmax : 50;
        this.maxTurbos = 3;

        if (autonomia > 0) {
            this.autonomia_m = autonomia;
            this.autonomiaRestante = autonomia;
        } else {
            this.autonomia_m = 100;
            this.autonomiaRestante = 100;
        }

        this.turbosRestantes = 3;
        this.distanciaRecorrida = 0;
    }

    public CocheCarreras(String nombre, int vmax, int maxTurbos, int autonomia) {

        this.nombre = nombre;
        this.vmax_ms = (vmax > 0 && vmax < 101) ? vmax : 50;

        if (maxTurbos >= 0) {
            this.maxTurbos = maxTurbos;
            this.turbosRestantes = maxTurbos;
        } else {
            this.maxTurbos = 3;
            this.turbosRestantes = 3;
        }

        if (autonomia > 0) {
            this.autonomia_m = autonomia;
            this.autonomiaRestante = autonomia;
        } else {
            this.autonomia_m = 100;
            this.autonomiaRestante = 100;
        }

        this.distanciaRecorrida = 0;
    }

    // Getters

    public String getNombre() {
        return nombre;
    }

    public int getVmax_ms() {
        return vmax_ms;
    }

    public int getMaxTurbos() {
        return maxTurbos;
    }

    public int getAutonomia_m() {
        return autonomia_m;
    }

    public int getAutonomiaRestante() {
        return autonomiaRestante;
    }

    public int getTurbosRestantes() {
        return turbosRestantes;
    }

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    // Métodos

    public void mostrar() {
        System.out.println("Coche: " + this.nombre);
        System.out.println("Velocidad Máxima: " + this.vmax_ms + " mps");
        System.out.println("Turbos: " + this.turbosRestantes + "/" + this.maxTurbos);
        System.out.println("Autonomía: " + this.autonomiaRestante + "/" + this.autonomia_m);
    }

    public int avanzar() {

        int avanza;

        Random rnd = new Random();

        avanza = rnd.nextInt(1, vmax_ms + 1);

        if (avanza < this.autonomiaRestante) {
            this.autonomiaRestante -= avanza;
            this.distanciaRecorrida += avanza;
        } else {

            avanza = this.autonomiaRestante;
            this.autonomiaRestante = 0;
            this.distanciaRecorrida += avanza;

        }

        return avanza;
    }

    public int usarTurbo() {

        double avanza;

        if (this.turbosRestantes > 0) {
            avanza = this.vmax_ms * 1.5;
            avanza = Math.round(avanza);

            if (avanza < this.autonomiaRestante) {
                this.autonomiaRestante -= avanza;
                this.distanciaRecorrida += avanza;

            } else {
                avanza = this.autonomiaRestante;
                this.autonomiaRestante = 0;
                this.distanciaRecorrida += avanza;

            }

            this.turbosRestantes -= 1;

            return (int) avanza;

        } else {
            return 0;
        }

    }

    public void repostar() {
        this.autonomiaRestante = this.autonomia_m;
        this.turbosRestantes = this.maxTurbos;
    }

    public void reiniciarDistancia() {
        this.distanciaRecorrida = 0;
    }

    public void turno() {

        if (this.getAutonomiaRestante() == 0) {
            this.repostar();
            System.out.println("" + this.getNombre() + " para a repostar.");
        } else if (this.getTurbosRestantes() > 0) {

            Random rnd = new Random();

            int probTurbo = rnd.nextInt(1, 100 + 1);
            if (probTurbo < 26) {
                int avanceTurbo = this.usarTurbo();
                System.out.println(" " + this.getNombre() + " usa un turbo y avanza" + avanceTurbo
                        + " metros. Quedan " + this.getTurbosRestantes() + " turbos. (Total recorrido )"
                        + this.getDistanciaRecorrida() + " metros).");
            }
        } else {
            int mAvanzados = this.avanzar();
            System.out.println(" " + this.getNombre() + " avanza " + mAvanzados + " metros (Total recorrido: "
                    + this.getDistanciaRecorrida() + " metros).");
            mAvanzados = 0;
        }
    }
}