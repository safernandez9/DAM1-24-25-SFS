package ud2.excepciones;

import java.io.IOException;

public class DeclararExcepcion {
    public static void main(String[] args) throws IOException {
        char car;
        System.out.println("Introduce un carácter");
        car = (char) System.in.read();
        
        System.out.println(car);
    }
}
