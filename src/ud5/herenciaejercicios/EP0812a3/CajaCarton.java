package ud5.herenciaejercicios.EP0812a3;

public class CajaCarton extends Caja {

    CajaCarton(int ancho, int alto, int fondo) {
        super(ancho, alto, fondo, Unidad.CM);
    }

    @Override
    double getVolumen() {
        return super.getVolumen() * 0.8;
    }

    double getSuperficie() {
        return 2 * alto * ancho + 2 * ancho * fondo + 2 * alto * fondo;
    }
}
