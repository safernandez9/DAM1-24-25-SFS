package ud5.apuntesinterfaces.relacionable;

public interface Modificable {
    void aumentar(int n);
    void disminuir(int n);

    default String nombreClase(){
        String clase = getClass().toString();
        int posicion = clase.lastIndexOf(".");
        return clase.substring(posicion+1);
    }
}
