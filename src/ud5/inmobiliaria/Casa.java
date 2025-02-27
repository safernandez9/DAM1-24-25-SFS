package ud5.inmobiliaria;

public class Casa extends Inmueble {

    int mConstruidos;
    int mTerreno;
    

    public Casa(String direccion, int numBaños, int numHabitaciones, int mConstruidos, int mTerreno) {

        super(direccion, numBaños, numHabitaciones);
        this.mConstruidos = mConstruidos;
        this.mTerreno = mTerreno;
    }
}
