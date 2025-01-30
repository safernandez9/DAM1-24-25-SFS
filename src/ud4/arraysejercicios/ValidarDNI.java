package ud4.arraysejercicios;

public class ValidarDNI {
    boolean esValidoDNI(int numero, char letra) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letras[numero % 23] == letra;
    }
}
