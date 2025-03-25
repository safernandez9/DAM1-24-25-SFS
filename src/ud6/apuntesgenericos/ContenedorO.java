package ud6.apuntesgenericos;

class ContenedorO {

    private Object objeto; // se inicializa a null: contenedor vacío

    public ContenedorO() {
    }

    void guardar(Object nuevo) {
        objeto = nuevo;
    }

    Object extraer() {
        Object res = objeto;
        objeto = null; // el contenedor vuelve a estar vacio
        return res;
    }

    public static void main(String[] args) {
        ContenedorO c = new ContenedorO();
        c.guardar(7);
        c.guardar("roca");
        System.out.println(c.getClass().getSimpleName());
        Double x = (Double) c.extraer(); // error de ejecución
    }

}
