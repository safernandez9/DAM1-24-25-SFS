package ud5.mulleres;

class Escritora extends MullerTraballadora implements IPioneira {
    protected String obraMestra;

    public Escritora(String nome, String apelidos, int anoNacemento, String obraMestra) {
        super(nome, apelidos, anoNacemento);
        this.obraMestra = obraMestra;
    }

    @Override
    public String descripcionContribucion() {
        return nome + " " + apelidos + " foi unha escritora destacada. A súa obra mestra: " + obraMestra;
    }

    @Override
    public String getDescubrimentoOuAporte() {
        return obraMestra;
    }
}
