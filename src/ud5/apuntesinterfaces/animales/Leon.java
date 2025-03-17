package ud5.apuntesinterfaces.animales;

public class Leon implements Sonido {

    @Override
    public void voz() {
        System.out.println("Grrrrrr");
    }

    @Override
    public void vozDurmiendo() {
        System.out.println("Grrrrrrrrrrrrrrrrrrrrrrrrr");
    }
}
