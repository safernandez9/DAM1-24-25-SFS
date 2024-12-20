package ud3.apuntes;

public class Bombilla {
    private boolean interruptor;

    private static boolean interruptorGeneral;

    public void encender() {
        interruptor = true;
    }

    public void apagar() {
        interruptor = false;
    }

    public static void encenderInterruptorGeneral() {
        interruptorGeneral = true;
    }

    public static void apagarInterruptorGeneral() {
        interruptorGeneral = false;
    }

    public boolean estado() {
        return interruptor && interruptorGeneral;
    }

    public static boolean estado(Bombilla b2) {
        return b2.interruptor && interruptorGeneral;
    }



}
