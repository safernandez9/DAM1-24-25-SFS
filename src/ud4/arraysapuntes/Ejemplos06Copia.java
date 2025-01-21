package ud4.arraysapuntes;

import java.util.Arrays;

public class Ejemplos06Copia {
    public static void main(String[] args) {
        int[] t1 = {5, 7, 2, 9, 3, 4};

        int[] t2 = new int[7];

        /*
        for (int i = 0; i < t1.length; i++){
            t2[i] = t1[i];
        } */

        t1 = Arrays.copyOf(t1, t1.length + 1);
        t1[t1.length - 1] = 66;




        System.arraycopy(t1, 0, t2, 0, t1.length);

        int[] t3 = t1.clone();

        System.out.println("Fin");
    }
}
