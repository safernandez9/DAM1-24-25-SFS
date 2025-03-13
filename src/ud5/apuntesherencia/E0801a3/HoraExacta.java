package ud5.apuntesherencia.E0801a3;

import java.util.Objects;

public class HoraExacta extends Hora {
    byte segundo;

    public HoraExacta(int hora, int minuto, int segundo) {
        super(hora, minuto);
        if (!setSegundo(segundo)) {
            throw new IllegalArgumentException("El segundo debe estar entre 0 y 59");
        }
    }

    boolean setSegundo(int valor) {
        if (valor >= 0 && valor < 60) {
            segundo = (byte)valor;
            return true;
        } else
            return false;
    }

    void inc(){
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            super.inc();
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        HoraExacta that = (HoraExacta) o;
        return hora == that.hora && minuto == that.minuto && segundo == that.segundo;
    }


    public static void main(String[] args) {
        HoraExacta h = new HoraExacta(8, 10, 0);
        System.out.println(h);
        HoraExacta h2 = new HoraExacta(23, 59, 59);
        h2.inc();
        System.out.println(h2);

        HoraExacta h3 = new HoraExacta(0, 0, 0);

        System.out.println(h2.equals(h3)); // true

    }

}
