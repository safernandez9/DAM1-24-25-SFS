package ud4.arraysapuntes;

/**
 * TresTablas. Crea tres tablas de cinco elementos: la primera de números enteros, la
 * segunda de double y la tercera de booleanos. Muestra las referencias en las que se
 * encuentra almacenada cada una de las tablas.
 */

public class TresTablas {
    public static void main(String[] args) {
        long[] enteros = {1, 2, 3, 4, 5};
        double[] reales = new double[5];
        boolean[] logicos = new boolean[5];
        Boolean[] logicosEnvolvente = new Boolean[5];

        System.out.println(enteros);
        System.out.println(reales);
        System.out.println(logicos);
        System.out.println(logicosEnvolvente);

        System.out.println("Fin Programa");
    }
}
