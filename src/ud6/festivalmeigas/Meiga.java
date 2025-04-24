package ud6.festivalmeigas;

import java.util.List;

public class Meiga {
    
    private String nome;
    private String alcumeMaxico;
    private List<Feitizo> favoritos;

    public Meiga(String nome, String alcumeMaxico, List<Feitizo> favoritos) {
        this.nome = nome;
        this.alcumeMaxico = alcumeMaxico;
        this.favoritos = favoritos;
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
    
}
