package ud5.mulleres;

class Sindicalista extends MullerTraballadora implements IActivista {
    
    protected String movementoDefendido;

    public Sindicalista(String nome, String apelidos, int anoNacemento, String movementoDefendido) {
        super(nome, apelidos, anoNacemento);
        this.movementoDefendido = movementoDefendido;
    }

    @Override
    public String descripcionContribucion() {
        return nome + " " + apelidos + " foi unha sindicalista que defendeu: " + movementoDefendido;
    }

    @Override
    public String getCausaDefendida() {
        return movementoDefendido;
    }
}