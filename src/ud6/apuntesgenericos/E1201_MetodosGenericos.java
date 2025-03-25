package ud6.apuntesgenericos;

import java.util.Arrays;

import ud5.apuntesherencia.Persona;

public class E1201_MetodosGenericos {
    static <U> int numeroDeNulos(U[] tabla) {
        int cont = 0;
        for (U e : tabla)
            if (e == null)
                cont++;
        return cont;
    }

    public static <U> U[] add(U e, U[] t) {
        t = Arrays.copyOf(t, t.length + 1);
        t[t.length - 1] = e;
        return t;
    }

    public static <U> boolean buscar(U e, U[] t) {
        for (int i = 0; i < t.length; i++) {
            if ((e == null && t[i] == null) ||
                    (t[i] != null && t[i].equals(e))) {
                return true;
            }
        }
        return false;
    }

    public static <U> U[] concatenar(U[] t1, U[] t2) {
        U[] t3 = Arrays.copyOf(t1, t1.length + t2.length);
        for (int i = 0; i < t2.length; i++) {
            t3[t1.length + i] = t2[i];
        }
        return t3;
    }

    public static <U, V> Object[] concatenar2(U[] t1, V[] t2) {
        // Instancia un array de Object del tamaño adecuado
        Object[] t3 = new Object[t1.length + t2.length];
        // Copia los elementos de t1
        for (int i = 0; i < t1.length; i++) {
            t3[i] = t1[i];
        }
        // Copia los elementos de t2
        for (int i = 0; i < t2.length; i++) {
            t3[t1.length + i] = t2[i];
        }
        return t3;        
    }


    public static void main(String[] args) {
        Integer[] numeros = { 3, 5, 8, null, 2, null };
        Persona[] personas = { new Persona("Pepe"), null, new Persona("María") };

        System.out.println(numeroDeNulos(numeros));
        System.out.println(numeroDeNulos(personas));

        numeros = add(7, numeros);
        System.out.println(Arrays.toString(numeros));
        personas = add(new Persona("Juancho"), personas);
        System.out.println(Arrays.toString(personas));

        System.out.println("Hay un 8 en números? " + buscar(8, numeros));
        System.out.println("Hay un 6 en números? " + buscar(6, numeros));
        System.out.println("Hay un null en números? " + buscar(null, numeros));

        // System.out.println("Está Pepe? " + buscar(new Persona("Pepe"), personas));
        // El resultado dependerá de la implementación del método equals() de la clase
        // Persona

        Integer[] numeros2 = { 23, 45, 78, 23 };
        Integer[] masNumeros = concatenar(numeros, numeros2);
        System.out.println(Arrays.toString(masNumeros));

        //Integer[] concatena1 = concatenar(numeros, personas); // Error de Compilación porque numeros y personas no son del mismo tipo
        //Integer[] concatena12 = concatenar2(numeros, personas); // Error de Compilación porque numeros y personas no son del mismo tipo
        Object[] concatena2 = concatenar(numeros, personas); // Error de ejecución. (ArrayStoreException) Java deduce que el tipo U es Object? 
        Object[] concatena3 = concatenar2(numeros, personas);

        System.out.println("FIN");
    }
}