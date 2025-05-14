package contornos.ud4.maloscheiros;

// Duplicated Code

public class Factura {
    private double importe;

    public Factura(double importe) {
        this.importe = importe;
    }

    public double calcularTotalClienteRegular(double desconto) {
        double total = importe - (importe * desconto / 100);
        if (total < 0) {
            total = 0;
        }
        return total;
    }

    public double calcularTotalClienteVIP(double descontoExtra) {
        double total = importe - (importe * descontoExtra / 100);
        if (total < 0) {
            total = 0;
        }
        return total;
    }
}
