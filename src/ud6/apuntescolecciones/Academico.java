package ud6.apuntescolecciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * E1216. Los miembros de la Real Academia de la Lengua ocupan sillones con las
 * letras
 * del abecedario español, minúsculas y mayúsculas (en la práctica, las letras
 * v, w, x, y, z, N,
 * W, Y nunca se ocupan, pero nosotros no lo tendremos en cuenta). Cuando un
 * sillón
 * queda vacante, se nombra un nuevo académico para ocuparlo.
 * 
 * Implementar la clase Academico cuyos atributos son el nombre y el año de
 * ingreso. El
 * criterio de ordenación natural será por nombres.
 * 
 * Implementar un programa donde se cargan los datos de los académicos se crean
 * cinco
 * objetos Academico, que se insertan en un mapa en el que la clave es la letra
 * del sillón que ocupan,
 * y el valor un objeto de la clase Academico. Para ello implementar el método
 * estático:
 * 
 * static boolean nuevoAcademico (Map<Character, Academico> academia, Academico
 * nuevo, Character letra)
 * 
 * donde se lleva a cabo la inserción después de comprobar que el carácter
 * pasado como
 * parámetro es una letra del abecedario.
 * 
 * Hacer diversos listados de los académicos:
 * 
 * 1. primero sin letra, por orden de nombre y de año de ingreso;
 * 2. y después con letra, por orden de letra (clave), nombre y fecha de
 * ingreso.
 * Debemos recordar que en código Unicode, las mayúsculas van antes que las
 * minúsculas.
 * 
 * Utiliza el método del repositorio para cargar y preparar los datos del
 * fichero de texto:
 * public static String readFileToString(String filePath)
 * 
 * DATOS
 * Fichero en materias: DATOS - Académicos RAE (2025_04_11).txt
 */

public class Academico implements Comparable<Academico> {

    private String nombre;
    private int anhoIngreso;

    public Academico(String nombre, int anhoIngreso) {
        this.nombre = nombre;
        this.anhoIngreso = anhoIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getanhoIngreso() {
        return anhoIngreso;
    }

    @Override
    public int compareTo(Academico a) {
        return this.nombre.compareTo(a.nombre);
    }

    @Override
    public String toString() {
        return nombre + " (" + anhoIngreso + ")";
    }

    public static void main(String[] args) {

        Map<Character, Academico> academia = new TreeMap<>();

        String contenidoFichero = readFileToString("src/ud6/apuntescolecciones/academicos.txt");
        // System.out.println(contenidoFichero);
        String[] lineas = contenidoFichero.split("\n");
        // System.out.println(Arrays.toString(lineas));

        for (int i = 0; i < lineas.length; i++) {
            Character letra = lineas[i].charAt(6);
            String nombre = lineas[i].substring(7, lineas[i].length() - 6);
            int anhoIngreso = Integer.parseInt(lineas[i].substring(lineas[i].length() - 5, lineas[i].length() - 1));
            System.out.println(letra + " - " + nombre + " ( " + anhoIngreso + " ) ");
            nuevoAcademico(academia, new Academico(nombre, anhoIngreso), letra);
        }

        // Sin letra, por nombre

        List<Academico> listaAcademicos = new ArrayList<>(academia.values());
        Collections.sort(listaAcademicos);
        System.out.println("Listado por nombre:");
        for (Academico a : listaAcademicos) {
            System.out.println(a);
        }

        // Sin letra, por año de ingreso
        listaAcademicos.sort(new Comparator<>() {
            @Override
            public int compare(Academico a1, Academico a2) {
                int res = a1.anhoIngreso - a2.anhoIngreso;
                if (res == 0)
                    res = a1.nombre.compareTo(a2.nombre);
                return res;
            }
        });

        System.out.println("\nListado por año de ingreso:");
        for (Academico a : listaAcademicos) {
            System.out.println(a);
        }

        // Listado con letra (orden por clave)
        System.out.println("\nListado con letra:");
        for (Map.Entry entry : academia.entrySet()) {
            System.out.println("Letra " + entry.getKey() + ": " + entry.getValue());
        }
    }

    public static String readFileToString(String filePath) {
        StringBuilder fileContent = new StringBuilder();
        try {
            // Creamos un objeto FileReader que nos permitirá leer el fichero
            FileReader reader = new FileReader(filePath);

            // Creamos un buffer para leer el fichero de forma más eficiente
            BufferedReader buffer = new BufferedReader(reader);

            // Leemos el fichero línea a línea
            String line;
            while ((line = buffer.readLine()) != null) {
                // Vamos añadiendo cada línea al StringBuilder
                fileContent.append(line);
                // Añadimos un salto de línea al final de cada línea
                fileContent.append("\n");
            }

            // Cerramos el buffer y el fichero
            buffer.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("No existe el fichero.");
            // e.printStackTrace();
        }
                return filePath;
    }
    

    public static boolean nuevoAcademico(Map<Character, Academico> academia, Academico nuevoAcademico,
            Character letra) {
        if (Character.isLetter(letra)) {
            academia.put(letra, nuevoAcademico);
            return true;
        }
        return false;
    }

}
