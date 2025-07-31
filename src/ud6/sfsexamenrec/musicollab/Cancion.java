//Saúl Fernández Salgado
package ud6.sfsexamenrec.musicollab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Cancion implements Comparable<Cancion> {

        private String nombre;
        private String autor;
        private String estiloMusical;
        private List<String> instrumentosRequeridos;

        public Cancion(String nombre, String autor, String estiloMusical, List<String> instrumentosRequeridos) {
                this.nombre = nombre;
                this.autor = autor;
                this.estiloMusical = estiloMusical;
                Set<String> instrumentosRequeridosFinal = new TreeSet<>(instrumentosRequeridos);
                this.instrumentosRequeridos = new ArrayList<>(instrumentosRequeridosFinal);
        }

        // Getters y Setters

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public String getAutor() {
                return autor;
        }

        public void setAutor(String autor) {
                this.autor = autor;
        }

        public String getEstiloMusical() {
                return estiloMusical;
        }

        public void setEstiloMusical(String estiloMusical) {
                this.estiloMusical = estiloMusical;
        }

        public List<String> getInstrumentosRequeridos() {
                return instrumentosRequeridos;
        }

        public void setInstrumentosRequeridos(List<String> instrumentosRequeridos) {
                this.instrumentosRequeridos = instrumentosRequeridos;
        }

        public static void main(String[] args) {
                // Canciones de ejemplo
                List<Cancion> canciones = Arrays.asList(
                                new Cancion("Bohemian Rhapsody", "Queen", "Rock",
                                                List.of("voz", "piano", "guitarra", "batería")),
                                new Cancion("Billie Jean", "Michael Jackson", "Pop",
                                                List.of("voz", "bajo", "batería")),
                                new Cancion("Imagine", "John Lennon", "Balada",
                                                List.of("voz", "piano")),
                                new Cancion("Smells Like Teen Spirit", "Nirvana", "Grunge",
                                                List.of("voz", "guitarra", "bajo", "batería")),
                                new Cancion("Yesterday", "The Beatles", "Pop",
                                                List.of("voz", "guitarra")),
                                new Cancion("Sweet Child O'Mine", "Guns N' Roses", "Rock",
                                                List.of("voz", "guitarra", "bajo", "batería")),
                                new Cancion("Rolling in the Deep", "Adele", "Pop",
                                                List.of("voz", "piano", "batería")),
                                new Cancion("Hotel California", "Eagles", "Rock",
                                                List.of("voz", "guitarra", "bajo", "batería")));

                // Ordenar canciones por nombre
                Collections.sort(canciones);
                System.out.println("\nCanciones ordenadas por nombre:");
                System.out.println("===============================\n");
                canciones.forEach(System.out::println);

                // Ordenar canciones alfabéticamente por estilo musical, luego por autor y luego
                // por nombre
                System.out.println("\nCanciones ordenadas por estilo musical, luego por autor y luego por nombre:");
                System.out.println("===========================================================================\n");

                // TODO Tu código aquí
                Comparator<Cancion> compEstilo = (c1, c2) -> c1.getEstiloMusical().compareTo(c2.getEstiloMusical());
                Comparator<Cancion> compAutor = (c1, c2) -> c1.getAutor().compareTo(c2.getAutor());
                Comparator<Cancion> compNombre = (c1, c2) -> c1.getNombre().compareTo(c2.getNombre());
                canciones.sort(compEstilo.thenComparing(compAutor.thenComparing(compNombre)));
                canciones.forEach(System.out::println);

                // Obtener lista de instrumentos distintos
                System.out.println("\nLista de instrumentos distintos:");
                System.out.println("================================\n");
                System.out.println(instrumentosDistintos(canciones));

                System.out.println("\n");
        }

        private static List<String> instrumentosDistintos(List<Cancion> canciones) {

                Set<String> instrumentosDistintos = new TreeSet<>();
                for (Cancion c : canciones) {
                        instrumentosDistintos.addAll(c.getInstrumentosRequeridos());
                }
                return new ArrayList<>(instrumentosDistintos);

        }

        @Override
        public int compareTo(Cancion c) {
                return (nombre).compareTo(c.nombre);
        }

        @Override
        public String toString() {
                return ("\"" + nombre + "\" " + "(" + autor + ") - " + estiloMusical + " | Instrumentos: "
                                + instrumentosRequeridos);

        }
}
