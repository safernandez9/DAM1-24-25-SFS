package ud5.apuntesinterfaces;

import java.util.Arrays;
import java.util.Comparator;

public class E0910 {
    public static void main(String[] args) {
        Integer[] numeros = new Integer[20];

        for (int i = 0; i < numeros.length; i++)
            numeros[i] = (int) (Math.random()*100 + 1);

        Arrays.sort(numeros, Comparator.reverseOrder());

        System.out.println(Arrays.toString(numeros));
    }
}
