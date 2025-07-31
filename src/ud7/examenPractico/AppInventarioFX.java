// AppInventarioFX.java
package ud7.examenPractico;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.swing.text.html.ListView;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import ud7.examenPractico.inventario.Producto;

public class AppInventarioFX extends Application {

    private ObservableList<Producto> productos = FXCollections.observableArrayList();
    private final String FICHERO = "inventario.dat";
    private ListView<Producto> listView;

    @Override
    public void start(Stage stage) {
        TextField txtCodigo = new TextField();
        txtCodigo.setPromptText("Código");
        TextField txtNombre = new TextField();
        txtNombre.setPromptText("Nombre");
        TextField txtCantidad = new TextField();
        txtCantidad.setPromptText("Cantidad");
        TextField txtPrecio = new TextField();
        txtPrecio.setPromptText("Precio");

        Button btnAgregar = new Button("Agregar");
        btnAgregar.setOnAction(e -> agregarProducto(txtCodigo, txtNombre, txtCantidad, txtPrecio));

        TextField txtBuscar = new TextField();
        txtBuscar.setPromptText("Buscar por código");
        Button btnBuscar = new Button("Buscar");
        btnBuscar.setOnAction(e -> buscarProducto(txtBuscar));

        listView = new ListView<>(productos);

        VBox formulario = new VBox(5, txtCodigo, txtNombre, txtCantidad, txtPrecio, btnAgregar);
        HBox busqueda = new HBox(5, txtBuscar, btnBuscar);
        VBox layout = new VBox(10, formulario, busqueda, listView);

        cargarProductos();

        Scene scene = new Scene(layout, 500, 400);
        stage.setScene(scene);
        stage.setTitle("Inventario FX");
        stage.show();
    }

    private void agregarProducto(TextField codigo, TextField nombre, TextField cantidad, TextField precio) {
        try {
            int cod = Integer.parseInt(codigo.getText());
            for (Producto p : productos) {
                if (p.getCodigo() == cod) {
                    mostrarError("Código ya existe.");
                    return;
                }
            }
            if (nombre.getText().isBlank()) {
                mostrarError("Nombre no puede estar vacío.");
                return;
            }
            Producto p = new Producto(
                cod,
                nombre.getText(),
                Integer.parseInt(cantidad.getText()),
                Double.parseDouble(precio.getText())
            );
            productos.add(p);
            guardarProductos();
        } catch (Exception e) {
            mostrarError("Datos inválidos: " + e.getMessage());
        }
    }

    private void buscarProducto(TextField campo) {
        try {
            int cod = Integer.parseInt(campo.getText());
            Optional<Producto> encontrado = productos.stream().filter(p -> p.getCodigo() == cod).findFirst();
            if (encontrado.isPresent()) {
                mostrarInfo(encontrado.get().toString());
            } else {
                mostrarError("Producto no encontrado.");
            }
        } catch (NumberFormatException e) {
            mostrarError("Código inválido.");
        }
    }

    private void cargarProductos() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FICHERO))) {
            productos.setAll((List<Producto>) in.readObject());
        } catch (IOException | ClassNotFoundException e) {
            // Ignorar si no existe
        }
    }

    private void guardarProductos() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FICHERO))) {
            out.writeObject(new ArrayList<>(productos));
        } catch (IOException e) {
            mostrarError("Error al guardar: " + e.getMessage());
        }
    }

    private void mostrarError(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR, mensaje, ButtonType.OK);
        alert.showAndWait();
    }

    private void mostrarInfo(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION, mensaje, ButtonType.OK);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch();
    }
}



