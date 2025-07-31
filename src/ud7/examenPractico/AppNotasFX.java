// AppNotasFX.java
package ud7.examenPractico;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppNotasFX extends Application {
    private TextArea areaResultados;

    @Override
    public void start(Stage stage) {
        Button btnCargar = new Button("Cargar Notas");
        areaResultados = new TextArea();
        areaResultados.setEditable(false);

        btnCargar.setOnAction(e -> procesarNotas());

        VBox root = new VBox(10, btnCargar, areaResultados);
        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("Promedios de Notas");
        stage.setScene(scene);
        stage.show();
    }

    private void procesarNotas() {
        File entrada = new File("notas.txt");
        File salida = new File("promedios.txt");

        try (Scanner sc = new Scanner(entrada);
             PrintWriter writer = new PrintWriter(new FileWriter(salida))) {

            StringBuilder resultado = new StringBuilder();

            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] partes = linea.split(",");
                if (partes.length < 2) continue;

                String nombre = partes[0];
                double suma = 0;
                int cantidad = 0;

                for (int i = 1; i < partes.length; i++) {
                    suma += Double.parseDouble(partes[i]);
                    cantidad++;
                }

                double promedio = suma / cantidad;
                String lineaResultado = nombre + ": " + promedio;
                writer.println(lineaResultado);
                resultado.append(lineaResultado).append("\n");
            }

            areaResultados.setText(resultado.toString());

        } catch (IOException e) {
            mostrarError("Error al procesar el archivo: " + e.getMessage());
        }
    }

    private void mostrarError(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR, mensaje, ButtonType.OK);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch();
    }
}
