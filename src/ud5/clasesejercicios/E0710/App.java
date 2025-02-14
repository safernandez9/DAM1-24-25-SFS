package ud5.clasesejercicios.E0710;

import java.time.LocalDate;

import ud5.clasesejercicios.E0710.maquinaria.Locomotora;
import ud5.clasesejercicios.E0710.maquinaria.Tren;
import ud5.clasesejercicios.E0710.personal.*;


public class App {
    public static void main(String[] args) {
        Maquinista maquinista = new Maquinista("María", "555555555X", 40000, "A");
        System.out.println(maquinista);

        Mecanico mecanicoPepe = new Mecanico("Pepe", "666666666", Especialidad.FRENOS);
        Mecanico mecanico2 = new Mecanico("Juan", "666666666", Especialidad.valueOf("HIDRAULICA"));

        JefeEstacion jefe = new JefeEstacion("Lola", "33333333Z", LocalDate.of(2023, 10, 1));

        // Vagon solo es visible por clases vecinas
        Locomotora locomotora = new Locomotora("1111AAA", 5000, 2010, mecanicoPepe);

        Tren tren = new Tren(locomotora, maquinista);

        Tren tren2 = new Tren(locomotora, maquinista, 5);

        try {
            Tren tren3 = new Tren(locomotora, maquinista, 50);
        } catch (Exception e) {
            System.out.println("No se puede crear el tren. " + e.getMessage());
        }
        

    }
}
