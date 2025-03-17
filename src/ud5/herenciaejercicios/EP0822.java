package ud5.herenciaejercicios;

import java.util.Scanner;

public class EP0822 {
    // Contador de objetos de la clase EP0822 destruidos
    static int objetosDestruidos = 0;
    
    @Override
    /**
     * Método que se ejecuta cuando el recolector de basura destruye un objeto
     * Esta versión imprime un mensaje por consolaindicando el número de objeto destruido.
     */
    protected void finalize() throws Throwable {
        objetosDestruidos++;
        System.out.println("Objeto nº " + objetosDestruidos + " destruido");
        // Invoca el método finalize de la clase Object
        super.finalize();
    }

    public static void main(String[] args) {
        // Instancia hasta un millón de objetos y los deja sin referencias
        // Observa como se invoca automáticamente el método finalize de cada objeto destruido
        // y como el recolector de basura destruye los objetos sin referencias
        for (int i = 0; i < 100000; i++) {
            EP0822 obj = new EP0822();
        }
        
        // System.gc(); // Invoca explícitamente al recolector de basura, necesario para menos de un millón de objetos

        // Espera a pulsar [ENTER] para finalizar
        System.out.println("Pulsa [ENTER] para finalizar");
        new Scanner(System.in).nextLine();
    }
    
}
