//Saúl Fernández Salgado

package ud2.sfsexamen;

public class ChiclesRegalo {

    public static int totalChicles(int nChiclesComprados, int nEnvoltoriosOferta, int nChiclesGratis) {

        int chiclesExtra = 0;
        int chiclesTotales;
        int premios;

        // Caso número negativo
        if (nChiclesComprados < 0 || nEnvoltoriosOferta < 0 || nChiclesGratis < 0) {
            return -1;
        }

        // Caso "No hay oferta"
        if (nEnvoltoriosOferta == 0) {
            return nChiclesComprados;
        }

        // Caso "Se dan mas chicles gratis que envoltorios se entregan"
        if (nChiclesGratis > nEnvoltoriosOferta) {
            return -1;
        }

        // Cargo ya en el total los chicles comprados
        chiclesTotales = nChiclesComprados;

        // Numero de chicles extra que conseguimos con los chicles comprados
        do {
            premios = nChiclesComprados / nEnvoltoriosOferta;
            chiclesExtra = premios * nChiclesGratis;

            // Sumamos los chicles extra a los totales
            chiclesTotales += chiclesExtra;

            // Y si tenemos sudicientes para otro premio volvemos a ejecutar el bucle
            // usando como nChiclesComprados los extra

            nChiclesComprados = chiclesExtra;
            chiclesExtra = 0;
        } while (nChiclesComprados / nEnvoltoriosOferta != 0);

        return chiclesTotales;
    }
}
