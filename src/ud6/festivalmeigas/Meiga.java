package ud6.festivalmeigas;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Meiga {
    
    private String nome;
    private String alcumeMaxico;
    private List<Feitizo> favoritos;

    public Meiga(String nome, String alcumeMaxico, List<Feitizo> favoritos) {
        this.nome = nome;
        this.alcumeMaxico = alcumeMaxico;
        this.favoritos = favoritos;
    }

    public Meiga(String nome2, String alcume, Collection<Feitizo> feitizos, Map<String inventario) {
            //TODO Auto-generated constructor stub
        }
    
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public String getAlcumeMaxico() {
            return alcumeMaxico;
        }
    
        public void setAlcumeMaxico(String alcumeMaxico) {
            this.alcumeMaxico = alcumeMaxico;
        }
    
        public List<Feitizo> getFavoritos() {
            return favoritos;
        }
    
        public void setFavoritos(List<Feitizo> favoritos) {
            this.favoritos = favoritos;
        }
    
        @Override
        public String toString(){
            return "Meiga: " + nome + "\n" + "Alcume: " +  alcumeMaxico + "\n" + "Feitizos Favoritos: " + favoritos + "\n\n";
        }
    
        public static Meiga[] crearMeigasExemplo(Feitizo[] feitizosDisponibles) {
            Random rnd = new Random();
        
            String[] nomes = {"Uxía", "Lúa", "Iria", "Noa"};
            String[] alcumes = {"A das Fraguiñas", "Sombra do Vento", "Luz do Bosque", "Meiga da Brétema"};
        
            Meiga[] meigas = new Meiga[nomes.length];
    
            // Obtén todos os feitozos de exemplo e todos os seus ingredientes únicos
            Collection<Feitizo> feitizosExemplo = List.of(Feitizo.crearFeitizosExemplo());
            Collection<String> ingredientesExemplo = Feitizo.ingredientesUnicos(feitizosExemplo);
    
            for (int i = 0; i < nomes.length; i++) {
                String nome = nomes[i];
                String alcume = alcumes[i];
                // Xera unha colección cunha selección aleatoria de feitizos de exemplo para asignar á meiga
                Collection<Feitizo> feitizos = getFeitizosRnd(feitizosExemplo);
                // Xera un mapa cunha selección aleatoria de ingredientes e cantidades de cada un de exemplo para asignar á meiga
                Map<String, Integer> inventario = getIngredientesRnd(ingredientesExemplo, 3);
        
                // Crea a meiga e a engade ao array
                meigas[i] = new Meiga(nome, alcume, feitizos, inventario);
        }

        return meigas;

    }
    
}
