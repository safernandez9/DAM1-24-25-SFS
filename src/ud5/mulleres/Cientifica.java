package ud5.mulleres;

class Cientifica extends MullerTraballadora implements IPioneira {

    protected String descubrimento;

    public Cientifica(String nome, String apelidos, int anoNacemento, String descubrimento) {
        super(nome, apelidos, anoNacemento);
        this.descubrimento = descubrimento;
    }

    @Override
    public String descripcionContribucion() {
        return nome + " " + apelidos + " foi unha científica pioneira que descubriu: " + descubrimento;
    }

    @Override
    public String getDescubrimentoOuAporte() {
        return descubrimento;
    }
}