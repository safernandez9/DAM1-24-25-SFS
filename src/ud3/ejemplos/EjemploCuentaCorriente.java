package ud3.ejemplos;

public class EjemploCuentaCorriente {

    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente("55555555Z", "Pepe", 1000);
        CuentaCorriente cc2 = new CuentaCorriente("33333333R", "María", 2000);

        CuentaCorriente.setBanco("Abanca");

        System.out.println(CuentaCorriente.getBanco());
        cc.mostrarInformacion();
        cc2.mostrarInformacion();

        Gestor gestor = new Gestor("Gestoría Pepe", "986868686");
        cc.setGestor(gestor);
        System.out.println(cc.getGestor().nombre + "(" + cc.getGestor().telefono + ")");      
    }
}