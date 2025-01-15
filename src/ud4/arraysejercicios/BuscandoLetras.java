package ud4.arraysejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BuscandoLetras {

    public static void main(String[] args) {

        String conceptos[] = { "Algoritmo",
                "Lenguaje de programación",
                "Entorno de desarrollo",
                "Compilación",
                "Ejecución",
                "Código fuente",
                "Bytecode",
                "Código objeto"
        };

        String frase;
        char[] caracteres;
        int[] resultado;
        char letra;

        Scanner sc = new Scanner(System.in);

        frase = fraseAleatoria(conceptos);

        do {
            System.out.println("Introduce una letra: ");
            letra = sc.next().charAt(0);
            resultado = Arrays.copyOf(buscarLetra(frase, letra), 3);
        } while (resultado[0] != -1);

    }

    static String fraseAleatoria(String[] t) {

        int indiceAleatorio;
        Random random = new Random();

        indiceAleatorio = random.nextInt(t.length);
        return (t[indiceAleatorio]);

    }

    static int[] buscarLetra(String cadena, char letra) {

        char [] caracteres;
        int [] resultados = new int [3];        //Cambiar tamaño
        int apariciones;
        int y = 2;


        caracteres = cadena.toCharArray();

        for (int i = 0; i<caracteres.length; i++) {     //Acabar

            if(aparece){
                apariciones++;
                resultados[0] = 1;
                resultados [1] = apariciones;
                resultados [y] = i;
                y++;
            }

            

            
        }
        if(encuentro){
            resultados[0] = 1;
            resultados[1] = ;
            resultados[2] = ;
        }
        else{
            Arrays.fill(resultados, -1);

        }

    }
}
