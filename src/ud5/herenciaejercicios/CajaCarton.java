package ud5.herenciaejercicios.EP0812a3;

public class CajaCarton extends Caja {
    @Override
    double getVolumen() {
        return super.getVolumen() * 0.8;
    }
}
