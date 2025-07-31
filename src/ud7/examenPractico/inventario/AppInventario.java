package ud7.examenPractico.inventario;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AppInventario {
    private static final String FICHERO = "inventario.dat";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Producto> productos = cargarProductos();

        int opcion;
        do {
            System.out.println("\n1. Agregar producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Buscar producto");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar

            switch (opcion) {
                case 1 -> agregarProducto(sc, productos);
                case 2 -> listarProductos(productos);
                case 3 -> buscarProducto(sc, productos);
            }

            guardarProductos(productos);
        } while (opcion != 0);
    }

    private static void agregarProducto(Scanner sc, List<Producto> productos) {
        try {
            System.out.print("Código: ");
            int codigo = sc.nextInt(); sc.nextLine();
            for (Producto p : productos) {
                if (p.getCodigo() == codigo) {
                    System.out.println("El código ya existe.");
                    return;
                }
            }
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            if (nombre.isBlank()) {
                System.out.println("El nombre no puede estar vacío.");
                return;
            }
            System.out.print("Cantidad: ");
            int cantidad = sc.nextInt();
            System.out.print("Precio: ");
            double precio = sc.nextDouble();
            productos.add(new Producto(codigo, nombre, cantidad, precio));
            System.out.println("Producto agregado.");
        } catch (Exception e) {
            System.out.println("Error en entrada. Intente de nuevo.");
            sc.nextLine();
        }
    }

    private static void listarProductos(List<Producto> productos) {
        productos.stream()
            .sorted(Comparator.comparingInt(Producto::getCodigo))
            .forEach(System.out::println);
    }

    private static void buscarProducto(Scanner sc, List<Producto> productos) {
        System.out.print("Código del producto: ");
        int codigo = sc.nextInt();
        productos.stream()
            .filter(p -> p.getCodigo() == codigo)
            .findFirst()
            .ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Producto no encontrado.")
            );
    }

    private static List<Producto> cargarProductos() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FICHERO))) {
            return (List<Producto>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    private static void guardarProductos(List<Producto> productos) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FICHERO))) {
            out.writeObject(productos);
        } catch (IOException e) {
            System.out.println("Error al guardar productos: " + e.getMessage());
        }
    }
}