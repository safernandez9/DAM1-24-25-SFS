package ud2.ejerciciosfunciones;

public class E0405_EsVocal {
    public static boolean esVocal(char letra) {        
        return switch (Character.toLowerCase(letra)) {
            case 'a', 'e', 'i', 'o', 'u' -> {yield true;}
            default -> {yield false;}
        };        

        /*switch (Character.toLowerCase(letra)) {
            case 'a', 'e', 'i', 'o', 'u': return true;
            default: return false;
        }*/
    }

    public static void main(String[] args) {
        System.out.println(esVocal('a'));
        System.out.println(esVocal('A'));
        System.out.println(esVocal('b'));

    }
}
