package ud5.apuntesinterfaces.relacionable;

public interface Relacionable {
    boolean esMayorQue(Relacionable a);
    boolean esMenorQue(Relacionable a);
    boolean esIgualQue(Relacionable a);

    default String nombreClase(){
        String clase = getClass().toString();
        int posicion = clase.lastIndexOf(".");
        return clase.substring(posicion+1);
    }

    default boolean esNulo() {
        return true;
    }

    static boolean esNull(Relacionable a){
        return a == null;
    }

}
