package contornos.ud4.maloscheiros;

class Concerto {
    private String nome;
    private double prezoBase;

    public Concerto(String nome, double prezoBase) {
        this.nome = nome;
        this.prezoBase = prezoBase;
    }

    public double calcularPrezoFinal(double desconto) {
        double prezoFinal = prezoBase - (prezoBase * desconto / 100);
        if (prezoFinal < 0) {
            prezoFinal = 0;
        }
        return prezoFinal;
    }
}

class Conferencia {
    private String nome;
    private double prezoBase;

    public Conferencia(String nome, double prezoBase) {
        this.nome = nome;
        this.prezoBase = prezoBase;
    }

    public double calcularPrezoFinal(double desconto) {
        double prezoFinal = prezoBase - (prezoBase * desconto / 100);
        if (prezoFinal < 0) {
            prezoFinal = 0;
        }
        return prezoFinal;
    }
}

