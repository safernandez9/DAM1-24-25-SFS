package ud6.apuntescolecciones;

class Producto {
    String codigo;
    String nombre;

    public Producto(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return codigo + "-" + nombre;
    }
}