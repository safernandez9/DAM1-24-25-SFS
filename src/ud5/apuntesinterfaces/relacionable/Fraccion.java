package ud5.apuntesinterfaces.relacionable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Fraccion implements Relacionable, Comparable<Fraccion> {

    private int num;
    private int den;

    //Constructores
    public Fraccion() {
        this.num = 0;
        this.den = 1;
    }

    public Fraccion(int num, int den) {
        this.num = num;
        this.den = den;
        simplificar();
    }

    public Fraccion(int num) {
        this.num = num;
        this.den = 1;
    }

    //Setters y Getters
    public void setDen(int den) {
        this.den = den;
        this.simplificar();
    }

    public void setNum(int num) {
        this.num = num;
        this.simplificar();
    }

    public int getDen() {
        return den;
    }

    public int getNum() {
        return num;
    }

    //sumar fracciones
    public Fraccion sumar(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.num = num * f.den + den * f.num;
        aux.den = den * f.den;
        aux.simplificar();
        return aux;
    }

    //restar fracciones
    public Fraccion restar(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.num = num * f.den - den * f.num;
        aux.den = den * f.den;
        aux.simplificar();
        return aux;
    }

    //multiplicar fracciones
    public Fraccion multiplicar(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.num = num * f.num;
        aux.den = den * f.den;
        aux.simplificar();
        return aux;
    }

    //dividir fracciones
    public Fraccion dividir(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.num = num * f.den;
        aux.den = den * f.num;
        aux.simplificar();
        return aux;
    }

    //Método para simplificar una fracción
    private void simplificar() {
        int n = mcd(); //se calcula el mcd de la fracción
        num = num / n;
        den = den / n;
    }

    //Cálculo del máximo común divisor por el algoritmo de Euclides
    //Lo utiliza el método simplificar()
    private int mcd() {
        int u = Math.abs(num); //valor absoluto del numerador
        int v = Math.abs(den); //valor absoluto del denominador
        if (v == 0) {
            return u;
        }
        int r;
        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
        }
        return u;
    }

    //Sobreescritura del método toString heredado de Object
    @Override
    public String toString() {
        simplificar();
        return num + "/" + den;
    }

    //Implementación del método abstracto esMayorQue de la interface
    @Override
    public boolean esMayorQue(Relacionable a) {
        if (a == null) {
            return false;
        }
        if (!(a instanceof Fraccion)) {
            return false;
        }
        Fraccion f = (Fraccion) a;
        this.simplificar();
        f.simplificar();
        if ((num / (double) den) <= (f.num / (double) f.den)) {
            return false;
        }
        return true;
    }

    //Implementación del método abstracto esMenorQue de la interface
    @Override
    public boolean esMenorQue(Relacionable a) {
        if (a == null) {
            return false;
        }
        if (!(a instanceof Fraccion)) {
            return false;
        }
        Fraccion f = (Fraccion) a;
        this.simplificar();
        f.simplificar();
        if ((num / (double) den) >= (f.num / (double) f.den)) {
            return false;
        }
        return true;
    }

    //Implementación del método abstracto esIgualQue de la interface
    @Override
    public boolean esIgualQue(Relacionable a) {
        if (a == null) {
            return false;
        }
        if (!(a instanceof Fraccion)) {
            return false;
        }
        Fraccion f = (Fraccion) a;
        this.simplificar();
        f.simplificar();
        if (num != f.num) {
            return false;
        }
        if (den != f.den) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {


        //Creamos dos fracciones y mostramos cuál es la mayor y cuál menor.
        Fraccion f1 = new Fraccion(3, 5);
        Fraccion f2 = new Fraccion(2, 8);

        if (f1.esMayorQue(f2)) {
            System.out.println(f1 + " > " + f2);
        } else {
            System.out.println(f1 + " <= " + f2);
        }

        //Creamos un Array de fracciones y las mostramos ordenadas de menor a mayor
        Fraccion[] fracciones = {
                new Fraccion(10, 7),
                new Fraccion(-2, 3),
                new Fraccion(1, 9),
                new Fraccion(6, 25),
                new Fraccion(3, 8),
                new Fraccion(8, 3)
        };

        // El método sort() ordena el array de objetos Comparables según el criterio de ordenació nnatural definido en el método abstracto compareTo()
        Arrays.sort(fracciones);

        System.out.println("Fracciones ordenadas de menor a mayor");
        for(Fraccion f: fracciones){
            System.out.print(f + " ");
        }
    }

    /**
     * Método abstracto de la interfaz Comparable de la API de Java que nos permite definir el criterio de ordenación natural de una clase
      * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Fraccion o) {
        if(this.esMenorQue(o)){
            return -1;
        }else if(this.esMayorQue(o)){
            return 1;
        }else{
            return 0;
        }    }
}
