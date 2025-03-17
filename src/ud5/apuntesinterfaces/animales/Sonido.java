package ud5.apuntesinterfaces.animales;

public interface Sonido {
    int version = 1;
    void voz();

    default void vozDurmiendo() {
        for(int i = 0; i < 3; i++)
            dormir();
    }

    static void bostezo() {
        System.out.println("Aauuuuuuu!!");
    }

    private void dormir() {
        System.out.println("ZZZZZZzzzzzz");

    }

}
