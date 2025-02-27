package ud5.inmobiliaria;

abstract class Inmueble {

    String direccion;
    int numBaños;
    int numHabitaciones;
    double precioAlquiler;
    double precioVenta;

    public Inmueble(String direccion, int numBaños, int numHabitaciones) {
        this.direccion = direccion;
        this.numBaños = numBaños;
        this.numHabitaciones = numHabitaciones;
    }

    String detalle(){
            
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

}
