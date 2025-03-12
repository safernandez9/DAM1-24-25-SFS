package ud5.mulleres;

import java.time.LocalDate;

abstract class MullerTraballadora {

    protected String nome;
    protected String apelidos;
    protected int anoNacemento;

    public MullerTraballadora(String nome, String apelidos, int anoNacemento) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.anoNacemento = anoNacemento;
    }

    public int getIdade(){

        LocalDate fechaActual = LocalDate.now();

        return fechaActual.getYear() - anoNacemento;
    }

    public abstract String descripcionContribucion();

}
