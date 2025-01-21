package ud4.arraysapuntes;

import ud3.sfsexamen.CocheCarreras;

public class Referencias {
    public static void main(String[] args) {
        CocheCarreras[] coches = new CocheCarreras[10];
        CocheCarreras[] coches2;

        coches[4] = new CocheCarreras("Rayo", 100, 180);

        coches2 = coches;

        coches2[4].mostrar();

        System.out.println("Fin de Programa");
    }
}
