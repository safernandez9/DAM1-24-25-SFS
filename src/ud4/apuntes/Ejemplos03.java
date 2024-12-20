package ud4.apuntes;

import java.util.Arrays;

public class Ejemplos03 {
    public static void main(String[] args) {
        int[] edad = {18, 24, 37, 27}; // Declarar y construir un array con inicialización

        //edad = new int[5]; // Crea/instancia el array
        //edad = null;
        /*
        for (int i = 0; i < 4; i++)        
            System.out.println(edad[i]);
        */
        System.out.println(edad);
        System.out.println(Arrays.toString(edad));

        System.out.println("Fin de Programa");
    }
}
