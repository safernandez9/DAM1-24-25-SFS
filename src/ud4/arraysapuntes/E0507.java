package ud4.arraysapuntes;

import java.util.Arrays;

import ud4.ArraysUtil;

public class E0507 {
    static Integer[] sinRepetidos(Integer t[]) {
        if (t == null)
            return null;
            
        Integer[] sinRepetidos = new Integer[0];
        for (int i = 0; i < t.length; i++) {
            boolean repetido = false;
            int j = 0;
            while (j < sinRepetidos.length && !repetido){
                if (t[i] == sinRepetidos[j])
                    repetido = true;
                j++;                    
            }
            if (!repetido) {
                sinRepetidos = Arrays.copyOf(sinRepetidos, sinRepetidos.length + 1);
                sinRepetidos[sinRepetidos.length - 1] = t[i];
            }
        }

        return sinRepetidos;
    }

    public static void main(String[] args) {
        Integer[] t = ArraysUtil.arrayAleatorio(20, 1, 10);
        
        System.out.println(Arrays.toString(t));

        t = sinRepetidos(t);

        t = sinRepetidos(null);

        System.out.println(Arrays.toString(t));        
    }
}
