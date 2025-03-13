package ud5.herenciaejercicios.EP0812a3;

public class Caja {
    final int ancho, alto, fondo;
    String etiqueta;

    enum Unidad {CM, M};

    Caja(int ancho, int alto, int fondo, Unidad unidad) {
        int multiplicador = switch (unidad) {
            case CM -> 1;
            case M -> 100;
        };

        if (ancho <= 0 || alto <= 0 || fondo <= 0)
            throw new IllegalArgumentException("Ancho, alto o fondo incorrecto");

        this.ancho = ancho * multiplicador;
        this.alto = alto * multiplicador;
        this.fondo = fondo * multiplicador;
    }

    // Volumen
    double getVolumen() {
        return ancho * alto * fondo / 1000000.0;
    }

    public void setEtiqueta(String etiqueta) {
        if (etiqueta != null && etiqueta.length() <= 30)
            this.etiqueta = etiqueta;
    }

    @Override
    public String toString() {
        String str = "Caja de " + ancho + "x" + alto + "x" + fondo
                + " cm";
        if (etiqueta != null) 
            str += " (" + etiqueta + ")";
        return str;
    }

    public static void main(String[] args) {
        Caja caja1 = new Caja(2, 2, 2, Unidad.M);
        caja1.setEtiqueta("Para: IES Chan do Monte");
        System.out.println(caja1);
        System.out.printf("Volumen: %.2f m2 %n", caja1.getVolumen());
        System.out.println();

        CajaCarton cajaCarton = new CajaCarton(50, 80, 100);
        cajaCarton.setEtiqueta("Caja de Cartón");
        System.out.println(cajaCarton);
        System.out.printf("Volumen: %.2f m2 %n", cajaCarton.getVolumen());
        System.out.printf("Superficie: %.2f cm2 %n", cajaCarton.getSuperficie());
    }

}
