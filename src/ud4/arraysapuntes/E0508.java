package ud4.arraysapuntes;

import java.util.Arrays;

public class E0508 {
    public static void main(String[] args) {
        int[] t = {5, 2, 7, 9, 4, 1, 8, 5, 4, 2, 8};

        int[] pares = new int[0];
        int[] impares = new int[0];

        for (int e : t) {
            if (e % 2 == 0) {
                pares = Arrays.copyOf(pares, pares.length + 1);
                pares[pares.length - 1] = e;
            } else {
                impares = Arrays.copyOf(impares, impares.length + 1);
                impares[impares.length - 1] = e;
            }
        }

        Arrays.sort(pares);
        Arrays.sort(impares);

        System.out.println(Arrays.toString(t));
        System.out.println(Arrays.toString(pares));
        System.out.println(Arrays.toString(impares));
    }
}
