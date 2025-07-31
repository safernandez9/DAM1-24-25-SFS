package ud7.examenPractico;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AppNotas {

    public static void main(String[] args) {

        //Declaro nombres de ficheros
        String entrada = "notas.txt";
        String salida = "promedios.txt";

        //Try para la creacion del scanner que hace catch de que el fichero no exista y IOException para errorex variosx 
        try (Scanner sc = new Scanner(new File(entrada));

        //Creo un PrintWriter para escribir en el fichero de salida
             PrintWriter writer = new PrintWriter(new FileWriter(salida))) {

            //Si no hay siguiente linea en sc (el de entrada) tiro excepcion
            if (!sc.hasNextLine()) {
                throw new IOException("El archivo está vacío.");
            }

            //Recorro con sc el fichero de entrada mientras haya algo
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();

                //por cada linea separo las partes y las añado a un vector
                String[] partes = linea.split(",");

                //Si hay menos de dos elementos la linea tiene formato incorrecto
                if (partes.length < 2) {
                    System.out.println("Línea con formato incorrecto: " + linea);
                    continue;
                }

                //nombre == primer elemento de cada linea
                String nombre = partes[0];
                double suma = 0;
                int cantidad = 0;

                //Recorro  en cada linea los elementos de despues del nombre y los sumo entre ellos y acumulo cuantas sumas hago
                for (int i = 1; i < partes.length; i++) {

                    //try catch para los errores del parse
                    try {
                        suma += Double.parseDouble(partes[i]);
                        cantidad++;
                    } catch (NumberFormatException e) {
                        System.out.println("Calificación no válida: " + partes[i]);
                    }
                }

                //Mas de una suma o menos de una suma y escribo en el fichero
                if (cantidad > 0) {
                    double promedio = suma / cantidad;
                    writer.println(nombre + ": " + promedio);
                } else {
                    System.out.println("No se encontraron notas válidas para: " + nombre);
                }
            }

            System.out.println("Archivo promedios.txt generado correctamente.");

        } catch (FileNotFoundException e) {
            System.out.println("El archivo " + entrada + " no existe.");
        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        }
    }
}
