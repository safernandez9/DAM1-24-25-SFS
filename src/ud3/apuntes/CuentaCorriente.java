package ud3.apuntes;

public class CuentaCorriente {
    String dni;
    public String titular;
    private double saldo;
    private Gestor gestor;
    private static String banco;

    public CuentaCorriente(String dni, String titular, double saldo) {
        this.dni = dni;
        this.titular = titular;
        this.saldo = saldo < 0 ? 0 : saldo;
    }

    public CuentaCorriente(String dni, String titular) {
        this(dni, titular, 0);
    }

    public CuentaCorriente(String dni, double saldo) {
        this(dni, null, saldo);
    }

    public static String getBanco() {
        return banco;
    }

    public static void setBanco(String banco) {
        CuentaCorriente.banco = banco;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    public boolean sacarDinero(double importe) {
        if (saldo >= importe) {
            saldo -= importe;
            return true;
        } else {
            return false;
        }
    }

    public void ingresarDinero(double importe) {
        saldo += importe;
    }

    public void mostrar() {
        System.out.println("CUENTA CORRIENTE: ");
        System.out.println("- Titular: " + titular + " (DNI = " + dni + ")");
        System.out.println("- Saldo: " + saldo + " euros");
        if (gestor != null) {
            System.out.print("- ");
            gestor.mostrar();
        }
    }

    public static void main(String[] args) {
        /*
         * CuentaCorriente cc = new CuentaCorriente("55555555Z", "Pepe", 1000);
         * CuentaCorriente cc2 = new CuentaCorriente("33333333R", "María", 2000);
         * 
         * CuentaCorriente.setBanco("Abanca");
         * 
         * System.out.println(CuentaCorriente.getBanco());
         * 
         * Gestor gestor = new Gestor("Gestoría Pepe", "986868686");
         * cc.gestor = gestor;
         * 
         * cc.mostrar();
         * cc2.mostrar();
         */

        CuentaCorriente c1 = new CuentaCorriente("99999999Z", "Pepe", 100);
        CuentaCorriente c2 = new CuentaCorriente("77777777X", "Marta", 50);

        c1.mostrar();
        c2.mostrar();

        // Método estático para transferencia entre 2 cuentas
        if (CuentaCorriente.transferencia(c1, c2, 75))
            System.out.println("Transferencia realizada!");
        else
            System.out.println("No hay suficiente saldo en la cuenta de origen");

        if (c1.transferir(c2, 75))
            System.out.println("Transferencia realizada!");
        else
            System.out.println("No hay suficiente saldo en la cuenta de origen");

        c1.mostrar();
        c2.mostrar();

    }

    public boolean transferir(CuentaCorriente c2, double importe) {
        boolean transferencia = false;
        if (c2 != null && this.saldo >= importe) {
            this.saldo -= importe;
            c2.saldo += importe;
            transferencia = true;
        }
        return transferencia;
    }

    public static boolean transferencia(CuentaCorriente c1, CuentaCorriente c2, double importe) {
        boolean transferencia = false;
        if (c1 != null && c2 != null && c1.saldo >= importe) {
            c1.saldo -= importe;
            c2.saldo += importe;
            transferencia = true;
        }
        return transferencia;
    }

}
