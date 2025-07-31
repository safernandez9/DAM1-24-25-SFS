package ud7.examenAlvaro.examenUD7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AppInventario {

    //Importante el src
    static final String FILE_PATH = "src/ud7/apuntesjavafx/examenUD7/inventario.dat";

    static List<Producto> inventario = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cargarInventario(FILE_PATH);

        
        boolean isRunning = true;
        int userChoice = -1;


         do {
            displayMainMenu();
            
            userChoice = readInt();            

            switch (userChoice) {
                case 1:
                    displayInventory();
                    break;
                case 2:
                    menuAddProducto();
                    break;
                case 3:
                    menuSearchProducto();
                    break;
                case 4:
                    menuRemoveProducto();
                    break;
                case 5:
                    menuSaveInventory();
                    break;
                case 6:
                    menuLoadInventory();
                    break;
                case 0:
                    System.out.println("Saliendo del programa");
                    isRunning = false;
                    break;

                default:
                    break;
            }
        } while (isRunning);


        sc.close();
    }

    public static void displayMainMenu(){
        System.out.println(" -- AppInventario -- ");

        String[] menus = {
            "Mostrar Inventario", 
            "Añadir Producto", 
            "Buscar Producto", 
            "Quitar Producto", 
            "Guardar Inventario", 
            "Cargar Inventario"
        };

        String menulist = "";

        for (int i = 0; i < menus.length; i++) {
            menulist = String.format(menulist+"\n%d. %s", i+1, menus[i]);
        }

        System.out.println(menulist);
        System.out.println("Número del programa: ");
    }


    public static void displayInventory(){
        System.out.println(" -- Mostrar Inventario --");
        
        inventario.sort((p1,p2)-> p1.compareTo(p2));

        String msg = "";
        Producto p = null;
        for (int i = 0; i < inventario.size(); i++) {
            p = inventario.get(i);
            msg = String.format(msg+"\n%d - %s",p.getCodigo(),p.getName());
        }

        System.out.println(msg+"\n");
    }


    public static void menuAddProducto(){
        System.out.println(" -- Añadir Producto --");
        addProduct();


    }


    public static void menuSearchProducto(){
        System.out.println(" -- Buscar Producto --");
        System.out.println("Introduzca el código del producto: ");

        int codigo = readInt();
        Producto p = findProductByID(codigo);
        
        if (p == null){
            System.out.printf("[ El producto con el código %d no existe ]\n\n",codigo);
        }
        else{
            System.out.println(p+"\n");
        }
        
    }


    public static void menuRemoveProducto(){
        System.out.println(" -- Quitar Producto --");
        System.out.println("Introduzca el código del producto: ");

        int codigo = readInt();
        Producto p = findProductByID(codigo);

        inventario.remove(p);
    }


    public static void menuSaveInventory(){
        System.out.println(" -- Guardar Inventario --");
        guardarInventario(FILE_PATH);
    }


    public static void menuLoadInventory(){
        System.out.println(" -- Cargar Inventario --");
        cargarInventario(FILE_PATH);
        displayInventory();
    }


    public static Producto findProductByID(int codigo){
        for (Producto p : inventario) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }
       
    public static int readInt(){
        int input = -1;
        
        System.out.print("\nOpción: ");
        try {
            input = sc.nextInt();
        }
        catch (InputMismatchException e) {
        }
        finally{
            sc.nextLine();
            cleanTerminal();
        }

        return input;
    }


    public static String readString(String msg) {
        System.out.printf("\n %s ",msg);
        String input = sc.nextLine().trim();

        cleanTerminal();
        return input;
    }


    static void cleanTerminal(){
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }


    public static void addProduct() {

        String name = "";
        int codigo = 0;
        Double price = 0.;
        int amount = 0;

        name = readString("Nombre del producto: ");

        if (name.isEmpty()){
            System.out.println("El campo nombre debe rellenarse");
            return;
        }

        // Este try impide que se metan letras en los campos numericos o que se dejen en blanco
        // Es una excepcion de las que se piden
        try{

            codigo = Integer.parseInt(readString("Código del producto: "));
            price = Double.parseDouble(readString("Precio del producto: "));
            amount = Integer.parseInt(readString("Cantidad: "));

        } catch (NumberFormatException e) {
            System.out.println("Uno de los campos númericos están vacio o es invalido");
            return;
        }

        Producto product = new Producto(codigo,name,price,amount);
        
        if (inventario.contains(product)){
            System.out.println("El producto ya existe en el inventario");
        }
        else{
            inventario.add(product);
            displayInventory();
        }


    }

    static public void cargarInventario(String file_path){

        // Crear un fichero binario para escritura
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file_path))) {
            inventario = (List<Producto>)in.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado");
        } catch (NotSerializableException e) {
            System.out.println("Error: Objeto no serializable");            
        } catch (IOException e) {
            System.out.println("Error de E/S al leer el archivo");
        } catch (Exception e) {
            System.out.println("Error desconocido al guardar el archivo");
        }
    }


    static public void guardarInventario(String file_path){

        // Crear un fichero binario para escritura
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            out.writeObject(inventario);
        } catch (FileNotFoundException e) {
            System.out.println("Error: Ruta Invalida o mal formada");
        } catch (NotSerializableException e) {
            System.out.println("Error: Objeto no serializable");            
        } catch (IOException e) {
            System.out.println("Error de E/S al escribir en el archivo");
        } catch (Exception e) {
            System.out.println("Error desconocido al guardar el archivo");
        }
    }






}
