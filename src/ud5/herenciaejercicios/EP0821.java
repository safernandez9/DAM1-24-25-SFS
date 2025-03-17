package ud5.herenciaejercicios;

public class EP0821 {
    static boolean esNumero(Object ob) {
        return ob instanceof Number;
    }

    static boolean sumar(Object a, Object b) {
        if (esNumero(a) && esNumero(b)) {
            // Obtiene los valores numéricos y los suma
            Double r = ((Number) a).doubleValue() + ((Number) b).doubleValue();

            // Si el resultado es un número entero, lo muestra como entero
            if (r - r.longValue() == 0) {
                System.out.println("La suma es: " + r.longValue());
            } else {
                System.out.println("La suma es: " + r);
            }
            return true;
        } else if (a instanceof CharSequence && b instanceof CharSequence) {
            System.out.println("La concatenación es: " + a + b);
            return true;
        } else {
            System.out.println("No sumables");
            return false;
        }
    }

    public static void main(String[] args) {
        sumar(5, 6);
        sumar(5.5, 6.6);
        sumar("Hola", " Mundo");
        sumar(new StringBuilder("Hola"), new StringBuilder("Mundo"));
        sumar(5, "Hola");
    }


}
