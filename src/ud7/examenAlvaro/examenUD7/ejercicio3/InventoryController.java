package ud7.examenAlvaro.examenUD7.ejercicio3;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import ud7.examenAlvaro.examenUD7.Producto;

/**
 * Controlador de la interfaz de usuario para la gestión del inventario.
 * Maneja la interacción con los controles gráficos y la lógica de negocio.
 */
public class InventoryController implements Initializable {

    // Campos vinculados a los controles definidos en el FXML
    @FXML
    private TextField txtAmount;  // Campo para cantidad de producto

    @FXML
    private TextField txtName;    // Campo para nombre de producto

    @FXML
    private TextField txtPrice;   // Campo para precio de producto

    @FXML
    private TextField txtCodigo;  // Campo para código de producto

    @FXML
    private TextField txtSearchBox; // Campo para buscar producto por código

    @FXML
    private ListView<Producto> lstProductos; // Lista que muestra productos

    /**
     * Inicialización del controlador tras cargar la vista.
     * Aquí se carga el inventario, se actualiza la lista y se configuran listeners.
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Cargar inventario desde fichero
        AppInventarioFX.cargarInventario(AppInventarioFX.FILE_PATH);

        // Cambiar título de ventana con ruta del archivo
        AppInventarioFX.mainStage.setTitle("Inventario - " + AppInventarioFX.FILE_PATH);

        // Añadir productos cargados a la lista visual
        lstProductos.getItems().addAll(AppInventarioFX.inventario);

        // Listener para actualizar campos cuando se selecciona un producto en la lista
        lstProductos.getSelectionModel().selectedItemProperty().addListener(
                (obs, prevProducto, producto) -> {
                    if (producto != null) {
                        txtCodigo.setText(String.valueOf(producto.getCodigo()));
                        txtName.setText(producto.getName());
                        txtPrice.setText(String.valueOf(producto.getPrice()));
                        txtAmount.setText(String.valueOf(producto.getAmount()));
                    }
                });

        // Listener para buscar producto automáticamente mientras se escribe en el buscador
        txtSearchBox.textProperty().addListener((observable, oldValue, newValue) -> searchProduct(null));
    }

    /**
     * Método auxiliar para crear un producto a partir de cadenas de texto.
     * Valida que los campos numéricos sean correctos y el nombre no esté vacío.
     * @param strCodigo Código en texto.
     * @param name Nombre.
     * @param strPrice Precio en texto.
     * @param strAmount Cantidad en texto.
     * @return Producto creado o null si hay error.
     */
    private Producto createProduct(String strCodigo, String name, String strPrice, String strAmount) {
        Producto p = null;

        if (name.isEmpty()) {
            System.out.println("El campo nombre debe rellenarse");
            return null;
        }

        try {
            p = new Producto(
                    Integer.parseInt(strCodigo),
                    name,
                    Double.parseDouble(strPrice),
                    Integer.parseInt(strAmount));
        } catch (NumberFormatException e) {
            System.out.println("Uno de los campos numéricos está vacío o es inválido");
            return null;
        }

        return p;
    }

    /**
     * Añade un producto al inventario desde los campos del formulario.
     * Verifica que el producto no exista ya antes de añadirlo.
     */
    @FXML
    void addProduct(ActionEvent event) {
        Producto p = createProduct(
                txtCodigo.getText(),
                txtName.getText(),
                txtPrice.getText(),
                txtAmount.getText()
        );

        if (p == null) {
            return;
        }

        if (AppInventarioFX.inventario.contains(p)) {
            System.out.println("El producto ya existe en el inventario");
        } else {
            AppInventarioFX.inventario.add(p);
            refreshListView();
        }
    }

    /**
     * Carga el inventario desde el fichero.
     * También puedes usar el botón para forzar la recarga.
     */
    @FXML
    void loadInventory(ActionEvent event) {
        AppInventarioFX.cargarInventario(AppInventarioFX.FILE_PATH);
        refreshListView();
    }

    /**
     * Elimina un producto seleccionado por código.
     * Si el código no es válido o el producto no existe, no hace nada.
     */
    @FXML
    void removeProduct(ActionEvent event) {
        int id = -1;
        try {
            id = Integer.parseInt(txtCodigo.getText());
        } catch (NumberFormatException e) {
            System.out.println("Código inválido para eliminar producto");
            return;
        }

        Producto p = new Producto(id);  // Solo con código para buscar y eliminar
        if (AppInventarioFX.inventario.remove(p)) {
            refreshListView();
        } else {
            System.out.println("No se encontró producto con código: " + id);
        }
    }

    /**
     * Busca y muestra el producto según el código introducido en el buscador.
     * Si está vacío muestra todo el inventario.
     */
    @FXML
    void searchProduct(ActionEvent event) {
        String strCodigo = txtSearchBox.getText();

        if (strCodigo.isEmpty()) {
            refreshListView();
            return;
        }

        int codigo = -1;
        try {
            codigo = Integer.parseInt(strCodigo);
        } catch (NumberFormatException e) {
            // Ignorar si no es número válido
            return;
        }

        Producto p = AppInventarioFX.findProductByID(codigo);

        lstProductos.getItems().clear();

        if (p != null) {
            lstProductos.getItems().add(p);
        }
    }

    /**
     * Guarda el inventario actual en el fichero.
     */
    @FXML
    void saveInventory(ActionEvent event) {
        AppInventarioFX.guardarInventario(AppInventarioFX.FILE_PATH);
    }

    /**
     * Actualiza un producto existente con los datos del formulario.
     * Busca por código y reemplaza la información.
     */
    @FXML
    void updateProductData(ActionEvent event) {
        int codigo = -1;

        try {
            codigo = Integer.parseInt(txtCodigo.getText());
        } catch (NumberFormatException e) {
            System.out.println("El código del producto no es un valor numérico válido");
            return;
        }

        for (int i = 0; i < AppInventarioFX.inventario.size(); i++) {
            Producto p = AppInventarioFX.inventario.get(i);

            if (p.getCodigo() == codigo) {
                Producto updatedProduct = createProduct(
                        txtCodigo.getText(),
                        txtName.getText(),
                        txtPrice.getText(),
                        txtAmount.getText()
                );

                if (updatedProduct != null) {
                    AppInventarioFX.inventario.set(i, updatedProduct);
                    refreshListView();
                }
                return;
            }
        }
        System.out.println("No se encontró producto para actualizar con código: " + codigo);
    }

    /**
     * Refresca la lista visual para mostrar los datos actuales del inventario.
     */
    private void refreshListView() {
        lstProductos.getItems().clear();
        lstProductos.getItems().addAll(AppInventarioFX.inventario);
    }
}