package ud4.arraysejercicios;

import java.util.Random;

public class ParejasTareas {
    static String[] parejas = {"Alejandro - Celia",
            "Israel - Hugo",
            "Jorge - Adrián",
            "David B. - Carlos",
            "Pablo - Antonio",
            "Álvaro - Pablo C",
            "Yago - Eva",
            "Arón - André",
            "Hugo C. - José",
            "Rocío - Saúl"};

    public static void main(String[] args) {
        desordenar(parejas);
        for (int i = 0; i < parejas.length; i++) {
            System.out.println((i + 1) + ". " + parejas[i]);
        }
    }

    static void desordenar(String t[]) {
        Random rnd = new Random(10);
        for (int i = 0; i < t.length; i++) {
            int nuevaPosicion = rnd.nextInt(t.length);
            if (i != nuevaPosicion) {
                String aux = t[i];
                t[i] = t[nuevaPosicion];
                t[nuevaPosicion] = aux;
            }
        }
    }

}
