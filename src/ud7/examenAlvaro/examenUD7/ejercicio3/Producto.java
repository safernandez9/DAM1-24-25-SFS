package ud7.examenAlvaro.examenUD7.ejercicio3;

import java.io.Serializable;
import java.util.Objects;

/**
 * Clase que representa un producto del inventario.
 * Implementa Serializable para permitir guardar y cargar objetos en archivo binario.
 */
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;

    private int codigo;
    private String name;
    private double price;
    private int amount;

    /**
     * Constructor completo.
     * @param codigo Código único del producto.
     * @param name Nombre del producto.
     * @param price Precio unitario.
     * @param amount Cantidad en stock.
     */
    public Producto(int codigo, String name, double price, int amount) {
        this.codigo = codigo;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    /**
     * Constructor que solo recibe el código.
     * Útil para crear un producto temporal para buscar o eliminar por código.
     * @param codigo Código único del producto.
     */
    public Producto(int codigo) {
        this.codigo = codigo;
    }

    // Getters y setters
    public int getCodigo() { return codigo; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getAmount() { return amount; }

    public void setCodigo(int codigo) { this.codigo = codigo; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }
    public void setAmount(int amount) { this.amount = amount; }

    /**
     * equals basado en el código único.
     * Esto permite buscar y eliminar productos por código.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Producto)) return false;
        Producto other = (Producto) obj;
        return codigo == other.codigo;
    }

    /**
     * hashCode compatible con equals.
     */
    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    /**
     * Representación textual para mostrar en ListView.
     */
    @Override
    public String toString() {
        return codigo + " - " + name + " | Precio: " + price + " | Cantidad: " + amount;
    }
}
