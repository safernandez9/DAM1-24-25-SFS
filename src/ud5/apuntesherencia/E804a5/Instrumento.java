package ud5.apuntesherencia.E804a5;

import java.util.Arrays;

public abstract class Instrumento {
    enum Nota {DO, RE, MI, FA, SOL, LA, SI}
    Nota[] melodia;

    public Instrumento() {
        this.melodia = new Nota[0];
    }

    public void add(Nota nota) {
        melodia = Arrays.copyOf(melodia, melodia.length + 1);
        melodia[melodia.length - 1] = nota;
    }

    public void copiarMelodia(Instrumento instrumento) {
        melodia = Arrays.copyOf(instrumento.melodia, instrumento.melodia.length);
    }

    public abstract void interpretar();


    public static void main(String[] args) {
        Piano piano = new Piano();
        piano.add(Nota.DO);
        piano.add(Nota.FA);
        piano.add(Nota.SOL);
        piano.interpretar();

        Guitarra guitarra = new Guitarra();
        guitarra.add(Nota.DO);
        guitarra.add(Nota.RE);
        guitarra.add(Nota.MI);
        guitarra.interpretar();

        Trompeta trompeta = new Trompeta();
        trompeta.copiarMelodia(piano);
        trompeta.interpretar();

        System.out.println("ORQUESTA!! ");
        Instrumento[] orquesta = {piano, guitarra, trompeta};
        for (Instrumento instrumento : orquesta) {
            instrumento.interpretar();
        }


    }



}
