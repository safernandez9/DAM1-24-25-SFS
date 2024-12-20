package ud3.apuntes;

public class E0708 {
    public static void main(String[] args) {
        Sintonizador miRadio = new Sintonizador(80.5);
        miRadio.display();
        miRadio.downThin();
        miRadio.down();  
        miRadio.display();
        miRadio.fijarMemoria1();
        miRadio.up();
        miRadio.upThin();
        miRadio.display();
        miRadio.sintonizarMemoria1();
        miRadio.display();

        Sintonizador miRadioError = null;
        try {
            miRadioError = new Sintonizador(20);    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(miRadioError);
    }

}
