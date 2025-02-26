package contornos.ud3;


public class Calculadora {
    private int num1;
    private int num2;

    public Calculadora(int a, int b) {
        num1 = a;
        num2 = b;
    }

    public int suma() {
        int total = num1 + num2;
        return total;
    }

    public int resta() {
        int total = num1 - num2;
        return total;
    }

    public int multiplica() {
        int total = num1 * num2;
        return total;
    }

    public int divide() {
        int total = num1 / num2;
        return total;
    }
}
