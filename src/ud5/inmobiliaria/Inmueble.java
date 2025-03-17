package ud5.inmobiliaria;

import java.util.Arrays;
import java.util.Comparator;

public abstract class Inmueble implements Comparable{
    String direccion;
    int numHab;
    int numBanhos;
    int m2;
    int precioAlquiler;
    int precioVenta;

    public Inmueble() {
    }

    public Inmueble(String direccion, int m2, int numHab, int numBanhos) {
        this.direccion = direccion;
        this.numHab = numHab;
        this.numBanhos = numBanhos;
        this.m2 = m2;
    }

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    abstract String detalle();

    @Override
    public String toString() {
        return "Inmueble  en " + direccion + " (" + m2 + " m2, " + numHab + " hab)";
    }

    static void mostrarInmuebles(Inmueble[] t) {
        for (Inmueble i : t) {
            System.out.println(i);
        }
    }

    @Override
    public int compareTo(Object o) {
        return direccion.compareTo(((Inmueble) o).direccion);
    }

    /* MÉTODOS DE CORDENACIÓN */
    static void sortMetrosDesc(Inmueble[] t) {
        Arrays.sort(t,new ComparaMetros().reversed());
    }

    static void sortHabMetrosDesc(Inmueble[] t) {
        Comparator comparaHab = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Inmueble i1 = (Inmueble) o1;
                Inmueble i2 = (Inmueble) o2;
                int res = i2.numHab - i1.numHab;
                if (res == 0)                 {
                    res = i2.m2 - i1.m2;
                }
                return res;
            }            
        };

        Arrays.sort(t, comparaHab);
        
//        Arrays.sort(t, comparaHab.thenComparing(new ComparaMetros().reversed()));
    }


    static void sortPrecioAlquilerAsc(Inmueble[] t) {
        Comparator comparaAlquiler = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Inmueble i1 = (Inmueble) o1;
                Inmueble i2 = (Inmueble) o2;
                return i1.precioAlquiler - i2.precioAlquiler;
            }            
        };

        Arrays.sort(t, comparaAlquiler);        
    }





    /* GETTERS Y SETTERS  */
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumHab() {
        return numHab;
    }

    public void setNumHab(int numHab) {
        this.numHab = numHab;
    }

    public int getNumBanhos() {
        return numBanhos;
    }

    public void setNumBanhos(int numBanhos) {
        this.numBanhos = numBanhos;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public int getPrecioAlquiler() {
        return precioAlquiler;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

}
