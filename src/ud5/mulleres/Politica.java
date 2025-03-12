package ud5.mulleres;

class Politica extends MullerTraballadora implements IActivista {

    protected String causa;

    public Politica(String nome, String apelidos, int anoNacemento, String causa) {
        super(nome, apelidos, anoNacemento);
        this.causa = causa;
    }

    @Override
    public String descripcionContribucion() {
        return nome + " " + apelidos + " foi unha política activista destacada por: " + causa;
    }

    @Override
    public String getCausaDefendida() {
        return causa;
    }
}
