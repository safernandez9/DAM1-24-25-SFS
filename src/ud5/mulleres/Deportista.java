package ud5.mulleres;

class Deportista extends MullerTraballadora implements IPioneira {
    
    protected String logro;

    public Deportista(String nome, String apelidos, int anoNacemento, String logro) {
        super(nome, apelidos, anoNacemento);
        this.logro = logro;
    }

    @Override
    public String descripcionContribucion() {
        return nome + " " + apelidos + " destacou no deporte con este logro: " + logro;
    }

    @Override
    public String getDescubrimentoOuAporte() {
        return logro;
    }
}
