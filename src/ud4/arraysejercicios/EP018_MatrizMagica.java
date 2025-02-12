package ud4.arraysejercicios;

/**
 * EP0518. Escribe un programa que solicite los elementos de una matriz de tamaño 4 x 4. La
 * aplicación debe decidir si la matriz introducida corresponde a una matriz mágica, que es aquella
 * donde la suma de los elementos de cualquier fila o de cualquier columna valen lo mismo.
 */

public class EP018_MatrizMagica{

    public static void main(String [] args){

        boolean magicaONo;



        magicaONo = esMagica(m);

    }

    public boolean esMagica(int[][] m){

if(m == null){
    return null;
}
        if(m.length == 0){
            return false;
        }
        for (int i = 0; i < m.length; i++){
            suma += m[i];
        }
    }
}