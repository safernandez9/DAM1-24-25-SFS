package ud5.clasesejercicios.E0710_trenes.personal;

import java.time.LocalDate;

import ud5.clasesejercicios.E0710_trenes.maquinaria.Locomotora;

public class Mecanico {
    String nombre;
    String telefono;
    Especialidad especialidad;

    public Mecanico(String nombre, String telefono, Especialidad especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return nombre + " (telefono=" + telefono + ", especialidad=" + especialidad + ")";
    }

    public void revisar(Locomotora locomotora) {
        System.out.println("El/La mecánico/a " + nombre + " ha revisado " + especialidad
         + " de la locomotora " + locomotora.getMatricula() + " con fecha " + LocalDate.now());
    }
    

}
