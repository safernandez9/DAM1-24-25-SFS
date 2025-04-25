package ud6.festivalmeigas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Feitizo {
    private String nome;
    private List<String> ingredientes;
    private int nivelDificultade;

    public Feitizo(String nome, String[] ingredientes, int nivelDificultade) {
        this.nome = nome;
        this.ingredientes = Arrays.asList(ingredientes);
        this.nivelDificultade = nivelDificultade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getNivelDificultade() {
        return nivelDificultade;
    }

    public void setNivelDificultade(int nivelDificultade) {
        this.nivelDificultade = nivelDificultade;
    }

    public static void main(String[] args) {

        Feitizo[] feitizos = crearFeitizosExemplo();
        System.out.println(ingredientesUnicos(List.of(feitizos)));
    }

    public static Feitizo[] crearFeitizosExemplo() {
        String[] ingredientes1 = { "auga de río encantada", "pétalos de rosa silvestre", "fume de lareira" };
        String[] ingredientes2 = { "auga do mar", "salicornia", "berberechos místicos" };
        String[] ingredientes3 = { "raíz de toxo", "auga bendita", "po de estrela fugaz" };
        String[] ingredientes4 = { "auga de río encantada", "raíz de toxo", "pel de serpe" };
        String[] ingredientes5 = { "auga do mar", "po de estrela fugaz", "cinza de bidueiro" };
        String[] ingredientes6 = { "auga bendita", "pétalos de rosa silvestre", "brétema das fragas" };

        Feitizo f1 = new Feitizo("Encantamento da Chuvia Mansa", ingredientes1, 3);
        Feitizo f2 = new Feitizo("Invocación Mariña", ingredientes2, 4);
        Feitizo f3 = new Feitizo("Luz do Luar", ingredientes3, 2);
        Feitizo f4 = new Feitizo("Garda da Fraga", ingredientes4, 3);
        Feitizo f5 = new Feitizo("Respiro Oceánico", ingredientes5, 4);
        Feitizo f6 = new Feitizo("Bendición Floral", ingredientes6, 2);

        return new Feitizo[] { f1, f2, f3, f4, f5, f6 };
    }

    public static Collection<String> ingredientesUnicos(Collection<Feitizo> feitizos) {
        Set<String> ingredientesUnicos = new TreeSet<>();
        for (Feitizo f : feitizos) {
            ingredientesUnicos.addAll((f.getIngredientes()));
        }

        return ingredientesUnicos;

    }

    public static List<Feitizo> feitizosPosibles(Set<String> ingredientes, Collection<Feitizo> feitizos) {
        List<Feitizo> feitizosPosibles = new ArrayList<>();

        for (Feitizo feitizo : feitizos) {
            if (ingredientes.containsAll(feitizo.ingredientes))
                feitizosPosibles.add(feitizo);
        }

        return feitizosPosibles;
    }

    public static Map<String, Integer> ingredientesVecesUsados(Collection<Feitizo> feitizos) {
        Map<String, Integer> contador = new HashMap();
        for (Feitizo f : feitizos) {
            for (String ingrediente : f.getIngredientes()) {
                contador.put(ingrediente, contador.getOrDefault(ingrediente, 0) + 1);
            }
        }
        return contador;
    }

    public boolean addIngrediente(String ingrediente) {
        return true;
    }

    public boolean removeIngrediente(String ingrediente) {
        return true;
    }

    public boolean cambiarIngrediente(String ingredienteViejo, String ingredienteNuevo) {
        return true;
    }

    public static List<Feitizo> feitizosUsanIngrediente(String ingrediente) {
        return null;
    }

}
