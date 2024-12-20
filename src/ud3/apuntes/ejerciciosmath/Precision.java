package ud3.apuntes.ejerciciosmath;

import java.math.BigDecimal;

public class Precision {
    public static void main(String[] args) {
        double unCentimo = 0.01;

        double suma = unCentimo + unCentimo + unCentimo + unCentimo + unCentimo + unCentimo;

        System.out.println("Cálculo con errores de precisión con tipos primitivos: " + suma);

        // Creo e inicializo el objeto BigDecimal
        BigDecimal centimo = new BigDecimal("0.01");
        
        BigDecimal sumaPrecisa = centimo.add(centimo).add(centimo).add(centimo).add(centimo).add(centimo);

        System.out.println("Suma precisa con BigDecimal: " + sumaPrecisa);
    }
}
