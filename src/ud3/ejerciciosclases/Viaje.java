package ud3.ejerciciosclases;

import java.time.LocalDateTime;

public class Viaje {
    private User conductor;           // Conductor del viaje
    private LocalDateTime fechaHora;  // Fecha y hora del viaje
    private PuntoGeografico origen;   // Punto de origen
    private PuntoGeografico destino;  // Punto de destino
    private int plazasOfrecidas;      // Número de plazas ofrecidas

    // Constructor con todos los atributos
    public Viaje(User conductor, LocalDateTime fechaHora, PuntoGeografico origen, PuntoGeografico destino, int plazasOfrecidas) {
        this.conductor = conductor;
        this.fechaHora = fechaHora;
        this.origen = origen;
        this.destino = destino;
        this.plazasOfrecidas = plazasOfrecidas;
    }

    // Getters y setters
    public User getConductor() {
        return conductor;
    }

    public void setConductor(User conductor) {
        this.conductor = conductor;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public PuntoGeografico getOrigen() {
        return origen;
    }

    public void setOrigen(PuntoGeografico origen) {
        this.origen = origen;
    }

    public PuntoGeografico getDestino() {
        return destino;
    }

    public void setDestino(PuntoGeografico destino) {
        this.destino = destino;
    }

    public int getPlazasOfrecidas() {
        return plazasOfrecidas;
    }

    public void setPlazasOfrecidas(int plazasOfrecidas) {
        this.plazasOfrecidas = plazasOfrecidas;
    }

    // Método para mostrar información detallada del viaje
    public void mostrar() {
        System.out.println("Conductor: " + conductor.getUsername());
        System.out.println("Fecha y hora del viaje: " + fechaHora);
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Plazas ofrecidas: " + plazasOfrecidas);
    }

    // Sobreescritura del método toString()
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d %02d:%02d - %s - %s >> %s",
                fechaHora.getDayOfMonth(), fechaHora.getMonthValue(), fechaHora.getYear(),
                fechaHora.getHour(), fechaHora.getMinute(),
                conductor.getUsername(), origen, destino);
    }
}
