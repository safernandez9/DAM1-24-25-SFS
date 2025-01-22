package ud4.arraysejercicios;

/**
 * MatricesTriangulares.java
 * Una matriz cuadrada, es decir que tiene el mismo número de filas que de columnas, es
 * triangular cuando todos los valores que están por encima o por debajo de la diagonal principal
 * son cero. También son triangulares aquellas matrices que cumplen estas dos condiciones a la
 * vez.
 * Implementa la siguiente función que indique si una matriz es triangular:
 * public static Boolean esTriangular(int[][] t)
 */

public class MatricesTriangulares {
    
    public static Boolean esTriangular(int[][] t){

        boolean triangular = true;;

        if(t.length != t[0].length || t == null || t.length == 0){
            return false;
        }

        //Comprobación triangulo superior, si valida se mantiene la condición triangular a true

        for(int i = 0; i < t.length; i++){
            for(int j = 1; j < i; j++){
                if(t[i][j] != 0){
                    triangular = false;
                }
            }
        }

        //Si el de arriba la hace triangular, devolvemos ya el valor verdadero
        //Si  no comprobamos el triangulo inferior

        if(triangular == true){
            return triangular;
        }
        else{
            for(int i = t.length - 1; i < t.length; i++){
                for(int j = 0 ;j < t.length; j++){
                    if(t[i][j] != 0){
                        triangular = false;
                    }
                }
            }
        }
    }
}
