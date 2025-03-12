package ud5.mulleres;

public class MulleresDestacadas {
    public static void main(String[] args) {

        // Instanciación de mulleres destacadas

        Cientifica marieCurie = new Cientifica("Marie", "Curie", 1867, "Descubriu o radio e o polonio");
        Artista fridaKahlo = new Artista("Frida", "Kahlo", 1907, "Surrealismo e pintura autobiográfica");
        Politica rosaParks = new Politica("Rosa", "Parks", 1913,
                "Loita polos dereitos civís e contra a segregación racial");
        Cientifica adaLovelace = new Cientifica("Ada", "Lovelace", 1815, "Primeira programadora da historia");
        Escritora virginiaWoolf = new Escritora("Virginia", "Woolf", 1882, "Orlando e Un cuarto de seu");
        Deportista serenaWilliams = new Deportista("Serena", "Williams", 1981,
                "Ser a tenista con máis títulos de Grand Slam na era aberta");
        Sindicalista claraCampoamor = new Sindicalista("Clara", "Campoamor", 1888,
                "Conseguiu o sufraxio feminino en España en 1931");

        // Array de mulleres destacadas

        MullerTraballadora[] mulleres = { marieCurie, fridaKahlo, rosaParks, adaLovelace, virginiaWoolf, serenaWilliams,
                claraCampoamor };

        // Mostramos los datos

        System.out.println("==== Mulleres Traballadoras Destacadas ====");
        for (MullerTraballadora muller : mulleres) {
            System.out.println(muller.descripcionContribucion());
        }

        // Mostrar los datos más específicos de las interfaces

        System.out.println("\n==== Detalles Específicos ====");
        for (MullerTraballadora muller : mulleres) {
            if (muller instanceof IPioneira) {
                System.out
                        .println(muller.nome + " foi pioneira en: " + ((IPioneira) muller).getDescubrimentoOuAporte());
            }
            if (muller instanceof IActivista) {
                System.out.println(muller.nome + " defendeu a causa: " + ((IActivista) muller).getCausaDefendida());
            }
        }
    }
}