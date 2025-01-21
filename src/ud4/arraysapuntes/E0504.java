package ud4.arraysapuntes;

import java.util.Arrays;

public class E0504 {
    static Integer maximo(int t[]) {
        if (t == null || t.length == 0)
            return null;

        Integer maximo = t[0];

        for(int i = 1; i < t.length; i++)
            if (t[i] > maximo)
                maximo = t[i];

        return maximo;
    }

    public static void main(String[] args) {
        int[] t = E0501.arrayAleatorio(0, -10, 10);        

        System.out.println(Arrays.toString(t));

        System.out.println("Máximo: " + maximo(t));

    }    
}
