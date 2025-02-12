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

        for(int i = 0; i < frase.length(); i++){
            char c = frase.charAt(i);
            if(c == ' '){                   //Si es un espacio entre palabras sumo 5
                duracion += 5;
            }else{
                indice = letras.indexOf(c);
                if(indice != -1){
                    codigo = letrasMorse[indice];
                    duracion += codigo.replace("-", "111").replace(".", "1").length();
                    duracion += 3;
                }
            }
        }

        return duracion > 3 ? duracion - 3 : duracion;
    }

}
