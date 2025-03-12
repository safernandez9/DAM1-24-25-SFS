package ud5.mulleres;


class Artista extends MullerTraballadora {
    
    protected String estilo;

    public Artista(String nome, String apelidos, int anoNacemento, String estilo) {
        super(nome, apelidos, anoNacemento);
        this.estilo = estilo;
    }

    @Override
    public String descripcionContribucion() {
        return nome + " " + apelidos + " destacou na arte do estilo: " + estilo;
    }
}