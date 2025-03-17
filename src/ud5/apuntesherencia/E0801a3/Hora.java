package ud5.apuntesherencia.E0801a3;

public class Hora {
    byte hora;
    byte minuto;

    public Hora(int hora, int minuto) {
        if (!setHora(hora)) {
            throw new IllegalArgumentException("La hora debe estar entre 0 y 23");
        }
        if (!setMinuto(minuto)) {
            throw new IllegalArgumentException("El minuto debe estar entre 0 y 59");
        }
    }

    void inc() {
        minuto++;
        if (minuto == 60) {
            minuto = 0;
            hora++;
            if (hora == 24) {
                hora = 0;
            }
        }
    }

    boolean setMinuto(int valor) {
        if (valor >= 0 && valor < 60) {
            minuto = (byte)valor;
            return true;
        } else
            return false;
    }

    boolean setHora(int valor) {
        if (valor >= 0 && valor < 24) {
            hora = (byte)valor;
            return true;
        } else
            return false;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hora, minuto);
    }

    public static void main(String[] args) {
        Hora hora = new Hora(88, 10);
        System.out.println(hora);
        hora.inc();
        System.out.println(hora);
        hora.setMinuto(59);
        System.out.println(hora);
    }

}
