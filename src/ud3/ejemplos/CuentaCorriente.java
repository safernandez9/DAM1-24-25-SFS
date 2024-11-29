package ud3.ejemplos;

/**
 * E0701. Diseñar la clase cuentacorriente, que almacena los datos: DNI y nombre
 * del
 * titular, asi como el saldo. Las operaciones típicas con una cuenta corriente
 * son:
 * ● Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial
 * será 0.
 * ● Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la
 * operación,
 * si existe saldo suficiente.
 * ● Ingresar dinero: se incrementa el saldo.
 * ● Mostrar información: muestra la información disponible de la cuenta
 * corrient
 */
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

    public void mostrarInformacion() {
        System.out.println("CUENTA CORRIENTE: ");
        System.out.println("- Titular: " + titular + " (DNI = " + dni + ")");
        System.out.println("- Saldo: " + saldo + " euros");
    }

    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente("55555555Z", "Pepe", 1000);
        CuentaCorriente cc2 = new CuentaCorriente("33333333R", "María", 2000);

        CuentaCorriente.setBanco("Abanca");

        System.out.println(CuentaCorriente.getBanco());
        cc.mostrarInformacion();
        cc2.mostrarInformacion();

        Gestor gestor = new Gestor("Gestoría Pepe", "986868686");
        cc.gestor = gestor;
        System.out.println(cc.gestor.nombre + "(" + cc.gestor.telefono + ")");

    }

}
