package ud4.stringsapuntes;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ClaseCharacter {
    public static void main(String[] args) {
        //System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner sc = new Scanner(System.in);
        System.out.println('\u20AC');
        System.out.println('€');
        System.out.println("€");

        System.out.print("Escribe un caracter y pulsa ENTER para analizarlo: ");
        String linea;
        do {
            linea = sc.nextLine();
        } while ("".equals(linea));
        char ch = linea.charAt(0);
        sc.close();


        System.out.println("Análisis del carácter: " + ch);
        System.out.println("- ¿Es un dígito? " + Character.isDigit(ch));
        System.out.println("- ¿Es una letra? " + Character.isLetter(ch));
        System.out.println("- ¿Es un dígito o una letra? " + Character.isLetterOrDigit(ch));
        System.out.println("- ¿Es minúscula? " + Character.isLowerCase(ch));    
        if (Character.isLowerCase(ch)) 
            System.out.println("- - En mayúsculas sería " + Character.toUpperCase(ch));
        System.out.println("- ¿Es mayúscula? " + Character.isUpperCase(ch));
        if (Character.isUpperCase(ch)) 
            System.out.println("- - En minúsculas sería " + Character.toLowerCase(ch));        
        System.out.println("- ¿Es un caracter de espacio \' \'? " + Character.isSpaceChar(ch));
        System.out.println("- ¿Es un espacio en blanco? (incluye tabuladores, etc.) " + Character.isWhitespace(ch));
        if (Character.getName(ch) != null)
            System.out.println("Este caracter tiene como nombre: " + Character.getName(ch));        
    }
}
