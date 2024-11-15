package ud2.ejerciciosfunciones;

public class E0406_Primo {
    public static boolean esPrimo(int n) {
        boolean esPrimo = true;

        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                esPrimo = false;
            }
        }

        return esPrimo;
    }

    public static void main(String[] args) {
        System.out.println(esPrimo(60));


        for (int i = 1; i <= 20; i++) {
            System.out.println(i + (esPrimo(i) ? " " : " no ") + " primo.");
        }
    }
}
