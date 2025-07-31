//Saúl Fernández Salgado

package ud7.sfsexamen.web;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GeneraWeb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String titulo, descripcion, textoEnlace, url, nombreHTML;
        String rutaSalida = "src\\ud7\\sfsexamen\\web\\";

        System.out.println("Inserte titulo: ");
        titulo = sc.nextLine();

        System.out.println("Inserte descripcion: ");
        descripcion = sc.nextLine();

        System.out.println("Inserte texto del enlace: ");
        textoEnlace = sc.nextLine();

        System.out.println("Inserte url del enlace: ");
        url = sc.nextLine();

        System.out.println("Inserte nombre del documento html (incluyendo la extension .html): ");
        nombreHTML = sc.nextLine();

        if(!nombreHTML.endsWith(".html")){
            nombreHTML += ".html"; 
        }

        rutaSalida += nombreHTML;

        System.out.println(rutaSalida);
        String transformacionHTML = transformaHTML(titulo, descripcion, textoEnlace, url, nombreHTML);

        try (PrintWriter writer = new PrintWriter(new FileWriter(rutaSalida))){

            writer.println(transformacionHTML);

        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        }

        sc.close();
    }

    private static String transformaHTML(String titulo, String descripcion, String textoEnlace, String url,
            String nombreHTML) {
        return "<html>\n" +
                "<head>\n" +
                "<title>" + titulo + "</title>\n" +
                "<meta charset=\"utf-8\">\n" +
                "</head>\n\n" +
                "<body>\n" +
                "<h1>" + titulo + "</h1>\n\n" +
                "<p>" + descripcion + ". <br>\n" +
                "<a href=\"" + url + "\">" + textoEnlace + "</a>\n" +
                "</p>" +
                "\n\n</body>" +
                "\n</html>";

    }
}
