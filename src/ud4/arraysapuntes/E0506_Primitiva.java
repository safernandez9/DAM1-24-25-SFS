package ud4.arraysapuntes;

import java.util.Arrays;

public class E0506_Primitiva {
    static int numAciertos(Integer[] apuesta, Integer[] ganadora) {
        int numAciertos = 0;

        for (int numApuesta : apuesta)
            if (Arrays.binarySearch(ganadora, numApuesta) >= 0)
                numAciertos++;

        return numAciertos;
    }

    public static void main(String[] args) {
        Integer[] apuesta = {12, 35, 18, 10, 15, 26};
        Integer[] ganadora = {2, 5, 8, 10, 15, 26};
        Arrays.sort(ganadora);

        System.out.println("Combinación Ganadora:\t" + Arrays.toString(ganadora));
        System.out.println("Tu apuesta:\t\t" + Arrays.toString(apuesta));

        System.out.println("Número de aciertos: " + numAciertos(apuesta,ganadora));
        
    }
}
