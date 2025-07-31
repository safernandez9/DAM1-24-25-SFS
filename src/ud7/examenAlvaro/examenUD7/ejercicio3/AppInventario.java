package ud7.examenAlvaro.examenUD7.ejercicio3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ud7.examenAlvaro.examenUD7.Producto;

public class AppInventario extends Application {

    // Ruta del archivo donde se guardará el inventario serializado
    static final String FILE_PATH = "src/ud7/apuntesjavafx/examenUD7/inventario.dat";

    // Lista estática que guarda todos los productos en memoria
    static List<Producto> inventario = new ArrayList<>();

    // Referencia al escenario principal de la aplicación
    static Stage mainStage;

    @Override
    public void start(Stage primaryStage) throws Exception {

        mainStage = primaryStage;

        // Carga del archivo FXML con la interfaz gráfica
        Parent fxml = FXMLLoader.load(AppInventario.class.getResource("Inventario.fxml"));

        // Creación de la escena con el contenido cargado
        Scene scene = new Scene(fxml);

        // Configura la escena en el escenario y lo muestra
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Lanza la aplicación JavaFX
        launch(args);
    }

    /**
     * Busca un producto por su código en la lista inventario.
     * @param codigo Código identificador del producto.
     * @return El producto encontrado o null si no existe.
     */
    public static Producto findProductByID(int codigo) {
        for (Producto p : inventario) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }

    /**
     * Carga el inventario desde un archivo binario serializado.
     * Si el archivo no existe o hay error, la lista inventario queda vacía.
     * @param file_path Ruta del archivo donde está guardado el inventario.
     */
    static public void cargarInventario(String file_path) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file_path))) {
            // Se lee la lista completa de productos y se asigna a inventario
            AppInventario.inventario = (List<Producto>) in.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado");
            // Si no existe archivo, inventario queda vacío
            inventario = new ArrayList<>();
        } catch (NotSerializableException e) {
            System.out.println("Error: Objeto no serializable");
        } catch (IOException e) {
            System.out.println("Error de E/S al leer el archivo");
        } catch (Exception e) {
            System.out.println("Error desconocido al cargar el archivo");
        }
    }

    /**
     * Guarda la lista inventario en un archivo binario serializado.
     * @param file_path Ruta donde se guardará el inventario.
     */
    static public void guardarInventario(String file_path) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file_path))) {
            out.writeObject(AppInventario.inventario);
        } catch (FileNotFoundException e) {
            System.out.println("Error: Ruta inválida o mal formada");
        } catch (NotSerializableException e) {
            System.out.println("Error: Objeto no serializable");
        } catch (IOException e) {
            System.out.println("Error de E/S al escribir en el archivo");
        } catch (Exception e) {
            System.out.println("Error desconocido al guardar el archivo");
        }
    }

}
