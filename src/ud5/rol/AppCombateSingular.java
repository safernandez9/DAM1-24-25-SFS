package ud5.rol;

import java.util.Random;

public class AppCombateSingular {
    public static void main(String[] args) {
        try {
            // Crear personajes
            Personaje personaje1 = new Personaje("Aragorn", "HUMANO", 90, 70, 85);
            Personaje personaje2 = new Personaje("Legolas", "ELFO", 80, 95, 70);

            // Mostrar fichas antes del combate
            System.out.println("Antes del combate:");
            personaje1.mostrar();
            personaje2.mostrar();

            // Decidir quién ataca primero (el de mayor agilidad)
            Personaje atacante, defensor;
            if (personaje1.getAgilidad() > personaje2.getAgilidad()) {
                atacante = personaje1;
                defensor = personaje2;
            } else if (personaje2.getAgilidad() > personaje1.getAgilidad()) {
                atacante = personaje2;
                defensor = personaje1;
            } else {
                Random rand = new Random();
                atacante = rand.nextBoolean() ? personaje1 : personaje2;
                defensor = (atacante == personaje1) ? personaje2 : personaje1;
            }

            // Simular el combate
            System.out.println("\nComienza el combate:");
            while (atacante.estaVivo() && defensor.estaVivo()) {
                // Atacante ataca al defensor
                System.out.println(atacante.getNombre() + " (" + atacante.getPuntosDeVida() + ") ataca a " + defensor.getNombre() + " (" + defensor.getPuntosDeVida() + ")");
                int daño = atacante.atacar(defensor);
                if (daño > 0) {
                    System.out.println(defensor.getNombre() + " recibe " + daño + " puntos de daño.");
                } else {
                    System.out.println(atacante.getNombre() + " falla el ataque.");
                }

                if (!defensor.estaVivo()) {
                    System.out.println(defensor.getNombre() + " ha muerto.");
                    break;
                }

                // Intercambiar roles (ahora el defensor ataca)
                Personaje temp = atacante;
                atacante = defensor;
                defensor = temp;
            }

            // Mostrar fichas después del combate
            System.out.println("\nDespués del combate:");
            personaje1.mostrar();
            personaje2.mostrar();

        } catch (PersonajeNoValido e) {
            System.out.println("Error al crear personaje: " + e.getMessage());
        }
    }
}
