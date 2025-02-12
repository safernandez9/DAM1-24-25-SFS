package ud4.arraysejercicios;

/**
 * RecorridoRobot.java
 * El siguiente array codifica el mapa de un juego:
 * String[] mapa = {
 * " Z ",
 * " * ",
 * " * * ",
 * " ",
 * " A "
 * };
 * ● la “A” representa la casilla de salida
 * ● la “Z” representa la casilla de llegada
 * ● los asteriscos “*” representan minas que no se deben pisar.
 * 
 * El juego consiste en mostrar el mapa y a continuación solicitar al usuario que introduzca por
 * teclado una única cadena de caracteres con las instrucciones que debe seguir un robot para
 * llegar desde la casilla de salida hasta la de llegada sin pisar ninguna mina ni salirse del
 * tablero.
 * 
 * Al inicio del juego el robot está situado en la casilla de salida y orientado hacia arriba.
 * La cadena de instrucciones que se le da al robot puede tener estos 3 caracteres distintos:
 * ● una “A” hará que el robot avance una casilla en la dirección en la que está orientado.
 * ● una “R” hará que la orientación del robot gire a la derecha 90º sin moverse del sitio.
 * ● una “L” hará que la orientación del robot gire a la izquierda 90º sin moverse del sitio.
 * 
 * Implementa una función que reciba como parámetros de entrada un mapa en el formato
 * anterior y una cadena de caracteres con las instrucciones para el robot y que devuelva true
 * si tras ejecutar las instrucciones el robot termina en la casilla de llegada y false si el robot se 
 * pasa de largo, o si pisa alguna mina o si sale del tablero, o si las instrucciones contienen
 * caracteres no válidos, o en cualquier otro caso.
 * Utiliza el siguiente prototipo:
 * static boolean recorridoRobot(String[] mapa, String instrucciones)
 * Los siguientes son algunos ejemplos de cadenas de instrucciones y sus resultados para el
 * mapa proporcionado al inicio del ejercicio:
 * 1. “AALARAARAA” => True: el robot alcanza la casilla de llegada.
 * 2. “RAALAAAALA” => True: el robot alcanza la casilla de llegada.
 * 3. “ARALA” => False: el robot pisa una mina.
 * 4. “LAA” => False: el robot se sale del mapa.
 * El mapa que se pasa a la función podrá tener cualquier tamaño pero se supondrá que es
 * correcto, es decir, que tiene una única “A”, una única “Z” y cero, una o varias minas.
 */

public class RecorridoRobot {
    
}
