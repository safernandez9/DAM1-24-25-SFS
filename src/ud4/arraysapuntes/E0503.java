package ud4.arraysapuntes;

import java.util.Arrays;

public class E0503 {
    public static void main(String[] args) {
        int[] t = E0501.arrayAleatorio(5, -10, 10);        

        System.out.println(Arrays.toString(t));

        for(int i = t.length - 1; i >= 0; i--)
            System.out.print(t[i] + " ");
        System.out.println();
    }


}
