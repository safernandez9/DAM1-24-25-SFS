package ud5.inmobiliaria;

public class Piso extends Inmueble{

    int superficie;
    int planta;

    public Piso(String direccion, int numBaños, int numHabitaciones, int superficie, int planta) {

        super(direccion, numBaños, numHabitaciones);
        this.superficie = superficie;
        this.planta = planta;
    }

    
    
     
}
