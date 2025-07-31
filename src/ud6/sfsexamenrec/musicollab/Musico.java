//Saúl Fernández Salgado
package ud6.sfsexamenrec.musicollab;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Musico implements Comparable<Musico> {

    private String nombre;
    private String alias;
    private List<String> instrumentosDominados;
    private List<Cancion> repertorio;

    public Musico(String nombre, String alias, List<String> instrumentosDominados, HashSet repertorio) {

        this.nombre = nombre;
        this.alias = alias;
        Set<String> instrumentosDominadosFinal = new TreeSet<>(instrumentosDominados);
        this.instrumentosDominados = new ArrayList<>(instrumentosDominadosFinal);
        this.repertorio = new ArrayList<>(repertorio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public List<String> getInstrumentosDominados() {
        return instrumentosDominados;
    }

    public void setInstrumentosDominados(List<String> instrumentosDominados) {
        this.instrumentosDominados = instrumentosDominados;
    }

    public List<Cancion> getRepertorio() {
        return repertorio;
    }

    public void setRepertorio(List<Cancion> repertorio) {
        this.repertorio = repertorio;
    }

    @Override
    public int compareTo(Musico m) {
        return (alias).compareTo(m.alias);
    }

    @Override
    public String toString() {
        return "[" + alias + "] (" + nombre + "): " + instrumentosDominados + " | Repertorio: " + repertorio.size()
                + " canciones";
    }
}
