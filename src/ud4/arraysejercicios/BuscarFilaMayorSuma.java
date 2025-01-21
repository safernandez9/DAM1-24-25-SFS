package ud4.arraysejercicios;

public class BuscarFilaMayorSuma {

    public static int[] BuscarFilaMayor(int[][] m) {

        int valorFila = 0;
        int valorFilaMayor = 0;
        int filaMayor = 0;

        if (m == null) {
            return null;
        } else if (m.length == 0) {
            return new int[0];
        } else if (m.length == 1) {
            return m[0];
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                valorFila += m[i][j];
            }
            if (i == 0) {
                valorFilaMayor = valorFila;
                filaMayor = 0;
            } else if (valorFila > valorFilaMayor) {
                valorFilaMayor = valorFila;
                filaMayor = i;
            } else if (valorFila == filaMayor) {

            }
        }

        return m[filaMayor];
    }

}
