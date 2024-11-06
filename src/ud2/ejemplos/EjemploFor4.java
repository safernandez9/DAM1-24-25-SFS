package ud2.ejemplos;

// Programa que muestra el valor de a, b y su suma mientras que la suma sea menor de 10. 
// En cada iteración el valor de a se incrementa en 1 unidad y el de b en 2
public class EjemploFor4 {
    public static void main(String[] args) {
        for (int a = 1, b = 1; a + b < 10; a++, b += 2) {
            System.out.println("a = " + a + "  b = " + b + "  a + b = " + (a + b));
        }
    }
}
