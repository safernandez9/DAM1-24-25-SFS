//Saúl Fernández Salgado

package ud4.sfsexamen;

public class CodificandoMorse {

    public static void main(String[] args) {

        String frase1 = "?";
        String frase2 = "!";
        String frase3 = "SI";
        String frase4 = "YA NACIO";

        int retorno = numPuntosMorse(frase1);
        System.out.println(retorno);
        retorno = numPuntosMorse(frase2);
        System.out.println(retorno);
        retorno = numPuntosMorse(frase3);
        System.out.println(retorno);
        retorno = numPuntosMorse(frase4);
        System.out.println(retorno);

    }

    static int numPuntosMorse(String frase) {

        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!?";
        String[] letrasMorse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
                ".--", "-..-", "-.--", "--..",
                "-.-.--", "..--.." };

        int duracion = 0;
        String codigo;
        int indice;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == ' ') { // Si es un espacio entre palabras sumo 5
                duracion += 5;
            } else {
                indice = letras.indexOf(c);
                if (indice != -1) {
                    codigo = letrasMorse[indice];

                    for (int j = 0; j < codigo.length(); j++) {
                        if (codigo.charAt(j) == '.') {
                            duracion += 1;
                        } else if (codigo.charAt(j) == '-') {
                            duracion += 3;
                        }

                        if (j < codigo.length() - 1) {
                            duracion += 1;
                        }
                    }
                    if (i < frase.length() - 1) {
                        if (frase.charAt(i + 1) != ' ') {
                            duracion += 3;
                        } else {
                            duracion += 5;
                        }
                    }
                }
            }

        }

        return duracion;

    }
}
