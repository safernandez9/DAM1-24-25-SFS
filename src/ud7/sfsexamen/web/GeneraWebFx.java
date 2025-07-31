//Saúl Fernández Salgado

package ud7.sfsexamen.web;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GeneraWebFx extends Application {
    
    TextField txtTitulo = new TextField("Escribe el título");
    TextField txtDescripcion = new TextField("Escribe la descrpcion");
    TextField txtTextoEnlace = new TextField("Escribe el el texto del enlace");
    TextField txtUrl = new TextField("Escribe la url");
    TextField txtDocumento = new TextField("Escribe el nombre del documento (con la estension.html)");

    Button btnGenerar = new Button("Generar Html");

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox vbox = new VBox(txtTitulo, txtDescripcion, txtTextoEnlace, txtUrl, txtDocumento);

        Scene scene = new Scene(vbox, 300, 150);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Generar HTML");
        primaryStage.setResizable(true);
        primaryStage.centerOnScreen();
        primaryStage.show();

    }

}
