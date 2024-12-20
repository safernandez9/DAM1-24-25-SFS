package ud3.apuntes;

public class E0701 {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente("55555555Z", "Pepe");
        cc.mostrar();

        cc.ingresarDinero(200);
        cc.mostrar();

        System.out.println(cc.sacarDinero(100));
        cc.mostrar();

        cc.ingresarDinero(-200);
        cc.mostrar();

        System.out.println("FIN");

    }
}
