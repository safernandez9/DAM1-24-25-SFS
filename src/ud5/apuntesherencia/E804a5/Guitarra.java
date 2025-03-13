package ud5.apuntesherencia.E804a5;

import java.util.Arrays;

public class Guitarra extends Instrumento {

    @Override
    public void interpretar() {
        System.out.println("Sonido de Guitarra: " + Arrays.toString(melodia));
    }
}
