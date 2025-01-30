package ud4.arraysejercicios;

public class Matriculas {

    final static String LETRAS = "ABCDEFGHIJKLMNOPRSTUVWXYZ";

    public static boolean esMatriculaValida(String matricula) {

        char letra;

        if (matricula.length() < 7) {
            return false;
        }

        for (int i = 0; i < 4; i++) {
            if (!Character.isDigit(matricula.charAt(i))) {
                return false;
            }
        }

        for (int i = 0; i < 7; i++) {
            letra = matricula.charAt(i);
            if (!LETRAS.contains(Character.toString(letra))) {
                return false;
            }
        }

        return true;

    }

    public static String siguienteMatricula(String matricula) {

    }

    public static int compararMatriculas(String m1, String m2) {

        int num1, num2, indice1, indice2;
        char[] letras1;
        char[] letras2;

        num1 = Integer.parseInt(m1.substring(0, 4));
        num2 = Integer.parseInt(m2.substring(0, 4));

        if (num1 != num2) {
            return Integer.compare(num1, num2);
        }

        letras1 = m1.substring(4).toCharArray();
        letras2 = m2.substring(4).toCharArray();

        for (int i = 0; i < 3; i++) {
            indice1 = LETRAS.indexOf(letras1[i]);
            indice2 = LETRAS.indexOf(letras2[i]);

            if (indice1 != indice2) {
                return Integer.compare(indice1, indice2);
            }
        }

        return 0;

    }

}
