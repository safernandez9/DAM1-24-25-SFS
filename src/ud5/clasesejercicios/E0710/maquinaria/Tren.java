package ud5.clasesejercicios.E0710.maquinaria;

import ud5.clasesejercicios.E0710.personal.Maquinista;

public class Tren {
    static final byte MAX_VAGONES = 5;
    Locomotora locomotora;
    Vagon[] vagones;
    Maquinista maquinista;


    public Tren(Locomotora locomotora, Maquinista maquinista) {
        this(locomotora, maquinista, 0);
    }

    public Tren(Locomotora locomotora, Maquinista maquinista, int numVagones) {
        if (numVagones > MAX_VAGONES) {
            throw new ArrayIndexOutOfBoundsException("Demasiados vagones, el máximo es " + MAX_VAGONES);
        }

        this.locomotora = locomotora;
        this.maquinista = maquinista;
        vagones = new Vagon[numVagones];
        for (int i = 0; i < numVagones; i++) {
            vagones[i] = new Vagon(i);
        }
    }

}
