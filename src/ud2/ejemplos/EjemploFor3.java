package ud2.ejemplos;

//Programa que muestra una tabla de equivalencias entre grados Fahrenheit y celsius
public class EjemploFor3 {
    public static void main(String[] args) {                                                                      
        double celsius;
        System.out.printf(" ºF \t  ºC \n");
        System.out.println("---------------");
        for (int fahrenheit = 10; fahrenheit <= 100; fahrenheit+= 10) {                                           
             celsius = (fahrenheit - 32)*5/9.0;
             System.out.printf("%3d\t%6.2f \n", fahrenheit, celsius);
        }
    }
}
