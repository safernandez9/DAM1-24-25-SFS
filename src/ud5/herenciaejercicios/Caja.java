package ud5.herenciaejercicios;

public class Caja {
    int ancho, alto, fondo;
    String etiqueta;

    enum Unidad {cm, m};

    Caja(int ancho, int alto, int fondo, Unidad unidad) {
        int multiplicador = switch (unidad) {
            case cm -> 1;
            case m -> 100;
            default -> 0;
        };

        if (multiplicador == 0)
            throw new IllegalArgumentException("La unidad de medida es incorrecta");
        else if (ancho <= 0 || alto <= 0 || fondo <= 0)
            throw new IllegalArgumentException("Ancho, alto o fondo incorrecto");

        this.ancho = ancho * multiplicador;
        this.alto = alto * multiplicador;
        this.fondo = fondo * multiplicador;
    }

    // Volumen
    double getVolumen() {
        return ancho * alto * fondo / 1000000;
    }

    public void setEtiqueta(String etiqueta) {
        if (etiqueta != null && etiqueta.length() <= 30)
            this.etiqueta = etiqueta;
    }

    @Override
    public String toString() {
        return "Caja de " + ancho + "x" + alto + "x" + fondo
                + " (" + etiqueta + ")";
    }

    public static void main(String[] args) {
        Caja caja1 = new Caja(100, 100, 100, Unidad.cm);
        caja1.setEtiqueta("Para: IES Chan do Monte");
        System.out.println(caja1);
        System.out.println("Volumen: " + caja1.getVolumen());
    }

}
