package ud7.examenAlvaro.examenUD7.notas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class AppNotas {

    public static void main(String[] args) {
        final String INPUT_FILE_PATH = "src/ud7/examenAlvaro/examenUD7/notas/notas.txt";
        final String OUTPUT_FILE_PATH = "src/ud7/examenAlvaro/examenUD7/notas/promedios.txt";

        // Verificar que el fichero exista y no esté vacío
        if (!Files.exists(Paths.get(INPUT_FILE_PATH))) {
            System.out.println("Error: El fichero " + INPUT_FILE_PATH + " no existe.");
            return;
        }
        try {
            if (Files.size(Paths.get(INPUT_FILE_PATH)) == 0) {
                System.out.println("Error: El fichero " + INPUT_FILE_PATH + " está vacío.");
                return;
            }
        } catch (IOException e) {
            System.out.println("Error al verificar el fichero: " + e.getMessage());
            return;
        }

        List<String> outputLines = new ArrayList<>();

        //Recorro mientras pueda
        try (BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_PATH))) {
            String line;
            int lineNum = 0;
            while ((line = br.readLine()) != null) {
                lineNum++;
                line = line.trim();
                if (line.isEmpty()) continue;

                // Dividir nombre y notas
                String[] parts = line.split(",");
                if (parts.length < 2) {
                    System.out.println("Error: Datos incorrectos en la línea " + lineNum + ": " + line);
                    continue;
                }

                String nombre = parts[0].trim();

                // Leer calificaciones
                double suma = 0;
                int count = 0;
                boolean errorEnNotas = false;
                for (int i = 1; i < parts.length; i++) {
                    try {
                        double nota = Double.parseDouble(parts[i].trim());
                        suma += nota;
                        count++;
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Nota inválida en línea " + lineNum + ": " + parts[i]);
                        errorEnNotas = true;
                        break;
                    }
                }

                if (errorEnNotas) continue;

                double promedio = suma / count;
                outputLines.add(nombre + ": " + promedio);
            }
        } catch (IOException e) {
            System.out.println("Error leyendo el fichero: " + e.getMessage());
            return;
        }

        // Escribir resultados en el fichero de salida
        try (PrintWriter pw = new PrintWriter(new FileWriter(OUTPUT_FILE_PATH))) {
            for (String outputLine : outputLines) {
                pw.println(outputLine);
            }
            System.out.println("Promedios calculados y guardados en " + OUTPUT_FILE_PATH);
        } catch (IOException e) {
            System.out.println("Error escribiendo el fichero: " + e.getMessage());
        }
    }
}
