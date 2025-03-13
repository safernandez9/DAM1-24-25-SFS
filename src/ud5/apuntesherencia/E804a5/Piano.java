package ud5.apuntesherencia.E804a5;

import java.util.Arrays;

public class Piano extends Instrumento {

    @Override
    public void interpretar() {
        System.out.println("Sonido de Piano: " + Arrays.toString(melodia));
    }
}
